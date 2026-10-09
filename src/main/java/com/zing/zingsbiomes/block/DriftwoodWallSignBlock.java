package net.mcreator.zingsbiomes.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.zingsbiomes.init.ZingsBiomesModWoodTypes;
import net.mcreator.zingsbiomes.init.ZingsBiomesModBlocks;

public class DriftwoodWallSignBlock extends WallSignBlock {
	public DriftwoodWallSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.DRIFTWOOD_SIGN_WOOD_TYPE,
				properties
						.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.driftwood.break")),
								() -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.driftwood.step")), () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.driftwood.place")),
								() -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.driftwood.hit")), () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.driftwood.hit"))))
						.strength(1f, 10f).forceSolidOn().overrideLootTable(ZingsBiomesModBlocks.DRIFTWOOD_SIGN.get().getLootTable()).overrideDescription(ZingsBiomesModBlocks.DRIFTWOOD_SIGN.get().getDescriptionId()));
	}
}