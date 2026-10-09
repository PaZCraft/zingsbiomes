package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModWoodTypes;

public class BlackberrySignBlock extends StandingSignBlock {
	public BlackberrySignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.BLACKBERRY_SIGN_WOOD_TYPE, properties.sound(SoundType.CHERRY_WOOD).strength(1f, 10f).forceSolidOn());
	}
}