package com.zing.zingsbiomes.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.entity.EntityType;

import com.zing.zingsbiomes.init.ZingsBiomesModItems;

public class UltravioletOakBoatWithChestEntity extends ChestBoat {
	public UltravioletOakBoatWithChestEntity(EntityType<UltravioletOakBoatWithChestEntity> type, Level world) {
		super(type, world, ZingsBiomesModItems.ULTRAVIOLET_OAK_BOAT_WITH_CHEST);
	}
}