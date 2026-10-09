package com.zing.zingsbiomes.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ArcticPearlItem extends Item {
	public ArcticPearlItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}