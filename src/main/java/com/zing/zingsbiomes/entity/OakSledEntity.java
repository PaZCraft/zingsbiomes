package net.mcreator.zingsbiomes.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.mcreator.zingsbiomes.init.ZingsBiomesModItems;

public class OakSledEntity extends GroundSledEntity {
	public OakSledEntity(EntityType<OakSledEntity> type, Level level) {
		super(type, level, ZingsBiomesModItems.OAK_SLED);
	}
}