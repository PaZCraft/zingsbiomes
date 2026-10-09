package com.zing.zingsbiomes.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.BlockPos;

import java.util.function.Function;

public class MintCakeBlock extends Block {
	public static final IntegerProperty BITES = BlockStateProperties.BITES;
	private final Function<BlockState, VoxelShape> shapes = this.makeShapes();

	public MintCakeBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOL).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(BITES, 0));
	}

	private Function<BlockState, VoxelShape> makeShapes() {
		return this.getShapeForEachState(state -> {
			if (state.getValue(BITES) == 1) {
				return box(1, 0, 3, 15, 8, 15);
			} else if (state.getValue(BITES) == 2) {
				return box(1, 0, 4, 15, 8, 15);
			} else if (state.getValue(BITES) == 3) {
				return box(1, 0, 5, 15, 8, 15);
			} else if (state.getValue(BITES) == 4) {
				return box(1, 0, 7, 15, 8, 15);
			} else if (state.getValue(BITES) == 5) {
				return box(1, 0, 9, 15, 8, 15);
			} else if (state.getValue(BITES) == 6) {
				return box(1, 0, 12, 15, 8, 15);
			}
			return box(1, 0, 1, 15, 8, 15);
		});
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return shapes.apply(state);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state) {
		return true;
	}

	@Override
	public int getLightDampening(BlockState state) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(BITES);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		BlockState state = super.getStateForPlacement(context);
		if (state == null)
			return null;
		return state.setValue(BITES, 0);
	}
}