package com.zing.zingsbiomes.block;

import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.TintedParticleLeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.client.color.block.BlockTintSources;

import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

import java.util.List;

public class FirLeavesBlock extends TintedParticleLeavesBlock {
	public FirLeavesBlock(BlockBehaviour.Properties properties) {
		super(0f, properties.sound(SoundType.GRASS).strength(1f, 10f).noOcclusion().pushReaction(PushReaction.POPPED).isRedstoneConductor((bs, br, bp) -> false).ignitedByLava().isSuffocating((bs, br, bp) -> false)
				.isViewBlocking((bs, level, pos, shape) -> false));
	}

	public static void blockColorLoad(RegisterColorHandlersEvent.BlockTintSources event) {
		event.getBlockColors().register(List.of(BlockTintSources.constant(FoliageColor.FOLIAGE_DEFAULT)), ZingsBiomesModBlocks.FIR_LEAVES.get());
	}
}