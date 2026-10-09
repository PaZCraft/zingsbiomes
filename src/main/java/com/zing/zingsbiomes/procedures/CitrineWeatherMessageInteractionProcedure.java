package com.zing.zingsbiomes.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

public class CitrineWeatherMessageInteractionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (getBlockNBTLogic(world, BlockPos.containing(x, y, z), "is_activated") == true) {
			if ((getBlockNBTString(world, BlockPos.containing(x, y, z), "current_weather")).equals("clear")) {
				if (entity instanceof ServerPlayer _player)
					_player.sendSystemMessage(Component.literal("Current Weather: Clear"), true);
			}
			if ((getBlockNBTString(world, BlockPos.containing(x, y, z), "current_weather")).equals("rain")) {
				if (entity instanceof ServerPlayer _player)
					_player.sendSystemMessage(Component.literal("Current Weather: Rain"), true);
			}
			if ((getBlockNBTString(world, BlockPos.containing(x, y, z), "current_weather")).equals("thunder")) {
				if (entity instanceof ServerPlayer _player)
					_player.sendSystemMessage(Component.literal("Current Weather: Thunder"), true);
			}
		} else {
			if (entity instanceof ServerPlayer _player)
				_player.sendSystemMessage(Component.literal("Must be activated to detect current weather"), true);
		}
	}

	private static boolean getBlockNBTLogic(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getBooleanOr(tag, false);
		return false;
	}

	private static String getBlockNBTString(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getStringOr(tag, "");
		return "";
	}
}