package com.zing.zingsbiomes.recipe.brewing;

import net.minecraft.world.item.ItemStack;

/**
 * IBrewingRecipe
 */
public interface IBrewingRecipe {

    ItemStack getOutput(ItemStack input, ItemStack ingredient);

    boolean isIngredient(ItemStack ingredient);

    boolean isInput(ItemStack input);
}
