package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.PressurePlateBlock;

public class EndRockPressurePlateBlock extends PressurePlateBlock {
	public EndRockPressurePlateBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.STONE, properties.mapColor(MapColor.TERRACOTTA_CYAN).strength(1f, 10f).requiresCorrectToolForDrops().noCollision().pushReaction(PushReaction.DESTROY).isRedstoneConductor((bs, br, bp) -> false).forceSolidOn());
	}
}