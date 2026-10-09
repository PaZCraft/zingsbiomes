package com.zing.zingsbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.ParticleTypes;

public class BurnedSpiderOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Mob _mobEnt0 && _mobEnt0.isAggressive()) {
			world.addParticle(ParticleTypes.FLAME, x, y, z, 0, 0.5, 0);
			world.addParticle(ParticleTypes.SMOKE, x, y, z, 0, 0.8, 0);
		}
		WaterSourceDamageVulnerableEntityProcedure.execute(world, entity);
	}
}