package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class FireSoilBlock extends Block {
	public FireSoilBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.NETHER).sound(SoundType.SOUL_SOIL).strength(1f, 10f).instrument(NoteBlockInstrument.COW_BELL));
	}
}