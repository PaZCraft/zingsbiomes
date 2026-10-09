package com.zing.zingsbiomes.entity;

import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.common.NeoForgeMod;

import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.animal.polarbear.PolarBear;
import net.minecraft.world.entity.animal.fish.Cod;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.*;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import com.zing.zingsbiomes.procedures.PenguinSwimAnimConditionProcedure;
import com.zing.zingsbiomes.init.ZingsBiomesModItems;
import com.zing.zingsbiomes.init.ZingsBiomesModEntities;

public class PenguinEntity extends Animal {
	public final AnimationState animationState0 = new AnimationState();
	public final AnimationState animationState2 = new AnimationState();

	public PenguinEntity(EntityType<PenguinEntity> type, Level world) {
		super(type, world);
		xpReward = 5;
		setNoAi(false);
		setPersistenceRequired();
		this.setPathfindingMalus(PathType.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (PenguinEntity.this.isInWater())
					PenguinEntity.this.setDeltaMovement(PenguinEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !PenguinEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - PenguinEntity.this.getX();
					double dy = this.wantedY - PenguinEntity.this.getY();
					double dz = this.wantedZ - PenguinEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * PenguinEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					PenguinEntity.this.setYRot(this.rotlerp(PenguinEntity.this.getYRot(), f, 10));
					PenguinEntity.this.yBodyRot = PenguinEntity.this.getYRot();
					PenguinEntity.this.yHeadRot = PenguinEntity.this.getYRot();
					if (PenguinEntity.this.isInWater()) {
						PenguinEntity.this.setSpeed((float) PenguinEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						PenguinEntity.this.setXRot(this.rotlerp(PenguinEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(PenguinEntity.this.getXRot() * (float) (Math.PI / 180.0));
						PenguinEntity.this.setZza(f3 * f1);
						PenguinEntity.this.setYya((float) (f1 * dy));
					} else {
						PenguinEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					PenguinEntity.this.setSpeed(0);
					PenguinEntity.this.setYya(0);
					PenguinEntity.this.setZza(0);
				}
			}
		};
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new WaterBoundPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, true) {
			@Override
			protected boolean canPerformAttack(LivingEntity entity) {
				return this.isTimeToAttack() && this.mob.distanceToSqr(entity) < (this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth()) && this.mob.getSensing().hasLineOfSight(entity);
			}
		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(4, new BreedGoal(this, 1));
		this.goalSelector.addGoal(5, new FollowParentGoal(this, 0.8));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, Cod.class, false, false));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, SardineEntity.class, false, false));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, PiranhaEntity.class, false, false));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, TunaEntity.class, false, false));
		this.goalSelector.addGoal(10, new PanicGoal(this, 1.2));
		this.goalSelector.addGoal(11, new AvoidEntityGoal<>(this, PolarBear.class, (float) 6, 1, 1.2));
		this.goalSelector.addGoal(12, new AvoidEntityGoal<>(this, LynxEntity.class, (float) 6, 1, 1.2));
		this.goalSelector.addGoal(13, new AvoidEntityGoal<>(this, JellyfishEntity.class, (float) 6, 1, 1.2));
		this.goalSelector.addGoal(15, new TemptGoal(this, 1, (Ingredient.of(Items.COD)), false));
		this.goalSelector.addGoal(16, new TemptGoal(this, 1, (Ingredient.of(ZingsBiomesModItems.RAW_PIRANHA.get())), false));
		this.goalSelector.addGoal(17, new TemptGoal(this, 1, (Ingredient.of(Items.SALMON)), false));
		this.goalSelector.addGoal(18, new LookAtPlayerGoal(this, LivingEntity.class, (float) 6));
		this.goalSelector.addGoal(19, new RandomSwimmingGoal(this, 10, 40));
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.penguin.emperor.idle"));
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.chicken.step")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.generic.death"));
	}

	@Override
	public boolean hurtServer(ServerLevel level, DamageSource damagesource, float amount) {
		if (damagesource.is(DamageTypes.DROWN))
			return false;
		return super.hurtServer(level, damagesource, amount);
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level().isClientSide()) {
			this.animationState0.animateWhen(true, this.tickCount);
			this.animationState2.animateWhen(PenguinSwimAnimConditionProcedure.execute(this), this.tickCount);
		}
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		return ZingsBiomesModEntities.PENGUIN.get().create(serverWorld, EntitySpawnReason.BREEDING);
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return Ingredient.of(ZingsBiomesModItems.RAW_PIRANHA.get(), Items.COD, Items.SALMON).test(stack);
	}

	@Override
	public boolean checkSpawnObstruction(LevelReader world) {
		return world.isUnobstructed(this);
	}

	@Override
	public boolean canDrownInFluidType(FluidType type) {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level();
		Entity entity = this;
		return false;
	}

	@Override
	public boolean canBreatheUnderwater() {
		return !this.canDrownInFluidType(NeoForgeMod.WATER_TYPE.value());
	}

	@Override
	public boolean isPushedByFluid() {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level();
		Entity entity = this;
		return false;
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
		event.register(ZingsBiomesModEntities.PENGUIN.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> world.getBlockState(pos.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && (EntitySpawnReason.ignoresLightRequirements(reason) || world.getRawBrightness(pos, 0) > 8),
				RegisterSpawnPlacementsEvent.Operation.REPLACE);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 25);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 5);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);
		builder = builder.add(NeoForgeMod.SWIM_SPEED, 0.3);
		builder = builder.add(Attributes.TEMPT_RANGE, 10);
		return builder;
	}
}