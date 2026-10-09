package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceBlock;

public class StrawberryFenceBlock extends FenceBlock {
	public StrawberryFenceBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.CHERRY_WOOD).strength(1f, 10f).forceSolidOn());
	}
}