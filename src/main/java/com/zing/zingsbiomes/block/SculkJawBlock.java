package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.zingsbiomes.procedures.SculkJawEntityWalksOnTheBlockProcedure;

public class SculkJawBlock extends Block {
	public static final BooleanProperty IS_SNAPPED = BooleanProperty.create("is_snapped");

	public SculkJawBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.SAND).sound(SoundType.SCULK).strength(1f, 10f).lightLevel(blockstate -> 5).requiresCorrectToolForDrops());
		this.registerDefaultState(this.stateDefinition.any().setValue(IS_SNAPPED, false));
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(IS_SNAPPED);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		BlockState state = super.getStateForPlacement(context);
		if (state == null)
			return null;
		return state.setValue(IS_SNAPPED, false);
	}

	@Override
	public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
		super.stepOn(world, pos, blockstate, entity);
		SculkJawEntityWalksOnTheBlockProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
	}
}