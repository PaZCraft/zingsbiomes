package com.zing.zingsbiomes.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.entity.EntityType;

import com.zing.zingsbiomes.init.ZingsBiomesModItems;

public class DriftwoodBoatWithChestEntity extends ChestBoat {
	public DriftwoodBoatWithChestEntity(EntityType<DriftwoodBoatWithChestEntity> type, Level world) {
		super(type, world, ZingsBiomesModItems.DRIFTWOOD_BOAT_WITH_CHEST);
	}
}