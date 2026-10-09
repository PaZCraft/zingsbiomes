package net.mcreator.zingsbiomes.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.InstantenousMobEffect;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.zingsbiomes.procedures.FakeGelEffectStartedappliedProcedure;

public class FakeGelMobEffect extends InstantenousMobEffect {
	public FakeGelMobEffect() {
		super(MobEffectCategory.HARMFUL, -13434880);
		this.withSoundOnAdded(BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.player.attack.crit")));
	}

	@Override
	public void applyInstantenousEffect(ServerLevel level, Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		FakeGelEffectStartedappliedProcedure.execute(level, entity);
	}
}