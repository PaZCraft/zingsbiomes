package com.zing.zingsbiomes.item;

import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.component.BlocksAttacks;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.component.DataComponents;

import com.zing.zingsbiomes.procedures.CarnelianShieldToolInInventoryTickProcedure;


import javax.annotation.Nullable;

import java.util.Optional;
import java.util.List;

public class CarnelianShieldItem extends ShieldItem {
	public CarnelianShieldItem(Item.Properties properties) {
		super(properties.repairable(TagKey.create(Registries.ITEM, Identifier.parse("zings_biomes:carnelian_shield_repair_items"))).component(DataComponents.BREAK_SOUND, SoundEvents.SHIELD_BREAK).equippableUnswappable(EquipmentSlot.OFFHAND)
				.delayedComponent(DataComponents.BLOCKS_ATTACKS,
						context -> new BlocksAttacks(0.25f, 1, List.of(new BlocksAttacks.DamageReduction(90.0f, Optional.empty(), 0, 1)), new BlocksAttacks.ItemDamageFunction(3, 1, 1), Optional.of(context.getOrThrow(DamageTypeTags.BYPASSES_SHIELD)),
								Optional.of(SoundEvents.SHIELD_BLOCK), Optional.of(SoundEvents.SHIELD_BREAK)))
				.durability(1000).rarity(Rarity.UNCOMMON).fireResistant()
				.attributes(ItemAttributeModifiers.builder()
						.add(Attributes.MINING_EFFICIENCY, new AttributeModifier(Identifier.fromNamespaceAndPath(ZiNGsBiomes.MODID, "carnelian_shield_0"), 5, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
						.add(Attributes.SUBMERGED_MINING_SPEED, new AttributeModifier(Identifier.fromNamespaceAndPath(ZiNGsBiomes.MODID, "carnelian_shield_1"), 10, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND).build()));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, ServerLevel world, Entity entity, @Nullable EquipmentSlot equipmentSlot) {
		super.inventoryTick(itemstack, world, entity, equipmentSlot);
		CarnelianShieldToolInInventoryTickProcedure.execute(entity);
	}
}