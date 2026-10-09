package com.zing.zingsbiomes.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import com.zing.zingsbiomes.init.ZingsBiomesModItems;

public class JungleSledWithChestEntity extends GroundSledWithChestEntity {
	public JungleSledWithChestEntity(EntityType<JungleSledWithChestEntity> type, Level level) {
		super(type, level, ZingsBiomesModItems.JUNGLE_SLED_WITH_CHEST);
	}

	@Override
	protected String getSledName() {
		return "Jungle Sled with Chest";
	}
}