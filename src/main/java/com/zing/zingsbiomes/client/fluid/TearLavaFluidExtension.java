package com.zing.zingsbiomes.client.fluid;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.client.event.RegisterFluidModelsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.resources.Identifier;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.client.renderer.block.FluidModel;

import com.zing.zingsbiomes.init.ZingsBiomesModFluids;
import com.zing.zingsbiomes.init.ZingsBiomesModFluidTypes;

@EventBusSubscriber(Dist.CLIENT)
public class TearLavaFluidExtension {
	@SubscribeEvent
	public static void registerRegisterFluidModels(RegisterFluidModelsEvent event) {
		event.register(new FluidModel.Unbaked(new Material(Identifier.parse("zings_biomes:block/tear_lava")), new Material(Identifier.parse("zings_biomes:block/tear_lava_flowing")), null, null), ZingsBiomesModFluids.TEAR_LAVA,
				ZingsBiomesModFluids.FLOWING_TEAR_LAVA);
	}

	@SubscribeEvent
	public static void registerFluidTypeExtensions(RegisterClientExtensionsEvent event) {
		event.registerFluidType(new IClientFluidTypeExtensions() {
		}, ZingsBiomesModFluidTypes.TEAR_LAVA_TYPE);
	}
}