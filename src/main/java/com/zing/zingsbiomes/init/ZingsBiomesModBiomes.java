/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.zing.zingsbiomes.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Registry;

import java.util.function.Function;
import java.util.List;
import java.util.ArrayList;

import com.mojang.datafixers.util.Pair;

@EventBusSubscriber
public class ZingsBiomesModBiomes {
	public static final Identifier OVERWORLD_BIOMESOURCE_PRESET_ID = Identifier.withDefaultNamespace("overworld");
	public static final Identifier NETHER_BIOMESOURCE_PRESET_ID = Identifier.withDefaultNamespace("nether");
	private static boolean BOOTSTRAP_VALIDATION_PASSED = false;

	@SubscribeEvent
	public static void onCommonSetup(FMLCommonSetupEvent event) {
		BOOTSTRAP_VALIDATION_PASSED = true;
	}



	public static <T> Climate.ParameterList<T> adaptPresetParameterList(Identifier idArg, Climate.ParameterList<T> originalList, Function<ResourceKey<Biome>, T> lookup) {
		if (!BOOTSTRAP_VALIDATION_PASSED)
			return originalList;
		if (idArg.equals(OVERWORLD_BIOMESOURCE_PRESET_ID))
			return ZingsBiomesModBiomes.modifyOverworldParameterPoints(originalList, lookup);
		if (idArg.equals(NETHER_BIOMESOURCE_PRESET_ID))
			return ZingsBiomesModBiomes.modifyNetherParameterPoints(originalList, lookup);
		return originalList;
	}


