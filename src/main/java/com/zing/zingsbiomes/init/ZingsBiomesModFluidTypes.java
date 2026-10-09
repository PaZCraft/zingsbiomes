/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package com.zing.zingsbiomes.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import com.zing.zingsbiomes.fluid.types.TearLavaFluidType;
import com.zing.zingsbiomes.fluid.types.SoulLavaFluidType;
import com.zing.zingsbiomes.fluid.types.QuartzLavaFluidType;
import com.zing.zingsbiomes.fluid.types.IcyWaterFluidType;
import com.zing.zingsbiomes.fluid.types.EndTarPitFluidType;
import com.zing.zingsbiomes.ZingsBiomesMod;

public class ZingsBiomesModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, ZingsBiomesMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> ICY_WATER_TYPE = REGISTRY.register("icy_water", IcyWaterFluidType::new);
	public static final DeferredHolder<FluidType, FluidType> TEAR_LAVA_TYPE = REGISTRY.register("tear_lava", TearLavaFluidType::new);
	public static final DeferredHolder<FluidType, FluidType> QUARTZ_LAVA_TYPE = REGISTRY.register("quartz_lava", QuartzLavaFluidType::new);
	public static final DeferredHolder<FluidType, FluidType> SOUL_LAVA_TYPE = REGISTRY.register("soul_lava", SoulLavaFluidType::new);
	public static final DeferredHolder<FluidType, FluidType> END_TAR_PIT_TYPE = REGISTRY.register("end_tar_pit", EndTarPitFluidType::new);
}