package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.SoundType;

import com.zing.zingsbiomes.init.ZingsBiomesModWoodTypes;

public class GlowBerrySignBlock extends StandingSignBlock {
	public GlowBerrySignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.GLOW_BERRY_SIGN_WOOD_TYPE, properties.sound(SoundType.CHERRY_WOOD).strength(1f, 10f).postProcess((bs, br, bp) -> bp).emissiveRendering((bs, br, bp) -> true).forceSolidOn());
	}
}