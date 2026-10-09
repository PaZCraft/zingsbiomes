package net.mcreator.zingsbiomes.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.entity.EntityType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModItems;

public class FirBoatEntity extends Boat {
	public FirBoatEntity(EntityType<FirBoatEntity> type, Level world) {
		super(type, world, ZingsBiomesModItems.FIR_BOAT);
	}
}