package net.mcreator.zingsbiomes.entity;

import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.wanderingtrader.WanderingTrader;
import net.minecraft.world.entity.npc.villager.Villager;
import net.minecraft.world.entity.monster.zombie.ZombifiedPiglin;
import net.minecraft.world.entity.monster.zombie.ZombieVillager;
import net.minecraft.world.entity.monster.zombie.Zombie;
import net.minecraft.world.entity.monster.zombie.Husk;
import net.minecraft.world.entity.monster.zombie.Drowned;
import net.minecraft.world.entity.monster.skeleton.Parched;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.illager.Vindicator;
import net.minecraft.world.entity.monster.illager.Pillager;
import net.minecraft.world.entity.monster.illager.Illusioner;
import net.minecraft.world.entity.monster.illager.Evoker;
import net.minecraft.world.entity.monster.Witch;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.*;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.zingsbiomes.init.ZingsBiomesModEntities;

public class HippoEntity extends Animal {
	public final AnimationState animationState0 = new AnimationState();

	public HippoEntity(EntityType<HippoEntity> type, Level world) {
		super(type, world);
		xpReward = 5;
		setNoAi(false);
		setPersistenceRequired();
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
		this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, LivingEntity.class, (float) 6));
		this.goalSelector.addGoal(6, new TemptGoal(this, 1, (Ingredient.of(Blocks.LILY_OF_THE_VALLEY.asItem())), false));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, Villager.class, false, true));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, WanderingTrader.class, false, true));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, Drowned.class, false, true));
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, Pillager.class, false, true));
		this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, Vindicator.class, false, true));
		this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, Evoker.class, false, true));
		this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, Witch.class, false, true));
		this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, Illusioner.class, false, true));
		this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, ScorchedEntity.class, false, true));
		this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, TangledEntity.class, false, true));
		this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, ThawedEntity.class, false, true));
		this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, Husk.class, false, true));
		this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, Zombie.class, false, true));
		this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, ZombieVillager.class, false, true));
		this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, CoyoteEntity.class, false, true));
		this.targetSelector.addGoal(22, new NearestAttackableTargetGoal(this, Parched.class, false, true));
		this.targetSelector.addGoal(23, new NearestAttackableTargetGoal(this, MountaineerEntity.class, false, true));
		this.targetSelector.addGoal(24, new NearestAttackableTargetGoal(this, CastawayEntity.class, false, true));
		this.targetSelector.addGoal(25, new NearestAttackableTargetGoal(this, ZombifiedPiglin.class, false, true));
		this.targetSelector.addGoal(26, new NearestAttackableTargetGoal(this, Piglin.class, false, true));
		this.targetSelector.addGoal(27, new NearestAttackableTargetGoal(this, PiglinBrute.class, false, true));
		this.goalSelector.addGoal(28, new TryFindWaterGoal(this));
		this.goalSelector.addGoal(29, new BreedGoal(this, 1));
		this.goalSelector.addGoal(30, new FollowParentGoal(this, 0.8));
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.hippo.idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.hippo.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.hippo.hurt"));
	}

	@Override
	public boolean hurtServer(ServerLevel level, DamageSource damagesource, float amount) {
		if (damagesource.is(DamageTypes.FALL))
			return false;
		if (damagesource.is(DamageTypes.DROWN))
			return false;
		if (damagesource.is(DamageTypes.EXPLOSION) || damagesource.is(DamageTypes.PLAYER_EXPLOSION))
			return false;
		return super.hurtServer(level, damagesource, amount);
	}

	@Override
	public boolean ignoreExplosion(Explosion explosion) {
		return true;
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
		return ZingsBiomesModEntities.HIPPO.get().create(serverWorld, EntitySpawnReason.BREEDING);
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return Ingredient.of(Blocks.LILY_OF_THE_VALLEY.asItem()).test(stack);
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
		event.register(ZingsBiomesModEntities.HIPPO.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> world.getBlockState(pos.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && (EntitySpawnReason.ignoresLightRequirements(reason) || world.getRawBrightness(pos, 0) > 8),
				RegisterSpawnPlacementsEvent.Operation.REPLACE);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 40);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 8);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.5);
		builder = builder.add(Attributes.TEMPT_RANGE, 10);
		return builder;
	}
}