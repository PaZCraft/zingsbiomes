package com.zing.zingsbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class AnchorStruckByLightningProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof net.minecraft.world.entity.Entity _centerEnt) {
			double _radius = 5;
			double _power = 1;
			net.minecraft.world.phys.Vec3 _centerPos = _centerEnt.position();
			net.minecraft.world.phys.AABB _area = new net.minecraft.world.phys.AABB(_centerPos, _centerPos).inflate(_radius);
			for (net.minecraft.world.entity.Entity _ent : world.getEntitiesOfClass(net.minecraft.world.entity.Entity.class, _area)) {
				if (_ent != _centerEnt && _ent.position().distanceToSqr(_centerPos) <= _radius * _radius) {
					net.minecraft.world.phys.Vec3 _vec = _centerPos.subtract(_ent.position());
					if (_vec.lengthSqr() > 1.0E-4D) {
						net.minecraft.world.phys.Vec3 _motion = _vec.normalize().scale(_power);
						_ent.setDeltaMovement(_motion);
						_ent.hurtMarked = true;
						if (_ent instanceof net.minecraft.server.level.ServerPlayer _player) {
							_player.connection.send(new net.minecraft.network.protocol.game.ClientboundSetEntityMotionPacket(_ent));
						}
					}
				}
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = EntityType.TNT.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
			}
		}
	}
}