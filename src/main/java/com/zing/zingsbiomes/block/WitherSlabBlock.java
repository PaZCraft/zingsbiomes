package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class WitherSlabBlock extends SlabBlock {
	public WitherSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.NETHER_WOOD).strength(1f, 10f));
	}
}