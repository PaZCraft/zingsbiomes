package net.mcreator.zingsbiomes.procedures;

import net.minecraft.world.entity.Entity;

public class QuartzFireCollisionEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.igniteForSeconds(5);
	}
}