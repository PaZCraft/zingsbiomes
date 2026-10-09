package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.SoundType;

import com.zing.zingsbiomes.init.ZingsBiomesModWoodTypes;
import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

public class YolkedWallSignBlock extends WallSignBlock {
	public YolkedWallSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.YOLKED_SIGN_WOOD_TYPE,
				properties.sound(SoundType.NETHER_WOOD).strength(1f, 10f).forceSolidOn().overrideLootTable(ZingsBiomesModBlocks.YOLKED_SIGN.get().getLootTable()).overrideDescription(ZingsBiomesModBlocks.YOLKED_SIGN.get().getDescriptionId()));
	}
}