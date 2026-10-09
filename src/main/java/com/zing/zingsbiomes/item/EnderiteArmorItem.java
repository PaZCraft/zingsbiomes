package com.zing.zingsbiomes.item;

import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import java.util.Map;

public abstract class EnderiteArmorItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(40, Map.of(ArmorType.BOOTS, 10, ArmorType.LEGGINGS, 10, ArmorType.CHESTPLATE, 10, ArmorType.HELMET, 10, ArmorType.BODY, 10), 20,
			DeferredHolder.create(Registries.SOUND_EVENT, Identifier.parse("item.armor.equip_netherite")), 4f, 0.2f, TagKey.create(Registries.ITEM, Identifier.parse("zings_biomes:enderite_armor_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.parse("zings_biomes:enderite_armor")));

	private EnderiteArmorItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends EnderiteArmorItem {
		public Helmet(Item.Properties properties) {
			super(properties.rarity(Rarity.RARE).humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}
	}

	public static class Chestplate extends EnderiteArmorItem {
		public Chestplate(Item.Properties properties) {
			super(properties.rarity(Rarity.RARE).humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}
	}

	public static class Leggings extends EnderiteArmorItem {
		public Leggings(Item.Properties properties) {
			super(properties.rarity(Rarity.RARE).humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS));
		}
	}

	public static class Boots extends EnderiteArmorItem {
		public Boots(Item.Properties properties) {
			super(properties.rarity(Rarity.RARE).humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS));
		}
	}
}