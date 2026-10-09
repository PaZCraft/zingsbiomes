package com.zing.zingsbiomes.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import com.zing.zingsbiomes.procedures.EndTarPitMobplayerCollidesBlockProcedure;
import com.zing.zingsbiomes.init.ZingsBiomesModFluids;

public class EndTarPitBlock extends LiquidBlock {
	public EndTarPitBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModFluids.END_TAR_PIT.get(), properties.mapColor(MapColor.TERRACOTTA_PURPLE).strength(100f).noCollision().noLootTable().liquid().pushReaction(PushReaction.POPPED).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity, InsideBlockEffectApplier insideBlockEffectApplier, boolean isPrecise) {
		super.entityInside(blockstate, world, pos, entity, insideBlockEffectApplier, isPrecise);
		EndTarPitMobplayerCollidesBlockProcedure.execute(world, entity);
	}
}