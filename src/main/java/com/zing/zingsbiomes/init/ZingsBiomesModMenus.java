/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.zing.zingsbiomes.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.client.network.ClientPacketDistributor;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.Minecraft;

import com.zing.zingsbiomes.world.inventory.TinContainerMenu;
import com.zing.zingsbiomes.world.inventory.TinContainerChiseledMenu;
import com.zing.zingsbiomes.world.inventory.SledWithChestInventoryMenu;
import com.zing.zingsbiomes.world.inventory.AmazoniteLanternMenuMenu;
import com.zing.zingsbiomes.network.MenuStateUpdateMessage;


import java.util.Map;

public class ZingsBiomesModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, ZiNGsBiomes.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<TinContainerMenu>> TIN_CONTAINER = REGISTRY.register("tin_container", () -> IMenuTypeExtension.create(TinContainerMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<TinContainerChiseledMenu>> TIN_CONTAINER_CHISELED = REGISTRY.register("tin_container_chiseled", () -> IMenuTypeExtension.create(TinContainerChiseledMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<SledWithChestInventoryMenu>> SLED_WITH_CHEST_INVENTORY = REGISTRY.register("sled_with_chest_inventory", () -> IMenuTypeExtension.create(SledWithChestInventoryMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<AmazoniteLanternMenuMenu>> AMAZONITE_LANTERN_MENU = REGISTRY.register("amazonite_lantern_menu", () -> IMenuTypeExtension.create(AmazoniteLanternMenuMenu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				PacketDistributor.sendToPlayer(serverPlayer, new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level().isClientSide()) {
				if (Minecraft.getInstance().screen instanceof ZingsBiomesModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				ClientPacketDistributor.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
			}
		}

		default <T> T getMenuState(int elementType, String name, T defaultValue) {
			try {
				return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
			} catch (ClassCastException e) {
				return defaultValue;
			}
		}
	}
}