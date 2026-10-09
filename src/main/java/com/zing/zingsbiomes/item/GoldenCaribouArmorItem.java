package net.mcreator.zingsbiomes.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class GoldenCaribouArmorItem extends Item {
	public GoldenCaribouArmorItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public boolean isPiglinCurrency(ItemStack stack) {
		return true;
	}
}