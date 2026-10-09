package net.mcreator.zingsbiomes.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.zingsbiomes.init.ZingsBiomesModFluids;

public class IcyWaterItem extends BucketItem {
	public IcyWaterItem(Item.Properties properties) {
		super(ZingsBiomesModFluids.ICY_WATER.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}
}