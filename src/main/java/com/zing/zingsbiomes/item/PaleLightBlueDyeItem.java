package net.mcreator.zingsbiomes.item;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.DyeItem;
import net.minecraft.core.component.DataComponents;

public class PaleLightBlueDyeItem extends DyeItem {
	public PaleLightBlueDyeItem(Item.Properties properties) {
		super(properties.component(DataComponents.DYE, DyeColor.LIGHT_BLUE));
	}
}