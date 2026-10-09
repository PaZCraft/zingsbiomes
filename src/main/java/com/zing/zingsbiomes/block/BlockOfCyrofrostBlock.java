package net.mcreator.zingsbiomes.block;

import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.client.color.block.BlockTintSources;

import net.mcreator.zingsbiomes.init.ZingsBiomesModBlocks;

import java.util.List;

public class BlockOfCyrofrostBlock extends Block {
	public BlockOfCyrofrostBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.AMETHYST).strength(1f, 10f));
	}

	public static void blockColorLoad(RegisterColorHandlersEvent.BlockTintSources event) {
		event.getBlockColors().register(List.of(BlockTintSources.water()), ZingsBiomesModBlocks.BLOCK_OF_ICE_CRYSTAL.get());
	}
}