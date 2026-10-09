package net.mcreator.zingsbiomes.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.zingsbiomes.ZingsBiomesMod;

public class DarkGelMobEffect extends MobEffect {
	public DarkGelMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -15533819);
		this.withSoundOnAdded(BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("block.sign.waxed_interact_fail")));
		this.addAttributeModifier(Attributes.STEP_HEIGHT, Identifier.fromNamespaceAndPath(ZingsBiomesMod.MODID, "effect.dark_gel_0"), 5, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.SNEAKING_SPEED, Identifier.fromNamespaceAndPath(ZingsBiomesMod.MODID, "effect.dark_gel_1"), 5, AttributeModifier.Operation.ADD_VALUE);
	}
}