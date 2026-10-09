package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.SoundType;

import com.zing.zingsbiomes.init.ZingsBiomesModWoodTypes;

public class GrazedSpruceSignBlock extends StandingSignBlock {
	public GrazedSpruceSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.GRAZED_SPRUCE_SIGN_WOOD_TYPE, properties.sound(SoundType.WOOD).strength(1f, 10f).forceSolidOn());
	}
}