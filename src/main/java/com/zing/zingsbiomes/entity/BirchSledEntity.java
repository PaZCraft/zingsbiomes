package com.zing.zingsbiomes.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import com.zing.zingsbiomes.init.ZingsBiomesModItems;

public class BirchSledEntity extends GroundSledEntity {
	public BirchSledEntity(EntityType<BirchSledEntity> type, Level level) {
		super(type, level, ZingsBiomesModItems.BIRCH_SLED);
	}
}