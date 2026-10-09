package net.mcreator.zingsbiomes.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedSardineItem extends Item {
	public CookedSardineItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(7).saturationModifier(0.7f).alwaysEdible().build()));
	}
}