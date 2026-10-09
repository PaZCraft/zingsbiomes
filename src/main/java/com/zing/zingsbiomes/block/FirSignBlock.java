package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.SoundType;

import com.zing.zingsbiomes.init.ZingsBiomesModWoodTypes;

public class FirSignBlock extends StandingSignBlock {
	public FirSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.FIR_SIGN_WOOD_TYPE, properties.sound(SoundType.WOOD).strength(1f, 10f).noCollision().isRedstoneConductor((bs, br, bp) -> false).forceSolidOn());
	}
}