package com.zing.zingsbiomes.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.entity.EntityType;

import com.zing.zingsbiomes.init.ZingsBiomesModItems;

public class GlowBerryBoatWithChestEntity extends ChestBoat {
	public GlowBerryBoatWithChestEntity(EntityType<GlowBerryBoatWithChestEntity> type, Level world) {
		super(type, world, ZingsBiomesModItems.GLOW_BERRY_BOAT_WITH_CHEST);
	}
}