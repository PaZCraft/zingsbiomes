package net.mcreator.zingsbiomes.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.entity.EntityType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModItems;

public class GrazedSpruceBoatEntity extends Boat {
	public GrazedSpruceBoatEntity(EntityType<GrazedSpruceBoatEntity> type, Level world) {
		super(type, world, ZingsBiomesModItems.GRAZED_SPRUCE_BOAT);
	}
}