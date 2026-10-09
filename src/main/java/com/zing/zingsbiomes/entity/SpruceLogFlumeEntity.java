package com.zing.zingsbiomes.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.level.Level;
import com.zing.zingsbiomes.init.ZingsBiomesModItems;

public class SpruceLogFlumeEntity extends Boat {
	public SpruceLogFlumeEntity(EntityType<SpruceLogFlumeEntity> type, Level world) {
		super(type, world, ZingsBiomesModItems.SPRUCE_LOG_FLUME);
	}
}