	public static <T> Climate.ParameterList<T> modifyOverworldParameterPoints(Climate.ParameterList<T> originalList, Function<ResourceKey<Biome>, T> lookup) {
		List<Pair<Climate.ParameterPoint, T>> parameters = new ArrayList<>(originalList.values());
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.6f, 1f), Climate.Parameter.span(-1f, -0.6f), Climate.Parameter.span(0.6f, 1f), Climate.Parameter.span(-1f, -0.7f), Climate.Parameter.point(0.0f),
				Climate.Parameter.span(0.3f, 0.8f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "dusty_peaks")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.6f, 1f), Climate.Parameter.span(-1f, -0.6f), Climate.Parameter.span(0.6f, 1f), Climate.Parameter.span(-1f, -0.7f), Climate.Parameter.point(1.0f),
				Climate.Parameter.span(0.3f, 0.8f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "dusty_peaks")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.1f, 0.4f), Climate.Parameter.span(0.2f, 0.6f), Climate.Parameter.span(0.1f, 0.5f), Climate.Parameter.span(-0.2f, 0.2f), Climate.Parameter.point(0.0f),
				Climate.Parameter.span(0.3f, 0.7f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "mossbark_forest")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.1f, 0.4f), Climate.Parameter.span(0.2f, 0.6f), Climate.Parameter.span(0.1f, 0.5f), Climate.Parameter.span(-0.2f, 0.2f), Climate.Parameter.point(1.0f),
				Climate.Parameter.span(0.3f, 0.7f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "mossbark_forest")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.4f, 0f), Climate.Parameter.span(0.1f, 0.5f), Climate.Parameter.span(0.1f, 0.5f), Climate.Parameter.span(0.5f, 0.9f), Climate.Parameter.point(0.0f),
				Climate.Parameter.span(-0.4f, 0.1f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "grazed_taiga")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.4f, 0f), Climate.Parameter.span(0.1f, 0.5f), Climate.Parameter.span(0.1f, 0.5f), Climate.Parameter.span(0.5f, 0.9f), Climate.Parameter.point(1.0f),
				Climate.Parameter.span(-0.4f, 0.1f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "grazed_taiga")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.2f, 0.5f), Climate.Parameter.span(0.3f, 0.7f), Climate.Parameter.span(0.2f, 0.6f), Climate.Parameter.span(-0.3f, 0.1f), Climate.Parameter.point(0.0f),
				Climate.Parameter.span(0.4f, 0.8f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "ultraviolet_garden")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.2f, 0.5f), Climate.Parameter.span(0.3f, 0.7f), Climate.Parameter.span(0.2f, 0.6f), Climate.Parameter.span(-0.3f, 0.1f), Climate.Parameter.point(1.0f),
				Climate.Parameter.span(0.4f, 0.8f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "ultraviolet_garden")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.7f, 1f), Climate.Parameter.span(-1f, -0.6f), Climate.Parameter.span(-0.2f, 0f), Climate.Parameter.span(0.6f, 1f), Climate.Parameter.point(0.0f),
				Climate.Parameter.span(-0.2f, 0.2f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "red_beach")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.7f, 1f), Climate.Parameter.span(-1f, -0.6f), Climate.Parameter.span(-0.2f, 0f), Climate.Parameter.span(0.6f, 1f), Climate.Parameter.point(1.0f),
				Climate.Parameter.span(-0.2f, 0.2f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "red_beach")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.2f, 0.1f), Climate.Parameter.span(0.6f, 1f), Climate.Parameter.span(-0.1f, 0.3f), Climate.Parameter.span(0.55f, 0.95f), Climate.Parameter.point(0.0f),
				Climate.Parameter.span(-0.3f, 0.3f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "frozegrove_swamp")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.2f, 0.1f), Climate.Parameter.span(0.6f, 1f), Climate.Parameter.span(-0.1f, 0.3f), Climate.Parameter.span(0.55f, 0.95f), Climate.Parameter.point(1.0f),
				Climate.Parameter.span(-0.3f, 0.3f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "frozegrove_swamp")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.5f, 0.9f), Climate.Parameter.span(-0.4f, 0.1f), Climate.Parameter.span(0.3f, 0.7f), Climate.Parameter.span(0.1f, 0.5f), Climate.Parameter.point(0.0f),
				Climate.Parameter.span(0.4f, 0.8f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "old_growth_baobab_savanna")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.5f, 0.9f), Climate.Parameter.span(-0.4f, 0.1f), Climate.Parameter.span(0.3f, 0.7f), Climate.Parameter.span(0.1f, 0.5f), Climate.Parameter.point(1.0f),
				Climate.Parameter.span(0.4f, 0.8f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "old_growth_baobab_savanna")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.7f, 1f), Climate.Parameter.span(-0.2f, 0.3f), Climate.Parameter.span(-0.1f, 0.2f), Climate.Parameter.span(0.2f, 0.6f), Climate.Parameter.point(0.0f),
				Climate.Parameter.span(-0.8f, -0.4f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "desert_oasis")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.7f, 1f), Climate.Parameter.span(-0.2f, 0.3f), Climate.Parameter.span(-0.1f, 0.2f), Climate.Parameter.span(0.2f, 0.6f), Climate.Parameter.point(1.0f),
				Climate.Parameter.span(-0.8f, -0.4f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "desert_oasis")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-1f, -0.6f), Climate.Parameter.span(-1f, -0.7f), Climate.Parameter.span(0.4f, 0.8f), Climate.Parameter.span(0.4f, 0.8f), Climate.Parameter.point(0.0f),
				Climate.Parameter.span(-0.3f, 0.2f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "dusk_desert")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-1f, -0.6f), Climate.Parameter.span(-1f, -0.7f), Climate.Parameter.span(0.4f, 0.8f), Climate.Parameter.span(0.4f, 0.8f), Climate.Parameter.point(1.0f),
				Climate.Parameter.span(-0.3f, 0.2f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "dusk_desert")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.3f, 0.7f), Climate.Parameter.span(0f, 0.8f), Climate.Parameter.span(-1f, -0.5f), Climate.Parameter.span(0.3f, 0.8f), Climate.Parameter.point(0.0f),
				Climate.Parameter.span(-0.4f, 0.4f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "sweet_ocean")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.3f, 0.7f), Climate.Parameter.span(0f, 0.8f), Climate.Parameter.span(-1f, -0.5f), Climate.Parameter.span(0.3f, 0.8f), Climate.Parameter.point(1.0f),
				Climate.Parameter.span(-0.4f, 0.4f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "sweet_ocean")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0f, 0.4f), Climate.Parameter.span(0f, 0.8f), Climate.Parameter.span(-1f, -0.8f), Climate.Parameter.span(0.1f, 0.5f), Climate.Parameter.point(0.0f),
				Climate.Parameter.span(-0.5f, 0.5f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "starlight_ocean")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0f, 0.4f), Climate.Parameter.span(0f, 0.8f), Climate.Parameter.span(-1f, -0.8f), Climate.Parameter.span(0.1f, 0.5f), Climate.Parameter.point(1.0f),
				Climate.Parameter.span(-0.5f, 0.5f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "starlight_ocean")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.1f, 0.4f), Climate.Parameter.span(0.4f, 0.8f), Climate.Parameter.span(0.4f, 1.0002f), Climate.Parameter.span(-0.6f, -0.2f), Climate.Parameter.point(0.0f),
				Climate.Parameter.span(-0.2f, 0.2f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "shamrock_glade")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.1f, 0.4f), Climate.Parameter.span(0.4f, 0.8f), Climate.Parameter.span(0.4f, 1.0002f), Climate.Parameter.span(-0.6f, -0.2f), Climate.Parameter.point(1.0f),
				Climate.Parameter.span(-0.2f, 0.2f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "shamrock_glade")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.4554f, 0.5f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(0.3f, 1f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.point(0.0f),
				Climate.Parameter.span(-1f, 1f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "amaranth_ocean")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.4554f, 0.5f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(0.3f, 1f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.point(1.0f),
				Climate.Parameter.span(-1f, 1f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "amaranth_ocean")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.4554f, 0.5f), Climate.Parameter.span(-0.5f, 0.5024f), Climate.Parameter.span(0.2999f, 1.0001f), Climate.Parameter.span(-0.5f, 0.4999f),
				Climate.Parameter.point(0.0f), Climate.Parameter.span(-1f, 0.9999f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "deep_amaranth_ocean")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.4554f, 0.5f), Climate.Parameter.span(-0.5f, 0.5024f), Climate.Parameter.span(0.2999f, 1.0001f), Climate.Parameter.span(-0.5f, 0.4999f),
				Climate.Parameter.point(1.0f), Climate.Parameter.span(-1f, 0.9999f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "deep_amaranth_ocean")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.5f, 1f), Climate.Parameter.span(0f, 1f), Climate.Parameter.span(0.3f, 1f), Climate.Parameter.span(-0.5f, 0.5028f), Climate.Parameter.point(0.0f),
				Climate.Parameter.span(-1f, 1f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "blossom_valley")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.5f, 1f), Climate.Parameter.span(0f, 1f), Climate.Parameter.span(0.3f, 1f), Climate.Parameter.span(-0.5f, 0.5028f), Climate.Parameter.point(1.0f),
				Climate.Parameter.span(-1f, 1f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "blossom_valley")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.0989f, 0.4f), Climate.Parameter.span(0.3993f, 0.8003f), Climate.Parameter.span(0.3997f, 1.0007f), Climate.Parameter.span(-0.6013f, -0.2f),
				Climate.Parameter.point(0.0f), Climate.Parameter.span(-0.2007f, 0.2003f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "sunshine_woods")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.0989f, 0.4f), Climate.Parameter.span(0.3993f, 0.8003f), Climate.Parameter.span(0.3997f, 1.0007f), Climate.Parameter.span(-0.6013f, -0.2f),
				Climate.Parameter.point(1.0f), Climate.Parameter.span(-0.2007f, 0.2003f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "sunshine_woods")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.1039f, 0.4046f), Climate.Parameter.span(0.3993f, 0.8025f), Climate.Parameter.span(0.3997f, 1.001f), Climate.Parameter.span(-0.6013f, -0.2f),
				Climate.Parameter.point(0.0f), Climate.Parameter.span(-0.2007f, 0.2003f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "hoarfrost_timber")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.1039f, 0.4046f), Climate.Parameter.span(0.3993f, 0.8025f), Climate.Parameter.span(0.3997f, 1.001f), Climate.Parameter.span(-0.6013f, -0.2f),
				Climate.Parameter.point(1.0f), Climate.Parameter.span(-0.2007f, 0.2003f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "hoarfrost_timber")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.5021f, 0.5012f), Climate.Parameter.span(-0.5006f, 0.496f), Climate.Parameter.span(0.3f, 0.9686f), Climate.Parameter.span(-0.5f, 0.4956f),
				Climate.Parameter.span(0.2f, 1f), Climate.Parameter.span(-1f, 1.0045f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "fungi_caves")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.505f, 0.5013f), Climate.Parameter.span(-0.498f, 0.5f), Climate.Parameter.span(0.3f, 1f), Climate.Parameter.span(-0.5f, 0.5007f),
				Climate.Parameter.span(0.1999f, 0.902f), Climate.Parameter.span(-1f, 0.9951f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "volcanic_caves")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.5027f, 0.4922f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(0.3f, 1f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(0.2f, 0.902f),
				Climate.Parameter.span(-1f, 1f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "icicle_caves")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.4986f, 0.5006f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(0.3f, 1.0011f), Climate.Parameter.span(-0.5f, 0.5005f),
				Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(-1f, 1.0005f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "flooded_caves")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(0.3f, 1f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(0.2f, 1f),
				Climate.Parameter.span(-1f, 1f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "redstone_mines")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.5f, 0.4983f), Climate.Parameter.span(-0.5f, 0.4961f), Climate.Parameter.span(0.3f, 1.0012f), Climate.Parameter.span(-0.4928f, 0.5f),
				Climate.Parameter.span(0.205f, 0.9f), Climate.Parameter.span(-1.0025f, 1f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "geode_clusters")))));
		return new Climate.ParameterList<>(parameters);
	}


	public static <T> Climate.ParameterList<T> modifyNetherParameterPoints(Climate.ParameterList<T> originalList, Function<ResourceKey<Biome>, T> lookup) {
		List<Pair<Climate.ParameterPoint, T>> parameters = new ArrayList<>(originalList.values());
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(1.2f, 1.8f), Climate.Parameter.span(-0.4f, 0.4f), Climate.Parameter.span(0.3f, 1.0006f), Climate.Parameter.span(-0.5001f, 0.5007f), Climate.Parameter.point(0.0f),
				Climate.Parameter.span(-0.6f, -0.1f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "yolked_forest")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(1.2f, 1.8f), Climate.Parameter.span(-0.4f, 0.4f), Climate.Parameter.span(0.3f, 1.0006f), Climate.Parameter.span(-0.5001f, 0.5007f), Climate.Parameter.point(1.0f),
				Climate.Parameter.span(-0.6f, -0.1f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "yolked_forest")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.5057f, 0.5f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(0.3f, 1f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.point(0.0f),
				Climate.Parameter.span(-1f, 1f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "fire_sand_valley")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.5057f, 0.5f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(0.3f, 1f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.point(1.0f),
				Climate.Parameter.span(-1f, 1f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "fire_sand_valley")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.4989f, 0.507f), Climate.Parameter.span(-0.8f, 0.5f), Climate.Parameter.span(-1.002f, 1f), Climate.Parameter.span(0.4f, 0.5f), Climate.Parameter.point(0.0f),
				Climate.Parameter.span(-1.0019f, 1f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "tear_sand_valley")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.4989f, 0.507f), Climate.Parameter.span(-0.8f, 0.5f), Climate.Parameter.span(-1.002f, 1f), Climate.Parameter.span(0.4f, 0.5f), Climate.Parameter.point(1.0f),
				Climate.Parameter.span(-1.0019f, 1f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "tear_sand_valley")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.4989f, 0.507f), Climate.Parameter.span(-0.8f, 0.5f), Climate.Parameter.span(-1.002f, 1f), Climate.Parameter.span(0.5001f, 0.5084f), Climate.Parameter.point(0.0f),
				Climate.Parameter.span(-1.0019f, 1f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "quartz_sand_valley")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.4989f, 0.507f), Climate.Parameter.span(-0.8f, 0.5f), Climate.Parameter.span(-1.002f, 1f), Climate.Parameter.span(0.5001f, 0.5084f), Climate.Parameter.point(1.0f),
				Climate.Parameter.span(-1.0019f, 1f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "quartz_sand_valley")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(1.1986f, 1.8085f), Climate.Parameter.span(-0.4007f, 0.4025f), Climate.Parameter.span(0.2992f, 1.0042f), Climate.Parameter.span(-0.5008f, 0.5032f),
				Climate.Parameter.point(0.0f), Climate.Parameter.span(-0.6008f, -0.0959f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "wither_forest")))));
		parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(1.1986f, 1.8085f), Climate.Parameter.span(-0.4007f, 0.4025f), Climate.Parameter.span(0.2992f, 1.0042f), Climate.Parameter.span(-0.5008f, 0.5032f),
				Climate.Parameter.point(1.0f), Climate.Parameter.span(-0.6008f, -0.0959f), 0), lookup.apply(ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("zings_biomes", "wither_forest")))));
		return new Climate.ParameterList<>(parameters);
	}



}