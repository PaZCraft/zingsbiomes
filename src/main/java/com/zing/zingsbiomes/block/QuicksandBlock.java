package com.zing.zingsbiomes.block;

import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import com.zing.zingsbiomes.procedures.QuicksandEntityWalksOnTheBlockProcedure;
import com.zing.zingsbiomes.procedures.QuicksandEntityCollidesInTheBlockProcedure;

public class QuicksandBlock extends Block {
	public QuicksandBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.SAND).sound(SoundType.SAND).strength(1f, 10f).noCollision().instrument(NoteBlockInstrument.SNARE));
	}

	@Override
	public PathType getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
		return PathType.ON_TOP_OF_POWDER_SNOW;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity, InsideBlockEffectApplier insideBlockEffectApplier, boolean isPrecise) {
		super.entityInside(blockstate, world, pos, entity, insideBlockEffectApplier, isPrecise);
		QuicksandEntityCollidesInTheBlockProcedure.execute(world, entity);
	}

	@Override
	public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
		super.stepOn(world, pos, blockstate, entity);
		QuicksandEntityWalksOnTheBlockProcedure.execute();
	}
}