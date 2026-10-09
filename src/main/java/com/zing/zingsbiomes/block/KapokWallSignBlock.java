package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.SoundType;

import com.zing.zingsbiomes.init.ZingsBiomesModWoodTypes;
import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

public class KapokWallSignBlock extends WallSignBlock {
	public KapokWallSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.KAPOK_SIGN_WOOD_TYPE,
				properties.sound(SoundType.WOOD).strength(1f, 10f).forceSolidOn().overrideLootTable(ZingsBiomesModBlocks.KAPOK_SIGN.get().getLootTable()).overrideDescription(ZingsBiomesModBlocks.KAPOK_SIGN.get().getDescriptionId()));
	}
}