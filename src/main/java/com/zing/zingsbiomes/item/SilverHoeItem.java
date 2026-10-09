package com.zing.zingsbiomes.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;

import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class SilverHoeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 450, 7f, 0, 12, TagKey.create(Registries.ITEM, Identifier.parse("zings_biomes:silver_hoe_repair_items")));

	public SilverHoeItem(Item.Properties properties) {
		super(properties.axe(TOOL_MATERIAL, 5.5f, -3f));
	}
}