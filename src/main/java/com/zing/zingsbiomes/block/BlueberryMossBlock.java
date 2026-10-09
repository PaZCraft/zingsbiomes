package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class BlueberryMossBlock extends Block {
	public BlueberryMossBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.MOSS).strength(1f, 10f));
	}
}