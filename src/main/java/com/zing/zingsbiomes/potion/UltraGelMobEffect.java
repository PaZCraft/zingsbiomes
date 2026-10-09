package com.zing.zingsbiomes.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;

public class UltraGelMobEffect extends MobEffect {
	public UltraGelMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -2686721);
		this.withSoundOnAdded(BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("block.eyeblossom.open_long")));
		this.addAttributeModifier(Attributes.ATTACK_KNOCKBACK, Identifier.fromNamespaceAndPath("zingsbiomes", "effect.ultra_gel_0"), 2, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ENTITY_INTERACTION_RANGE, Identifier.fromNamespaceAndPath("zingsbiomes", "effect.ultra_gel_1"), 5, AttributeModifier.Operation.ADD_VALUE);
	}
}