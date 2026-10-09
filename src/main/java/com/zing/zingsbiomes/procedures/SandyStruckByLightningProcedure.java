package com.zing.zingsbiomes.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.zombie.Husk;
import net.minecraft.world.entity.monster.skeleton.Parched;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

import com.zing.zingsbiomes.init.ZingsBiomesModEntities;

import java.util.Comparator;

public class SandyStruckByLightningProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		spawnEntityById(world, "minecraft:husk", x, y, z);
		spawnEntityById(world, "minecraft:parched", x, y, z);
		ZingsBiomesModEntities.queueServerWork(20, (Runnable) () -> {
			spawnEntityById(world, "minecraft:creeper", x, y, z);
			if ((findEntityInWorldRange(world, Husk.class, x, y, z, 4)) instanceof Mob _entity && (findEntityInWorldRange(world, Creeper.class, x, y, z, 4)) instanceof LivingEntity _ent)
				_entity.setTarget(_ent);
			if ((findEntityInWorldRange(world, Parched.class, x, y, z, 4)) instanceof Mob _entity && (findEntityInWorldRange(world, Creeper.class, x, y, z, 4)) instanceof LivingEntity _ent)
				_entity.setTarget(_ent);
		});
	}

	private static Entity spawnEntityById(LevelAccessor world, String entityId, double x, double y, double z) {
		if (!(world instanceof ServerLevel _level)) {
			return null;
		}
		EntityType<?> entityType = BuiltInRegistries.ENTITY_TYPE.getValue(Identifier.parse(entityId));
		if (entityType == null) {
			return null;
		}
		Entity entityToSpawn = entityType.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
		if (entityToSpawn != null) {
			entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
		}
		return entityToSpawn;
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}