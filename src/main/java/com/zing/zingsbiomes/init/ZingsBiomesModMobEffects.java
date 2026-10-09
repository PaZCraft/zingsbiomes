/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.zing.zingsbiomes.init;
import com.zing.zingsbiomes.ZiNGsBiomes;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import com.zing.zingsbiomes.procedures.SnoozeEffectExpiresProcedure;
import com.zing.zingsbiomes.potion.*;


@EventBusSubscriber
public class ZingsBiomesModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, ZiNGsBiomes.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> FROSTBURN = REGISTRY.register("frostburn", FrostburnMobEffect::new);
	public static final DeferredHolder<MobEffect, MobEffect> PALE_GEL = REGISTRY.register("pale_gel", PaleGelMobEffect::new);
	public static final DeferredHolder<MobEffect, MobEffect> ULTRA_GEL = REGISTRY.register("ultra_gel", UltraGelMobEffect::new);
	public static final DeferredHolder<MobEffect, MobEffect> SEA_GEL = REGISTRY.register("sea_gel", SeaGelMobEffect::new);
	public static final DeferredHolder<MobEffect, MobEffect> DARK_GEL = REGISTRY.register("dark_gel", DarkGelMobEffect::new);
	public static final DeferredHolder<MobEffect, MobEffect> SNOOZE = REGISTRY.register("snooze", SnoozeMobEffect::new);
	public static final DeferredHolder<MobEffect, MobEffect> FAKE_GEL = REGISTRY.register("fake_gel", FakeGelMobEffect::new);

	@SubscribeEvent
	public static void onEffectRemoved(MobEffectEvent.Remove event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	@SubscribeEvent
	public static void onEffectExpired(MobEffectEvent.Expired event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	private static void expireEffects(Entity entity, MobEffectInstance effectInstance) {
		if (effectInstance.is(SNOOZE)) {
			SnoozeEffectExpiresProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		}
	}

    public static void queueServerWork(int ticks, Runnable task) {
        com.zing.zingsbiomes.ServerWorkQueue.queueServerWork(ticks, task);
    }
}