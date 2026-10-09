package com.zing.zingsbiomes.procedures;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

public class UltravioletCreakingGlowConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof Mob _mobEnt0 && _mobEnt0.isAggressive();
	}
}