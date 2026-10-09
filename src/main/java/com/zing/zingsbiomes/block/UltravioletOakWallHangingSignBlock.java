package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.SoundType;

import com.zing.zingsbiomes.init.ZingsBiomesModWoodTypes;
import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

public class UltravioletOakWallHangingSignBlock extends WallHangingSignBlock {
	public UltravioletOakWallHangingSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.ULTRAVIOLET_OAK_HANGING_SIGN_WOOD_TYPE, properties.sound(SoundType.WOOD).strength(1f, 10f).forceSolidOn().overrideLootTable(ZingsBiomesModBlocks.ULTRAVIOLET_OAK_HANGING_SIGN.get().getLootTable())
				.overrideDescription(ZingsBiomesModBlocks.ULTRAVIOLET_OAK_HANGING_SIGN.get().getDescriptionId()));
	}
}