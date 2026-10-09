package net.mcreator.zingsbiomes.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;

public class ChorusStairsBlock extends StairBlock {
	public ChorusStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(),
				properties.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.chorus.break")),
						() -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.chorus.step")), () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.chorus.place")),
						() -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.chorus.hit")), () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("zings_biomes:block.chorus.hit")))).strength(1f, 10f));
	}

	@Override
	public float getExplosionResistance() {
		return 10f;
	}
}