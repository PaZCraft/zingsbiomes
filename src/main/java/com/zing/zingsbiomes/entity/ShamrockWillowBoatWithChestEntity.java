package net.mcreator.zingsbiomes.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.entity.EntityType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModItems;

public class ShamrockWillowBoatWithChestEntity extends ChestBoat {
	public ShamrockWillowBoatWithChestEntity(EntityType<ShamrockWillowBoatWithChestEntity> type, Level world) {
		super(type, world, ZingsBiomesModItems.SHAMROCK_WILLOW_BOAT_WITH_CHEST);
	}
}