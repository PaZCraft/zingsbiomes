package com.zing.zingsbiomes.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SnowLayerBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.damagesource.DamageSource;

public class GroundSledEntity extends Entity {
	private static final double MAX_SPEED = 0.42;
	private static final double ACCELERATION = 0.035;
	private final Item dropItem;

	public GroundSledEntity(EntityType<?> type, Level level, Item dropItem) {
		super(type, level);
		this.dropItem = dropItem;
	}

	@Override
	protected void defineSynchedData(net.minecraft.network.syncher.SynchedEntityData.Builder builder) {
	}

	@Override
	protected void readAdditionalSaveData(net.minecraft.world.level.storage.ValueInput input) {
	}

	@Override
	protected void addAdditionalSaveData(net.minecraft.world.level.storage.ValueOutput output) {
	}

	@Override
	public void tick() {
		super.tick();
		Vec3 velocity = getDeltaMovement();
		if (isVehicle() && getFirstPassenger() instanceof ServerPlayer rider) {
			setYRot(rider.getYRot());
			yRotO = getYRot();
			float forward = rider.getLastClientInput().forward() == rider.getLastClientInput().backward() ? 0
					: rider.getLastClientInput().forward() ? 1 : -1;
			float strafe = rider.getLastClientInput().left() == rider.getLastClientInput().right() ? 0
					: rider.getLastClientInput().left() ? 1 : -1;
			float yaw = getYRot() * ((float) Math.PI / 180F);
			double inputX = -Math.sin(yaw) * forward + Math.cos(yaw) * strafe;
			double inputZ = Math.cos(yaw) * forward + Math.sin(yaw) * strafe;
			velocity = velocity.add(inputX * ACCELERATION, 0, inputZ * ACCELERATION);
		}

		BlockPos groundPos = BlockPos.containing(getX(), getY() - 0.01, getZ());
		BlockState ground = level().getBlockState(groundPos);
		boolean onSledGround = isSledGround(ground);
		double friction = onSledGround ? (ground.is(Blocks.ICE) || ground.is(Blocks.PACKED_ICE) || ground.is(Blocks.BLUE_ICE) ? 0.985 : 0.88) : 0.6;
		double verticalVelocity = onSledGround ? Math.max(0, velocity.y) : velocity.y - 0.08;
		velocity = new Vec3(velocity.x * friction, verticalVelocity, velocity.z * friction);
		double horizontalSpeed = Math.sqrt(velocity.x * velocity.x + velocity.z * velocity.z);
		if (horizontalSpeed > MAX_SPEED) {
			double scale = MAX_SPEED / horizontalSpeed;
			velocity = new Vec3(velocity.x * scale, velocity.y, velocity.z * scale);
		}
		setDeltaMovement(velocity);
		move(MoverType.SELF, velocity);
		if (onGround() && getDeltaMovement().y < 0)
			setDeltaMovement(getDeltaMovement().x, 0, getDeltaMovement().z);
	}

	public static boolean isSledGround(Level level, BlockPos pos) {
		BlockState state = level.getBlockState(pos);
		return state.isFaceSturdy(level, pos, net.minecraft.core.Direction.UP)
				|| state.is(Blocks.SNOW) || state.is(Blocks.POWDER_SNOW) || state.is(Blocks.MUD)
				|| state.is(Blocks.SAND) || state.is(Blocks.RED_SAND) || state.is(Blocks.ICE)
				|| state.is(Blocks.PACKED_ICE) || state.is(Blocks.BLUE_ICE) || state.is(Blocks.DIRT)
				|| state.is(Blocks.COARSE_DIRT) || state.is(Blocks.ROOTED_DIRT) || state.is(Blocks.GRASS_BLOCK)
				|| state.is(Blocks.PODZOL) || state.is(Blocks.MYCELIUM);
	}

	@Override
	public InteractionResult interact(Player player, InteractionHand hand) {
		if (!player.isSecondaryUseActive() && !level().isClientSide())
			player.startRiding(this);
		return InteractionResult.SUCCESS;
	}

	@Override
	public boolean hurtServer(ServerLevel level, DamageSource source, float amount) {
		if (isInvulnerableTo(source))
			return false;
		if (amount > 0 && !isRemoved()) {
			dropContents(level);
			spawnAtLocation(level, new ItemStack(dropItem));
			discard();
		}
		return true;
	}

	protected void dropContents(ServerLevel level) {
	}

	@Override
	public boolean canBeCollidedWith() {
		return !isRemoved();
	}

	@Override
	public boolean isPushable() {
		return true;
	}

	@Override
	public boolean canCollideWith(Entity entity) {
		return entity != getFirstPassenger();
	}

	@Override
	protected double getPassengersRidingOffset() {
		return 0.1;
	}

	@Override
	public EntityDimensions getDefaultDimensions(Pose pose) {
		return super.getDefaultDimensions(pose).scale(2.0F);
	}
}
