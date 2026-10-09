package net.mcreator.zingsbiomes.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.zingsbiomes.ZingsBiomesMod;

public class FrostburnMobEffect extends MobEffect {
	public FrostburnMobEffect() {
		super(MobEffectCategory.HARMFUL, -9581336, mobEffectInstance -> ParticleTypes.WHITE_SMOKE);
		this.withSoundOnAdded(BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.player.hurt_freeze")));
		this.addAttributeModifier(Attributes.BURNING_TIME, Identifier.fromNamespaceAndPath(ZingsBiomesMod.MODID, "effect.frostburn_0"), 0.01, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.SNEAKING_SPEED, Identifier.fromNamespaceAndPath(ZingsBiomesMod.MODID, "effect.frostburn_1"), -0.005, AttributeModifier.Operation.ADD_VALUE);
	}
}