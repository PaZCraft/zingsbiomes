package com.zing.zingsbiomes.block;

import net.minecraft.world.level.redstone.Orientation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import com.zing.zingsbiomes.procedures.UltravioletRedstoneLampOnRedstoneOffProcedure;

import javax.annotation.Nullable;

public class UltravioletRedstoneLampOnBlock extends Block {
	public UltravioletRedstoneLampOnBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GLASS).strength(1f, 10f).lightLevel(blockstate -> 15).postProcess((bs, br, bp) -> bp).emissiveRendering(state -> true));
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, @Nullable Orientation orientation, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, orientation, moving);
		if (world.getBestNeighborSignal(pos) > 0) {
		} else {
			UltravioletRedstoneLampOnRedstoneOffProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		}
	}
}