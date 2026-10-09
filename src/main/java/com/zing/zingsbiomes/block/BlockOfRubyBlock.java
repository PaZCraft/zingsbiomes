package com.zing.zingsbiomes.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class BlockOfRubyBlock extends Block {
	public BlockOfRubyBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.CRIMSON_NYLIUM).strength(1f, 10f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}
}