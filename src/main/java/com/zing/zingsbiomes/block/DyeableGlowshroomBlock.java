package com.zing.zingsbiomes.block;

import net.minecraft.world.level.block.BonemealSource;

import java.util.List;

import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.phys.BlockHitResult;

import com.zing.zingsbiomes.init.ZingsBiomesModBlocks;

public abstract class DyeableGlowshroomBlock extends FlowerBlock implements BonemealableBlock, SimpleWaterloggedBlock {
	protected DyeableGlowshroomBlock(Holder<MobEffect> effect, int duration, BlockBehaviour.Properties properties) {
		super(effect, duration, properties);
		this.registerDefaultState(this.stateDefinition.any().setValue(DyeableShroomlightBlock.COLOR, DyeableShroomlightBlock.ShroomlightColor.NONE).setValue(BlockStateProperties.WATERLOGGED, false));
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<net.minecraft.world.level.block.Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(DyeableShroomlightBlock.COLOR);
	}

	@Override
	protected InteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
		if (!stack.is(ItemTags.DYES))
			return InteractionResult.TRY_WITH_EMPTY_HAND;

		String colorName = DyeableShroomlightBlock.getColorName(stack);
		if (colorName == null)
			return InteractionResult.TRY_WITH_EMPTY_HAND;
		DyeableShroomlightBlock.ShroomlightColor color = DyeableShroomlightBlock.ShroomlightColor.byName(colorName);
		if (color == null)
			return InteractionResult.TRY_WITH_EMPTY_HAND;
		if (level.isClientSide())
			return InteractionResult.SUCCESS;
		if (state.getValue(DyeableShroomlightBlock.COLOR).equals(color))
			return InteractionResult.SUCCESS;

		level.setBlock(pos, state.setValue(DyeableShroomlightBlock.COLOR, color), 3);
		level.playSound(null, pos, SoundEvents.DYE_USE, SoundSource.BLOCKS, 1.0F, 1.0F);
		if (!player.getAbilities().instabuild)
			stack.shrink(1);
		return InteractionResult.SUCCESS;
	}

	public static void blockColorLoad(RegisterColorHandlersEvent.BlockTintSources event) {
		event.getBlockColors().register(List.of(state -> DyeableShroomlightBlock.getTintColor(state)),
				ZingsBiomesModBlocks.RED_GLOWSHROOM.get(), ZingsBiomesModBlocks.ORANGE_GLOWSHROOM.get(), ZingsBiomesModBlocks.YELLOW_GLOWSHROOM.get(),
				ZingsBiomesModBlocks.LIME_GLOWSHROOM.get(), ZingsBiomesModBlocks.GREEN_GLOWSHROOM.get(), ZingsBiomesModBlocks.CYAN_GLOWSHROOM.get(),
				ZingsBiomesModBlocks.LIGHT_BLUE_GLOWSHROOM.get(), ZingsBiomesModBlocks.BLUE_GLOWSHROOM.get(), ZingsBiomesModBlocks.PURPLE_GLOWSHROOM.get(),
				ZingsBiomesModBlocks.MAGENTA_GLOWSHROOM.get(), ZingsBiomesModBlocks.PINK_GLOWSHROOM.get(), ZingsBiomesModBlocks.BROWN_GLOWSHROOM.get(),
				ZingsBiomesModBlocks.WHITE_GLOWSHROOM.get(), ZingsBiomesModBlocks.LIGHT_GRAY_GLOWSHROOM.get(), ZingsBiomesModBlocks.GRAY_GLOWSHROOM.get(),
				ZingsBiomesModBlocks.BLACK_GLOWSHROOM.get(), ZingsBiomesModBlocks.CRIMSON_GLOWSHROOM.get(), ZingsBiomesModBlocks.VIOLET_GLOWSHROOM.get(),
				ZingsBiomesModBlocks.MINT_GLOWSHROOM.get(), ZingsBiomesModBlocks.PALE_ORANGE_GLOWSHROOM.get(), ZingsBiomesModBlocks.PALE_LIGHT_BLUE_GLOWSHROOM.get(),
				ZingsBiomesModBlocks.NEON_ORANGE_GLOWSHROOM.get(), ZingsBiomesModBlocks.NEON_YELLOW_GLOWSHROOM.get());
	}

    public void performBonemeal(ServerLevel world, RandomSource random, BlockPos pos, BlockState blockstate, BonemealSource source) {
    }

    @Override
    public boolean isValidBonemealTarget(net.minecraft.world.level.LevelReader world, BlockPos pos, BlockState state, BonemealSource source) {
        return true;
    }

    @Override
    public boolean isBonemealSuccess(Level world, RandomSource random, BlockPos pos, BlockState state, BonemealSource source) {
        return true;
    }
}
