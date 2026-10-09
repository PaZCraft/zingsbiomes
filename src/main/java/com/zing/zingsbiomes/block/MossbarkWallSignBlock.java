package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.SoundType;

import com.zing.zingsbiomes.init.ZingsBiomesModWoodTypes;
import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

public class MossbarkWallSignBlock extends WallSignBlock {
	public MossbarkWallSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.MOSSBARK_SIGN_WOOD_TYPE,
				properties.sound(SoundType.WOOD).strength(1f, 10f).forceSolidOn().overrideLootTable(ZingsBiomesModBlocks.MOSSBARK_SIGN.get().getLootTable()).overrideDescription(ZingsBiomesModBlocks.MOSSBARK_SIGN.get().getDescriptionId()));
	}
}