package net.mcreator.zingsbiomes.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.skeleton.Bogged;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.zingsbiomes.init.ZingsBiomesModEntities;
import net.mcreator.zingsbiomes.entity.TangledEntity;
import net.mcreator.zingsbiomes.ZingsBiomesMod;

import java.util.Comparator;

public class PoisonerStruckByLightningProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof net.minecraft.server.level.ServerLevel _level) {
			double _cx = (double) x;
			double _cy = (double) y;
			double _cz = (double) z;
			int _r = (int) 5;
			double _p = 2;
			boolean _grav = true;
			net.minecraft.core.BlockPos _center = net.minecraft.core.BlockPos.containing(_cx, _cy, _cz);
			for (int _dx = -_r; _dx <= _r; _dx++) {
				for (int _dy = -_r; _dy <= _r; _dy++) {
					for (int _dz = -_r; _dz <= _r; _dz++) {
						if (_dx * _dx + _dy * _dy + _dz * _dz <= _r * _r) {
							net.minecraft.core.BlockPos _pos = _center.offset(_dx, _dy, _dz);
							net.minecraft.world.level.block.state.BlockState _state = _level.getBlockState(_pos);
							if (!_state.isAir() && _state.getDestroySpeed(_level, _pos) >= 0) {
								double _vx = _pos.getX() + 0.5d - _cx;
								double _vy = _pos.getY() + 0.5d - _cy;
								double _vz = _pos.getZ() + 0.5d - _cz;
								double _dist = Math.sqrt(_vx * _vx + _vy * _vy + _vz * _vz);
								if (_dist > 0) {
									_vx = (_vx / _dist) * _p;
									_vy = (_vy / _dist) * _p + 0.2d;
									_vz = (_vz / _dist) * _p;
								}
								net.minecraft.world.entity.item.FallingBlockEntity _falling = net.minecraft.world.entity.item.FallingBlockEntity.fall(_level, _pos, _state);
								if (_falling != null) {
									_level.setBlock(_pos, net.minecraft.world.level.block.Blocks.AIR.defaultBlockState(), 3);
									_falling.setDeltaMovement(new net.minecraft.world.phys.Vec3(_vx, _vy, _vz));
									_falling.hurtMarked = true;
									if (!_grav) {
										_falling.setNoGravity(true);
										final net.minecraft.core.BlockPos _startPos = _pos;
										final net.minecraft.world.entity.item.FallingBlockEntity _fEntity = _falling;
										_level.getServer().submit(() -> {
											if (_fEntity.isAlive() && _fEntity.distanceToSqr(_startPos.getX(), _startPos.getY(), _startPos.getZ()) > 4096) {
												_fEntity.discard();
											}
										});
									}
								}
							}
						}
					}
				}
			}
		}
		if (entity instanceof net.minecraft.world.entity.Entity _ent) {
			double _blocks = 6;
			double _speed = 2;
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
		ZingsBiomesMod.queueServerWork(50, () -> {
			if (entity instanceof net.minecraft.world.entity.Entity _ent1 && (findEntityInWorldRange(world, Player.class, x, y, z, 4)) instanceof net.minecraft.world.entity.Entity _ent2) {
				net.minecraft.world.phys.Vec3 _pos1 = _ent1.position();
				net.minecraft.world.phys.Vec3 _pos2 = _ent2.position();
				_ent1.teleportTo(_pos2.x, _pos2.y, _pos2.z);
				_ent2.teleportTo(_pos1.x, _pos1.y, _pos1.z);
				if (_ent1 instanceof net.minecraft.server.level.ServerPlayer _player1) {
					_player1.connection.teleport(_pos2.x, _pos2.y, _pos2.z, _player1.getYRot(), _player1.getXRot());
				}
				if (_ent2 instanceof net.minecraft.server.level.ServerPlayer _player2) {
					_player2.connection.teleport(_pos1.x, _pos1.y, _pos1.z, _player2.getYRot(), _player2.getXRot());
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.CREEPER.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.BOGGED.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = ZingsBiomesModEntities.TANGLED.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if ((findEntityInWorldRange(world, Creeper.class, x, y, z, 4)) instanceof Mob _entity && (findEntityInWorldRange(world, Player.class, x, y, z, 4)) instanceof LivingEntity _ent)
				_entity.setTarget(_ent);
			if ((findEntityInWorldRange(world, Bogged.class, x, y, z, 4)) instanceof Mob _entity && (findEntityInWorldRange(world, Player.class, x, y, z, 4)) instanceof LivingEntity _ent)
				_entity.setTarget(_ent);
			if ((findEntityInWorldRange(world, TangledEntity.class, x, y, z, 4)) instanceof Mob _entity && (findEntityInWorldRange(world, Player.class, x, y, z, 4)) instanceof LivingEntity _ent)
				_entity.setTarget(_ent);
		});
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}