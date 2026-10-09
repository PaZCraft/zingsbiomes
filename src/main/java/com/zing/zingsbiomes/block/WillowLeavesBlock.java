package com.zing.zingsbiomes.block;

import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.TintedParticleLeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.client.color.block.BlockTintSources;

import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

import java.util.List;

public class WillowLeavesBlock extends TintedParticleLeavesBlock {
	public WillowLeavesBlock(BlockBehaviour.Properties properties) {
		super(0.1f, properties.sound(SoundType.GRASS).strength(1f, 10f).noOcclusion().pushReaction(PushReaction.POPPED).isRedstoneConductor((bs, br, bp) -> false).ignitedByLava().isSuffocating((bs, br, bp) -> false)
				.isViewBlocking((bs, level, pos, shape) -> false));
	}

	public static void blockColorLoad(RegisterColorHandlersEvent.BlockTintSources event) {
		event.getBlockColors().register(List.of(BlockTintSources.foliage()), ZingsBiomesModBlocks.WILLOW_LEAVES.get());
	}
}