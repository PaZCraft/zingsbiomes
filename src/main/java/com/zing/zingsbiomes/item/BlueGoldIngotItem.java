package com.zing.zingsbiomes.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class BlueGoldIngotItem extends Item {
	public BlueGoldIngotItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public boolean isPiglinCurrency(ItemStack stack) {
		return true;
	}
}