package com.zing.zingsbiomes.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import com.mojang.serialization.MapCodec;

public class ObsidianGravelBlock extends FallingBlock {
	public static final MapCodec<ObsidianGravelBlock> CODEC = simpleCodec(ObsidianGravelBlock::new);

	@Override
	public MapCodec<ObsidianGravelBlock> codec() {
		return CODEC;
	}

	@Override
	public int getDustColor(BlockState blockstate, BlockGetter world, BlockPos pos) {
		return blockstate.getMapColor(world, pos).col;
	}

	public ObsidianGravelBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.TERRACOTTA_BLUE).sound(SoundType.GRAVEL).strength(1.4f, 13.5f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.SNARE));
	}
}