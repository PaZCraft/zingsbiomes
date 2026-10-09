package net.mcreator.zingsbiomes.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.zingsbiomes.init.ZingsBiomesModFluids;

public class EndTarPitItem extends BucketItem {
	public EndTarPitItem(Item.Properties properties) {
		super(ZingsBiomesModFluids.END_TAR_PIT.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON));
	}
}