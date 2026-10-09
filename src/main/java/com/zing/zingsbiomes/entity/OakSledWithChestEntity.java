package net.mcreator.zingsbiomes.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.mcreator.zingsbiomes.init.ZingsBiomesModItems;

public class OakSledWithChestEntity extends GroundSledWithChestEntity {
	public OakSledWithChestEntity(EntityType<OakSledWithChestEntity> type, Level level) {
		super(type, level, ZingsBiomesModItems.OAK_SLED_WITH_CHEST);
	}

	@Override
	protected String getSledName() {
		return "Oak Sled with Chest";
	}
}