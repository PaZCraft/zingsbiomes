package com.zing.zingsbiomes.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.entity.EntityType;

import com.zing.zingsbiomes.init.ZingsBiomesModItems;

public class KapokBoatWithChestEntity extends ChestBoat {
	public KapokBoatWithChestEntity(EntityType<KapokBoatWithChestEntity> type, Level world) {
		super(type, world, ZingsBiomesModItems.KAPOK_BOAT_WITH_CHEST);
	}
}