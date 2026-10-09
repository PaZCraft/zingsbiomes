package com.zing.zingsbiomes.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.entity.EntityType;

import com.zing.zingsbiomes.init.ZingsBiomesModItems;

public class RedDriftwoodBoatWithChestEntity extends ChestBoat {
	public RedDriftwoodBoatWithChestEntity(EntityType<RedDriftwoodBoatWithChestEntity> type, Level world) {
		super(type, world, ZingsBiomesModItems.RED_DRIFTWOOD_BOAT_WITH_CHEST);
	}
}