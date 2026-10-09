package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.DoorBlock;

public class YolkedDoorBlock extends DoorBlock {
	public YolkedDoorBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.OAK, properties.sound(SoundType.NETHER_WOOD).strength(1f, 10f));
	}
}