package com.zing.zingsbiomes.entity;

import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.EventHooks;

import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.*;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.BlockPos;

import com.zing.zingsbiomes.procedures.WoodenBirdzingUponDeathTriggerProcedure;
import com.zing.zingsbiomes.procedures.WoodenBirdzingShearingProcedure;
import com.zing.zingsbiomes.procedures.PaleOakWoodenBirdzingEntityIsHurtProcedure;
import com.zing.zingsbiomes.init.ZingsBiomesModEntities;

public class PaleWoodenBirdzingEntity extends TamableAnimal {
	public static final EntityDataAccessor<Boolean> DATA_is_sheared = SynchedEntityData.defineId(PaleWoodenBirdzingEntity.class, EntityDataSerializers.BOOLEAN);
	public final AnimationState animationState0 = new AnimationState();

	public PaleWoodenBirdzingEntity(EntityType<PaleWoodenBirdzingEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
	}

	@Override
	protected void defineSynchedData(SynchedEntityData.Builder builder) {
		super.defineSynchedData(builder);
		builder.define(DATA_is_sheared, false);
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
		this.targetSelector.addGoal(3, new HurtByTargetGoal(this).setAlertOthers());
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(5, new FloatGoal(this));
		this.goalSelector.addGoal(6, new LeapAtTargetGoal(this, (float) 0.5));
		this.goalSelector.addGoal(7, new BreedGoal(this, 1));
		this.targetSelector.addGoal(8, new OwnerHurtTargetGoal(this));
		this.goalSelector.addGoal(9, new FollowOwnerGoal(this, 1, (float) 10, (float) 2));
		this.goalSelector.addGoal(10, new OwnerHurtByTargetGoal(this));
		this.goalSelector.addGoal(11, new FollowParentGoal(this, 0.8));
		this.goalSelector.addGoal(12, new EatBlockGoal(this));
		this.goalSelector.addGoal(13, new LookAtPlayerGoal(this, LivingEntity.class, (float) 6));
		this.goalSelector.addGoal(14, new TemptGoal(this, 1, (Ingredient.of(Blocks.PALE_OAK_SAPLING.asItem())), false));
	}

	protected void dropCustomDeathLoot(ServerLevel serverLevel, DamageSource source, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(serverLevel, source, recentlyHitIn);
		this.spawnAtLocation(serverLevel, new ItemStack(Blocks.PALE_OAK_LOG));
	}

	@Override
	public SoundEvent getAmbientSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.pale.idle"));
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("block.creaking_heart.step")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.pale.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.wooden_birdzing.pale.death"));
	}

	@Override
	public boolean hurtServer(ServerLevel level, DamageSource damagesource, float amount) {
		
		
		
		
		
		Entity sourceentity = damagesource.getEntity();
		Entity immediatesourceentity = damagesource.getDirectEntity();

		PaleOakWoodenBirdzingEntityIsHurtProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
		if (damagesource.is(DamageTypes.FALL))
			return false;
		return super.hurtServer(level, damagesource, amount);
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		WoodenBirdzingUponDeathTriggerProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void addAdditionalSaveData(ValueOutput valueOutput) {
		super.addAdditionalSaveData(valueOutput);
		valueOutput.putBoolean("Datais_sheared", this.entityData.get(DATA_is_sheared));
	}

	@Override
	public void readAdditionalSaveData(ValueInput valueInput) {
		super.readAdditionalSaveData(valueInput);
		this.entityData.set(DATA_is_sheared, valueInput.getBooleanOr("Datais_sheared", false));
	}

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.SUCCESS;
		Item item = itemstack.getItem();
		if (itemstack.getItem() instanceof SpawnEggItem) {
			retval = super.mobInteract(sourceentity, hand);
		} else if (this.level().isClientSide()) {
			retval = (this.isTame() && this.isOwnedBy(sourceentity) || this.isFood(itemstack)) ? InteractionResult.SUCCESS : InteractionResult.PASS;
		} else {
			if (this.isTame()) {
				if (this.isOwnedBy(sourceentity)) {
					if (this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
						this.usePlayerItem(sourceentity, hand, itemstack);
						FoodProperties foodproperties = itemstack.get(DataComponents.FOOD);
						float nutrition = foodproperties != null ? (float) foodproperties.nutrition() : 1;
						this.heal(nutrition);
						retval = InteractionResult.SUCCESS;
					} else if (this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
						this.usePlayerItem(sourceentity, hand, itemstack);
						this.heal(4);
						retval = InteractionResult.SUCCESS;
					} else {
						retval = super.mobInteract(sourceentity, hand);
					}
				}
			} else if (this.isFood(itemstack)) {
				this.usePlayerItem(sourceentity, hand, itemstack);
				if (this.random.nextInt(3) == 0 && !EventHooks.onAnimalTame(this, sourceentity)) {
					this.tame(sourceentity);
					this.level().broadcastEntityEvent(this, (byte) 7);
				} else {
					this.level().broadcastEntityEvent(this, (byte) 6);
				}
				this.setPersistenceRequired();
				retval = InteractionResult.SUCCESS;
			} else {
				retval = super.mobInteract(sourceentity, hand);
				if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME)
					this.setPersistenceRequired();
			}
		}
		
		
		
		
		

		WoodenBirdzingShearingProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this, sourceentity);
		return retval;
	}

	@Override
	public void tick() {
		super.tick();
		if (this.level().isClientSide()) {
			this.animationState0.animateWhen(true, this.tickCount);
		}
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		return ZingsBiomesModEntities.WEEPING_WOODEN_BIRDZING.get().create(serverWorld, EntitySpawnReason.BREEDING);
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return Ingredient.of(Blocks.PALE_OAK_SAPLING.asItem()).test(stack);
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
		event.register(ZingsBiomesModEntities.WEEPING_WOODEN_BIRDZING.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> world.getBlockState(pos.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && (EntitySpawnReason.ignoresLightRequirements(reason) || world.getRawBrightness(pos, 0) > 8),
				RegisterSpawnPlacementsEvent.Operation.REPLACE);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 30);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);
		builder = builder.add(Attributes.TEMPT_RANGE, 10);
		return builder;
	}
}