package com.zing.zingsbiomes.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import com.zing.zingsbiomes.ZingsBiomesMod;

public class SculkJawEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null) {
				_blockEntity.getPersistentData().putBoolean("is_snapped", true);
			}
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		world.gameEvent(null, GameEvent.BLOCK_CHANGE, new Vec3(x, y, z));
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
		ZingsBiomesMod.queueServerWork(200, () -> {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.generic.eat")), SoundSource.BLOCKS, 1, 2);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.generic.eat")), SoundSource.BLOCKS, 1, 2, false);
				}
			}
			{
				Entity _ent = entity;
				if (_ent.level() instanceof ServerLevel _serverLevel) {
					_ent.hurtServer(_serverLevel, new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, Identifier.parse("zings_biomes:sculk_jaw_snap")))), 5);
				}
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putBoolean("is_snapped", false);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (entity instanceof net.minecraft.world.entity.Mob _mobBrainless) {
				net.minecraft.resources.Identifier _modifierId = net.minecraft.resources.Identifier.fromNamespaceAndPath("zings_biomes", "brainless_stay");
				if (false) {
					_mobBrainless.goalSelector.removeAllGoals(_g -> true);
					_mobBrainless.targetSelector.removeAllGoals(_g -> true);
					_mobBrainless.getLookControl().setLookAt(_mobBrainless.getX(), _mobBrainless.getEyeY(), _mobBrainless.getZ(), 0.0F, 0.0F);
					if (false) {
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
			if (entity instanceof net.minecraft.world.entity.Entity _ent) {
				net.minecraft.world.phys.Vec3 _backDir = _ent.getLookAngle().reverse();
				double _speed = 1;
				double _dist = 5;
				double _power = true ? (_speed * (_dist * 0.5d)) : _speed;
				net.minecraft.world.phys.Vec3 _motion = _backDir.scale(_power);
				_ent.setDeltaMovement(_motion);
				_ent.hurtMarked = true;
				if (_ent instanceof net.minecraft.server.level.ServerPlayer _player) {
					_player.connection.send(new net.minecraft.network.protocol.game.ClientboundSetEntityMotionPacket(_ent));
				}
			}
		});
	}
}