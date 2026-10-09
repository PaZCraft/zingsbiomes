package com.zing.zingsbiomes.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.Identifier;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.SectionPos;

import com.zing.zingsbiomes.procedures.AmazoniteFuelUsageProcedure;
import com.zing.zingsbiomes.ZiNGsBiomes;


@EventBusSubscriber
public record AmazoniteLanternMenuSlotMessage(int slotID, int x, int y, int z, int changeType, int meta) implements CustomPacketPayload {
	public static final Type<AmazoniteLanternMenuSlotMessage> TYPE = new Type<>(Identifier.fromNamespaceAndPath(ZiNGsBiomes.MODID, "amazonite_lantern_menu_slots"));
	public static final StreamCodec<RegistryFriendlyByteBuf, AmazoniteLanternMenuSlotMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, AmazoniteLanternMenuSlotMessage message) -> {
		buffer.writeInt(message.slotID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		buffer.writeInt(message.changeType);
		buffer.writeInt(message.meta);
	}, (RegistryFriendlyByteBuf buffer) -> new AmazoniteLanternMenuSlotMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));

	@Override
	public Type<AmazoniteLanternMenuSlotMessage> type() {
		return TYPE;
	}

	public static void handleData(final AmazoniteLanternMenuSlotMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> handleSlotAction(context.player(), message.slotID, message.changeType, message.meta, message.x, message.y, message.z)).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleSlotAction(Player entity, int slot, int changeType, int meta, int x, int y, int z) {
		Level world = entity.level();
		// security measure to prevent arbitrary chunk generation
		if (!world.getChunkSource().hasChunk(SectionPos.blockToSectionCoord(x), SectionPos.blockToSectionCoord(z)))
			return;
		if (slot == 0 && changeType == 0) {

			AmazoniteFuelUsageProcedure.execute(world, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(RegisterPayloadHandlersEvent event) {
		PayloadRegistrar registrar = event.registrar("1");
		registrar.playToServer(TYPE, STREAM_CODEC, AmazoniteLanternMenuSlotMessage::handleData);
	}
}