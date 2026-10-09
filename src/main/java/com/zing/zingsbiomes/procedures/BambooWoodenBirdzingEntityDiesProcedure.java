package com.zing.zingsbiomes.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class BambooWoodenBirdzingEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.BAMBOO_BLOCK.defaultBlockState()));
		world.setBlock(BlockPos.containing(x, y, z), Blocks.BAMBOO.defaultBlockState(), 3);
	}
}