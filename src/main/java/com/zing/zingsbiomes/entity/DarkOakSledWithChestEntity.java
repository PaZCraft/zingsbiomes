package com.zing.zingsbiomes.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import com.zing.zingsbiomes.init.ZingsBiomesModItems;

public class DarkOakSledWithChestEntity extends GroundSledWithChestEntity {
	public DarkOakSledWithChestEntity(EntityType<DarkOakSledWithChestEntity> type, Level level) {
		super(type, level, ZingsBiomesModItems.DARK_OAK_SLED_WITH_CHEST);
	}

	@Override
	protected String getSledName() {
		return "Dar Oak Sled with Chest";
	}
}