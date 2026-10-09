package com.zing.zingsbiomes.block;

import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.color.block.BlockTintSources;

import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

import java.util.List;

public class MangroveLeafLitterBlock extends FlowerBlock {
	public MangroveLeafLitterBlock(BlockBehaviour.Properties properties) {
		super(MobEffects.SPEED, 100, properties.mapColor(MapColor.PLANT).sound(SoundType.LEAF_LITTER).instabreak().noCollision().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.POPPED));
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
		return groundState.is(ZingsBiomesModBlocks.MUDDED_GRASS_BLOCK.get()) || groundState.is(Blocks.MUD) || groundState.is(Blocks.MUDDY_MANGROVE_ROOTS) || groundState.is(ZingsBiomesModBlocks.GRASSY_RED_SAND.get())
				|| groundState.is(ZingsBiomesModBlocks.GRASSY_SAND.get()) || groundState.is(Blocks.GRASS_BLOCK) || groundState.is(BlockTags.create(Identifier.parse("minecraft:dirt")));
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}

	public static void blockColorLoad(RegisterColorHandlersEvent.BlockTintSources event) {
		event.getBlockColors().register(List.of(BlockTintSources.foliage()), ZingsBiomesModBlocks.MANGROVE_LEAF_LITTER.get());
	}
}