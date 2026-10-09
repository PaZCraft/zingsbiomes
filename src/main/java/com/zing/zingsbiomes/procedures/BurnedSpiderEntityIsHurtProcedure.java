package net.mcreator.zingsbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.ParticleTypes;

public class BurnedSpiderEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		sourceentity.igniteForSeconds(15);
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
			float _newYaw = _ent.getYRot() + (float) 360;
			_ent.setYRot(_newYaw);
			if (_ent instanceof net.minecraft.world.entity.LivingEntity _living) {
				_living.yHeadRot = _newYaw;
				_living.yBodyRot = _newYaw;
			}
		}
		world.addParticle(ParticleTypes.LAVA, x, y, z, 0, 0.5, 0);
	}
}