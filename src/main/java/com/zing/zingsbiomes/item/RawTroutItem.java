package net.mcreator.zingsbiomes.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class RawTroutItem extends Item {
	public RawTroutItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(11).saturationModifier(0.8f).build()));
	}
}