/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package com.zing.zingsbiomes.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;

import com.zing.zingsbiomes.fluid.TearLavaFluid;
import com.zing.zingsbiomes.fluid.SoulLavaFluid;
import com.zing.zingsbiomes.fluid.QuartzLavaFluid;
import com.zing.zingsbiomes.fluid.IcyWaterFluid;
import com.zing.zingsbiomes.fluid.EndTarPitFluid;


public class ZingsBiomesModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, ZiNGsBiomes.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> ICY_WATER = REGISTRY.register("icy_water", IcyWaterFluid.Source::new);
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_ICY_WATER = REGISTRY.register("flowing_icy_water", IcyWaterFluid.Flowing::new);
	public static final DeferredHolder<Fluid, FlowingFluid> TEAR_LAVA = REGISTRY.register("tear_lava", TearLavaFluid.Source::new);
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_TEAR_LAVA = REGISTRY.register("flowing_tear_lava", TearLavaFluid.Flowing::new);
	public static final DeferredHolder<Fluid, FlowingFluid> QUARTZ_LAVA = REGISTRY.register("quartz_lava", QuartzLavaFluid.Source::new);
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_QUARTZ_LAVA = REGISTRY.register("flowing_quartz_lava", QuartzLavaFluid.Flowing::new);
	public static final DeferredHolder<Fluid, FlowingFluid> SOUL_LAVA = REGISTRY.register("soul_lava", SoulLavaFluid.Source::new);
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_SOUL_LAVA = REGISTRY.register("flowing_soul_lava", SoulLavaFluid.Flowing::new);
	public static final DeferredHolder<Fluid, FlowingFluid> END_TAR_PIT = REGISTRY.register("end_tar_pit", EndTarPitFluid.Source::new);
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_END_TAR_PIT = REGISTRY.register("flowing_end_tar_pit", EndTarPitFluid.Flowing::new);
}