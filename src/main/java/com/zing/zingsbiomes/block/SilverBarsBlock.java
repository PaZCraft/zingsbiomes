package net.mcreator.zingsbiomes.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;

public class SilverBarsBlock extends IronBarsBlock {
	public SilverBarsBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.silver.break")),
				() -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.silver.step")), () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.silver.place")),
				() -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.silver.hit")), () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.silver.land")))).strength(1f, 10f));
	}
}