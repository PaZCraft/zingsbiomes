package net.mcreator.zingsbiomes.block;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

import net.minecraft.client.color.block.BlockTintSources;
import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemTags;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.StringProperty;
import net.minecraft.world.phys.BlockHitResult;

import net.mcreator.zingsbiomes.init.ZingsBiomesModBlocks;

public abstract class DyeableShroomlightBlock extends Block {
	public static final StringProperty COLOR = StringProperty.create("color", validColors());

	private static final Map<String, Integer> CUSTOM_COLORS = Map.of(
			"crimson", 0xDC143C,
			"violet", 0x8F00FF,
			"mint", 0x3EB489,
			"pale_orange", 0xFFDAB9,
			"pale_light_blue", 0xC6E2FF,
			"neon_yellow", 0xDFFF00,
			"neon_orange", 0xFF5F1F);

	protected DyeableShroomlightBlock(BlockBehaviour.Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any().setValue(COLOR, "none"));
	}

	private static List<String> validColors() {
		List<String> colors = new ArrayList<>();
		colors.add("none");
		for (DyeColor color : DyeColor.values())
			colors.add(color.getName());
		colors.addAll(CUSTOM_COLORS.keySet());
		return colors;
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(COLOR);
	}

	@Override
	protected InteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
		if (!stack.is(ItemTags.DYES))
			return InteractionResult.TRY_WITH_EMPTY_HAND;

		String color = getColorName(stack);
		if (color == null)
			return InteractionResult.TRY_WITH_EMPTY_HAND;
		if (level.isClientSide())
			return InteractionResult.SUCCESS;
		if (state.getValue(COLOR).equals(color))
			return InteractionResult.SUCCESS;

		level.setBlock(pos, state.setValue(COLOR, color), 3);
		level.playSound(null, pos, SoundEvents.DYE_USE, SoundSource.BLOCKS, 1.0F, 1.0F);
		if (!player.getAbilities().instabuild)
			stack.shrink(1);
		return InteractionResult.SUCCESS;
	}

	static String getColorName(ItemStack stack) {
		String itemPath = BuiltInRegistries.ITEM.getKey(stack.getItem()).getPath();
		if (CUSTOM_COLORS.containsKey(itemPath.replace("_dye", "")))
			return itemPath.substring(0, itemPath.length() - "_dye".length());

		DyeColor dyeColor = stack.get(DataComponents.DYE);
		return dyeColor == null ? null : dyeColor.getName();
	}

	static int getTintColor(BlockState state) {
		String color = state.getValue(COLOR);
		Integer customColor = CUSTOM_COLORS.get(color);
		if (customColor != null)
			return customColor;
		if ("none".equals(color))
			return 0xFFFFFF;
		DyeColor dyeColor = DyeColor.byName(color, null);
		return dyeColor == null ? 0xFFFFFF : dyeColor.getTextureDiffuseColor();
	}

	public static void blockColorLoad(RegisterColorHandlersEvent.BlockTintSources event) {
		event.getBlockColors().register(List.of(state -> getTintColor(state)), ZingsBiomesModBlocks.YOLKED_SHROOMLIGHT.get(), ZingsBiomesModBlocks.CRIMSON_SHROOMLIGHT.get(),
				ZingsBiomesModBlocks.WARPED_SHROOMLIGHT.get(), ZingsBiomesModBlocks.WITHER_SHROOMLIGHT.get());
	}
}
