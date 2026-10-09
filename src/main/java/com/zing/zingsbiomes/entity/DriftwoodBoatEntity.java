package com.zing.zingsbiomes.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.entity.EntityType;

import com.zing.zingsbiomes.init.ZingsBiomesModItems;

public class DriftwoodBoatEntity extends Boat {
	public DriftwoodBoatEntity(EntityType<DriftwoodBoatEntity> type, Level world) {
		super(type, world, ZingsBiomesModItems.DRIFTWOOD_BOAT);
	}
}