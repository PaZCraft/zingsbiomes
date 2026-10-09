package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModWoodTypes;
import net.mcreator.zingsbiomes.init.ZingsBiomesModBlocks;

public class WitherWallSignBlock extends WallSignBlock {
	public WitherWallSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.WITHER_SIGN_WOOD_TYPE,
				properties.sound(SoundType.NETHER_WOOD).strength(1f, 10f).forceSolidOn().overrideLootTable(ZingsBiomesModBlocks.WITHER_SIGN.get().getLootTable()).overrideDescription(ZingsBiomesModBlocks.WITHER_SIGN.get().getDescriptionId()));
	}
}