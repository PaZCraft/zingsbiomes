package com.zing.zingsbiomes.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import com.zing.zingsbiomes.init.ZingsBiomesModEntities;

public class FlytrapSeaAnemoneEntityCollidesInTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		{
			BlockPos _pos = BlockPos.containing(x, y, z);
			BlockState _bs = world.getBlockState(_pos);
			if (_bs.getBlock().getStateDefinition().getProperty("is_snapped") instanceof BooleanProperty _booleanProp)
				world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
		}
		if ((getPropertyByName(blockstate, "is_snapped") instanceof BooleanProperty _getbp2 && blockstate.getValue(_getbp2)) == true) {
			if (entity instanceof net.minecraft.world.entity.Mob _mob) {
				_mob.setNoAi(true);
			}
			{
				Entity _ent = entity;
				if (_ent.level() instanceof ServerLevel _serverLevel) {
					_ent.hurtServer(_serverLevel, new DamageSource(world.holderOrThrow(DamageTypes.CRAMMING)), 1);
				}
			}
			ZingsBiomesModEntities.queueServerWork(20, (Runnable) () -> {
				if (entity instanceof net.minecraft.world.entity.Entity _ent) {
					double _blocks = 20;
					double _speed = 10;
					double _dx = 0;
					double _dz = 0;
					double _multiplier = _speed * (_blocks * 0.3d);
					double _dy = Math.min(_blocks * 0.15d, 1.5d);
					_ent.setDeltaMovement(new net.minecraft.world.phys.Vec3(_dx * _multiplier, _dy, _dz * _multiplier));
					
					if (_ent instanceof net.minecraft.server.level.ServerPlayer _player) {
						_player.connection.send(new net.minecraft.network.protocol.game.ClientboundSetEntityMotionPacket(_ent));
					}
				}
				if (entity instanceof net.minecraft.world.entity.Mob _mob) {
					_mob.setNoAi(false);
				}
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("is_snapped") instanceof BooleanProperty _booleanProp)
						world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
				}
			});
		}
	}

	private static Property<?> getPropertyByName(BlockState state, String name) {
		for (Property<?> property : state.getProperties()) {
			if (property.getName().equals(name)) {
				return property;
			}
		}
		return null;
	}
}