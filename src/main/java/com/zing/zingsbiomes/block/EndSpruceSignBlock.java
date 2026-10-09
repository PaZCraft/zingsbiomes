package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModWoodTypes;

public class EndSpruceSignBlock extends StandingSignBlock {
	public EndSpruceSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.END_SPRUCE_SIGN_WOOD_TYPE, properties.sound(SoundType.WOOD).strength(1f, 10f).forceSolidOn());
	}
}