package com.zing.zingsbiomes.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import com.zing.zingsbiomes.init.ZingsBiomesModFluids;

public class TearLavaItem extends BucketItem {
	public TearLavaItem(Item.Properties properties) {
		super(ZingsBiomesModFluids.TEAR_LAVA.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}
}