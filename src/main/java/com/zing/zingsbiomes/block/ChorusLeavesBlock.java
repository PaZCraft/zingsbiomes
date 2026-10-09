package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.UntintedParticleLeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.core.particles.SimpleParticleType;

import com.zing.zingsbiomes.init.ZingsBiomesModParticleTypes;

public class ChorusLeavesBlock extends UntintedParticleLeavesBlock {
	public ChorusLeavesBlock(BlockBehaviour.Properties properties) {
		super(0.12f, (SimpleParticleType) (ZingsBiomesModParticleTypes.CHORUS_LEAF.get()), net.minecraft.world.level.block.sounds.AmbientLeavesBlockSoundPlayer.noAmbientSound(), properties.sound(SoundType.VINE).strength(1f, 10f).noOcclusion().isSuffocating((bs, br, bp) -> false).isViewBlocking((bs, level, pos, shape) -> false));
	}

	@Override
	public int getLightDampening(BlockState state) {
		return 15;
	}
}