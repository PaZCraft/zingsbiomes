package net.mcreator.zingsbiomes.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.zingsbiomes.procedures.FlytrapSeaAnemoneEntityCollidesInTheBlockProcedure;

import java.util.function.Function;

public class FlytrapSeaAnemoneBlock extends Block implements SimpleWaterloggedBlock {
	public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	public static final BooleanProperty IS_SNAPPED = BooleanProperty.create("is_snapped");
	private final Function<BlockState, VoxelShape> shapes = this.makeShapes();

	public FlytrapSeaAnemoneBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.CORAL_BLOCK).strength(1f, 10f).requiresCorrectToolForDrops().noCollision().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(AXIS, Direction.Axis.Y).setValue(IS_SNAPPED, false).setValue(WATERLOGGED, false));
	}

	private Function<BlockState, VoxelShape> makeShapes() {
		return this.getShapeForEachState(state -> {
			if (state.getValue(IS_SNAPPED) == true) {
				return switch (state.getValue(AXIS)) {
					case X -> Shapes.or(box(0, 7, 0, 2, 9, 16), box(1.31518, -1.21465, 0, 2.31518, 6.78535, 16), box(0.9185, 9.01903, 0, 1.9185, 17.01903, 16));
					case Y -> Shapes.or(box(0, 0, 7, 16, 2, 9), box(0, 1.31518, -1.21465, 16, 2.31518, 6.78535), box(0, 0.9185, 9.01903, 16, 1.9185, 17.01903));
					case Z -> Shapes.or(box(0, 7, 14, 16, 9, 16), box(0, -1.21465, 13.68482, 16, 6.78535, 14.68482), box(0, 9.01903, 14.0815, 16, 17.01903, 15.0815));
				};
			}
			return switch (state.getValue(AXIS)) {
				case X -> Shapes.or(box(0, 7, 0, 2, 9, 16), box(1.31518, -1.21465, 0, 2.31518, 6.78535, 16), box(0.9185, 9.01903, 0, 1.9185, 17.01903, 16));
				case Y -> Shapes.or(box(0, 0, 7, 16, 2, 9), box(0, 1.31518, -1.21465, 16, 2.31518, 6.78535), box(0, 0.9185, 9.01903, 16, 1.9185, 17.01903));
				case Z -> Shapes.or(box(0, 7, 14, 16, 9, 16), box(0, -1.21465, 13.68482, 16, 6.78535, 14.68482), box(0, 9.01903, 14.0815, 16, 17.01903, 15.0815));
			};
		}, WATERLOGGED);
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return shapes.apply(state);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state) {
		return state.getFluidState().isEmpty();
	}

	@Override
	public int getLightDampening(BlockState state) {
		return propagatesSkylightDown(state) ? 0 : 1;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(AXIS, IS_SNAPPED, WATERLOGGED);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		BlockState state = super.getStateForPlacement(context);
		if (state == null)
			return null;
		boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
		return state.setValue(AXIS, context.getClickedFace().getAxis()).setValue(IS_SNAPPED, false).setValue(WATERLOGGED, flag);
	}

	@Override
	public BlockState rotate(BlockState state, Rotation rot) {
		return RotatedPillarBlock.rotatePillar(state, rot);
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}

	@Override
	public BlockState updateShape(BlockState state, LevelReader world, ScheduledTickAccess scheduledTickAccess, BlockPos currentPos, Direction facing, BlockPos facingPos, BlockState facingState, RandomSource random) {
		if (state.getValue(WATERLOGGED)) {
			scheduledTickAccess.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
		}
		return super.updateShape(state, world, scheduledTickAccess, currentPos, facing, facingPos, facingState, random);
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity, InsideBlockEffectApplier insideBlockEffectApplier, boolean isPrecise) {
		super.entityInside(blockstate, world, pos, entity, insideBlockEffectApplier, isPrecise);
		FlytrapSeaAnemoneEntityCollidesInTheBlockProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate, entity);
	}
}