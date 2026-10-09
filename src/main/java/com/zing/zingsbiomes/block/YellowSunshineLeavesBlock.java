package com.zing.zingsbiomes.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.UntintedParticleLeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.core.particles.SimpleParticleType;

import com.zing.zingsbiomes.init.ZingsBiomesModParticleTypes;

public class YellowSunshineLeavesBlock extends UntintedParticleLeavesBlock {
	public YellowSunshineLeavesBlock(BlockBehaviour.Properties properties) {
		super(0.01f, (SimpleParticleType) (ZingsBiomesModParticleTypes.YELLOW_SUNSHINE_LEAF.get()), net.minecraft.world.level.block.sounds.AmbientLeavesBlockSoundPlayer.noAmbientSound(), properties.sound(SoundType.LILY_PAD).strength(1f, 10f).noOcclusion().pushReaction(PushReaction.POPPED).isRedstoneConductor((bs, br, bp) -> false)
				.ignitedByLava().isSuffocating((bs, br, bp) -> false).isViewBlocking((bs, level, pos, shape) -> false));
	}
}