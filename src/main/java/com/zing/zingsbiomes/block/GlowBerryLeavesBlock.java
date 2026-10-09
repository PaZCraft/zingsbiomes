package com.zing.zingsbiomes.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.UntintedParticleLeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ColorParticleOption;

public class GlowBerryLeavesBlock extends UntintedParticleLeavesBlock {
	public GlowBerryLeavesBlock(BlockBehaviour.Properties properties) {
		super(0.01f, ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, -25), net.minecraft.world.level.block.sounds.AmbientLeavesBlockSoundPlayer.noAmbientSound(), properties.sound(SoundType.CHERRY_LEAVES).strength(1f, 10f).noOcclusion().pushReaction(PushReaction.POPPED).postProcess((bs, br, bp) -> bp)
				.emissiveRendering(state -> true).isRedstoneConductor((bs, br, bp) -> false).ignitedByLava().isSuffocating((bs, br, bp) -> false).isViewBlocking((bs, level, pos, shape) -> false));
	}
}