package net.mcreator.zingsbiomes.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedTroutItem extends Item {
	public CookedTroutItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(17).saturationModifier(1.7f).build()));
	}
}