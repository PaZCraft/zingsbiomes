package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class UltravioletResinBrickSlabBlock extends SlabBlock {
	public UltravioletResinBrickSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.RESIN_BRICKS).strength(1f, 10f));
	}
}