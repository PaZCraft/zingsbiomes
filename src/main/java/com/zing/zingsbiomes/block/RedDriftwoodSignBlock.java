package com.zing.zingsbiomes.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;

import com.zing.zingsbiomes.init.ZingsBiomesModWoodTypes;

public class RedDriftwoodSignBlock extends StandingSignBlock {
	public RedDriftwoodSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.RED_DRIFTWOOD_SIGN_WOOD_TYPE,
				properties
						.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.driftwood.break")),
								() -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.driftwood.step")), () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.driftwood.place")),
								() -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.driftwood.hit")), () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.driftwood.hit"))))
						.strength(1f, 10f).forceSolidOn());
	}
}