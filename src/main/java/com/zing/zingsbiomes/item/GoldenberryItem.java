package com.zing.zingsbiomes.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class GoldenberryItem extends Item {
	public GoldenberryItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.3f).build()));
	}
}