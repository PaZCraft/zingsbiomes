package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModWoodTypes;
import net.mcreator.zingsbiomes.init.ZingsBiomesModBlocks;

public class BlackberryWallSignBlock extends WallSignBlock {
	public BlackberryWallSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.BLACKBERRY_SIGN_WOOD_TYPE,
				properties.sound(SoundType.CHERRY_WOOD).strength(1f, 10f).forceSolidOn().overrideLootTable(ZingsBiomesModBlocks.BLACKBERRY_SIGN.get().getLootTable()).overrideDescription(ZingsBiomesModBlocks.BLACKBERRY_SIGN.get().getDescriptionId()));
	}
}