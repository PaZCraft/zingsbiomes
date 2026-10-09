package com.zing.zingsbiomes.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.UntintedParticleLeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ColorParticleOption;

public class PinkFloweringAzaleaLeavesBlock extends UntintedParticleLeavesBlock {
	public PinkFloweringAzaleaLeavesBlock(BlockBehaviour.Properties properties) {
		super(0.01f, ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, -5526437), net.minecraft.world.level.block.sounds.AmbientLeavesBlockSoundPlayer.noAmbientSound(), properties.sound(SoundType.AZALEA_LEAVES).strength(1f, 10f).noOcclusion().pushReaction(PushReaction.POPPED).isRedstoneConductor((bs, br, bp) -> false)
				.ignitedByLava().isSuffocating((bs, br, bp) -> false).isViewBlocking((bs, level, pos, shape) -> false));
	}
}