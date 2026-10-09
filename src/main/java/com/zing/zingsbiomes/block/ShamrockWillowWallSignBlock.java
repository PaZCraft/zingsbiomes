package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.SoundType;

import com.zing.zingsbiomes.init.ZingsBiomesModWoodTypes;
import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

public class ShamrockWillowWallSignBlock extends WallSignBlock {
	public ShamrockWillowWallSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.SHAMROCK_WILLOW_SIGN_WOOD_TYPE, properties.sound(SoundType.WOOD).strength(1f, 10f).noCollision().isRedstoneConductor((bs, br, bp) -> false).forceSolidOn()
				.overrideLootTable(ZingsBiomesModBlocks.SHAMROCK_WILLOW_SIGN.get().getLootTable()).overrideDescription(ZingsBiomesModBlocks.SHAMROCK_WILLOW_SIGN.get().getDescriptionId()));
	}
}