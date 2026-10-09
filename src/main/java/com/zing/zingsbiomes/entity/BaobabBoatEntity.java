package net.mcreator.zingsbiomes.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.entity.EntityType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModItems;

public class BaobabBoatEntity extends Boat {
	public BaobabBoatEntity(EntityType<BaobabBoatEntity> type, Level world) {
		super(type, world, ZingsBiomesModItems.BAOBAB_BOAT);
	}
}