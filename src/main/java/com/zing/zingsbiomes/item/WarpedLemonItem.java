package com.zing.zingsbiomes.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class WarpedLemonItem extends Item {
	public WarpedLemonItem(Item.Properties properties) {
		super(properties.fireResistant().food((new FoodProperties.Builder()).nutrition(7).saturationModifier(0.8f).alwaysEdible().build()));
	}
}