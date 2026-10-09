package com.zing.zingsbiomes.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.MoveToBlockGoal;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;

public class TryFindWaterGoal extends MoveToBlockGoal {
	public TryFindWaterGoal(PathfinderMob mob) {
		super(mob, 1.0D, 24);
	}

	@Override
	protected boolean isValidTarget(LevelReader level, BlockPos pos) {
		return level.getBlockState(pos).is(Blocks.WATER);
	}
}
