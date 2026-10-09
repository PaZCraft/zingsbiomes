package net.mcreator.zingsbiomes.item;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SnowLayerBlock;
import net.minecraft.core.BlockPos;
import net.mcreator.zingsbiomes.entity.GroundSledEntity;

public class GroundSledItem extends Item {
	private final EntityType<? extends Entity> entityType;

	public GroundSledItem(EntityType<? extends Entity> entityType, Properties properties) {
		super(properties.stacksTo(1));
		this.entityType = entityType;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		Level level = context.getLevel();
		BlockPos supportPos = context.getClickedPos();
		if (!GroundSledEntity.isSledGround(level, supportPos))
			return InteractionResult.FAIL;
		if (!(level instanceof ServerLevel serverLevel))
			return InteractionResult.SUCCESS;

		Entity sled = entityType.create(serverLevel, EntitySpawnReason.SPAWN_ITEM_USE);
		if (sled == null)
			return InteractionResult.FAIL;
		double surfaceHeight = level.getBlockState(supportPos).is(Blocks.SNOW)
				? level.getBlockState(supportPos).getValue(SnowLayerBlock.LAYERS) / 8.0
				: 1.0;
		sled.moveTo(supportPos.getX() + 0.5, supportPos.getY() + surfaceHeight, supportPos.getZ() + 0.5, context.getRotation(), 0);
		if (!level.noCollision(sled))
			return InteractionResult.FAIL;
		if (!level.addFreshEntity(sled))
			return InteractionResult.FAIL;
		if (!context.getPlayer().getAbilities().instabuild)
			context.getItemInHand().shrink(1);
		return InteractionResult.SUCCESS;
	}
}
