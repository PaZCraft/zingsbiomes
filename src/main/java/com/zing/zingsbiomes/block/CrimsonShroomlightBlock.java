package com.zing.zingsbiomes.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;

public class CrimsonShroomlightBlock extends DyeableShroomlightBlock {
	public CrimsonShroomlightBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.CRIMSON_NYLIUM).sound(SoundType.SHROOMLIGHT).strength(1f, 10f).lightLevel(blockstate -> 15).postProcess((bs, br, bp) -> bp).emissiveRendering(state -> true).instrument(NoteBlockInstrument.PLING));
	}
}