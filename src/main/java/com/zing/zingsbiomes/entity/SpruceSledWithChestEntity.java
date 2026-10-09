package com.zing.zingsbiomes.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import com.zing.zingsbiomes.init.ZingsBiomesModItems;

public class SpruceSledWithChestEntity extends GroundSledWithChestEntity {
	public SpruceSledWithChestEntity(EntityType<SpruceSledWithChestEntity> type, Level level) {
		super(type, level, ZingsBiomesModItems.SPRUCE_SLED_WITH_CHEST);
	}

	@Override
	protected String getSledName() {
		return "Spruce Sled with Chest";
	}
}