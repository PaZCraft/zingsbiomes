package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceGateBlock;

public class WitherFenceGateBlock extends FenceGateBlock {
	public WitherFenceGateBlock(BlockBehaviour.Properties properties) {
		super(WoodType.OAK, properties.sound(SoundType.NETHER_WOOD).strength(1f, 10f).forceSolidOn());
	}
}