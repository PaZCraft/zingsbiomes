package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModWoodTypes;
import net.mcreator.zingsbiomes.init.ZingsBiomesModBlocks;

public class HeartwoodWallSignBlock extends WallSignBlock {
	public HeartwoodWallSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.HEARTWOOD_SIGN_WOOD_TYPE,
				properties.sound(SoundType.WOOD).strength(1f, 10f).forceSolidOn().overrideLootTable(ZingsBiomesModBlocks.HEARTWOOD_SIGN.get().getLootTable()).overrideDescription(ZingsBiomesModBlocks.HEARTWOOD_SIGN.get().getDescriptionId()));
	}
}