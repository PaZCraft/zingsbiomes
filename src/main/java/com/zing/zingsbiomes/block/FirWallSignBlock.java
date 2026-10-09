package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModWoodTypes;
import net.mcreator.zingsbiomes.init.ZingsBiomesModBlocks;

public class FirWallSignBlock extends WallSignBlock {
	public FirWallSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.FIR_SIGN_WOOD_TYPE, properties.sound(SoundType.WOOD).strength(1f, 10f).noCollision().isRedstoneConductor((bs, br, bp) -> false).forceSolidOn().overrideLootTable(ZingsBiomesModBlocks.FIR_SIGN.get().getLootTable())
				.overrideDescription(ZingsBiomesModBlocks.FIR_SIGN.get().getDescriptionId()));
	}
}