package net.mcreator.zingsbiomes.item;

import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.zingsbiomes.ZingsBiomesMod;

import java.util.Map;

public abstract class BlueGoldenItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(250, Map.of(ArmorType.BOOTS, 1, ArmorType.LEGGINGS, 3, ArmorType.CHESTPLATE, 5, ArmorType.HELMET, 2, ArmorType.BODY, 5), 25,
			DeferredHolder.create(Registries.SOUND_EVENT, Identifier.parse("item.armor.equip_gold")), 0f, 0f, TagKey.create(Registries.ITEM, Identifier.parse("zings_biomes:blue_golden_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.parse("zings_biomes:blue_golden")));

	private BlueGoldenItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends BlueGoldenItem {
		public Helmet(Item.Properties properties) {
			super(properties.rarity(Rarity.UNCOMMON).humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET)
					.attributes(ItemAttributeModifiers.builder().add(Attributes.ARMOR, new AttributeModifier(Identifier.withDefaultNamespace("armor.helmet"), 2, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
							.add(Attributes.MOVEMENT_SPEED, new AttributeModifier(Identifier.fromNamespaceAndPath(ZingsBiomesMod.MODID, "blue_golden_0.helmet"), 0.005, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
							.add(Attributes.MAX_ABSORPTION, new AttributeModifier(Identifier.fromNamespaceAndPath(ZingsBiomesMod.MODID, "blue_golden_1.helmet"), 0.005, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD).build()));
		}
	}

	public static class Chestplate extends BlueGoldenItem {
		public Chestplate(Item.Properties properties) {
			super(properties.rarity(Rarity.UNCOMMON).humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE)
					.attributes(ItemAttributeModifiers.builder().add(Attributes.ARMOR, new AttributeModifier(Identifier.withDefaultNamespace("armor.chestplate"), 5, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
							.add(Attributes.MOVEMENT_SPEED, new AttributeModifier(Identifier.fromNamespaceAndPath(ZingsBiomesMod.MODID, "blue_golden_0.chestplate"), 0.005, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
							.add(Attributes.MAX_ABSORPTION, new AttributeModifier(Identifier.fromNamespaceAndPath(ZingsBiomesMod.MODID, "blue_golden_1.chestplate"), 0.005, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST).build()));
		}
	}

	public static class Leggings extends BlueGoldenItem {
		public Leggings(Item.Properties properties) {
			super(properties.rarity(Rarity.UNCOMMON).humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS)
					.attributes(ItemAttributeModifiers.builder().add(Attributes.ARMOR, new AttributeModifier(Identifier.withDefaultNamespace("armor.leggings"), 3, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
							.add(Attributes.MOVEMENT_SPEED, new AttributeModifier(Identifier.fromNamespaceAndPath(ZingsBiomesMod.MODID, "blue_golden_0.leggings"), 0.005, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
							.add(Attributes.MAX_ABSORPTION, new AttributeModifier(Identifier.fromNamespaceAndPath(ZingsBiomesMod.MODID, "blue_golden_1.leggings"), 0.005, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS).build()));
		}
	}

	public static class Boots extends BlueGoldenItem {
		public Boots(Item.Properties properties) {
			super(properties.rarity(Rarity.UNCOMMON).humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS)
					.attributes(ItemAttributeModifiers.builder().add(Attributes.ARMOR, new AttributeModifier(Identifier.withDefaultNamespace("armor.boots"), 1, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
							.add(Attributes.MOVEMENT_SPEED, new AttributeModifier(Identifier.fromNamespaceAndPath(ZingsBiomesMod.MODID, "blue_golden_0.boots"), 0.005, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
							.add(Attributes.MAX_ABSORPTION, new AttributeModifier(Identifier.fromNamespaceAndPath(ZingsBiomesMod.MODID, "blue_golden_1.boots"), 0.005, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET).build()));
		}
	}
}