package net.mcreator.zingsbiomes.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;

public class BlockOfSilverBlock extends Block {
	public BlockOfSilverBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.TERRACOTTA_CYAN)
				.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.silver.break")),
						() -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.silver.step")), () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.silver.place")),
						() -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.silver.hit")), () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.silver.land"))))
				.strength(1f, 10f).instrument(NoteBlockInstrument.IRON_XYLOPHONE));
	}
}