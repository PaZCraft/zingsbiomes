package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.zingsbiomes.init.ZingsBiomesModBlocks;

public class CherryVineBlock extends FlowerBlock {
	public CherryVineBlock(BlockBehaviour.Properties properties) {
		super(MobEffects.SPEED, 100, properties.mapColor(MapColor.PLANT).sound(SoundType.GRASS).instabreak().noCollision().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY));
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
		return groundState.is(ZingsBiomesModBlocks.BLUEBERRY_LOG.get()) || groundState.is(ZingsBiomesModBlocks.BLACKBERRY_LOG.get()) || groundState.is(ZingsBiomesModBlocks.GLOW_BERRY_LOG.get())
				|| groundState.is(ZingsBiomesModBlocks.SWEET_BERRY_LOG.get()) || groundState.is(ZingsBiomesModBlocks.GOLDENBERRY_LOG.get()) || groundState.is(ZingsBiomesModBlocks.GOOSEBERRY_LOG.get())
				|| groundState.is(ZingsBiomesModBlocks.STRAWBERRY_LOG.get()) || groundState.is(ZingsBiomesModBlocks.RASPBERRY_LOG.get()) || groundState.is(BlockTags.create(Identifier.parse("minecraft:logs")));
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}
}