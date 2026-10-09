package com.zing.zingsbiomes.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.ButtonBlock;

public class EndRockButtonBlock extends ButtonBlock {
	public EndRockButtonBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.STONE, 20, properties.mapColor(MapColor.TERRACOTTA_CYAN).strength(1f, 10f).requiresCorrectToolForDrops().noCollision().pushReaction(PushReaction.POPPED).isRedstoneConductor((bs, br, bp) -> false));
	}
}