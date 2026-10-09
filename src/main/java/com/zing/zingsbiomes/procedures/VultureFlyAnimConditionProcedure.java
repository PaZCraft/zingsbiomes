package com.zing.zingsbiomes.procedures;

import net.minecraft.world.entity.Entity;

public class VultureFlyAnimConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return !entity.onGround();
	}
}