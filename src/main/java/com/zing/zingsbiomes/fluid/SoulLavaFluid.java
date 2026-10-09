package net.mcreator.zingsbiomes.fluid;

import org.apache.logging.log4j.core.util.Source;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.zingsbiomes.init.ZingsBiomesModItems;
import net.mcreator.zingsbiomes.init.ZingsBiomesModFluids;
import net.mcreator.zingsbiomes.init.ZingsBiomesModFluidTypes;
import net.mcreator.zingsbiomes.init.ZingsBiomesModBlocks;

public abstract class SoulLavaFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> ZingsBiomesModFluidTypes.SOUL_LAVA_TYPE.get(), () -> ZingsBiomesModFluids.SOUL_LAVA.get(), () -> ZingsBiomesModFluids.FLOWING_SOUL_LAVA.get())
			.explosionResistance(100f).bucket(() -> ZingsBiomesModItems.SOUL_LAVA_BUCKET.get()).block(() -> (LiquidBlock) ZingsBiomesModBlocks.SOUL_LAVA.get());

	private SoulLavaFluid() {
		super(PROPERTIES);
	}

	public static class Source extends SoulLavaFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends SoulLavaFluid {
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