package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class YolkedSlabBlock extends SlabBlock {
	public YolkedSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.NETHER_WOOD).strength(1f, 10f));
	}
}