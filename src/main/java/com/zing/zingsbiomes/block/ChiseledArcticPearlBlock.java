package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class ChiseledArcticPearlBlock extends Block {
	public ChiseledArcticPearlBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f));
	}
}