package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.CeilingHangingSignBlock;

import com.zing.zingsbiomes.init.ZingsBiomesModWoodTypes;

public class WitherHangingSignBlock extends CeilingHangingSignBlock {
	public WitherHangingSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.WITHER_HANGING_SIGN_WOOD_TYPE, properties.sound(SoundType.NETHER_WOOD_HANGING_SIGN).strength(1f, 10f).forceSolidOn());
	}
}