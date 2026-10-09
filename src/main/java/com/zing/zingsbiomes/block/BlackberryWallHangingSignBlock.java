package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModWoodTypes;
import net.mcreator.zingsbiomes.init.ZingsBiomesModBlocks;

public class BlackberryWallHangingSignBlock extends WallHangingSignBlock {
	public BlackberryWallHangingSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.BLACKBERRY_HANGING_SIGN_WOOD_TYPE, properties.sound(SoundType.CHERRY_WOOD_HANGING_SIGN).strength(1f, 10f).forceSolidOn().overrideLootTable(ZingsBiomesModBlocks.BLACKBERRY_HANGING_SIGN.get().getLootTable())
				.overrideDescription(ZingsBiomesModBlocks.BLACKBERRY_HANGING_SIGN.get().getDescriptionId()));
	}
}