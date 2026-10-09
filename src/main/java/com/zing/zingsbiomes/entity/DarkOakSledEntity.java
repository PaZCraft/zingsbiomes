package com.zing.zingsbiomes.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import com.zing.zingsbiomes.init.ZingsBiomesModItems;

public class DarkOakSledEntity extends GroundSledEntity {
	public DarkOakSledEntity(EntityType<DarkOakSledEntity> type, Level level) {
		super(type, level, ZingsBiomesModItems.DARK_OAK_SLED);
	}
}