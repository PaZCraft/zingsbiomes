package com.zing.zingsbiomes.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;

import com.zing.zingsbiomes.init.ZingsBiomesModWoodTypes;
import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

public class PalmWallSignBlock extends WallSignBlock {
	public PalmWallSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.PALM_SIGN_WOOD_TYPE,
				properties
						.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.palm.break")),
								() -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.palm.step")), () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.palm.place")),
								() -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.palm.hit")), () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.palm.hit"))))
						.strength(1f, 10f).noCollision().isRedstoneConductor((bs, br, bp) -> false).forceSolidOn().overrideLootTable(ZingsBiomesModBlocks.PALM_SIGN.get().getLootTable())
						.overrideDescription(ZingsBiomesModBlocks.PALM_SIGN.get().getDescriptionId()));
	}
}