package com.zing.zingsbiomes.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;

public class TinBarsBlock extends IronBarsBlock {
	public TinBarsBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.tin.break")),
				() -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.tin.step")), () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.tin.place")),
				() -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.tin.hit")), () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.tin.land")))).strength(1f, 10f)
				.requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}
}