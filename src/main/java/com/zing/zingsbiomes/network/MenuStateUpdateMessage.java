package com.zing.zingsbiomes.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.resources.Identifier;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.client.Minecraft;

import com.zing.zingsbiomes.init.ZingsBiomesModScreens;
import com.zing.zingsbiomes.init.ZingsBiomesModMenus;
import com.zing.zingsbiomes.ZiNGsBiomes;

@EventBusSubscriber
public record MenuStateUpdateMessage(int elementType, String name, Object elementState) implements CustomPacketPayload {
	public static final Type<MenuStateUpdateMessage> TYPE = new Type<>(Identifier.fromNamespaceAndPath(ZiNGsBiomes.MODID, "menustate_update"));
	public static final StreamCodec<RegistryFriendlyByteBuf, MenuStateUpdateMessage> STREAM_CODEC = StreamCodec.of(MenuStateUpdateMessage::write, MenuStateUpdateMessage::read);

	public static void write(FriendlyByteBuf buffer, MenuStateUpdateMessage message) {
		buffer.writeInt(message.elementType);
		buffer.writeUtf(message.name);
		switch (message.elementType) {
			case 0 -> {
				if (!(message.elementState instanceof String string)) {
					throw new IllegalArgumentException("Menu state type 0 requires a String value, got " + (message.elementState == null ? "null" : message.elementState.getClass().getSimpleName()));
				}
				buffer.writeUtf(string);
			}
			case 1 -> {
				if (!(message.elementState instanceof Boolean bool)) {
					throw new IllegalArgumentException("Menu state type 1 requires a Boolean value, got " + (message.elementState == null ? "null" : message.elementState.getClass().getSimpleName()));
				}
				buffer.writeBoolean(bool);
			}
			case 2 -> {
				if (!(message.elementState instanceof Number number)) {
					throw new IllegalArgumentException("Menu state type 2 requires a Number value, got " + (message.elementState == null ? "null" : message.elementState.getClass().getSimpleName()));
				}
				buffer.writeDouble(number.doubleValue());
			}
			default -> throw new IllegalArgumentException("Unsupported menu state element type: " + message.elementType);
		}
	}

	public static MenuStateUpdateMessage read(FriendlyByteBuf buffer) {
		int elementType = buffer.readInt();
		String name = buffer.readUtf();
		Object elementState = switch (elementType) {
			case 0 -> buffer.readUtf();
			case 1 -> buffer.readBoolean();
			case 2 -> buffer.readDouble();
			default -> null;
		};
		return new MenuStateUpdateMessage(elementType, name, elementState);
	}

	@Override
	public Type<MenuStateUpdateMessage> type() {
		return TYPE;
	}

	public static void handleMenuState(final MenuStateUpdateMessage message, final IPayloadContext context) {
		boolean validState = switch (message.elementType) {
			case 0 -> message.elementState instanceof String;
			case 1 -> message.elementState instanceof Boolean;
			case 2 -> message.elementState instanceof Number;
			default -> false;
		};
		if (message.name == null || !validState || message.name.length() > 256 || message.elementState instanceof String string && string.length() > 8192)
			return;
		context.enqueueWork(() -> {
			if (context.player() == null) {
				return;
			}
			if (context.player().containerMenu instanceof ZingsBiomesModMenus.MenuAccessor menu) {
				menu.getMenuState().put(message.elementType + ":" + message.name, message.elementState);
				if (context.flow() == PacketFlow.CLIENTBOUND) {
					try {
						java.lang.reflect.Field screenField = Minecraft.class.getDeclaredField("screen");
						screenField.setAccessible(true);
						Object currentScreen = screenField.get(Minecraft.getInstance());
						if (currentScreen instanceof ZingsBiomesModScreens.ScreenAccessor accessor) {
							accessor.updateMenuState(message.elementType, message.name, message.elementState);
						}
					} catch (ReflectiveOperationException ignored) {
					}
				}
			}
		}).exceptionally(e -> {
			context.connection().disconnect(Component.literal(e.getMessage() == null ? "Menu state update failed" : e.getMessage()));
			return null;
		});
	}

	@SubscribeEvent
	public static void registerMessage(RegisterPayloadHandlersEvent event) {
		PayloadRegistrar registrar = event.registrar("1");
		registrar.playToClient(TYPE, STREAM_CODEC, MenuStateUpdateMessage::handleMenuState);
		registrar.playToServer(TYPE, STREAM_CODEC, MenuStateUpdateMessage::handleMenuState);
	}
}