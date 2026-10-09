package com.zing.zingsbiomes.entity;

import java.util.function.Predicate;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.animal.fish.Pufferfish;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.Level;

import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

public abstract class ThemedCreeperEntity extends Creeper {
	private boolean explosionEffectApplied;

	protected ThemedCreeperEntity(EntityType<? extends ThemedCreeperEntity> type, Level level) {
		super(type, level);
	}

	@Override
	public void tick() {
		boolean wasRemoved = this.isRemoved();
		super.tick();
		if (!wasRemoved && this.isRemoved() && this.getSwelling(1.0F) > 1.06F && !this.explosionEffectApplied && this.level() instanceof ServerLevel serverLevel) {
			this.explosionEffectApplied = true;
			this.applyExplosionEffect(serverLevel, BlockPos.containing(this.getX(), this.getY(), this.getZ()));
		}
	}

	protected abstract void applyExplosionEffect(ServerLevel level, BlockPos origin);

	protected static void spreadGroundBlock(ServerLevel level, BlockPos origin, BlockState replacement, Predicate<BlockState> canReplace) {
		for (int dx = -3; dx <= 3; dx++) {
			for (int dz = -3; dz <= 3; dz++) {
				if (dx * dx + dz * dz > 9 || level.getRandom().nextFloat() > 0.45F)
					continue;
				BlockPos groundPos = origin.offset(dx, 0, dz).below();
				BlockState ground = level.getBlockState(groundPos);
				if (canReplace.test(ground) && level.getBlockState(groundPos.above()).isAir())
					level.setBlock(groundPos, replacement, 3);
			}
		}
	}

	protected static void spreadOnGround(ServerLevel level, BlockPos origin, BlockState spreadBlock) {
		for (int dx = -3; dx <= 3; dx++) {
			for (int dz = -3; dz <= 3; dz++) {
				if (dx * dx + dz * dz > 9 || level.getRandom().nextFloat() > 0.45F)
					continue;
				BlockPos groundPos = origin.offset(dx, 0, dz).below();
				BlockPos spreadPos = groundPos.above();
				if (level.getBlockState(spreadPos).isAir() && level.getBlockState(groundPos).isFaceSturdy(level, groundPos, Direction.UP))
					level.setBlock(spreadPos, spreadBlock, 3);
			}
		}
	}

	protected static boolean isDirt(BlockState state) {
		return state.is(BlockTags.DIRT);
	}

	protected static boolean isSand(BlockState state) {
		return state.is(Blocks.SAND) || state.is(Blocks.RED_SAND);
	}

	protected static void spreadFire(ServerLevel level, BlockPos origin) {
		for (int dx = -3; dx <= 3; dx++) {
			for (int dz = -3; dz <= 3; dz++) {
				if (dx * dx + dz * dz > 9 || level.getRandom().nextFloat() > 0.4F)
					continue;
				BlockPos groundPos = origin.offset(dx, 0, dz).below();
				BlockPos firePos = groundPos.above();
				BlockState fire = Blocks.FIRE.defaultBlockState();
				if (level.getBlockState(firePos).isAir() && fire.canSurvive(level, firePos))
					level.setBlock(firePos, fire, 3);
			}
		}
	}

	protected static void spawnPufferfish(ServerLevel level, BlockPos origin) {
		for (int i = 0; i < 4; i++) {
			BlockPos pos = origin.offset(level.getRandom().nextIntBetweenInclusive(-2, 2), 0, level.getRandom().nextIntBetweenInclusive(-2, 2));
			Pufferfish fish = EntityTypes.PUFFERFISH.create(level, EntitySpawnReason.MOB_SUMMONED);
			if (fish != null) {
				fish.setPos(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5);
				fish.setYRot(level.getRandom().nextFloat() * 360.0F);
				fish.setXRot(0.0F);
				level.addFreshEntity(fish);
			}
		}
	}

	protected static void spreadQuicksand(ServerLevel level, BlockPos origin) {
		Block quicksand = ZingsBiomesModBlocks.QUICKSAND.get();
		spreadGroundBlock(level, origin, quicksand.defaultBlockState(), ThemedCreeperEntity::isSand);
	}
}
