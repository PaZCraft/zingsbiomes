package net.mcreator.zingsbiomes.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedDuckItem extends Item {
	public CookedDuckItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(14).saturationModifier(1.4f).alwaysEdible().build()));
	}
}