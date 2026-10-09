package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.SoundType;

import com.zing.zingsbiomes.init.ZingsBiomesModWoodTypes;
import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

public class GlowBerryWallSignBlock extends WallSignBlock {
	public GlowBerryWallSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.GLOW_BERRY_SIGN_WOOD_TYPE, properties.sound(SoundType.CHERRY_WOOD).strength(1f, 10f).postProcess((bs, br, bp) -> bp).emissiveRendering((bs, br, bp) -> true).forceSolidOn()
				.overrideLootTable(ZingsBiomesModBlocks.GLOW_BERRY_SIGN.get().getLootTable()).overrideDescription(ZingsBiomesModBlocks.GLOW_BERRY_SIGN.get().getDescriptionId()));
	}
}