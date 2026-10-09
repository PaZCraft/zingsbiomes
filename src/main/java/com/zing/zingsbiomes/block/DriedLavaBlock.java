package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class DriedLavaBlock extends Block {
	public DriedLavaBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.BASALT).strength(1.25f, 11.5f).requiresCorrectToolForDrops());
	}
}