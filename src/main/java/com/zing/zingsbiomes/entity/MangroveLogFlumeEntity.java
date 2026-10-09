package com.zing.zingsbiomes.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.level.Level;
import com.zing.zingsbiomes.init.ZingsBiomesModItems;

public class MangroveLogFlumeEntity extends Boat {
	public MangroveLogFlumeEntity(EntityType<MangroveLogFlumeEntity> type, Level world) {
		super(type, world, ZingsBiomesModItems.MANGROVE_LOG_FLUME);
	}
}
