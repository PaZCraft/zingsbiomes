package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class NeonOrangeWoolBlock extends Block {
	public NeonOrangeWoolBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOL).strength(1f, 10f));
	}
}