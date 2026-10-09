package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;

public class YolkedShroomlightBlock extends DyeableShroomlightBlock {
	public YolkedShroomlightBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.SHROOMLIGHT).strength(1f, 10f).lightLevel(blockstate -> 15).postProcess((bs, br, bp) -> bp).emissiveRendering(state -> true));
	}
}