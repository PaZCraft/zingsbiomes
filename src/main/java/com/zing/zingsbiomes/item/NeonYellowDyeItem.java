package com.zing.zingsbiomes.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.DyeItem;
import net.minecraft.core.component.DataComponents;

public class NeonYellowDyeItem extends DyeItem {
	public NeonYellowDyeItem(Item.Properties properties) {
		super(properties.component(DataComponents.DYE, DyeColor.YELLOW));
	}
}