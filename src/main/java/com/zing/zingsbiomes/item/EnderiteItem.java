package net.mcreator.zingsbiomes.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EnderiteItem extends Item {
	public EnderiteItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}