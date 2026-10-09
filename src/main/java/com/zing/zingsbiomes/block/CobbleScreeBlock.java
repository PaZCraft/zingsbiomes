package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class CobbleScreeBlock extends Block {
	public CobbleScreeBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f));
	}
}