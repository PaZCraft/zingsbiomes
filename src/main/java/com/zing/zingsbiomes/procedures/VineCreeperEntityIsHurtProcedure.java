package net.mcreator.zingsbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.particles.ParticleTypes;

public class VineCreeperEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 100, 1));
		world.addParticle(ParticleTypes.PAUSE_MOB_GROWTH, x, y, z, 0, 1, 0);
		world.addParticle(ParticleTypes.PAUSE_MOB_GROWTH, x, y, z, 1, 1, 0);
		world.addParticle(ParticleTypes.PAUSE_MOB_GROWTH, x, y, z, 1, 1, 1);
		world.addParticle(ParticleTypes.PAUSE_MOB_GROWTH, x, y, z, 0, 1, 1);
	}
}