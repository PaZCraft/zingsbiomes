/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.zing.zingsbiomes.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;



public class ZingsBiomesModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, ZiNGsBiomes.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> HOARFROST_LEAF = REGISTRY.register("hoarfrost_leaf", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> YELLOW_SUNSHINE_LEAF = REGISTRY.register("yellow_sunshine_leaf", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> GREEN_SUNSHINE_LEAF = REGISTRY.register("green_sunshine_leaf", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> SHAMROCK_WILLOW_LEAF = REGISTRY.register("shamrock_willow_leaf", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> KAPOK_LEAF = REGISTRY.register("kapok_leaf", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> END_SPRUCE_LEAF = REGISTRY.register("end_spruce_leaf", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> CHORUS_LEAF = REGISTRY.register("chorus_leaf", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> ULTRABLOSSOM_OPEN_TRAIL = REGISTRY.register("ultrablossom_open_trail", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> DARKBLOSSOM_OPEN_TRAIL = REGISTRY.register("darkblossom_open_trail", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> SEABLOSSOM_OPEN_TRAIL = REGISTRY.register("seablossom_open_trail", () -> new SimpleParticleType(false));
}