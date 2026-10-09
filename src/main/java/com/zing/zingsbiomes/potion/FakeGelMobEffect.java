package com.zing.zingsbiomes.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;

import org.jspecify.annotations.Nullable;

import com.zing.zingsbiomes.procedures.FakeGelEffectStartedappliedProcedure;

public class FakeGelMobEffect extends InstantenousMobEffect {
	public FakeGelMobEffect() {
		super();
		this.withSoundOnAdded(BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.player.attack.crit")));
	}

	@Override
	public void applyInstantaneousEffect(ServerLevel level, Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		FakeGelEffectStartedappliedProcedure.execute(level, entity);
	}
}