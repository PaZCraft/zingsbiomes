package com.zing.zingsbiomes.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedPiranhaItem extends Item {
	public CookedPiranhaItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(12).saturationModifier(1.2f).alwaysEdible().build()));
	}
}