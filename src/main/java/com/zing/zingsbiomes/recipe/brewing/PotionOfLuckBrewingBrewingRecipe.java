package com.zing.zingsbiomes.recipe.brewing;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.core.component.DataComponents;

import com.zing.zingsbiomes.init.ZingsBiomesModPotions;
import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

public class PotionOfLuckBrewingBrewingRecipe implements IBrewingRecipe {
	@Override
	public boolean isInput(ItemStack input) {
		Item inputItem = input.getItem();
		return (inputItem == Items.POTION || inputItem == Items.SPLASH_POTION || inputItem == Items.LINGERING_POTION) && input.getOrDefault(DataComponents.POTION_CONTENTS, PotionContents.EMPTY).is(Potions.THICK);
	}

	public boolean isIngredient(ItemStack ingredient) {
		return Ingredient.of(ZingsBiomesModBlocks.CLOVER.get().asItem()).test(ingredient);
	}

	@Override
	public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
		if (isInput(input) && isIngredient(ingredient)) {
			return PotionContents.createItemStack(input.getItem(), ZingsBiomesModPotions.LUCKY_DAY);
		}
		return ItemStack.EMPTY;
	}
}