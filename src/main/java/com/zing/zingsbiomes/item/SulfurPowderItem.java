package com.zing.zingsbiomes.item;

import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.function.Consumer;

public class SulfurPowderItem extends Item {
	public SulfurPowderItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}

	@SuppressWarnings("deprecation")
	@Override
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
		componentConsumer.accept(Component.translatable("item.zings_biomes.sulfur_powder.description_0"));
		componentConsumer.accept(Component.translatable("item.zings_biomes.sulfur_powder.description_1"));
	}
}