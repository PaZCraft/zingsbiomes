package com.zing.zingsbiomes.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.UntintedParticleLeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ColorParticleOption;

public class HeartwoodLeavesBlock extends UntintedParticleLeavesBlock {
	public HeartwoodLeavesBlock(BlockBehaviour.Properties properties) {
		super(0f, ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, -7733214), net.minecraft.world.level.block.sounds.AmbientLeavesBlockSoundPlayer.noAmbientSound(), properties.sound(SoundType.GRASS).strength(1f, 10f).noOcclusion().pushReaction(PushReaction.POPPED).isRedstoneConductor((bs, br, bp) -> false).ignitedByLava()
				.isSuffocating((bs, br, bp) -> false).isViewBlocking((bs, level, pos, shape) -> false));
	}
}