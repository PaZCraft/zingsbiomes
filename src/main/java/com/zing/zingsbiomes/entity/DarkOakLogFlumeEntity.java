package com.zing.zingsbiomes.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.level.Level;
import com.zing.zingsbiomes.init.ZingsBiomesModItems;

public class DarkOakLogFlumeEntity extends Boat {
	public DarkOakLogFlumeEntity(EntityType<DarkOakLogFlumeEntity> type, Level world) {
		super(type, world, ZingsBiomesModItems.DARK_OAK_LOG_FLUME);
	}
}
