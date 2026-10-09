package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class FossilizedPrototaxiteBlockBlock extends Block {
	public FossilizedPrototaxiteBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(1.5f, 10f).requiresCorrectToolForDrops());
	}
}