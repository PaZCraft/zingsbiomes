package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModWoodTypes;
import net.mcreator.zingsbiomes.init.ZingsBiomesModBlocks;

public class FrozegroveWallHangingSignBlock extends WallHangingSignBlock {
	public FrozegroveWallHangingSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.FROZEGROVE_HANGING_SIGN_WOOD_TYPE, properties.sound(SoundType.WOOD).strength(1f, 10f).forceSolidOn().overrideLootTable(ZingsBiomesModBlocks.FROZEGROVE_HANGING_SIGN.get().getLootTable())
				.overrideDescription(ZingsBiomesModBlocks.FROZEGROVE_HANGING_SIGN.get().getDescriptionId()));
	}
}