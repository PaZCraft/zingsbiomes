package com.zing.zingsbiomes.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import com.zing.zingsbiomes.init.ZingsBiomesModItems;

public class CherrySledEntity extends GroundSledEntity {
	public CherrySledEntity(EntityType<CherrySledEntity> type, Level level) {
		super(type, level, ZingsBiomesModItems.CHERRY_SLED);
	}
}