package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModWoodTypes;
import net.mcreator.zingsbiomes.init.ZingsBiomesModBlocks;

public class MossbarkWallSignBlock extends WallSignBlock {
	public MossbarkWallSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.MOSSBARK_SIGN_WOOD_TYPE,
				properties.sound(SoundType.WOOD).strength(1f, 10f).forceSolidOn().overrideLootTable(ZingsBiomesModBlocks.MOSSBARK_SIGN.get().getLootTable()).overrideDescription(ZingsBiomesModBlocks.MOSSBARK_SIGN.get().getDescriptionId()));
	}
}