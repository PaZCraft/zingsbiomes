package com.zing.zingsbiomes.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.entity.EntityType;

import com.zing.zingsbiomes.init.ZingsBiomesModItems;

public class BaobabBoatWithChestEntity extends ChestBoat {
	public BaobabBoatWithChestEntity(EntityType<BaobabBoatWithChestEntity> type, Level world) {
		super(type, world, ZingsBiomesModItems.BAOBAB_BOAT_WITH_CHEST);
	}
}