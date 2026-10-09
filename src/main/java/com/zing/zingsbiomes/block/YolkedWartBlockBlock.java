package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class YolkedWartBlockBlock extends Block {
	public YolkedWartBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.TERRACOTTA_YELLOW).sound(SoundType.WART_BLOCK).strength(1f, 10f).instrument(NoteBlockInstrument.PLING));
	}
}