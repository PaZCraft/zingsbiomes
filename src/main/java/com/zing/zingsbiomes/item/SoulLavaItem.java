package com.zing.zingsbiomes.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import com.zing.zingsbiomes.init.ZingsBiomesModFluids;

public class SoulLavaItem extends BucketItem {
	public SoulLavaItem(Item.Properties properties) {
		super(ZingsBiomesModFluids.SOUL_LAVA.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}
}