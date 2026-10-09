package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class GlowingStarlightCoralBlockBlock extends Block {
	public GlowingStarlightCoralBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.CORAL_BLOCK).strength(1f, 10f).lightLevel(blockstate -> 5).postProcess((bs, br, bp) -> bp).emissiveRendering(state -> true));
	}
}