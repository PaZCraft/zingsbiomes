package com.zing.zingsbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import com.zing.zingsbiomes.init.ZingsBiomesModEntities;
import com.zing.zingsbiomes.init.ZingsBiomesModMenus;

public class AmazoniteFuelUsageProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		ZingsBiomesModEntities.queueServerWork(24000, new Runnable() {
			@Override
			public void run() {
				if (entity instanceof Player _player && _player.containerMenu instanceof ZingsBiomesModMenus.MenuAccessor _menu) {
					_menu.getSlots().get(0).remove(1);
					_player.containerMenu.broadcastChanges();
				}
			}
		});
	}
}