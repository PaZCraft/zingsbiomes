package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class GlowBerryPlanksBlock extends Block {
	public GlowBerryPlanksBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.CHERRY_WOOD).strength(1f, 10f).postProcess((bs, br, bp) -> bp).emissiveRendering(state -> true));
	}
}