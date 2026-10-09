package com.zing.zingsbiomes.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.entity.EntityType;

import com.zing.zingsbiomes.init.ZingsBiomesModItems;

public class HoarfrostBoatWithChestEntity extends ChestBoat {
	public HoarfrostBoatWithChestEntity(EntityType<HoarfrostBoatWithChestEntity> type, Level world) {
		super(type, world, ZingsBiomesModItems.HOARFROST_BOAT_WITH_CHEST);
	}
}