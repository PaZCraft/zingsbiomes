package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.SoundType;

public class GlowBerryTrapdoorBlock extends TrapDoorBlock {
	public GlowBerryTrapdoorBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.OAK, properties.sound(SoundType.CHERRY_WOOD).strength(1f, 10f).noOcclusion().postProcess((bs, br, bp) -> bp).emissiveRendering(state -> true).isRedstoneConductor((bs, br, bp) -> false));
	}
}