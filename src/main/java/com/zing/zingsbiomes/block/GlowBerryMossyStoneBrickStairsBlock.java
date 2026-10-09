package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.Blocks;

public class GlowBerryMossyStoneBrickStairsBlock extends StairBlock {
	public GlowBerryMossyStoneBrickStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.strength(1f, 10f).requiresCorrectToolForDrops().postProcess((bs, br, bp) -> bp).emissiveRendering(state -> true));
	}

	@Override
	public float getExplosionResistance() {
		return 10f;
	}
}