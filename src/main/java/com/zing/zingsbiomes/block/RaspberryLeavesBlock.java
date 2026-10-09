package com.zing.zingsbiomes.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.UntintedParticleLeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ColorParticleOption;

public class RaspberryLeavesBlock extends UntintedParticleLeavesBlock {
	public RaspberryLeavesBlock(BlockBehaviour.Properties properties) {
		super(0.01f, ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, -1), net.minecraft.world.level.block.sounds.AmbientLeavesBlockSoundPlayer.noAmbientSound(), properties.sound(SoundType.CHERRY_LEAVES).instabreak().noOcclusion().pushReaction(PushReaction.POPPED).isRedstoneConductor((bs, br, bp) -> false).ignitedByLava()
				.isSuffocating((bs, br, bp) -> false).isViewBlocking((bs, level, pos, shape) -> false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state) {
		return true;
	}

	@Override
	public int getLightDampening(BlockState state) {
		return 0;
	}
}