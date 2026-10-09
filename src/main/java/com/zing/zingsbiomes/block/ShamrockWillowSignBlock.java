package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModWoodTypes;

public class ShamrockWillowSignBlock extends StandingSignBlock {
	public ShamrockWillowSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.SHAMROCK_WILLOW_SIGN_WOOD_TYPE, properties.sound(SoundType.WOOD).strength(1f, 10f).noCollision().isRedstoneConductor((bs, br, bp) -> false).forceSolidOn());
	}
}