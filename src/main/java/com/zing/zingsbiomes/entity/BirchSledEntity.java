package net.mcreator.zingsbiomes.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.mcreator.zingsbiomes.init.ZingsBiomesModItems;

public class BirchSledEntity extends GroundSledEntity {
	public BirchSledEntity(EntityType<BirchSledEntity> type, Level level) {
		super(type, level, ZingsBiomesModItems.BIRCH_SLED);
	}
}