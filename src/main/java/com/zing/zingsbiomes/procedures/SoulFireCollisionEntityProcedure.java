package com.zing.zingsbiomes.procedures;

import net.minecraft.world.entity.Entity;

public class SoulFireCollisionEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.igniteForSeconds(15);
	}
}