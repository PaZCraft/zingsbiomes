package net.mcreator.zingsbiomes.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;

public class PalmButtonBlock extends ButtonBlock {
	public PalmButtonBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.OAK, 30,
				properties.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.palm.break")),
						() -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.palm.step")), () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.palm.place")),
						() -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.palm.hit")), () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.palm.hit")))).strength(1f, 10f));
	}
}