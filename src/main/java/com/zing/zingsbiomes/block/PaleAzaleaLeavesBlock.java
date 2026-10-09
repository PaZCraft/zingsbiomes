package com.zing.zingsbiomes.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.UntintedParticleLeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.core.particles.ParticleTypes;

public class PaleAzaleaLeavesBlock extends UntintedParticleLeavesBlock {
	public PaleAzaleaLeavesBlock(BlockBehaviour.Properties properties) {
		super(0.01f, ParticleTypes.PALE_OAK_LEAVES, net.minecraft.world.level.block.sounds.AmbientLeavesBlockSoundPlayer.noAmbientSound(), properties.sound(SoundType.AZALEA_LEAVES).strength(1f, 10f).noOcclusion().pushReaction(PushReaction.POPPED).isRedstoneConductor((bs, br, bp) -> false).ignitedByLava()
				.isSuffocating((bs, br, bp) -> false).isViewBlocking((bs, level, pos, shape) -> false));
	}
}