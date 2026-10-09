package com.zing.zingsbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.projectile.LlamaSpit;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class PoisonedSpiderEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 60, 1));
		{
			if (world instanceof net.minecraft.world.level.Level _level) {
				net.minecraft.world.level.Level projectileLevel = _level;
				double _custom_x = (double) x;
				double _custom_y = (double) y;
				double _custom_z = (double) z;
				net.minecraft.world.entity.Entity _targetEntity = sourceentity;
				if (_targetEntity != null && new LlamaSpit(EntityType.LLAMA_SPIT, projectileLevel) instanceof net.minecraft.world.entity.projectile.Projectile _proj) {
					double _dx = _targetEntity.getX() - _custom_x;
					double _dy = _targetEntity.getEyeY() - 0.1d - _custom_y;
					double _dz = _targetEntity.getZ() - _custom_z;
					double _dist = Math.sqrt(_dx * _dx + _dy * _dy + _dz * _dz);
					if (_dist >= 1.0E-7D) {
						double _spawnX = _custom_x + (_dx / _dist) * 1.0d;
						double _spawnY = _custom_y + (_dy / _dist) * 1.0d;
						double _spawnZ = _custom_z + (_dz / _dist) * 1.0d;
						_proj.setPos(_spawnX, _spawnY, _spawnZ);
						_proj.shoot(_dx, _dy, _dz, (float) 1.5, (float) 5);
						_level.addFreshEntity(_proj);
					}
				}
			}
		}
	}
}