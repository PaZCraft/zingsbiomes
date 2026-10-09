package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceGateBlock;

public class GlowBerryFenceGateBlock extends FenceGateBlock {
	public GlowBerryFenceGateBlock(BlockBehaviour.Properties properties) {
		super(WoodType.OAK, properties.sound(SoundType.CHERRY_WOOD).strength(1f, 10f).postProcess((bs, br, bp) -> bp).emissiveRendering(state -> true).forceSolidOn());
	}
}