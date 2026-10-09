package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.zingsbiomes.init.ZingsBiomesModWoodTypes;

public class HoarfrostSignBlock extends StandingSignBlock {
	public HoarfrostSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.HOARFROST_SIGN_WOOD_TYPE, properties.sound(SoundType.WOOD).strength(1f, 10f).forceSolidOn());
	}
}