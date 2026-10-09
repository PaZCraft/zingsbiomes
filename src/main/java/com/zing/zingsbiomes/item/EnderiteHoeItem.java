package com.zing.zingsbiomes.item;

import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.component.DataComponents;

import com.zing.zingsbiomes.init.ZingsBiomesModItems;
import com.zing.zingsbiomes.ZingsBiomesMod;

@EventBusSubscriber
public class EnderiteHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 4050, 15.5f, 0, 20, TagKey.create(Registries.ITEM, Identifier.parse("zings_biomes:enderite_hoe_repair_items")));

	public EnderiteHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 9.5f, -3f, properties.rarity(Rarity.RARE).fireResistant());
	}

	@SubscribeEvent
	public static void modifyDefaultComponents(ModifyDefaultComponentsEvent event) {
		event.modify(ZingsBiomesModItems.ENDERITE_HOE.get(),
				(builder, _, _) -> builder.set(DataComponents.ATTRIBUTE_MODIFIERS,
						ItemAttributeModifiers.builder().add(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_ID, 9.5, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
								.add(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_ID, -3, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
								.add(Attributes.BLOCK_INTERACTION_RANGE, new AttributeModifier(Identifier.fromNamespaceAndPath(ZingsBiomesMod.MODID, "enderite_hoe_0"), 0.05, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HAND)
								.add(Attributes.ENTITY_INTERACTION_RANGE, new AttributeModifier(Identifier.fromNamespaceAndPath(ZingsBiomesMod.MODID, "enderite_hoe_1"), 0.05, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HAND)
								.add(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(Identifier.fromNamespaceAndPath(ZingsBiomesMod.MODID, "enderite_hoe_2"), 0.05, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HAND).build()));
	}
}