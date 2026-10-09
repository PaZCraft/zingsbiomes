package com.zing.zingsbiomes.block;

import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.UntintedParticleLeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.color.block.BlockTintSources;

import com.zing.zingsbiomes.init.ZingsBiomesModParticleTypes;
import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

import java.util.List;

public class KapokLeavesBlock extends UntintedParticleLeavesBlock {
	public KapokLeavesBlock(BlockBehaviour.Properties properties) {
		super(0.01f, (SimpleParticleType) (ZingsBiomesModParticleTypes.KAPOK_LEAF.get()), properties.sound(SoundType.GRASS).strength(1f, 10f).noOcclusion().isSuffocating((bs, br, bp) -> false).isViewBlocking((bs, br, bp) -> false));
	}

	@Override
	public int getLightDampening(BlockState state) {
		return 15;
	}

	public static void blockColorLoad(RegisterColorHandlersEvent.BlockTintSources event) {
		event.getBlockColors().register(List.of(BlockTintSources.foliage()), ZingsBiomesModBlocks.KAPOK_LEAVES.get());
	}
}