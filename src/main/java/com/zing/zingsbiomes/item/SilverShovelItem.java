package net.mcreator.zingsbiomes.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class SilverShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 450, 7f, 0, 12, TagKey.create(Registries.ITEM, Identifier.parse("zings_biomes:silver_shovel_repair_items")));

	public SilverShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 5.5f, -3f, properties);
	}
}