package net.mcreator.zingsbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class BomberryProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.bomberry.explode")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:entity.bomberry.explode")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		{
			Entity _ent = entity;
			if (_ent.level() instanceof ServerLevel _serverLevel) {
				_ent.hurtServer(_serverLevel, new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, Identifier.parse("zings_biomes:bomberry_shot")))), 5);
			}
		}
		{
			double _x = x;
			double _y = y;
			double _z = z;
			double _radius = 10;
			double _power = 1;
			net.minecraft.world.phys.Vec3 _centerPos = new net.minecraft.world.phys.Vec3(_x, _y, _z);
			net.minecraft.world.phys.AABB _area = new net.minecraft.world.phys.AABB(_centerPos, _centerPos).inflate(_radius);
			for (net.minecraft.world.entity.Entity _ent : world.getEntitiesOfClass(net.minecraft.world.entity.Entity.class, _area)) {
				if (_ent.position().distanceToSqr(_centerPos) <= _radius * _radius) {
					net.minecraft.world.phys.Vec3 _vec = _ent.position().subtract(_centerPos);
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
		world.addParticle(ParticleTypes.POOF, x, y, z, 0, 0.1, 0);
		world.addParticle(ParticleTypes.POOF, x, y, z, 0.1, 0.1, 0);
		world.addParticle(ParticleTypes.POOF, x, y, z, 0.1, 0.1, 0.1);
	}
}