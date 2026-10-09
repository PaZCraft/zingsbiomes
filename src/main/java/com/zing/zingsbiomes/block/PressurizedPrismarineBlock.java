package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class PressurizedPrismarineBlock extends Block {
	public PressurizedPrismarineBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1.5f, 15f).requiresCorrectToolForDrops());
	}
}