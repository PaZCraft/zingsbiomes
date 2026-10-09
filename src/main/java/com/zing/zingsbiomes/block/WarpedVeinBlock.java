package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.BonemealSource;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class WarpedVeinBlock extends FlowerBlock implements BonemealableBlock {
	public WarpedVeinBlock(BlockBehaviour.Properties properties) {
		super(MobEffects.SPEED, 100, properties.mapColor(MapColor.PLANT).sound(SoundType.NETHER_WART).instabreak().postProcess((bs, br, bp) -> bp).emissiveRendering(state -> true).noCollision().replaceable()
				.offsetType(BlockBehaviour.OffsetType.XYZ).pushReaction(PushReaction.POPPED));
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
		return groundState.is(Blocks.NETHERRACK) || groundState.is(Blocks.WARPED_STEM) || groundState.is(Blocks.WARPED_HYPHAE) || groundState.is(Blocks.WARPED_WART_BLOCK);
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}

	@Override
	public boolean isValidBonemealTarget(LevelReader worldIn, BlockPos pos, BlockState blockstate, BonemealSource source) {
		return true;
	}

	@Override
	public boolean isBonemealSuccess(Level world, RandomSource random, BlockPos pos, BlockState blockstate, BonemealSource source) {
		return true;
	}

	@Override
	public void performBonemeal(ServerLevel world, RandomSource random, BlockPos pos, BlockState blockstate, BonemealSource source) {
	}
}