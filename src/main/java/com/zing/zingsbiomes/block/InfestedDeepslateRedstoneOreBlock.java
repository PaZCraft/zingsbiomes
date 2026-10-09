package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class InfestedDeepslateRedstoneOreBlock extends Block {
	public InfestedDeepslateRedstoneOreBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.DEEPSLATE).strength(1.15f, 10f).requiresCorrectToolForDrops());
	}
}