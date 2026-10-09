package com.zing.zingsbiomes.recipe.brewing;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import com.zing.zingsbiomes.init.ZingsBiomesModPotions;
import com.zing.zingsbiomes.init.ZingsBiomesModItems;

public class SnoozingPotionBrewingRecipe implements IBrewingRecipe {
	public static void init() {
		BrewingRecipeRegistry.addRecipe(new SnoozingPotionBrewingRecipe());
	}

	public boolean isInput(ItemStack input) {
		return Ingredient.of(ZingsBiomesModItems.LIMEMADE_BOTTLE.get()).test(input);
	}

	public boolean isIngredient(ItemStack ingredient) {
		return Ingredient.of(Blocks.OPEN_EYEBLOSSOM.asItem()).test(ingredient);
	}

	public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
		if (isInput(input) && isIngredient(ingredient)) {
			return PotionContents.createItemStack(Items.POTION, ZingsBiomesModPotions.SNOOZING);
		}
		return ItemStack.EMPTY;
	}
}

class BrewingRecipeRegistry {
	private static final List<IBrewingRecipe> RECIPES = new ArrayList<>();

	public static void addRecipe(IBrewingRecipe recipe) {
		RECIPES.add(recipe);
	}

	public static List<IBrewingRecipe> getRecipes() {
		return RECIPES;
	}
}