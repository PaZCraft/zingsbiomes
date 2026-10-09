package net.mcreator.zingsbiomes.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class BlueGoldenNuggetItem extends Item {
	public BlueGoldenNuggetItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public boolean isPiglinCurrency(ItemStack stack) {
		return true;
	}
}