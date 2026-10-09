package com.zing.zingsbiomes.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class UltrabbitFootItem extends Item {
	public UltrabbitFootItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}