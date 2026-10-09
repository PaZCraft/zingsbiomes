package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.UntintedParticleLeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModParticleTypes;

public class HoarfrostLeavesBlock extends UntintedParticleLeavesBlock {
	public HoarfrostLeavesBlock(BlockBehaviour.Properties properties) {
		super(0.03f, (SimpleParticleType) (ZingsBiomesModParticleTypes.HOARFROST_LEAF.get()), properties.sound(SoundType.SNOW).strength(1f, 10f).noOcclusion().pushReaction(PushReaction.DESTROY).isRedstoneConductor((bs, br, bp) -> false)
				.ignitedByLava().isSuffocating((bs, br, bp) -> false).isViewBlocking((bs, br, bp) -> false));
	}

	@Override
	public int getLightDampening(BlockState state) {
		return 1;
	}
}