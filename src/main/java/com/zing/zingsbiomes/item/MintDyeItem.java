package com.zing.zingsbiomes.item;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.DyeItem;
import net.minecraft.core.component.DataComponents;

public class MintDyeItem extends DyeItem {
	public MintDyeItem(Item.Properties properties) {
		super(properties.component(DataComponents.DYE, DyeColor.LIME));
	}
}