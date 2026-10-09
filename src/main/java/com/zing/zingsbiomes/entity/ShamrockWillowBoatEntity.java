package com.zing.zingsbiomes.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.entity.EntityType;

import com.zing.zingsbiomes.init.ZingsBiomesModItems;

public class ShamrockWillowBoatEntity extends Boat {
	public ShamrockWillowBoatEntity(EntityType<ShamrockWillowBoatEntity> type, Level world) {
		super(type, world, ZingsBiomesModItems.SHAMROCK_WILLOW_BOAT);
	}
}