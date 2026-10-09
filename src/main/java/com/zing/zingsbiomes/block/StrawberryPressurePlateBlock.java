package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.PressurePlateBlock;

public class StrawberryPressurePlateBlock extends PressurePlateBlock {
	public StrawberryPressurePlateBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.OAK, properties.sound(SoundType.CHERRY_WOOD).strength(1f, 10f).forceSolidOn());
	}
}