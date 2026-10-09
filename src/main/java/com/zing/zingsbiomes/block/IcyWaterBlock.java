package net.mcreator.zingsbiomes.block;

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

import net.mcreator.zingsbiomes.procedures.IcyWaterMobplayerCollidesBlockProcedure;
import net.mcreator.zingsbiomes.init.ZingsBiomesModFluids;

public class IcyWaterBlock extends LiquidBlock {
	public IcyWaterBlock(BlockBehaviour.Properties properties) {
		super(ZingsBiomesModFluids.ICY_WATER.get(), properties.mapColor(MapColor.ICE).strength(100f).noCollision().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity, InsideBlockEffectApplier insideBlockEffectApplier, boolean isPrecise) {
		super.entityInside(blockstate, world, pos, entity, insideBlockEffectApplier, isPrecise);
		IcyWaterMobplayerCollidesBlockProcedure.execute(entity);
	}
}