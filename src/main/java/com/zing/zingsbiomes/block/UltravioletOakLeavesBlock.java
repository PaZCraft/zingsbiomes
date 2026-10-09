package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.UntintedParticleLeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ColorParticleOption;

public class UltravioletOakLeavesBlock extends UntintedParticleLeavesBlock {
	public UltravioletOakLeavesBlock(BlockBehaviour.Properties properties) {
		super(0.1f, ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, -9731103), net.minecraft.world.level.block.sounds.AmbientLeavesBlockSoundPlayer.noAmbientSound(), properties.sound(SoundType.GRASS).strength(1f, 10f).noOcclusion().isSuffocating((bs, br, bp) -> false).isViewBlocking((bs, level, pos, shape) -> false));
	}

	@Override
	public int getLightDampening(BlockState state) {
		return 15;
	}
}