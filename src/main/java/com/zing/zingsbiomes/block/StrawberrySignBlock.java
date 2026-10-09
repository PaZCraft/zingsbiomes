package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.SoundType;

import com.zing.zingsbiomes.init.ZingsBiomesModWoodTypes;

public class StrawberrySignBlock extends StandingSignBlock {
	public StrawberrySignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.STRAWBERRY_SIGN_WOOD_TYPE, properties.sound(SoundType.CHERRY_WOOD).strength(1f, 10f).forceSolidOn());
	}
}