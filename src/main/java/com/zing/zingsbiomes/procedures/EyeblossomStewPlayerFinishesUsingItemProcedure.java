package com.zing.zingsbiomes.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import com.zing.zingsbiomes.init.ZingsBiomesModMobEffects;

public class EyeblossomStewPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(ZingsBiomesModMobEffects.PALE_GEL, 24000, 1));
	}
}