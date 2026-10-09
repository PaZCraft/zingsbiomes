package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class LemonsweetCoralBlockBlock extends Block {
	public LemonsweetCoralBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.CORAL_BLOCK).strength(1f, 10f));
	}
}