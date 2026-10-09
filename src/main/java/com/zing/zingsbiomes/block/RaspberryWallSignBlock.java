package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.SoundType;

import com.zing.zingsbiomes.init.ZingsBiomesModWoodTypes;
import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

public class RaspberryWallSignBlock extends WallSignBlock {
	public RaspberryWallSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.RASPBERRY_SIGN_WOOD_TYPE,
				properties.sound(SoundType.CHERRY_WOOD).strength(1f, 10f).forceSolidOn().overrideLootTable(ZingsBiomesModBlocks.RASPBERRY_SIGN.get().getLootTable()).overrideDescription(ZingsBiomesModBlocks.RASPBERRY_SIGN.get().getDescriptionId()));
	}
}