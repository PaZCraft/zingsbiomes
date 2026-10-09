package net.mcreator.zingsbiomes.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.entity.EntityType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModItems;

public class RedDriftwoodBoatEntity extends Boat {
	public RedDriftwoodBoatEntity(EntityType<RedDriftwoodBoatEntity> type, Level world) {
		super(type, world, ZingsBiomesModItems.RED_DRIFTWOOD_BOAT);
	}
}