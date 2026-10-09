package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class FloodstoneBlock extends Block {
	public FloodstoneBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.DIRT).sound(SoundType.DRIPSTONE_BLOCK).strength(1.3f, 13f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}
}