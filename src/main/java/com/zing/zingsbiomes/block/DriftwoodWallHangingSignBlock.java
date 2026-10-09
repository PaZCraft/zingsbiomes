package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.SoundType;

import com.zing.zingsbiomes.init.ZingsBiomesModWoodTypes;
import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

public class DriftwoodWallHangingSignBlock extends WallHangingSignBlock {
	public DriftwoodWallHangingSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.DRIFTWOOD_HANGING_SIGN_WOOD_TYPE, properties.sound(SoundType.WOOD).strength(1f, 10f).forceSolidOn().overrideLootTable(ZingsBiomesModBlocks.DRIFTWOOD_HANGING_SIGN.get().getLootTable())
				.overrideDescription(ZingsBiomesModBlocks.DRIFTWOOD_HANGING_SIGN.get().getDescriptionId()));
	}
}