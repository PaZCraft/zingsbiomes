package com.zing.zingsbiomes.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import com.zing.zingsbiomes.init.ZingsBiomesModItems;

public class MangroveSledWithChestEntity extends GroundSledWithChestEntity {
	public MangroveSledWithChestEntity(EntityType<MangroveSledWithChestEntity> type, Level level) {
		super(type, level, ZingsBiomesModItems.MANGROVE_SLED_WITH_CHEST);
	}

	@Override
	protected String getSledName() {
		return "Mangrove Sled with Chest";
	}
}