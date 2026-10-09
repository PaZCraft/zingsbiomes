package com.zing.zingsbiomes.potion;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

public class InstantenousMobEffect extends MobEffect {
	public InstantenousMobEffect() {
		super(MobEffectCategory.HARMFUL, 0xFFFFFF);
	}
}
