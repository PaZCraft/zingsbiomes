package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.SoundType;

import com.zing.zingsbiomes.init.ZingsBiomesModWoodTypes;

public class WitherSignBlock extends StandingSignBlock {
	public WitherSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.WITHER_SIGN_WOOD_TYPE, properties.sound(SoundType.NETHER_WOOD).strength(1f, 10f).forceSolidOn());
	}
}