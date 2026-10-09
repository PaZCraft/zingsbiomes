package net.mcreator.zingsbiomes.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.level.Level;
import net.mcreator.zingsbiomes.init.ZingsBiomesModItems;

public class CherryLogFlumeEntity extends Boat {
	public CherryLogFlumeEntity(EntityType<CherryLogFlumeEntity> type, Level world) {
		super(type, world, ZingsBiomesModItems.CHERRY_LOG_FLUME);
	}
}
