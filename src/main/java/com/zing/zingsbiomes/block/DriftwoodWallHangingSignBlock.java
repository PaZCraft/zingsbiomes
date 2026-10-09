package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModWoodTypes;
import net.mcreator.zingsbiomes.init.ZingsBiomesModBlocks;

public class DriftwoodWallHangingSignBlock extends WallHangingSignBlock {
	public DriftwoodWallHangingSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.DRIFTWOOD_HANGING_SIGN_WOOD_TYPE, properties.sound(SoundType.WOOD).strength(1f, 10f).forceSolidOn().overrideLootTable(ZingsBiomesModBlocks.DRIFTWOOD_HANGING_SIGN.get().getLootTable())
				.overrideDescription(ZingsBiomesModBlocks.DRIFTWOOD_HANGING_SIGN.get().getDescriptionId()));
	}
}