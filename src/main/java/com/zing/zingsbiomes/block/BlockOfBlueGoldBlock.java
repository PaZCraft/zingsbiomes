package com.zing.zingsbiomes.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class BlockOfBlueGoldBlock extends Block {
	public BlockOfBlueGoldBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.GLOW_LICHEN).sound(SoundType.METAL).strength(1f, 10f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BELL));
	}
}