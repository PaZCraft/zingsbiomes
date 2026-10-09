package com.zing.zingsbiomes.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class TearSoilBlock extends Block {
	public TearSoilBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).sound(SoundType.SOUL_SOIL).strength(1f, 10f).instrument(NoteBlockInstrument.COW_BELL));
	}
}