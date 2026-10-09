package com.zing.zingsbiomes.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class TinSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 150, 4f, 0, 2, TagKey.create(Registries.ITEM, Identifier.parse("zings_biomes:tin_sword_repair_items")));

	public TinSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 3f, -3f));
	}
}