package net.mcreator.zingsbiomes.client.fluid;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.client.event.RegisterFluidModelsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.resources.Identifier;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.client.renderer.block.FluidModel;

import net.mcreator.zingsbiomes.init.ZingsBiomesModFluids;
import net.mcreator.zingsbiomes.init.ZingsBiomesModFluidTypes;

@EventBusSubscriber(Dist.CLIENT)
public class SoulLavaFluidExtension {
	@SubscribeEvent
	public static void registerRegisterFluidModels(RegisterFluidModelsEvent event) {
		event.register(new FluidModel.Unbaked(new Material(Identifier.parse("zings_biomes:block/soul_lava")), new Material(Identifier.parse("zings_biomes:block/soul_lava_flowing")), null, null), ZingsBiomesModFluids.SOUL_LAVA,
				ZingsBiomesModFluids.FLOWING_SOUL_LAVA);
	}

	@SubscribeEvent
	public static void registerFluidTypeExtensions(RegisterClientExtensionsEvent event) {
		event.registerFluidType(new IClientFluidTypeExtensions() {
		}, ZingsBiomesModFluidTypes.SOUL_LAVA_TYPE);
	}
}