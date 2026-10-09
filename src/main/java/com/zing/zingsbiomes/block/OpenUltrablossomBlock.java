package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.zingsbiomes.procedures.UltrablossomStatesProcedure;
import net.mcreator.zingsbiomes.init.ZingsBiomesModBlocks;

public class OpenUltrablossomBlock extends FlowerBlock {
	public OpenUltrablossomBlock(BlockBehaviour.Properties properties) {
		super(MobEffects.NIGHT_VISION, 100, properties.mapColor(MapColor.PLANT).sound(SoundType.GRASS).instabreak().postProcess((bs, br, bp) -> bp).emissiveRendering((bs, br, bp) -> true).noCollision().offsetType(BlockBehaviour.OffsetType.XZ)
				.pushReaction(PushReaction.DESTROY));
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
		return groundState.is(ZingsBiomesModBlocks.ULTRAVIOLET_MOSS_BLOCK.get()) || groundState.is(Blocks.GRASS_BLOCK) || groundState.is(BlockTags.DIRT);
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}

	@Override
	public void randomTick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		UltrablossomStatesProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}