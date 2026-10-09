package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.SoundType;

import com.zing.zingsbiomes.init.ZingsBiomesModWoodTypes;

public class RaspberrySignBlock extends StandingSignBlock {
	public RaspberrySignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.RASPBERRY_SIGN_WOOD_TYPE, properties.sound(SoundType.CHERRY_WOOD).strength(1f, 10f).forceSolidOn());
	}
}