package net.mcreator.zingsbiomes.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
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
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.util.StringRepresentable;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.zingsbiomes.procedures.CitrineWeatherMeterOnTickUpdateProcedure;
import net.mcreator.zingsbiomes.procedures.CitrineWeatherMeterActivationProcedure;

import java.util.function.Function;

public class CitrineWeatherMeterBlock extends Block implements SimpleWaterloggedBlock {
	public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	public static final BooleanProperty IS_ACTIVATED = BooleanProperty.create("is_activated");
	public static final EnumProperty<CurrentWeatherProperty> CURRENT_WEATHER = EnumProperty.create("current_weather", CurrentWeatherProperty.class);
	private final Function<BlockState, VoxelShape> shapes = this.makeShapes();

	public CitrineWeatherMeterBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.AMETHYST).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(AXIS, Direction.Axis.Y).setValue(IS_ACTIVATED, false).setValue(CURRENT_WEATHER, CurrentWeatherProperty.OFF).setValue(WATERLOGGED, false));
	}

	private Function<BlockState, VoxelShape> makeShapes() {
		return this.getShapeForEachState(state -> {
			if (state.getValue(IS_ACTIVATED) == true && state.getValue(CURRENT_WEATHER) == CurrentWeatherProperty.CLEAR) {
				return switch (state.getValue(AXIS)) {
					case X -> box(0, 0, 0, 2, 16, 16);
					case Y -> box(0, 0, 0, 16, 2, 16);
					case Z -> box(0, 0, 14, 16, 16, 16);
				};
			} else if (state.getValue(IS_ACTIVATED) == true && state.getValue(CURRENT_WEATHER) == CurrentWeatherProperty.RAIN) {
				return switch (state.getValue(AXIS)) {
					case X -> box(0, 0, 0, 2, 16, 16);
					case Y -> box(0, 0, 0, 16, 2, 16);
					case Z -> box(0, 0, 14, 16, 16, 16);
				};
			} else if (state.getValue(IS_ACTIVATED) == true && state.getValue(CURRENT_WEATHER) == CurrentWeatherProperty.THUNDER) {
				return switch (state.getValue(AXIS)) {
					case X -> box(0, 0, 0, 2, 16, 16);
					case Y -> box(0, 0, 0, 16, 2, 16);
					case Z -> box(0, 0, 14, 16, 16, 16);
				};
			}
			return switch (state.getValue(AXIS)) {
				case X -> box(0, 0, 0, 2, 16, 16);
				case Y -> box(0, 0, 0, 16, 2, 16);
				case Z -> box(0, 0, 14, 16, 16, 16);
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
		builder.add(AXIS, IS_ACTIVATED, CURRENT_WEATHER, WATERLOGGED);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		BlockState state = super.getStateForPlacement(context);
		if (state == null)
			return null;
		boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
		return state.setValue(AXIS, context.getClickedFace().getAxis()).setValue(IS_ACTIVATED, false).setValue(CURRENT_WEATHER, CurrentWeatherProperty.OFF).setValue(WATERLOGGED, flag);
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
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		CitrineWeatherMeterOnTickUpdateProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public InteractionResult useWithoutItem(BlockState blockstate, Level world, BlockPos pos, Player entity, BlockHitResult hit) {
		super.useWithoutItem(blockstate, world, pos, entity, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		CitrineWeatherMeterActivationProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}

	public enum CurrentWeatherProperty implements StringRepresentable {
		OFF("off"), CLEAR("clear"), RAIN("rain"), THUNDER("thunder");

		private final String name;

		private CurrentWeatherProperty(String name) {
			this.name = name;
		}

		@Override
		public String getSerializedName() {
			return this.name;
		}

		@Override
		public String toString() {
			return this.name;
		}
	}
}