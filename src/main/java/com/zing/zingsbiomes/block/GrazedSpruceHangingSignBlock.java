package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.CeilingHangingSignBlock;

import com.zing.zingsbiomes.init.ZingsBiomesModWoodTypes;

public class GrazedSpruceHangingSignBlock extends CeilingHangingSignBlock {
	public GrazedSpruceHangingSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.GRAZED_SPRUCE_HANGING_SIGN_WOOD_TYPE, properties.sound(SoundType.WOOD).strength(1f, 10f).noCollision().isRedstoneConductor((bs, br, bp) -> false).forceSolidOn());
	}
}