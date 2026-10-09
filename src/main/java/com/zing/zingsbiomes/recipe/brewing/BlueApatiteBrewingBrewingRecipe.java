package com.zing.zingsbiomes.recipe.brewing;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

import com.zing.zingsbiomes.init.ZingsBiomesModItems;

public class BlueApatiteBrewingBrewingRecipe implements IBrewingRecipe {
	static {
		BrewingRecipeRegistry.addRecipe(new BlueApatiteBrewingBrewingRecipe());
	}

	@Override
	public boolean isInput(ItemStack input) {
		return Ingredient.of(Items.ARROW).test(input);
	}

	@Override
	public boolean isIngredient(ItemStack ingredient) {
		return Ingredient.of(ZingsBiomesModItems.BLUE_APATITE_SHARD.get()).test(ingredient);
	}

	@Override
	public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
		if (isInput(input) && isIngredient(ingredient)) {
			return new ItemStack(ZingsBiomesModItems.BLUE_APATITE_ARROW.get());
		}
		return ItemStack.EMPTY;
	}
}