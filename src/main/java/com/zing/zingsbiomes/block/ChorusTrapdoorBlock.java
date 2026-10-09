package com.zing.zingsbiomes.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;

public class ChorusTrapdoorBlock extends TrapDoorBlock {
	public ChorusTrapdoorBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.OAK,
				properties
						.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.chorus.break")),
								() -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.chorus.step")), () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.chorus.place")),
								() -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.chorus.hit")), () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.chorus.hit"))))
						.strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}
}