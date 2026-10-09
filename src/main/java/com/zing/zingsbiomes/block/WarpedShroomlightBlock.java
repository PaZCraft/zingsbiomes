package com.zing.zingsbiomes.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;

public class WarpedShroomlightBlock extends DyeableShroomlightBlock {
	public WarpedShroomlightBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.WARPED_WART_BLOCK).sound(SoundType.SHROOMLIGHT).strength(1f, 10f).lightLevel(blockstate -> 15).postProcess((bs, br, bp) -> bp).emissiveRendering((bs, br, bp) -> true).instrument(NoteBlockInstrument.PLING));
	}
}