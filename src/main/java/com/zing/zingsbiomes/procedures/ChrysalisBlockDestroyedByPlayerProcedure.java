package com.zing.zingsbiomes.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import com.zing.zingsbiomes.init.ZingsBiomesModEntities;
import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

public class ChrysalisBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = ZingsBiomesModEntities.BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
			}
		}
		world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(ZingsBiomesModBlocks.CHRYSALIS.get().defaultBlockState()));
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
	}
}