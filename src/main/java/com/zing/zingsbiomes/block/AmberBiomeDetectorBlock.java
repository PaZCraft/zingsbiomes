package com.zing.zingsbiomes.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.biome.Biome;

public class AmberBiomeDetectorBlock extends Block {
	public AmberBiomeDetectorBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.COLOR_ORANGE).strength(1f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public InteractionResult useWithoutItem(BlockState blockstate, Level world, BlockPos pos, Player player, BlockHitResult hit) {
		if (!world.isClientSide() && player instanceof ServerPlayer serverPlayer) {
			Identifier biomeLocation = world.registryAccess().lookupOrThrow(Registries.BIOME).getKey(world.getBiome(pos).value());
			String biomeTranslationKey = "biome." + biomeLocation.getNamespace() + "." + biomeLocation.getPath().replace('/', '.');
			serverPlayer.sendSystemMessage(Component.translatable("message.zings_biomes.current_biome", Component.translatable(biomeTranslationKey)), true);
		}
		return InteractionResult.SUCCESS;
	}
}