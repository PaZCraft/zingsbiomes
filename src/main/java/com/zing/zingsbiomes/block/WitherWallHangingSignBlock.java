package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModWoodTypes;
import net.mcreator.zingsbiomes.init.ZingsBiomesModBlocks;

public class WitherWallHangingSignBlock extends WallHangingSignBlock {
	public WitherWallHangingSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.WITHER_HANGING_SIGN_WOOD_TYPE, properties.sound(SoundType.NETHER_WOOD_HANGING_SIGN).strength(1f, 10f).forceSolidOn().overrideLootTable(ZingsBiomesModBlocks.WITHER_HANGING_SIGN.get().getLootTable())
				.overrideDescription(ZingsBiomesModBlocks.WITHER_HANGING_SIGN.get().getDescriptionId()));
	}
}