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

public abstract class EndTarPitFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> ZingsBiomesModFluidTypes.END_TAR_PIT_TYPE.get(), () -> ZingsBiomesModFluids.END_TAR_PIT.get(),
			() -> ZingsBiomesModFluids.FLOWING_END_TAR_PIT.get()).explosionResistance(100f).tickRate(15).levelDecreasePerBlock(5).slopeFindDistance(5).bucket(() -> ZingsBiomesModItems.END_TAR_PIT_BUCKET.get())
			.block(() -> (LiquidBlock) ZingsBiomesModBlocks.END_TAR_PIT.get());

	private EndTarPitFluid() {
		super(PROPERTIES);
	}

	public static class Source extends EndTarPitFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends EndTarPitFluid {
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