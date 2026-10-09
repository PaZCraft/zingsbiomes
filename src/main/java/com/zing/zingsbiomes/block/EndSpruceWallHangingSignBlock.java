package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModWoodTypes;
import net.mcreator.zingsbiomes.init.ZingsBiomesModBlocks;

public class EndSpruceWallHangingSignBlock extends WallHangingSignBlock {
	public EndSpruceWallHangingSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.END_SPRUCE_HANGING_SIGN_WOOD_TYPE, properties.sound(SoundType.HANGING_SIGN).strength(1f, 10f).forceSolidOn().overrideLootTable(ZingsBiomesModBlocks.END_SPRUCE_HANGING_SIGN.get().getLootTable())
				.overrideDescription(ZingsBiomesModBlocks.END_SPRUCE_HANGING_SIGN.get().getDescriptionId()));
	}
}