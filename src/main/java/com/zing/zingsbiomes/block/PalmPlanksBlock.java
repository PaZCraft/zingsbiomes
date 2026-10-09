package com.zing.zingsbiomes.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;

public class PalmPlanksBlock extends Block {
	public PalmPlanksBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.palm.break")),
				() -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.palm.step")), () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.palm.place")),
				() -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.palm.hit")), () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.palm.hit")))).strength(1f, 10f));
	}
}