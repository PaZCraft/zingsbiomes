package com.zing.zingsbiomes.item;
import com.zing.zingsbiomes.ZiNGsBiomes;

import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;



public class EnderiteSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 4050, 15.5f, 0, 20, TagKey.create(Registries.ITEM, Identifier.parse("zings_biomes:enderite_sword_repair_items")));

	public EnderiteSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 9.5f, -3f).rarity(Rarity.RARE).fireResistant()
				.attributes(ItemAttributeModifiers.builder().add(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_ID, 9.5, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
						.add(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_ID, -3, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
						.add(Attributes.BLOCK_INTERACTION_RANGE, new AttributeModifier(Identifier.fromNamespaceAndPath(ZiNGsBiomes.MODID, "enderite_sword_0"), 0.05, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HAND)
						.add(Attributes.ENTITY_INTERACTION_RANGE, new AttributeModifier(Identifier.fromNamespaceAndPath(ZiNGsBiomes.MODID, "enderite_sword_1"), 0.05, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HAND)
						.add(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(Identifier.fromNamespaceAndPath(ZiNGsBiomes.MODID, "enderite_sword_2"), 0.05, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HAND).build()));
	}
}