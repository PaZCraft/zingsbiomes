package com.zing.zingsbiomes.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

public class HydrothermalVentTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.SAND) {
			world.addParticle(ParticleTypes.BUBBLE_COLUMN_UP, x, y, z, 0, (Mth.nextDouble(RandomSource.create(), 0.1, 1)), 0);
			world.addParticle(ParticleTypes.POOF, x, y, z, 0, (Mth.nextDouble(RandomSource.create(), 0.1, 1.5)), 0);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("block.bubble_column.upwards_ambient")), SoundSource.BLOCKS, 1, 0);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("block.bubble_column.upwards_ambient")), SoundSource.BLOCKS, 1, 0, false);
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ZingsBiomesModBlocks.SALTSTONE.get()) {
			world.addParticle(ParticleTypes.BUBBLE_COLUMN_UP, x, y, z, 0, (Mth.nextDouble(RandomSource.create(), 0.1, 1)), 0);
			world.addParticle(ParticleTypes.POOF, x, y, z, 0, (Mth.nextDouble(RandomSource.create(), 0.1, 1.5)), 0);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("ambient.underwater.loop")), SoundSource.BLOCKS, 1, 0);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("ambient.underwater.loop")), SoundSource.BLOCKS, 1, 0, false);
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.MAGMA_BLOCK) {
			world.addParticle(ParticleTypes.LAVA, x, y, z, 0, (Mth.nextDouble(RandomSource.create(), 0.1, 1)), 0);
			world.addParticle(ParticleTypes.SMOKE, x, y, z, 0, (Mth.nextDouble(RandomSource.create(), 0.1, 1.5)), 0);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("block.lava.ambient")), SoundSource.BLOCKS, 1, 0);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("block.lava.ambient")), SoundSource.BLOCKS, 1, 0, false);
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.POWDER_SNOW) {
			world.addParticle(ParticleTypes.SNOWFLAKE, x, y, z, 0, (Mth.nextDouble(RandomSource.create(), 0.1, 1)), 0);
			world.addParticle(ParticleTypes.POOF, x, y, z, 0, (Mth.nextDouble(RandomSource.create(), 0.1, 1.5)), 0);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("block.sand.idle")), SoundSource.BLOCKS, 1, 0);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("block.sand.idle")), SoundSource.BLOCKS, 1, 0, false);
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ZingsBiomesModBlocks.TEAR_SAND.get()) {
			world.addParticle(ParticleTypes.SPLASH, x, y, z, 0, (Mth.nextDouble(RandomSource.create(), 0.1, 1)), 0);
			world.addParticle(ParticleTypes.SNOWFLAKE, x, y, z, 0, (Mth.nextDouble(RandomSource.create(), 0.1, 1.5)), 0);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("weather.rain")), SoundSource.BLOCKS, 1, 0);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("weather.rain")), SoundSource.BLOCKS, 1, 0, false);
				}
			}
		}
	}
}