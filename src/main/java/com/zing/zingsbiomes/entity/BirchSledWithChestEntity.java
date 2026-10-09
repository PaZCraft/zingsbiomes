package net.mcreator.zingsbiomes.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.mcreator.zingsbiomes.init.ZingsBiomesModItems;

public class BirchSledWithChestEntity extends GroundSledWithChestEntity {
	public BirchSledWithChestEntity(EntityType<BirchSledWithChestEntity> type, Level level) {
		super(type, level, ZingsBiomesModItems.BIRCH_SLED_WITH_CHEST);
	}

	@Override
	protected String getSledName() {
		return "Birch Sled with Chest";
	}
}