package com.zing.zingsbiomes.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BlueGoldenCarrotItem extends Item {
	public BlueGoldenCarrotItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(17).saturationModifier(1.7f).alwaysEdible().build()));
	}

	@Override
	public boolean isPiglinCurrency(ItemStack stack) {
		return true;
	}
}