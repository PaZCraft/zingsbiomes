package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;

public class CherryMossyStoneBrickWallBlock extends WallBlock {
	public CherryMossyStoneBrickWallBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f).requiresCorrectToolForDrops().forceSolidOn());
	}
}