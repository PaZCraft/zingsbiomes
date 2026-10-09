package com.zing.zingsbiomes.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.DyeItem;
import net.minecraft.core.component.DataComponents;

public class PaleOrangeDyeItem extends DyeItem {
	public PaleOrangeDyeItem(Item.Properties properties) {
		super(properties.component(DataComponents.DYE, DyeColor.ORANGE));
	}
}