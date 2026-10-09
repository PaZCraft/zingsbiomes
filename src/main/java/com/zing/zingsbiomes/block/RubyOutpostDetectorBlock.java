package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class RubyOutpostDetectorBlock extends Block {
	public RubyOutpostDetectorBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.CRIMSON_NYLIUM).sound(SoundType.METAL).strength(1f, 10f));
	}
}