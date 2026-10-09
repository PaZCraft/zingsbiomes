package com.zing.zingsbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Holder;
import net.minecraft.core.BlockPos;

public class SporeeperItIsStruckByLightningProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		((LivingEntity) entity).getAttribute(Holder.direct(BuiltInRegistries.ATTRIBUTE.getValue(Identifier.parse("minecraft:scale")))).setBaseValue(0.1);
		if (world instanceof ServerLevel _level) {
			EntityType<?> entityType = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.parse("minecraft:skeleton"));
			if (entityType != null) {
				Entity entityToSpawn = entityType.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
	}
}