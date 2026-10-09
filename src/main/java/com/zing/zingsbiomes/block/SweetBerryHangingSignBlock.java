package net.mcreator.zingsbiomes.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.CeilingHangingSignBlock;

import net.mcreator.zingsbiomes.init.ZingsBiomesModWoodTypes;

public class SweetBerryHangingSignBlock extends CeilingHangingSignBlock {
	public SweetBerryHangingSignBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModWoodTypes.SWEET_BERRY_HANGING_SIGN_WOOD_TYPE, properties.sound(SoundType.CHERRY_WOOD_HANGING_SIGN).strength(1f, 10f).forceSolidOn());
	}
}