package com.zing.zingsbiomes.recipe.brewing;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

import com.zing.zingsbiomes.init.ZingsBiomesModItems;

public class CrystalizedBlowgunBrewingBrewingRecipe implements IBrewingRecipe {
	@Override
	public boolean isInput(ItemStack input) {
		return Ingredient.of(ZingsBiomesModItems.BLOWGUN.get()).test(input);
	}

	@Override
	public boolean isIngredient(ItemStack ingredient) {
		return Ingredient.of(ZingsBiomesModItems.BLUE_APATITE_SHARD.get()).test(ingredient);
	}

	@Override
	public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
		if (isInput(input) && isIngredient(ingredient)) {
			return new ItemStack(ZingsBiomesModItems.CRYSTALIZED_BLOWGUN.get());
		}
		return ItemStack.EMPTY;
	}
}