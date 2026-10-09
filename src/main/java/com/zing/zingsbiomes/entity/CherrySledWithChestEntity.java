package com.zing.zingsbiomes.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import com.zing.zingsbiomes.init.ZingsBiomesModItems;

public class CherrySledWithChestEntity extends GroundSledWithChestEntity {
	public CherrySledWithChestEntity(EntityType<CherrySledWithChestEntity> type, Level level) {
		super(type, level, ZingsBiomesModItems.CHERRY_SLED_WITH_CHEST);
	}

	@Override
	protected String getSledName() {
		return "Cherry Sled with Chest";
	}
}