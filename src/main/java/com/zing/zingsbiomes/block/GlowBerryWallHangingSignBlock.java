package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.SoundType;

import com.zing.zingsbiomes.init.ZingsBiomesModWoodTypes;
import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

public class GlowBerryWallHangingSignBlock extends WallHangingSignBlock {
	public GlowBerryWallHangingSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.GLOW_BERRY_HANGING_SIGN_WOOD_TYPE, properties.sound(SoundType.CHERRY_WOOD_HANGING_SIGN).strength(1f, 10f).postProcess((bs, br, bp) -> bp).emissiveRendering(state -> true).forceSolidOn()
				.overrideLootTable(ZingsBiomesModBlocks.GLOW_BERRY_HANGING_SIGN.get().getLootTable()).overrideDescription(ZingsBiomesModBlocks.GLOW_BERRY_HANGING_SIGN.get().getDescriptionId()));
	}
}