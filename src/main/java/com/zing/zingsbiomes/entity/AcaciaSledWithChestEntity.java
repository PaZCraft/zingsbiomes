package com.zing.zingsbiomes.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import com.zing.zingsbiomes.init.ZingsBiomesModItems;

public class AcaciaSledWithChestEntity extends GroundSledWithChestEntity {
	public AcaciaSledWithChestEntity(EntityType<AcaciaSledWithChestEntity> type, Level level) {
		super(type, level, ZingsBiomesModItems.ACACIA_SLED_WITH_CHEST);
	}

	@Override
	protected String getSledName() {
		return "Acacia Sled with Chest";
	}
}