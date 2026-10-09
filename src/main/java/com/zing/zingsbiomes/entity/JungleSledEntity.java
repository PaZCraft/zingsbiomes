package net.mcreator.zingsbiomes.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.mcreator.zingsbiomes.init.ZingsBiomesModItems;

public class JungleSledEntity extends GroundSledEntity {
	public JungleSledEntity(EntityType<JungleSledEntity> type, Level level) {
		super(type, level, ZingsBiomesModItems.JUNGLE_SLED);
	}
}