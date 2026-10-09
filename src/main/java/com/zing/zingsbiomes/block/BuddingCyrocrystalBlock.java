package com.zing.zingsbiomes.block;

import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.client.color.block.BlockTintSources;

import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

import java.util.List;

public class BuddingCyrocrystalBlock extends Block {
	public BuddingCyrocrystalBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.AMETHYST).strength(1f, 10f));
	}

	public static void blockColorLoad(RegisterColorHandlersEvent.BlockTintSources event) {
		event.getBlockColors().register(List.of(BlockTintSources.water()), ZingsBiomesModBlocks.BUDDING_ICE_CRYSTAL.get());
	}
}