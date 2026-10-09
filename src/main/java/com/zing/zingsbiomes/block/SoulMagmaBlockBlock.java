package com.zing.zingsbiomes.block;

import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import com.zing.zingsbiomes.procedures.SoulFireCollisionEntityProcedure;

public class SoulMagmaBlockBlock extends Block {
	public SoulMagmaBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f).lightLevel(blockstate -> 5).requiresCorrectToolForDrops().postProcess((bs, br, bp) -> bp).emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public PathType getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
		return PathType.FIRE;
	}

	@Override
	public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
		super.stepOn(world, pos, blockstate, entity);
		SoulFireCollisionEntityProcedure.execute(entity);
	}
}