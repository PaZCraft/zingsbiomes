package net.mcreator.zingsbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class FirecrackerStruckByLightningProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof net.minecraft.world.entity.Entity _ent) {
			double _blocks = 5;
			double _speed = 1;
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
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(35);
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 1));
		entity.setInvisible(true);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.ghast.shoot")), SoundSource.HOSTILE, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.ghast.shoot")), SoundSource.HOSTILE, 1, 1, false);
			}
		}
		world.addParticle(ParticleTypes.FLAME, x, y, z, 0, 1, 0);
	}
}