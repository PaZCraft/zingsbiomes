package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class BlockOfUltravioletResinBlock extends Block {
	public BlockOfUltravioletResinBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.RESIN).strength(1f, 10f));
	}
}