package net.mcreator.zingsbiomes.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.zingsbiomes.procedures.EyeblossomStewPlayerFinishesUsingItemProcedure;

public class EyeblossomStewItem extends Item {
	public EyeblossomStewItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.3f).alwaysEdible().build(), Consumables.DEFAULT_DRINK).usingConvertsTo(Items.BOWL));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		EyeblossomStewPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}