package com.zing.zingsbiomes.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.UntintedParticleLeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.core.particles.SimpleParticleType;

import com.zing.zingsbiomes.init.ZingsBiomesModParticleTypes;

public class YellowSunshineLeavesBlock extends UntintedParticleLeavesBlock {
	public YellowSunshineLeavesBlock(BlockBehaviour.Properties properties) {
		super(0.01f, (SimpleParticleType) (ZingsBiomesModParticleTypes.YELLOW_SUNSHINE_LEAF.get()), properties.sound(SoundType.LILY_PAD).strength(1f, 10f).noOcclusion().pushReaction(PushReaction.DESTROY).isRedstoneConductor((bs, br, bp) -> false)
				.ignitedByLava().isSuffocating((bs, br, bp) -> false).isViewBlocking((bs, br, bp) -> false));
	}
}