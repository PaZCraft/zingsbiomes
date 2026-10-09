package com.zing.zingsbiomes.client.fluid;

import org.joml.Vector4f;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.client.event.RegisterFluidModelsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.Identifier;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.client.renderer.fog.environment.FogEnvironment;
import net.minecraft.client.renderer.fog.FogData;
import net.minecraft.client.renderer.block.FluidModel;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.Camera;

import com.zing.zingsbiomes.init.ZingsBiomesModFluids;
import com.zing.zingsbiomes.init.ZingsBiomesModFluidTypes;

import javax.annotation.Nullable;

@EventBusSubscriber(Dist.CLIENT)
public class IcyWaterFluidExtension {
	@SubscribeEvent
	public static void registerRegisterFluidModels(RegisterFluidModelsEvent event) {
		event.register(new FluidModel.Unbaked(new Material(Identifier.parse("zings_biomes:block/icy_water_still")), new Material(Identifier.parse("zings_biomes:block/icy_water_flowing")), null, null), ZingsBiomesModFluids.ICY_WATER,
				ZingsBiomesModFluids.FLOWING_ICY_WATER);
	}

	@SubscribeEvent
	public static void registerFluidTypeExtensions(RegisterClientExtensionsEvent event) {
		event.registerFluidType(new IClientFluidTypeExtensions() {
			@Override
			public void modifyFogColor(Camera camera, float partialTick, ClientLevel level, int renderDistance, float darkenWorldAmount, Vector4f fluidFogColor) {
				fluidFogColor.set(0.8f, 1f, 0.8f, fluidFogColor.w);
			}

			@Override
			public void modifyFogRender(Camera camera, @Nullable FogEnvironment environment, float renderDistance, float partialTick, FogData fogData) {
				float nearDistance = fogData.environmentalStart;
				float farDistance = fogData.environmentalEnd;
				Entity entity = camera.entity();
				Level world = entity.level();
				fogData.environmentalStart = 0f;
				fogData.environmentalEnd = Math.min(48f, renderDistance);
			}
		}, ZingsBiomesModFluidTypes.ICY_WATER_TYPE);
	}
}