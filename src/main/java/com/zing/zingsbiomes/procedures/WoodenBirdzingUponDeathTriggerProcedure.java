package net.mcreator.zingsbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class WoodenBirdzingUponDeathTriggerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			BlockPos _bp = BlockPos.containing(x, y, z);
			if (BoneMealItem.applyBonemeal(new ItemStack(Items.BONE_MEAL), _level, _bp, null) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
				_level.levelEvent(2005, _bp, 0);
			}
		}
	}
}