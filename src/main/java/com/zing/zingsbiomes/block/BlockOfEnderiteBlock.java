package com.zing.zingsbiomes.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class BlockOfEnderiteBlock extends Block {
	public BlockOfEnderiteBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.COLOR_PINK).sound(SoundType.RESIN).strength(1f, 10f).requiresCorrectToolForDrops().jumpFactor(1.5f).instrument(NoteBlockInstrument.CHIME));
	}
}