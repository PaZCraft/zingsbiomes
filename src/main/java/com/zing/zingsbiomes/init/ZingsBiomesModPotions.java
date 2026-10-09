/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.zing.zingsbiomes.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

import com.zing.zingsbiomes.ZingsBiomesMod;

public class ZingsBiomesModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, ZingsBiomesMod.MODID);
	public static final DeferredHolder<Potion, Potion> LUCKY_DAY = REGISTRY.register("lucky_day", () -> new Potion("lucky_day", new MobEffectInstance(MobEffects.LUCK, 10600, 5, false, true)));
	public static final DeferredHolder<Potion, Potion> FROSTBITE = REGISTRY.register("frostbite", () -> new Potion("frostbite", new MobEffectInstance(ZingsBiomesModMobEffects.FROSTBURN, 3600, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> SNOOZING = REGISTRY.register("snoozing", () -> new Potion("snoozing", new MobEffectInstance(ZingsBiomesModMobEffects.SNOOZE, 1, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> BLINDING = REGISTRY.register("blinding", () -> new Potion("blinding", new MobEffectInstance(MobEffects.BLINDNESS, 3600, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> NAUSEAOUS = REGISTRY.register("nauseaous", () -> new Potion("nauseaous", new MobEffectInstance(MobEffects.NAUSEA, 3600, 0, false, true)));
}