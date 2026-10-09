package net.mcreator.zingsbiomes.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.entity.EntityType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModItems;

public class BlueberryBoatEntity extends Boat {
	public BlueberryBoatEntity(EntityType<BlueberryBoatEntity> type, Level world) {
		super(type, world, ZingsBiomesModItems.BLUEBERRY_BOAT);
	}
}