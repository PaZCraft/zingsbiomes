package com.zing.zingsbiomes.entity;

import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.common.NeoForgeMod;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.animal.feline.Ocelot;
import net.minecraft.world.entity.animal.feline.Cat;
import net.minecraft.world.entity.animal.camel.CamelHusk;
import net.minecraft.world.entity.animal.camel.Camel;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.*;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.Difficulty;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;

import com.zing.zingsbiomes.procedures.SandyStruckByLightningProcedure;
import com.zing.zingsbiomes.procedures.SandyIsHurtProcedure;
import com.zing.zingsbiomes.init.ZingsBiomesModEntities;

public class SandstoneCreeperEntity extends ThemedCreeperEntity {
	public SandstoneCreeperEntity(EntityType<SandstoneCreeperEntity> type, Level world) {
		super(type, world);
		xpReward = 3;
		setNoAi(false);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, Player.class, false, true));
		this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, LivingEntity.class, (float) 6));
		this.goalSelector.addGoal(7, new AvoidEntityGoal<>(this, Cat.class, (float) 15, 1, 1.2));
		this.goalSelector.addGoal(8, new AvoidEntityGoal<>(this, Ocelot.class, (float) 15, 1, 1.2));
		this.goalSelector.addGoal(9, new AvoidEntityGoal<>(this, LynxEntity.class, (float) 25, 1, 1.2));
		this.goalSelector.addGoal(10, new BreathAirGoal(this));
		this.goalSelector.addGoal(11, new PanicGoal(this, 1.2));
		this.goalSelector.addGoal(12, new LeapAtTargetGoal(this, (float) 0.2));
		this.goalSelector.addGoal(13, new RemoveBlockGoal(Blocks.FIRE, this, 1, (int) 3));
		this.goalSelector.addGoal(14, new MoveBackToVillageGoal(this, 0.6, false));
		this.goalSelector.addGoal(15, new BreakDoorGoal(this, e -> true));
		this.goalSelector.addGoal(16, new AvoidEntityGoal<>(this, Camel.class, (float) 15, 2, 1.5));
		this.goalSelector.addGoal(17, new AvoidEntityGoal<>(this, CamelHusk.class, (float) 10, 1.5, 1.2));
	}

	@Override
	protected void applyExplosionEffect(ServerLevel level, BlockPos origin) {
		if (level.getGameRules().get(net.minecraft.world.level.gamerules.GameRules.MOB_GRIEFING))
			spreadQuicksand(level, origin);
	}

	protected void dropCustomDeathLoot(ServerLevel serverLevel, DamageSource source, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(serverLevel, source, recentlyHitIn);
		this.spawnAtLocation(serverLevel, new ItemStack(Items.GUNPOWDER));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.creeper.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.creeper.death"));
	}

	@Override
	public void thunderHit(ServerLevel serverWorld, LightningBolt lightningBolt) {
		super.thunderHit(serverWorld, lightningBolt);
		SandyStruckByLightningProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
	}

	@Override
	public boolean hurtServer(ServerLevel level, DamageSource damagesource, float amount) {
		
		
		
		
		
		Entity sourceentity = damagesource.getEntity();
		Entity immediatesourceentity = damagesource.getDirectEntity();

		SandyIsHurtProcedure.execute(level, this.getX(), this.getY(), this.getZ(), this, sourceentity);
		if (damagesource.getDirectEntity() instanceof AbstractArrow)
			return false;
		if (damagesource.is(DamageTypes.FALL))
			return false;
		if (damagesource.is(DamageTypes.CACTUS))
			return false;
		return super.hurtServer(level, damagesource, amount);
	}

	@Override
	public boolean canDrownInFluidType(FluidType type) {
		
		
		
		
		
		return false;
	}

	@Override
	public boolean canBreatheUnderwater() {
		return !this.canDrownInFluidType(NeoForgeMod.WATER_TYPE.value());
	}

	@Override
	public boolean isPushedByFluid() {
		
		
		
		
		
		return false;
	}

	@Override
	public boolean checkSpawnRules(LevelAccessor level, EntitySpawnReason reason) {
		return this.level().dimension() == Level.OVERWORLD ? super.checkSpawnRules(level, reason) : true;
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
		event.register(ZingsBiomesModEntities.SANDSTONE_CREEPER.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> world.getDifficulty() != Difficulty.PEACEFUL
				&& (EntitySpawnReason.ignoresLightRequirements(reason) || Monster.isDarkEnoughToSpawn(world, pos, random)) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random), RegisterSpawnPlacementsEvent.Operation.REPLACE);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 25);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 2);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);
		return builder;
	}
}