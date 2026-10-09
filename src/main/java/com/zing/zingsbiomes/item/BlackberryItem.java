package net.mcreator.zingsbiomes.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BlackberryItem extends Item {
	public BlackberryItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.3f).build(), Consumables.defaultFood().animation(ItemUseAnimation.NONE).consumeSeconds(0F).build()));
	}
}