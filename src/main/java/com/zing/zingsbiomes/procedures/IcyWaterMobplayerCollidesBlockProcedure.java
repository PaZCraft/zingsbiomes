package net.mcreator.zingsbiomes.procedures;

import net.minecraft.world.entity.Entity;

public class IcyWaterMobplayerCollidesBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setTicksFrozen(140);
	}
}