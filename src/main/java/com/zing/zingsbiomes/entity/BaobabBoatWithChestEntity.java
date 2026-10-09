package net.mcreator.zingsbiomes.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.entity.EntityType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModItems;

public class BaobabBoatWithChestEntity extends ChestBoat {
	public BaobabBoatWithChestEntity(EntityType<BaobabBoatWithChestEntity> type, Level world) {
		super(type, world, ZingsBiomesModItems.BAOBAB_BOAT_WITH_CHEST);
	}
}