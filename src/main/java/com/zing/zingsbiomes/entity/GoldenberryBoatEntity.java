package net.mcreator.zingsbiomes.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.entity.EntityType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModItems;

public class GoldenberryBoatEntity extends Boat {
	public GoldenberryBoatEntity(EntityType<GoldenberryBoatEntity> type, Level world) {
		super(type, world, ZingsBiomesModItems.GOLDENBERRY_BOAT);
	}
}