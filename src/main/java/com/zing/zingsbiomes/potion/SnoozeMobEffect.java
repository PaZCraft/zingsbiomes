package com.zing.zingsbiomes.potion;

import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.consume_effects.RemoveStatusEffectsConsumeEffect;
import net.minecraft.world.item.consume_effects.ConsumeEffect;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.Items;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.component.DataComponents;

import com.zing.zingsbiomes.procedures.SnoozeEffectExpiresProcedure;
import com.zing.zingsbiomes.init.ZingsBiomesModMobEffects;

import java.util.List;

import org.jspecify.annotations.Nullable;

import java.util.ArrayList;

@EventBusSubscriber
public class SnoozeMobEffect extends InstantenousMobEffect {
	public SnoozeMobEffect() {
		super();
		this.withSoundOnAdded(BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.fox.sleep")));
	}

	private void withSoundOnAdded(SoundEvent value) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'withSoundOnAdded'");
	}

	public void applyInstantenousEffect(ServerLevel level, Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		SnoozeEffectExpiresProcedure.execute(level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@SubscribeEvent
	public static void modifyItemComponents(ModifyDefaultComponentsEvent event) {
		Consumable original = Consumables.HONEY_BOTTLE;
		List<ConsumeEffect> onConsumeEffects = new ArrayList<>(original.onConsumeEffects());
		onConsumeEffects.add(new RemoveStatusEffectsConsumeEffect(ZingsBiomesModMobEffects.SNOOZE));
		Consumable replacementConsumable = new Consumable(original.consumeSeconds(), original.animation(), original.sound(), original.hasConsumeParticles(), onConsumeEffects);
		event.modify(Items.HONEY_BOTTLE, (builder, _, _) -> builder.set(DataComponents.CONSUMABLE, replacementConsumable));
	}
}