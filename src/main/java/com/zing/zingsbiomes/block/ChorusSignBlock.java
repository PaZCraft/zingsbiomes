package com.zing.zingsbiomes.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;

import com.zing.zingsbiomes.init.ZingsBiomesModWoodTypes;

public class ChorusSignBlock extends StandingSignBlock {
	public ChorusSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.CHORUS_SIGN_WOOD_TYPE,
				properties
						.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.chorus.break")),
								() -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.chorus.step")), () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.chorus.place")),
								() -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.chorus.hit")), () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.chorus.hit"))))
						.strength(1f, 10f).forceSolidOn());
	}
}