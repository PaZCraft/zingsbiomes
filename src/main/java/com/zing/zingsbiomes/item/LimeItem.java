package com.zing.zingsbiomes.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class LimeItem extends Item {
	public LimeItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(8).saturationModifier(0.9f).alwaysEdible().build()));
	}
}