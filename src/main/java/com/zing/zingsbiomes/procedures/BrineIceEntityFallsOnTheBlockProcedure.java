package com.zing.zingsbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;

public class BrineIceEntityFallsOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof net.minecraft.server.level.ServerLevel _level) {
			net.minecraft.core.BlockPos _pos = net.minecraft.core.BlockPos.containing(((Number) x).doubleValue(), ((Number) y).doubleValue(), ((Number) z).doubleValue());
			double _dmg = 10;
			boolean _drop = true;
			int _rec = (int) 5;
			com.zing.zingsbiomes.world.BlockDamageHandler.applyDamage(_level, _pos, _dmg, _rec, _drop);
		}
	}
}