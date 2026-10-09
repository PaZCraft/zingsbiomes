package net.mcreator.zingsbiomes.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.entity.EntityType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModItems;

public class PalmBoatWithChestEntity extends ChestBoat {
	public PalmBoatWithChestEntity(EntityType<PalmBoatWithChestEntity> type, Level world) {
		super(type, world, ZingsBiomesModItems.PALM_BOAT_WITH_CHEST);
	}
}