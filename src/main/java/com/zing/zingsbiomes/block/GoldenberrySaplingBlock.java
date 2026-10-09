package com.zing.zingsbiomes.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.levelgen.feature.Feature;

import net.minecraft.util.random.WeightedList;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.Optional;

public class GoldenberrySaplingBlock extends SaplingBlock {
	public static final TreeGrower TREE_GROWER = new TreeGrower("goldenberry_sapling", WeightedList.of(getFeatureKey("zings_biomes:goldenberry_tree")), WeightedList.of(getFeatureKey("zings_biomes:goldenberry_tree")), WeightedList.of(getFeatureKey("zings_biomes:goldenberry_tree")), getFeatureKey("zings_biomes:goldenberry_tree"));

	public GoldenberrySaplingBlock(BlockBehaviour.Properties properties) {
		super(TREE_GROWER, properties.mapColor(MapColor.PLANT).randomTicks().sound(SoundType.GRASS).instabreak().noCollision().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.POPPED));
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	private static ResourceKey<Feature> getFeatureKey(String feature) {
		return ResourceKey.create(Registries.FEATURE, Identifier.parse(feature));
	}
}