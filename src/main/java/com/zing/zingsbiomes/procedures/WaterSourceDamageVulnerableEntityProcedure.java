package net.mcreator.zingsbiomes.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class WaterSourceDamageVulnerableEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (isInWaterRainOrBubble(entity)) {
			if (entity.is(TagKey.create(Registries.ENTITY_TYPE, Identifier.parse("zings_biomes:hurt_by_water")))) {
				{
					Entity _ent = entity;
					if (_ent.level() instanceof ServerLevel _serverLevel) {
						_ent.hurtServer(_serverLevel, new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 1);
					}
				}
			}
		}
	}

	private static boolean isInWaterRainOrBubble(Entity entity) {
		return entity.isInWaterOrRain() || entity.getInBlockState().is(Blocks.BUBBLE_COLUMN);
	}
}