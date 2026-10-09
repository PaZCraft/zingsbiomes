package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;

public class GlowBerryMossyCobblestoneWallBlock extends WallBlock {
	public GlowBerryMossyCobblestoneWallBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f).requiresCorrectToolForDrops().postProcess((bs, br, bp) -> bp).emissiveRendering(state -> true).forceSolidOn());
	}
}