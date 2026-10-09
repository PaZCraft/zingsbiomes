package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.EndRodBlock;

public class QuartzUltravioletRodBlock extends EndRodBlock {
	public QuartzUltravioletRodBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GLASS).strength(1f, 10f).lightLevel(blockstate -> 10).noOcclusion().postProcess((bs, br, bp) -> bp).emissiveRendering(state -> true).isRedstoneConductor((bs, br, bp) -> false).forceSolidOff());
	}
}