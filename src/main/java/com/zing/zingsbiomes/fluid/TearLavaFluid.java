package com.zing.zingsbiomes.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import com.zing.zingsbiomes.init.ZingsBiomesModItems;
import com.zing.zingsbiomes.init.ZiNGsBiomesFluids;
import com.zing.zingsbiomes.init.ZiNGsBiomesFluidTypes;
import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

public abstract class TearLavaFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> ZiNGsBiomesFluidTypes.TEAR_LAVA_TYPE.get(), () -> ZiNGsBiomesFluids.TEAR_LAVA.get(), () -> ZiNGsBiomesFluids.FLOWING_TEAR_LAVA.get())
			.explosionResistance(100f).bucket(() -> ZingsBiomesModItems.TEAR_LAVA_BUCKET.get()).block(() -> (LiquidBlock) ZingsBiomesModBlocks.TEAR_LAVA.get());

	private TearLavaFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.DRIPPING_WATER;
	}

	public static class Source extends TearLavaFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends TearLavaFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}