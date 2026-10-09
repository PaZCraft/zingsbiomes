package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.SoundType;

import com.zing.zingsbiomes.init.ZingsBiomesModWoodTypes;
import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

public class FrozegroveWallSignBlock extends WallSignBlock {
	public FrozegroveWallSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.FROZEGROVE_SIGN_WOOD_TYPE,
				properties.sound(SoundType.WOOD).strength(1f, 10f).forceSolidOn().overrideLootTable(ZingsBiomesModBlocks.FROZEGROVE_SIGN.get().getLootTable()).overrideDescription(ZingsBiomesModBlocks.FROZEGROVE_SIGN.get().getDescriptionId()));
	}
}