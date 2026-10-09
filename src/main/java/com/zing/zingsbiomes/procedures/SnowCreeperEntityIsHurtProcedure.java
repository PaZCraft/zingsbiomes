package net.mcreator.zingsbiomes.procedures;

import net.minecraft.world.entity.Entity;

public class SnowCreeperEntityIsHurtProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		sourceentity.setTicksFrozen(200);
	}
}