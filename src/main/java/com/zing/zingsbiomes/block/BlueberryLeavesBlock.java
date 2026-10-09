package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.UntintedParticleLeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ColorParticleOption;

public class BlueberryLeavesBlock extends UntintedParticleLeavesBlock {
	public BlueberryLeavesBlock(BlockBehaviour.Properties properties) {
		super(0.1f, ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, -851969), properties.sound(SoundType.CHERRY_LEAVES).strength(1f, 10f).noOcclusion().isSuffocating((bs, br, bp) -> false).isViewBlocking((bs, br, bp) -> false));
	}

	@Override
	public int getLightDampening(BlockState state) {
		return 15;
	}
}