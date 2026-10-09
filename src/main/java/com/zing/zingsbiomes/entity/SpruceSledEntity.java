package com.zing.zingsbiomes.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import com.zing.zingsbiomes.init.ZingsBiomesModItems;

public class SpruceSledEntity extends GroundSledEntity {
	public SpruceSledEntity(EntityType<SpruceSledEntity> type, Level level) {
		super(type, level, ZingsBiomesModItems.SPRUCE_SLED);
	}
}