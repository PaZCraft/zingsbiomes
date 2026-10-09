package com.zing.zingsbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class MangroveShroomOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			_level.holderOrThrow(
				ResourceKey.create(
					Registries.PLACED_FEATURE,
					Identifier.parse("zings_biomes:huge_mangrove_shroom")
				)
			).value().place(
				_level,
				_level.getChunkSource().getGenerator(),
				_level.getRandom(),
				BlockPos.containing(x, y, z)
			);
		}
	}
}