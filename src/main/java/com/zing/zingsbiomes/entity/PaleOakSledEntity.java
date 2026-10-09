package net.mcreator.zingsbiomes.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.mcreator.zingsbiomes.init.ZingsBiomesModItems;

public class PaleOakSledEntity extends GroundSledEntity {
	public PaleOakSledEntity(EntityType<PaleOakSledEntity> type, Level level) {
		super(type, level, ZingsBiomesModItems.PALE_OAK_SLED);
	}
}