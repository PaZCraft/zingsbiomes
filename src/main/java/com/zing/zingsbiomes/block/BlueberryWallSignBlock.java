package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModWoodTypes;
import net.mcreator.zingsbiomes.init.ZingsBiomesModBlocks;

public class BlueberryWallSignBlock extends WallSignBlock {
	public BlueberryWallSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.BLUEBERRY_SIGN_WOOD_TYPE,
				properties.sound(SoundType.CHERRY_WOOD).strength(1f, 10f).forceSolidOn().overrideLootTable(ZingsBiomesModBlocks.BLUEBERRY_SIGN.get().getLootTable()).overrideDescription(ZingsBiomesModBlocks.BLUEBERRY_SIGN.get().getDescriptionId()));
	}
}