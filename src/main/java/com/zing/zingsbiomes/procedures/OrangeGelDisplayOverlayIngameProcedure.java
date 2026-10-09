package com.zing.zingsbiomes.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import com.zing.zingsbiomes.init.ZingsBiomesModMobEffects;

public class OrangeGelDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(ZingsBiomesModMobEffects.PALE_GEL);
	}
}