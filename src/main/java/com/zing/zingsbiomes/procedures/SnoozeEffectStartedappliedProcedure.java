package com.zing.zingsbiomes.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;

public class SnoozeEffectStartedappliedProcedure {
	private static void queueServerWork(int ticks, Runnable task) {
		if (task == null) {
			return;
		}
		try {
			Class<?> modClass = Class.forName("com.zing.zingsbiomes.ZiNGsBiomes");
			java.lang.reflect.Method method = modClass.getMethod("queueServerWork", int.class, Runnable.class);
			method.invoke(null, ticks, task);
		} catch (ReflectiveOperationException _ignored) {
			// The mod entry point may not be available during compilation or in a test environment.
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity != null) {
			double _x = 0;
			double _y = y;
			double _z = 0;
			double _speed = 1;
			boolean _canFly = false;
			String _easing = "LINEAR";
			if (entity instanceof net.minecraft.world.entity.Mob _mob) {
				_mob.getPersistentData().putBoolean("abandonBlockTask", false);
				_mob.goalSelector.getAvailableGoals().removeIf(wrappedGoal -> wrappedGoal.getGoal() instanceof com.zing.zingsbiomes.ai.OverrideMovementGoal);
				_mob.goalSelector.addGoal(0, new com.zing.zingsbiomes.ai.OverrideMovementGoal(_mob, _x, _y, _z, _speed, _canFly, _easing));
			} else if (entity instanceof net.minecraft.world.entity.player.Player _player) {
				net.minecraft.world.phys.Vec3 _targetVec = new net.minecraft.world.phys.Vec3(_x, _y, _z);
				net.minecraft.world.phys.Vec3 _dir = _targetVec.subtract(_player.position()).normalize();
				_player.setDeltaMovement(_dir.scale(_speed * 0.3D));
			}
		}
		queueServerWork(3600, () -> {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.NAUSEA, 2400, 1));
			if (entity instanceof net.minecraft.world.entity.Mob _mob) {
				net.minecraft.world.level.block.state.BlockState _targetState = Blocks.RED_SAND.defaultBlockState();
				if (_targetState != null) {
					net.minecraft.world.level.block.Block _targetBlock = _targetState.getBlock();
					_mob.getPersistentData().putBoolean("abandonBlockTask", false);
					_mob.goalSelector.getAvailableGoals().removeIf(_wrapped -> _wrapped.getGoal() instanceof com.zing.zingsbiomes.ai.MoveToBlockGoal);
					_mob.goalSelector.addGoal(1, new com.zing.zingsbiomes.ai.MoveToBlockGoal(_mob, _targetBlock, "RESET_ON_HIT", true, 1.2D));
				}
			}
			queueServerWork(2400, () -> {
				{
					Entity _ent = entity;
					if (_ent.level() instanceof ServerLevel _serverLevel) {
						_ent.hurtServer(_serverLevel, new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 0);
					}
				}
				if (entity instanceof net.minecraft.world.entity.LivingEntity _livingFreeze) {
					net.minecraft.world.entity.ai.attributes.AttributeInstance _attr = _livingFreeze.getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED);
					if (_attr != null) {
						net.minecraft.resources.Identifier _modId = net.minecraft.resources.Identifier.fromNamespaceAndPath("zings_biomes", "freeze_movement");
						_attr.removeModifier(_modId);
						_attr.addTransientModifier(new net.minecraft.world.entity.ai.attributes.AttributeModifier(_modId, -1.0d, net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
					}
				}
				if (entity instanceof net.minecraft.world.entity.Mob _mobBrainless) {
					net.minecraft.resources.Identifier _modifierId = net.minecraft.resources.Identifier.fromNamespaceAndPath("zings_biomes", "brainless_stay");
					if (true) {
						_mobBrainless.goalSelector.removeAllGoals(_g -> true);
						_mobBrainless.targetSelector.removeAllGoals(_g -> true);
						_mobBrainless.getLookControl().setLookAt(_mobBrainless.getX(), _mobBrainless.getEyeY(), _mobBrainless.getZ(), 0.0F, 0.0F);
						if (true) {
							_mobBrainless.setDeltaMovement(0.0d, _mobBrainless.getDeltaMovement().y, 0.0d);
							_mobBrainless.setXxa(0.0F);
							_mobBrainless.setYya(0.0F);
							_mobBrainless.setZza(0.0F);
							_mobBrainless.setSpeed(0.0F);
							net.minecraft.world.entity.ai.attributes.AttributeInstance _kb = _mobBrainless.getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.KNOCKBACK_RESISTANCE);
							if (_kb != null) {
								_kb.removeModifier(_modifierId);
								_kb.addPermanentModifier(new net.minecraft.world.entity.ai.attributes.AttributeModifier(_modifierId, 1.0D, net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation.ADD_VALUE));
							}
							_mobBrainless.getPersistentData().putBoolean("BrainlessStayActive", true);
						}
					} else {
						_mobBrainless.goalSelector.removeAllGoals(_g -> true);
						_mobBrainless.targetSelector.removeAllGoals(_g -> true);
						net.minecraft.world.entity.ai.attributes.AttributeInstance _kb = _mobBrainless.getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.KNOCKBACK_RESISTANCE);
						if (_kb != null) {
							_kb.removeModifier(_modifierId);
						}
						_mobBrainless.getPersistentData().putBoolean("BrainlessStayActive", false);
						try {
							java.lang.reflect.Method _m = net.minecraft.world.entity.Mob.class.getDeclaredMethod("registerGoals");
							_m.setAccessible(true);
							_m.invoke(_mobBrainless);
						} catch (Exception _e) {
							// fail
						}
					}
				}
				if (entity instanceof net.minecraft.world.entity.Mob _mobLookTarget) {
					if (true) {
						double _tx = (double) x;
						double _ty = (double) (-175);
						double _tz = (double) z;
						_mobLookTarget.getLookControl().setLookAt(_tx, _ty, _tz, 30.0F, 30.0F);
						double _dx = _tx - _mobLookTarget.getX();
						double _dy = _ty - _mobLookTarget.getEyeY();
						double _dz = _tz - _mobLookTarget.getZ();
						double _dist = Math.sqrt(_dx * _dx + _dz * _dz);
						if (_dist >= 1.0E-7D) {
							float _yaw = (float) (Math.atan2(_dz, _dx) * (180.0D / Math.PI)) - 90.0F;
							float _pitch = (float) (-(Math.atan2(_dy, _dist) * (180.0D / Math.PI)));
							_mobLookTarget.setYRot(_yaw);
							_mobLookTarget.setXRot(_pitch);
							_mobLookTarget.yHeadRot = _yaw;
							_mobLookTarget.yBodyRot = _yaw;
						}
						_mobLookTarget.goalSelector.getAvailableGoals().stream()
								.filter(_g -> _g.getGoal() instanceof net.minecraft.world.entity.ai.goal.RandomLookAroundGoal || _g.getGoal() instanceof net.minecraft.world.entity.ai.goal.LookAtPlayerGoal)
								.forEach(_g -> _mobLookTarget.goalSelector.removeGoal(_g.getGoal()));
					} else {
						_mobLookTarget.goalSelector.addGoal(8, new net.minecraft.world.entity.ai.goal.LookAtPlayerGoal(_mobLookTarget, net.minecraft.world.entity.player.Player.class, 8.0F));
						_mobLookTarget.goalSelector.addGoal(8, new net.minecraft.world.entity.ai.goal.RandomLookAroundGoal(_mobLookTarget));
					}
				}
			});
		});
	}
}