package com.zing.zingsbiomes.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
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

public class RaspberrySaplingBlock extends SaplingBlock {
	public static final TreeGrower TREE_GROWER = new TreeGrower("raspberry_sapling", 0.1f, Optional.of(getFeatureKey("zings_biomes:raspberry_tree")), Optional.of(getFeatureKey("zings_biomes:raspberry_tree")),
			Optional.of(getFeatureKey("zings_biomes:raspberry_tree")), Optional.of(getFeatureKey("zings_biomes:raspberry_tree")), Optional.of(getFeatureKey("zings_biomes:raspberry_tree")), Optional.of(getFeatureKey("zings_biomes:raspberry_tree")));

	public RaspberrySaplingBlock(BlockBehaviour.Properties properties) {
		super(TREE_GROWER, properties.mapColor(MapColor.PLANT).randomTicks().sound(SoundType.GRASS).instabreak().noCollision().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY));
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	private static ResourceKey<ConfiguredFeature<?, ?>> getFeatureKey(String feature) {
		return ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.parse(feature));
	}
}