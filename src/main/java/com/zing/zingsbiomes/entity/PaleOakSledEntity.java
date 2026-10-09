package com.zing.zingsbiomes.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import com.zing.zingsbiomes.init.ZingsBiomesModItems;

public class PaleOakSledEntity extends GroundSledEntity {
	public PaleOakSledEntity(EntityType<PaleOakSledEntity> type, Level level) {
		super(type, level, ZingsBiomesModItems.PALE_OAK_SLED);
	}
}