package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.SoundType;

import com.zing.zingsbiomes.init.ZingsBiomesModWoodTypes;
import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

public class GooseberryWallSignBlock extends WallSignBlock {
	public GooseberryWallSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.GOOSEBERRY_SIGN_WOOD_TYPE,
				properties.sound(SoundType.CHERRY_WOOD).strength(1f, 10f).forceSolidOn().overrideLootTable(ZingsBiomesModBlocks.GOOSEBERRY_SIGN.get().getLootTable()).overrideDescription(ZingsBiomesModBlocks.GOOSEBERRY_SIGN.get().getDescriptionId()));
	}
}