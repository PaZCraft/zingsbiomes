package net.mcreator.zingsbiomes.block;

import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.client.color.block.BlockTintSources;

import net.mcreator.zingsbiomes.init.ZingsBiomesModBlocks;

import java.util.List;

public class IceCrystalTintedGlassBlock extends Block {
	public IceCrystalTintedGlassBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GLASS).strength(1f, 10f));
	}

	@Override
	public int getLightDampening(BlockState state) {
		return 10;
	}

	public static void blockColorLoad(RegisterColorHandlersEvent.BlockTintSources event) {
		event.getBlockColors().register(List.of(BlockTintSources.water()), ZingsBiomesModBlocks.ICE_CRYSTAL_TINTED_GLASS.get());
	}
}