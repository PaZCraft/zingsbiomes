package net.mcreator.zingsbiomes.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.mcreator.zingsbiomes.init.ZingsBiomesModItems;

public class AcaciaSledEntity extends GroundSledEntity {
	public AcaciaSledEntity(EntityType<AcaciaSledEntity> type, Level level) {
		super(type, level, ZingsBiomesModItems.ACACIA_SLED);
	}
}