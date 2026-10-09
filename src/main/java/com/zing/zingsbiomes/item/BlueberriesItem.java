package com.zing.zingsbiomes.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BlueberriesItem extends Item {
	public BlueberriesItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(8).saturationModifier(0.7f).alwaysEdible().build(), Consumables.defaultFood().consumeSeconds(1.25F).build()));
	}
}