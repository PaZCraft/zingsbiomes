package com.zing.zingsbiomes.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class EmeraldVillageDetectorBlock extends Block {
	public EmeraldVillageDetectorBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.EMERALD).sound(SoundType.METAL).strength(1f, 10f).postProcess((bs, br, bp) -> bp).emissiveRendering((bs, br, bp) -> true));
	}
}