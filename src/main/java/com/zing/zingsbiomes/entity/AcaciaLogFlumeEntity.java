package net.mcreator.zingsbiomes.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.level.Level;

import net.mcreator.zingsbiomes.init.ZingsBiomesModItems;

public class AcaciaLogFlumeEntity extends Boat {
	public AcaciaLogFlumeEntity(EntityType<AcaciaLogFlumeEntity> type, Level world) {
		super(type, world, ZingsBiomesModItems.ACACIA_LOG_FLUME);
	}
}