package com.zing.zingsbiomes.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CrimsonApplePieItem extends Item {
	public CrimsonApplePieItem(Item.Properties properties) {
		super(properties.fireResistant().food((new FoodProperties.Builder()).nutrition(18).saturationModifier(1.4f).build()));
	}
}