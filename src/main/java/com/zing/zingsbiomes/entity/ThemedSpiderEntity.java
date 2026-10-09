package com.zing.zingsbiomes.entity;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.spider.Spider;
import net.minecraft.world.level.Level;

public abstract class ThemedSpiderEntity extends Spider {
	protected ThemedSpiderEntity(EntityType<? extends ThemedSpiderEntity> type, Level level) {
		super(type, level);
	}

	@Override
	public boolean doHurtTarget(ServerLevel level, Entity target) {
		boolean hit = super.doHurtTarget(level, target);
		if (hit && target instanceof LivingEntity livingTarget)
			this.applySpecialAttack(level, livingTarget);
		return hit;
	}

	protected abstract void applySpecialAttack(ServerLevel level, LivingEntity target);
}
