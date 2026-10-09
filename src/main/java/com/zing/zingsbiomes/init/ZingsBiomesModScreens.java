/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zingsbiomes.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.zingsbiomes.client.gui.TinContainerScreen;
import net.mcreator.zingsbiomes.client.gui.TinContainerChiseledScreen;
import net.mcreator.zingsbiomes.client.gui.SledWithChestInventoryScreen;
import net.mcreator.zingsbiomes.client.gui.AmazoniteLanternMenuScreen;

@EventBusSubscriber(Dist.CLIENT)
public class ZingsBiomesModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(ZingsBiomesModMenus.TIN_CONTAINER.get(), TinContainerScreen::new);
		event.register(ZingsBiomesModMenus.TIN_CONTAINER_CHISELED.get(), TinContainerChiseledScreen::new);
		event.register(ZingsBiomesModMenus.SLED_WITH_CHEST_INVENTORY.get(), SledWithChestInventoryScreen::new);
		event.register(ZingsBiomesModMenus.AMAZONITE_LANTERN_MENU.get(), AmazoniteLanternMenuScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}