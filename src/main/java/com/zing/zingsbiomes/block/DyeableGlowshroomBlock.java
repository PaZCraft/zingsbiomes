package com.zing.zingsbiomes.block;

import java.util.List;

import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemTags;
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
	protected DyeableGlowshroomBlock(BlockBehaviour.Properties properties) {
		super(MobEffects.SPEED, 100, properties);
		this.registerDefaultState(this.stateDefinition.any().setValue(DyeableShroomlightBlock.COLOR, "none").setValue(BlockStateProperties.WATERLOGGED, false));
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

		String color = DyeableShroomlightBlock.getColorName(stack);
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

    public void performBonemeal(ServerLevel world, RandomSource random, BlockPos pos, BlockState blockstate) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'performBonemeal'");
    }
}
