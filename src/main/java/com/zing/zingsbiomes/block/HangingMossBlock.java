package net.mcreator.zingsbiomes.block;

import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.color.block.BlockTintSources;

import net.mcreator.zingsbiomes.init.ZingsBiomesModBlocks;

import java.util.List;

public class HangingMossBlock extends DoublePlantBlock {
	public HangingMossBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.PLANT).sound(SoundType.HANGING_ROOTS).instabreak().noCollision().offsetType(BlockBehaviour.OffsetType.XYZ).pushReaction(PushReaction.DESTROY));
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	private boolean canPlantTypeSurvive(BlockState state, LevelReader world, BlockPos pos) {
		return state.isFaceSturdy(world, pos, Direction.UP);
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader world, BlockPos pos) {
		BlockPos posbelow = pos.below();
		BlockState statebelow = world.getBlockState(posbelow);
		if (blockstate.getValue(HALF) != DoubleBlockHalf.UPPER) {
			if (blockstate.getBlock() == this)
				return this.canPlantTypeSurvive(statebelow, world, posbelow);
			return this.mayPlaceOn(statebelow, world, posbelow);
		} else {
			return statebelow.is(this) && statebelow.getValue(HALF) == DoubleBlockHalf.LOWER;
		}
	}

	public static void blockColorLoad(RegisterColorHandlersEvent.BlockTintSources event) {
		event.getBlockColors().register(List.of(BlockTintSources.grass()), ZingsBiomesModBlocks.HANGING_MOSS.get());
	}
}