package com.zing.zingsbiomes.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class InvertedStripedEndRockBlock extends Block {
	public InvertedStripedEndRockBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).strength(1f, 10f).requiresCorrectToolForDrops());
	}
}