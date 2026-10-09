package net.mcreator.zingsbiomes.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class BlueGoldenAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, 132, 12f, 0, 22, TagKey.create(Registries.ITEM, Identifier.parse("zings_biomes:blue_golden_axe_repair_items")));

	public BlueGoldenAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 6f, -3f, properties);
	}
}