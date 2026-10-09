package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.CeilingHangingSignBlock;

import com.zing.zingsbiomes.init.ZingsBiomesModWoodTypes;

public class ShamrockWillowHangingSignBlock extends CeilingHangingSignBlock {
	public ShamrockWillowHangingSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.SHAMROCK_WILLOW_HANGING_SIGN_WOOD_TYPE, properties.sound(SoundType.HANGING_SIGN).strength(1f, 10f).noCollision().isRedstoneConductor((bs, br, bp) -> false).forceSolidOn());
	}
}