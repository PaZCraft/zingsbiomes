package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.SoundType;

import com.zing.zingsbiomes.init.ZingsBiomesModWoodTypes;
import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

public class PalmWallHangingSignBlock extends WallHangingSignBlock {
	public PalmWallHangingSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.PALM_HANGING_SIGN_WOOD_TYPE, properties.sound(SoundType.HANGING_SIGN).strength(1f, 10f).noCollision().isRedstoneConductor((bs, br, bp) -> false).forceSolidOn()
				.overrideLootTable(ZingsBiomesModBlocks.PALM_HANGING_SIGN.get().getLootTable()).overrideDescription(ZingsBiomesModBlocks.PALM_HANGING_SIGN.get().getDescriptionId()));
	}
}