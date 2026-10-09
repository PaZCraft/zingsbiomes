package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class QuartzSoilBlock extends Block {
	public QuartzSoilBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.TERRACOTTA_WHITE).sound(SoundType.SOUL_SOIL).strength(1f, 10f).jumpFactor(1.5f).instrument(NoteBlockInstrument.COW_BELL));
	}
}