package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModWoodTypes;
import net.mcreator.zingsbiomes.init.ZingsBiomesModBlocks;

public class UltravioletOakWallSignBlock extends WallSignBlock {
	public UltravioletOakWallSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.ULTRAVIOLET_OAK_SIGN_WOOD_TYPE, properties.sound(SoundType.WOOD).strength(1f, 10f).forceSolidOn().overrideLootTable(ZingsBiomesModBlocks.ULTRAVIOLET_OAK_SIGN.get().getLootTable())
				.overrideDescription(ZingsBiomesModBlocks.ULTRAVIOLET_OAK_SIGN.get().getDescriptionId()));
	}
}