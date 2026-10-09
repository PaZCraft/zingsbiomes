package net.mcreator.zingsbiomes.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.entity.EntityType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModItems;

public class SweetBerryBoatWithChestEntity extends ChestBoat {
	public SweetBerryBoatWithChestEntity(EntityType<SweetBerryBoatWithChestEntity> type, Level world) {
		super(type, world, ZingsBiomesModItems.SWEET_BERRY_BOAT_WITH_CHEST);
	}
}