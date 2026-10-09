package net.mcreator.zingsbiomes.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.entity.EntityType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModItems;

public class RaspberryBoatWithChestEntity extends ChestBoat {
	public RaspberryBoatWithChestEntity(EntityType<RaspberryBoatWithChestEntity> type, Level world) {
		super(type, world, ZingsBiomesModItems.RASPBERRY_BOAT_WITH_CHEST);
	}
}