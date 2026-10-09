package net.mcreator.zingsbiomes.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.zingsbiomes.init.ZingsBiomesModBlocks;

public class BlockPlacedByCactusProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ZingsBiomesModBlocks.CRIMSON_CACTUS.get()) {
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(ZingsBiomesModBlocks.CRIMSON_CACTUS.get().defaultBlockState()));
			{
				BlockPos _pos = BlockPos.containing(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ZingsBiomesModBlocks.DUSK_CACTUS.get()) {
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(ZingsBiomesModBlocks.DUSK_CACTUS.get().defaultBlockState()));
			{
				BlockPos _pos = BlockPos.containing(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		} else {
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.CACTUS.defaultBlockState()));
			{
				BlockPos _pos = BlockPos.containing(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
	}
}