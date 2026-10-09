package net.mcreator.zingsbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.zingsbiomes.ZingsBiomesMod;

public class EndCubeOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof Mob _mobEnt0 && _mobEnt0.isAggressive()) {
			if (entity instanceof net.minecraft.world.entity.Mob _mob && sourceentity instanceof net.minecraft.world.entity.Entity _target) {
				if (true) {
					_mob.getLookControl().setLookAt(_target, 30.0F, 30.0F);
					double _dx = _target.getX() - _mob.getX();
					double _dy = _target.getEyeY() - _mob.getEyeY();
					double _dz = _target.getZ() - _mob.getZ();
					double _dist = Math.sqrt(_dx * _dx + _dz * _dz);
					if (_dist >= 1.0E-7D) {
						float _yaw = (float) (Math.atan2(_dz, _dx) * (180.0D / Math.PI)) - 90.0F;
						float _pitch = (float) (-(Math.atan2(_dy, _dist) * (180.0D / Math.PI)));
						_mob.setYRot(_yaw);
						_mob.setXRot(_pitch);
						_mob.yHeadRot = _yaw;
						_mob.yBodyRot = _yaw;
					}
					_mob.goalSelector.getAvailableGoals().stream().filter(_g -> _g.getGoal() instanceof net.minecraft.world.entity.ai.goal.RandomLookAroundGoal || _g.getGoal() instanceof net.minecraft.world.entity.ai.goal.LookAtPlayerGoal)
							.forEach(_g -> _mob.goalSelector.removeGoal(_g.getGoal()));
				} else {
					_mob.goalSelector.addGoal(8, new net.minecraft.world.entity.ai.goal.LookAtPlayerGoal(_mob, net.minecraft.world.entity.player.Player.class, 8.0F));
					_mob.goalSelector.addGoal(8, new net.minecraft.world.entity.ai.goal.RandomLookAroundGoal(_mob));
				}
			}
			ZingsBiomesMod.queueServerWork((int) Mth.nextDouble(RandomSource.create(), 45, 210), () -> {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.slime.jump")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.slime.jump")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
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
				if (entity instanceof net.minecraft.world.entity.Entity _ent) {
					double _power = 1.5;
					net.minecraft.world.phys.Vec3 _motion;
					if (true) {
						_motion = _ent.getLookAngle().scale(_power);
					} else {
						double _yaw = Math.toRadians(_ent.getYRot());
						double _dx = -Math.sin(_yaw);
						double _dz = Math.cos(_yaw);
						_motion = new net.minecraft.world.phys.Vec3(_dx * _power, _ent.getDeltaMovement().y, _dz * _power);
					}
					_ent.setDeltaMovement(_motion);
					_ent.hurtMarked = true;
					if (_ent instanceof net.minecraft.server.level.ServerPlayer _player) {
						_player.connection.send(new net.minecraft.network.protocol.game.ClientboundSetEntityMotionPacket(_ent));
					}
				}
			});
		}
	}
}