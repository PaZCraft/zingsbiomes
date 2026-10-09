package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.SoundType;

import com.zing.zingsbiomes.init.ZingsBiomesModWoodTypes;
import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

public class ShamrockWillowWallHangingSignBlock extends WallHangingSignBlock {
	public ShamrockWillowWallHangingSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.SHAMROCK_WILLOW_HANGING_SIGN_WOOD_TYPE, properties.sound(SoundType.HANGING_SIGN).strength(1f, 10f).noCollision().isRedstoneConductor((bs, br, bp) -> false).forceSolidOn()
				.overrideLootTable(ZingsBiomesModBlocks.SHAMROCK_WILLOW_HANGING_SIGN.get().getLootTable()).overrideDescription(ZingsBiomesModBlocks.SHAMROCK_WILLOW_HANGING_SIGN.get().getDescriptionId()));
	}
}