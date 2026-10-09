package net.mcreator.zingsbiomes.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.entity.EntityType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModItems;

public class GrazedSpruceBoatWithChestEntity extends ChestBoat {
	public GrazedSpruceBoatWithChestEntity(EntityType<GrazedSpruceBoatWithChestEntity> type, Level world) {
		super(type, world, ZingsBiomesModItems.GRAZED_SPRUCE_BOAT_WITH_CHEST);
	}
}