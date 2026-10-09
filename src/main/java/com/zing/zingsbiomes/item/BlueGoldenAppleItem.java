package com.zing.zingsbiomes.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import com.zing.zingsbiomes.procedures.BlueGoldenApplePlayerFinishesUsingItemProcedure;

public class BlueGoldenAppleItem extends Item {
	public BlueGoldenAppleItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(11).saturationModifier(1f).alwaysEdible().build()));
	}

	@Override
	public boolean isPiglinCurrency(ItemStack stack) {
		return true;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		BlueGoldenApplePlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}