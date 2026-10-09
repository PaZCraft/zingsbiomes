package com.zing.zingsbiomes.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.entity.EntityType;

import com.zing.zingsbiomes.init.ZingsBiomesModItems;

public class BlueberryBoatWithChestEntity extends ChestBoat {
	public BlueberryBoatWithChestEntity(EntityType<BlueberryBoatWithChestEntity> type, Level world) {
		super(type, world, ZingsBiomesModItems.BLUEBERRY_BOAT_WITH_CHEST);
	}
}