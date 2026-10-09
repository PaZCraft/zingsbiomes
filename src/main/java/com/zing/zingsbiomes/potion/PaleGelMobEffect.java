package net.mcreator.zingsbiomes.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.zingsbiomes.ZingsBiomesMod;

public class PaleGelMobEffect extends MobEffect {
	public PaleGelMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -41984);
		this.withSoundOnAdded(BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.creaking.ambient")));
		this.addAttributeModifier(Attributes.KNOCKBACK_RESISTANCE, Identifier.fromNamespaceAndPath(ZingsBiomesMod.MODID, "effect.pale_gel_0"), 5, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.BLOCK_INTERACTION_RANGE, Identifier.fromNamespaceAndPath(ZingsBiomesMod.MODID, "effect.pale_gel_1"), 5, AttributeModifier.Operation.ADD_VALUE);
	}
}