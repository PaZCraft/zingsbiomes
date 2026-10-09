package net.mcreator.zingsbiomes.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.mcreator.zingsbiomes.init.ZingsBiomesModItems;

public class SpruceSledEntity extends GroundSledEntity {
	public SpruceSledEntity(EntityType<SpruceSledEntity> type, Level level) {
		super(type, level, ZingsBiomesModItems.SPRUCE_SLED);
	}
}