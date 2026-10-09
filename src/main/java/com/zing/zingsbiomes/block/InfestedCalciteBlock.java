package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class InfestedCalciteBlock extends Block {
	public InfestedCalciteBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.CALCITE).strength(1f, 10f).requiresCorrectToolForDrops());
	}
}