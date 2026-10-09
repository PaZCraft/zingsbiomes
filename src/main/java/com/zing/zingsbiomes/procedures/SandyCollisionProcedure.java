package com.zing.zingsbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class SandyCollisionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		world.addParticle(ParticleTypes.POOF, x, y, z, 0, 0.5, 0);
		world.addParticle(ParticleTypes.POOF, x, y, z, 0.5, 0.5, 0);
		world.addParticle(ParticleTypes.POOF, x, y, z, 0.5, 0.5, 0.5);
		world.addParticle(ParticleTypes.POOF, x, y, z, 1, 0.5, 0);
		world.addParticle(ParticleTypes.POOF, x, y, z, 0, 0.5, 1);
		world.addParticle(ParticleTypes.POOF, x, y, z, 0.5, 0.5, 1);
		world.addParticle(ParticleTypes.POOF, x, y, z, 1, 0.5, 1);
		world.addParticle(ParticleTypes.POOF, x, y, z, 1, 0.5, 0.5);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.brush.brushing.sand")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.brush.brushing.sand")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.SPEED, 60, 2));
		{
			Entity _ent = entity;
			if (_ent.level() instanceof ServerLevel _serverLevel) {
				_ent.hurtServer(_serverLevel, new DamageSource(world.holderOrThrow(DamageTypes.PLAYER_ATTACK)), (float) 0.1);
			}
		}
	}
}