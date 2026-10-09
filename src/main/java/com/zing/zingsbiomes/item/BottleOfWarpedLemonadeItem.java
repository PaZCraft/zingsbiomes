package net.mcreator.zingsbiomes.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BottleOfWarpedLemonadeItem extends Item {
	public BottleOfWarpedLemonadeItem(Item.Properties properties) {
		super(properties.fireResistant().food((new FoodProperties.Builder()).nutrition(10).saturationModifier(1f).build(), Consumables.DEFAULT_DRINK).usingConvertsTo(Items.GLASS_BOTTLE));
	}
}