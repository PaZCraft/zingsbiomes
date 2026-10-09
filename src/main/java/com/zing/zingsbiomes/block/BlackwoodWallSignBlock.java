package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.SoundType;

import com.zing.zingsbiomes.init.ZingsBiomesModWoodTypes;
import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

public class BlackwoodWallSignBlock extends WallSignBlock {
	public BlackwoodWallSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.BLACKWOOD_SIGN_WOOD_TYPE,
				properties.sound(SoundType.WOOD).strength(1f, 10f).forceSolidOn().overrideLootTable(ZingsBiomesModBlocks.BLACKWOOD_SIGN.get().getLootTable()).overrideDescription(ZingsBiomesModBlocks.BLACKWOOD_SIGN.get().getDescriptionId()));
	}
}