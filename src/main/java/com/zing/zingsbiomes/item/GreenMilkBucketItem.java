package com.zing.zingsbiomes.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import com.zing.zingsbiomes.procedures.GreenMilkBucketPlayerFinishesUsingItemProcedure;

public class GreenMilkBucketItem extends Item {
	public GreenMilkBucketItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.3f).build()).usingConvertsTo(Items.BUCKET));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		GreenMilkBucketPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}