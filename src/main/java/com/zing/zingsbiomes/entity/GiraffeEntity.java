package com.zing.zingsbiomes.entity;

import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.*;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.HolderSet;

import com.zing.zingsbiomes.init.ZingsBiomesModEntities;

public class GiraffeEntity extends Animal {
	public GiraffeEntity(EntityType<GiraffeEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
		refreshDimensions();
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected boolean canPerformAttack(LivingEntity entity) {
				return this.isTimeToAttack() && this.mob.distanceToSqr(entity) < (this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth()) && this.mob.getSensing().hasLineOfSight(entity);
			}
		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(4, new FloatGoal(this));
		this.goalSelector.addGoal(5, new BreedGoal(this, 1));
		this.goalSelector.addGoal(6, new FollowParentGoal(this, 0.8));
		this.goalSelector.addGoal(7, new AvoidEntityGoal<>(this, Monster.class, (float) 6, 1, 1.2));
		this.goalSelector.addGoal(8, new TemptGoal(this, 1, (Ingredient.of(Blocks.OAK_LEAVES.asItem())), false));
		this.goalSelector.addGoal(9, new TemptGoal(this, 1, (Ingredient.of(Blocks.BIRCH_LEAVES.asItem())), false));
		this.goalSelector.addGoal(10, new TemptGoal(this, 1, (Ingredient.of(Blocks.SPRUCE_LEAVES.asItem())), false));
		this.goalSelector.addGoal(11, new TemptGoal(this, 1, (Ingredient.of(Blocks.JUNGLE_LEAVES.asItem())), false));
		this.goalSelector.addGoal(12, new TemptGoal(this, 1, (Ingredient.of(Blocks.ACACIA_LEAVES.asItem())), false));
		this.goalSelector.addGoal(13, new TemptGoal(this, 1, (Ingredient.of(Blocks.DARK_OAK_LEAVES.asItem())), false));
		this.goalSelector.addGoal(14, new TemptGoal(this, 1, (Ingredient.of(Blocks.PALE_OAK_LEAVES.asItem())), false));
		this.goalSelector.addGoal(15, new TemptGoal(this, 1, (Ingredient.of(Blocks.MANGROVE_LEAVES.asItem())), false));
		this.goalSelector.addGoal(16, new TemptGoal(this, 1, (Ingredient.of(Blocks.AZALEA_LEAVES.asItem())), false));
		this.goalSelector.addGoal(17, new TemptGoal(this, 1, (Ingredient.of(Blocks.FLOWERING_AZALEA_LEAVES.asItem())), false));
		this.goalSelector.addGoal(18, new TemptGoal(this, 1, (Ingredient.of(Blocks.CHERRY_LEAVES.asItem())), false));
		this.goalSelector.addGoal(19, new LookAtPlayerGoal(this, LivingEntity.class, (float) 6));
		this.goalSelector.addGoal(20, new PanicGoal(this, 1.2));
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
		return ZingsBiomesModEntities.GIRAFFE.get().create(serverWorld, EntitySpawnReason.BREEDING);
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return Ingredient.of(HolderSet.emptyNamed(BuiltInRegistries.ITEM, ItemTags.create(Identifier.parse("minecraft:leaves")))).test(stack);
	}

	@Override
	public EntityDimensions getDefaultDimensions(Pose pose) {
		return super.getDefaultDimensions(pose).scale(3f);
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
		event.register(ZingsBiomesModEntities.GIRAFFE.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
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