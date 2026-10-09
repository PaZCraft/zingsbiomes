package net.mcreator.zingsbiomes.potion;

import net.neoforged.neoforge.common.NeoForgeMod;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.zingsbiomes.ZingsBiomesMod;

public class SeaGelMobEffect extends MobEffect {
	public SeaGelMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16718337);
		this.withSoundOnAdded(BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("ambient.underwater.enter")));
		this.addAttributeModifier(Attributes.SUBMERGED_MINING_SPEED, Identifier.fromNamespaceAndPath(ZingsBiomesMod.MODID, "effect.sea_gel_0"), 5, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(NeoForgeMod.SWIM_SPEED, Identifier.fromNamespaceAndPath(ZingsBiomesMod.MODID, "effect.sea_gel_1"), 5, AttributeModifier.Operation.ADD_VALUE);
	}
}