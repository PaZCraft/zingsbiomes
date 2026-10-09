package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.SoundType;

import com.zing.zingsbiomes.init.ZingsBiomesModWoodTypes;
import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

public class RedDriftwoodWallHangingSignBlock extends WallHangingSignBlock {
	public RedDriftwoodWallHangingSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.RED_DRIFTWOOD_HANGING_SIGN_WOOD_TYPE, properties.sound(SoundType.HANGING_SIGN).strength(1f, 10f).forceSolidOn().overrideLootTable(ZingsBiomesModBlocks.RED_DRIFTWOOD_HANGING_SIGN.get().getLootTable())
				.overrideDescription(ZingsBiomesModBlocks.RED_DRIFTWOOD_HANGING_SIGN.get().getDescriptionId()));
	}
}