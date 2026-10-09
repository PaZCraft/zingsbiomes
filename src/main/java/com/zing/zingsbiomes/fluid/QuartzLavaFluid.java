package com.zing.zingsbiomes.fluid;

import org.apache.logging.log4j.core.util.Source;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import com.zing.zingsbiomes.init.ZingsBiomesModItems;
import com.zing.zingsbiomes.init.ZingsBiomesModFluids;
import com.zing.zingsbiomes.init.ZingsBiomesModFluidTypes;
import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

public abstract class QuartzLavaFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> ZingsBiomesModFluidTypes.QUARTZ_LAVA_TYPE.get(), () -> ZingsBiomesModFluids.QUARTZ_LAVA.get(),
			() -> ZingsBiomesModFluids.FLOWING_QUARTZ_LAVA.get()).explosionResistance(100f).bucket(() -> ZingsBiomesModItems.QUARTZ_LAVA_BUCKET.get()).block(() -> (LiquidBlock) ZingsBiomesModBlocks.QUARTZ_LAVA.get());

	private QuartzLavaFluid() {
		super(PROPERTIES);
	}

	public static class Source extends QuartzLavaFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends QuartzLavaFluid {
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