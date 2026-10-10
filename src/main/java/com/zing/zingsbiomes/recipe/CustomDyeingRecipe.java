package com.zing.zingsbiomes.recipe;

import com.zing.zingsbiomes.init.ZingsBiomesModItems;
import com.zing.zingsbiomes.item.CrimsonDyeItem;
import com.zing.zingsbiomes.item.VioletDyeItem;
import com.zing.zingsbiomes.item.MintDyeItem;
import com.zing.zingsbiomes.item.PaleOrangeDyeItem;
import com.zing.zingsbiomes.item.NeonOrangeDyeItem;
import com.zing.zingsbiomes.item.NeonYellowDyeItem;
import com.zing.zingsbiomes.item.PaleLightBlueDyeItem;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.CraftingInput;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;
import java.util.ArrayList;
import java.util.List;

public class CustomDyeingRecipe extends CustomRecipe {
    public CustomDyeingRecipe(CraftingBookCategory category) {
        super(category);
    }

    @Override
    public boolean matches(CraftingInput input, Level level) {
        ItemStack targetItem = ItemStack.EMPTY;
        List<ItemStack> dyes = new ArrayList<>();

        for (int i = 0; i < input.size(); i++) {
            ItemStack stack = input.getItem(i);
            if (!stack.isEmpty()) {
                if (stack.getItem() instanceof CrimsonDyeItem) {
                    if (!targetItem.isEmpty()) return false; // Only allow one dyable item
                    targetItem = stack;
                } else if (stack.is(ZingsBiomesModItemTagsProvider.C_DYES)) { // Assumes tag from Step 2
                    dyes.add(stack);
                } else {
                    return false; // Found an invalid item in the grid
                }
            }
        }
        return !targetItem.isEmpty() && !dyes.isEmpty();
    }

    @Override
    public ItemStack assemble(CraftingInput input, HolderLookup.Provider provider) {
        ItemStack targetItem = ItemStack.EMPTY;
        List<ItemStack> dyes = new ArrayList<>();

        for (int i = 0; i < input.size(); i++) {
            ItemStack stack = input.getItem(i);
            if (!stack.isEmpty()) {
                if (stack.getItem() instanceof VioletDye) {
                    targetItem = stack.copy();
                } else if (stack.is(ModItemTagsProvider.C_DYES)) {
                    dyes.add(stack);
                }
            }
        }

        // Fetch the starting color of the item
        int currentColor = CustomDyableItem.getColor(targetItem);
        
        // Average your dye colors together (Basic color blending algorithm)
        int rSum = (currentColor >> 16) & 0xFF;
        int gSum = (currentColor >> 8) & 0xFF;
        int bSum = currentColor & 0xFF;
        int count = 1;

        for (ItemStack dye : dyes) {
            int dyeColor = getRgbForDye(dye);
            rSum += (dyeColor >> 16) & 0xFF;
            gSum += (dyeColor >> 8) & 0xFF;
            bSum += dyeColor & 0xFF;
            count++;
        }

        int finalColor = ((rSum / count) << 16) | ((gSum / count) << 8) | (bSum / count);
        return CustomDyableItem.applyColor(targetItem, finalColor);
    }

    // Assign your custom colors to your registered items
    private int getRgbForDye(ItemStack dye) {
        if (dye.is(ModItems.MAROON_DYE.get())) return 0x800000;
        if (dye.is(ModItems.VIOLET_DYE.get())) return 0x008080;
        if (dye.is(ModItems.MINT_DYE.get())) return 0x008080;
        if (dye.is(ModItems.PALE_ORANGE_DYE.get())) return 0x008080;
        if (dye.is(ModItems.PALE_LIGHT_BLUE_DYE.get())) return 0x008080;
        if (dye.is(ModItems.NEON_YELLOW_DYE.get())) return 0x008080;
        if (dye.is(ModItems.NEON_ORANGE_DYE.get())) return 0x008080;
        return 0xFFFFFF; // Fallback
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return width * height >= 2;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        // Return your registered recipe serializer (see below)
        return ModRecipes.CUSTOM_DYEING_SERIALIZER.get(); 
    }
}


