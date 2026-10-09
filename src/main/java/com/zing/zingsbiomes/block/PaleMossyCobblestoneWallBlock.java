package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;

public class PaleMossyCobblestoneWallBlock extends WallBlock {
	public PaleMossyCobblestoneWallBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f).requiresCorrectToolForDrops().forceSolidOn());
	}
}