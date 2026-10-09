package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.UntintedParticleLeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.core.particles.SimpleParticleType;

import com.zing.zingsbiomes.init.ZingsBiomesModParticleTypes;

public class ShamrockWillowLeavesBlock extends UntintedParticleLeavesBlock {
	public ShamrockWillowLeavesBlock(BlockBehaviour.Properties properties) {
		super(0.01f, (SimpleParticleType) (ZingsBiomesModParticleTypes.SHAMROCK_WILLOW_LEAF.get()), properties.sound(SoundType.GRASS).strength(1f, 10f).noOcclusion().isSuffocating((bs, br, bp) -> false).isViewBlocking((bs, br, bp) -> false));
	}
}