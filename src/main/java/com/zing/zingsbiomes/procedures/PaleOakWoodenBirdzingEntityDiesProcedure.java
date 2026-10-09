package net.mcreator.zingsbiomes.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class PaleOakWoodenBirdzingEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.PALE_OAK_LOG.defaultBlockState()));
		world.setBlock(BlockPos.containing(x, y, z), Blocks.PALE_OAK_SAPLING.defaultBlockState(), 3);
	}
}