package net.mcreator.zingsbiomes.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.entity.EntityType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModItems;

public class HoarfrostBoatWithChestEntity extends ChestBoat {
	public HoarfrostBoatWithChestEntity(EntityType<HoarfrostBoatWithChestEntity> type, Level world) {
		super(type, world, ZingsBiomesModItems.HOARFROST_BOAT_WITH_CHEST);
	}
}