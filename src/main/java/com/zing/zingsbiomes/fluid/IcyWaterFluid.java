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

public abstract class IcyWaterFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> ZingsBiomesModFluidTypes.ICY_WATER_TYPE.get(), () -> ZingsBiomesModFluids.ICY_WATER.get(), () -> ZingsBiomesModFluids.FLOWING_ICY_WATER.get())
			.explosionResistance(100f).bucket(() -> ZingsBiomesModItems.ICY_WATER_BUCKET.get()).block(() -> (LiquidBlock) ZingsBiomesModBlocks.ICY_WATER.get());

	private IcyWaterFluid() {
		super(PROPERTIES);
	}

	public static class Source extends IcyWaterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends IcyWaterFluid {
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