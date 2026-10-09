package com.zing.zingsbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.ParticleTypes;

public class FloodCreeperPlayerCollidesWithThisEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		world.addParticle(ParticleTypes.SNOWFLAKE, x, y, z, 0, 1, 0);
		entity.setTicksFrozen(180);
	}
}