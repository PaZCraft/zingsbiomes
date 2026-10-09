package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.SoundType;

import com.zing.zingsbiomes.init.ZingsBiomesModWoodTypes;
import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

public class BaobabWallSignBlock extends WallSignBlock {
	public BaobabWallSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.BAOBAB_SIGN_WOOD_TYPE, properties.sound(SoundType.WOOD).strength(1f, 10f).noCollision().isRedstoneConductor((bs, br, bp) -> false).forceSolidOn()
				.overrideLootTable(ZingsBiomesModBlocks.BAOBAB_SIGN.get().getLootTable()).overrideDescription(ZingsBiomesModBlocks.BAOBAB_SIGN.get().getDescriptionId()));
	}
}