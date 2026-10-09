package net.mcreator.zingsbiomes.procedures;

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
import net.minecraft.core.BlockPos;

import net.mcreator.zingsbiomes.ZingsBiomesMod;

public class VultureEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		{
			Entity _ent = sourceentity;
			if (_ent.level() instanceof ServerLevel _serverLevel) {
				_ent.hurtServer(_serverLevel, new DamageSource(world.holderOrThrow(DamageTypes.MOB_ATTACK)), 5);
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.bat.takeoff")), SoundSource.NEUTRAL, 1, 0);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.bat.takeoff")), SoundSource.NEUTRAL, 1, 0, false);
			}
		}
		if (entity instanceof net.minecraft.world.entity.Entity _ent) {
			double _blocks = 100;
			double _speed = 5;
			double _dx = 0;
			double _dz = 0;
			double _multiplier = _speed * (_blocks * 0.3d);
			double _dy = Math.min(_blocks * 0.15d, 1.5d);
			_ent.setDeltaMovement(new net.minecraft.world.phys.Vec3(_dx * _multiplier, _dy, _dz * _multiplier));
			_ent.hurtMarked = true;
			if (_ent instanceof net.minecraft.server.level.ServerPlayer _player) {
				_player.connection.send(new net.minecraft.network.protocol.game.ClientboundSetEntityMotionPacket(_ent));
			}
		}
		ZingsBiomesMod.queueServerWork(20, () -> {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 100, 1));
		});
	}
}