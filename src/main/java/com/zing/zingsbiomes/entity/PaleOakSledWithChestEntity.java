package net.mcreator.zingsbiomes.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.mcreator.zingsbiomes.init.ZingsBiomesModItems;

public class PaleOakSledWithChestEntity extends GroundSledWithChestEntity {
	public PaleOakSledWithChestEntity(EntityType<PaleOakSledWithChestEntity> type, Level level) {
		super(type, level, ZingsBiomesModItems.PALE_OAK_SLED_WITH_CHEST);
	}

	@Override
	protected String getSledName() {
		return "Pal Oak Sled with Chest";
	}
}