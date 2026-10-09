package net.mcreator.zingsbiomes.entity;

import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.animal.wolf.Wolf;
import net.minecraft.world.entity.animal.golem.IronGolem;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.*;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.zingsbiomes.init.ZingsBiomesModEntities;

public class MuskoxEntity extends Animal {
	public MuskoxEntity(EntityType<MuskoxEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
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
		this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(5, new FloatGoal(this));
		this.goalSelector.addGoal(6, new BreedGoal(this, 1));
		this.goalSelector.addGoal(7, new FollowParentGoal(this, 0.8));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, Monster.class, false, true));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, CoyoteEntity.class, false, true));
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, Wolf.class, false, true));
		this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, LynxEntity.class, false, true));
		this.goalSelector.addGoal(12, new AvoidEntityGoal<>(this, IronGolem.class, (float) 6, 1, 1.2));
		this.goalSelector.addGoal(13, new EatBlockGoal(this));
		this.goalSelector.addGoal(14, new FollowMobGoal(this, 1, (float) 10, (float) 5));
		this.goalSelector.addGoal(15, new TemptGoal(this, 1, (Ingredient.of(Blocks.HAY_BLOCK.asItem())), false));
		this.goalSelector.addGoal(16, new LookAtPlayerGoal(this, LivingEntity.class, (float) 6));
		this.goalSelector.addGoal(17, new RemoveBlockGoal(Blocks.HAY_BLOCK, this, 1, (int) 3));
		this.goalSelector.addGoal(18, new RemoveBlockGoal(Blocks.SAND, this, 1, (int) 3));
		this.goalSelector.addGoal(19, new RemoveBlockGoal(Blocks.STONE, this, 1, (int) 3));
		this.goalSelector.addGoal(20, new RemoveBlockGoal(Blocks.DIRT, this, 1, (int) 3));
		this.goalSelector.addGoal(21, new RemoveBlockGoal(Blocks.OAK_LOG, this, 1, (int) 3));
		this.goalSelector.addGoal(22, new RemoveBlockGoal(Blocks.SPRUCE_LOG, this, 1, (int) 3));
		this.goalSelector.addGoal(23, new RemoveBlockGoal(Blocks.TALL_GRASS, this, 1, (int) 3));
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
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
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		return ZingsBiomesModEntities.MUSKOX.get().create(serverWorld, EntitySpawnReason.BREEDING);
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return Ingredient.of(Blocks.HAY_BLOCK.asItem()).test(stack);
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
		event.register(ZingsBiomesModEntities.MUSKOX.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> world.getBlockState(pos.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && (EntitySpawnReason.ignoresLightRequirements(reason) || world.getRawBrightness(pos, 0) > 8),
				RegisterSpawnPlacementsEvent.Operation.REPLACE);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 20);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 6);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 1.5);
		builder = builder.add(Attributes.TEMPT_RANGE, 10);
		return builder;
	}
}