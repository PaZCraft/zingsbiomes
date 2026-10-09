package net.mcreator.zingsbiomes.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CrimsonFruitItem extends Item {
	public CrimsonFruitItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).fireResistant().food((new FoodProperties.Builder()).nutrition(8).saturationModifier(0.9f).alwaysEdible().build()).usingConvertsTo(Items.NETHER_WART));
	}
}