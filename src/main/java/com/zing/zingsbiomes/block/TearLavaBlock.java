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

import com.zing.zingsbiomes.procedures.TearFireCollisionEntityProcedure;
import com.zing.zingsbiomes.init.ZingsBiomesModFluids;

public class TearLavaBlock extends LiquidBlock {
	public TearLavaBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModFluids.TEAR_LAVA.get(),
				properties.mapColor(MapColor.WATER).strength(100f).postProcess((bs, br, bp) -> bp).emissiveRendering((bs, br, bp) -> true).noCollision().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity, InsideBlockEffectApplier insideBlockEffectApplier, boolean isPrecise) {
		super.entityInside(blockstate, world, pos, entity, insideBlockEffectApplier, isPrecise);
		TearFireCollisionEntityProcedure.execute(world, entity);
	}
}