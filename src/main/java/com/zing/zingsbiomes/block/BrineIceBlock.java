package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.zingsbiomes.procedures.BrineIceEntityFallsOnTheBlockProcedure;

public class BrineIceBlock extends Block {
	public BrineIceBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GLASS).strength(0.5f).requiresCorrectToolForDrops().friction(1.05f).speedFactor(1.5f));
	}

	@Override
	public int getLightDampening(BlockState state) {
		return 5;
	}

	@Override
	public void fallOn(Level world, BlockState blockstate, BlockPos pos, Entity entity, double distance) {
		super.fallOn(world, blockstate, pos, entity, distance);
		BrineIceEntityFallsOnTheBlockProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}