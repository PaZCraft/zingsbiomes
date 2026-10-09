package com.zing.zingsbiomes.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import com.zing.zingsbiomes.init.ZingsBiomesModItems;

public class MangroveSledEntity extends GroundSledEntity {
	public MangroveSledEntity(EntityType<MangroveSledEntity> type, Level level) {
		super(type, level, ZingsBiomesModItems.MANGROVE_SLED);
	}
}