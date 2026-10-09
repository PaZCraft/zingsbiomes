package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceBlock;

public class YolkedFenceBlock extends FenceBlock {
	public YolkedFenceBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.NETHER_WOOD).strength(1f, 10f).forceSolidOn());
	}
}