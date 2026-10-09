package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.BonemealSource;

import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

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
import net.minecraft.util.RandomSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.color.block.BlockTintSources;

import com.zing.zingsbiomes.init.ZingsBiomesModMobEffects;
import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

import java.util.List;

public class FrostGrassBlock extends FlowerBlock implements BonemealableBlock {
	public FrostGrassBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModMobEffects.FROSTBURN, 100, properties.mapColor(MapColor.PLANT).sound(SoundType.GRASS).instabreak().noCollision().replaceable().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.POPPED));
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
		return groundState.is(BlockTags.create(Identifier.parse("minecraft:dirt"))) || groundState.is(Blocks.GRASS_BLOCK) || groundState.is(Blocks.ICE) || groundState.is(Blocks.PACKED_ICE) || groundState.is(Blocks.FROSTED_ICE)
				|| groundState.is(Blocks.BLUE_ICE);
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

	public static void blockColorLoad(RegisterColorHandlersEvent.BlockTintSources event) {
		event.getBlockColors().register(List.of(BlockTintSources.grass()), ZingsBiomesModBlocks.FROST_GRASS.get());
	}
}