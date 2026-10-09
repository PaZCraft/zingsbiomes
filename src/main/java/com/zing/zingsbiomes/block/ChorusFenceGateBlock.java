package com.zing.zingsbiomes.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;

public class ChorusFenceGateBlock extends FenceGateBlock {
	public ChorusFenceGateBlock(BlockBehaviour.Properties properties) {
		super(WoodType.OAK,
				properties
						.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.chorus.break")),
								() -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.chorus.step")), () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.chorus.place")),
								() -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.chorus.hit")), () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.chorus.hit"))))
						.strength(1f, 10f).forceSolidOn());
	}
}