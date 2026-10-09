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

import com.zing.zingsbiomes.procedures.SoulFireCollisionEntityProcedure;
import com.zing.zingsbiomes.init.ZingsBiomesModFluids;

public class SoulLavaBlock extends LiquidBlock {
	public SoulLavaBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModFluids.SOUL_LAVA.get(), properties.mapColor(MapColor.WARPED_WART_BLOCK).strength(100f).postProcess((bs, br, bp) -> bp).emissiveRendering(state -> true).lightLevel(state -> 5).noCollision().noLootTable().liquid()
				.pushReaction(PushReaction.POPPED).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity, InsideBlockEffectApplier insideBlockEffectApplier, boolean isPrecise) {
		super.entityInside(blockstate, world, pos, entity, insideBlockEffectApplier, isPrecise);
		SoulFireCollisionEntityProcedure.execute(entity);
	}
}