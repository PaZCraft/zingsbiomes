package com.zing.zingsbiomes.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class TallCactusFlowerBlock extends DoublePlantBlock {
	public TallCactusFlowerBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.PLANT).sound(SoundType.CACTUS_FLOWER).instabreak().noCollision().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.POPPED));
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
		return groundState.is(BlockTags.create(Identifier.parse("minecraft:sand"))) || groundState.is(BlockTags.create(Identifier.parse("c:sandstone/blocks"))) || groundState.is(BlockTags.create(Identifier.parse("c:sandstone/blocks")));
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		if (blockstate.getValue(HALF) == DoubleBlockHalf.UPPER)
			return groundState.is(this) && groundState.getValue(HALF) == DoubleBlockHalf.LOWER;
		else
			return this.mayPlaceOn(groundState, worldIn, blockpos);
	}
}