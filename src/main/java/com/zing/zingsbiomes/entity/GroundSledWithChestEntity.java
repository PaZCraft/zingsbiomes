package net.mcreator.zingsbiomes.entity;

import io.netty.buffer.Unpooled;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.neoforged.neoforge.transfer.CombinedResourceHandler;
import net.neoforged.neoforge.transfer.item.ItemStacksResourceHandler;
import net.neoforged.neoforge.transfer.item.ItemUtil;
import net.mcreator.zingsbiomes.world.inventory.SledWithChestInventoryMenu;

public class GroundSledWithChestEntity extends GroundSledEntity {
	private final ItemStacksResourceHandler inventory = new ItemStacksResourceHandler(27);
	private final CombinedResourceHandler combined = new CombinedResourceHandler(inventory);

	public GroundSledWithChestEntity(EntityType<?> type, Level level, Item dropItem) {
		super(type, level, dropItem);
	}

	public CombinedResourceHandler getCombinedInventory() {
		return combined;
	}

	@Override
	protected void dropContents(ServerLevel level) {
		for (int slot = 0; slot < inventory.size(); slot++) {
			ItemStack stack = ItemUtil.getStack(inventory, slot);
			if (!stack.isEmpty())
				spawnAtLocation(level, stack);
		}
	}

	@Override
	protected void addAdditionalSaveData(ValueOutput output) {
		super.addAdditionalSaveData(output);
		inventory.serialize(output.child("InventoryCustom"));
	}

	@Override
	protected void readAdditionalSaveData(ValueInput input) {
		super.readAdditionalSaveData(input);
		input.child("InventoryCustom").ifPresent(inventory::deserialize);
	}

	@Override
	public InteractionResult interact(Player player, InteractionHand hand) {
		if (player.isSecondaryUseActive()) {
			if (!level().isClientSide() && player instanceof ServerPlayer serverPlayer) {
				serverPlayer.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal(getSledName());
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory playerInventory, Player menuPlayer) {
						FriendlyByteBuf buffer = new FriendlyByteBuf(Unpooled.buffer());
						buffer.writeBlockPos(BlockPos.containing(getX(), getY(), getZ()));
						buffer.writeByte(0);
						buffer.writeVarInt(getId());
						return new SledWithChestInventoryMenu(id, playerInventory, buffer);
					}
				}, buffer -> {
					buffer.writeBlockPos(BlockPos.containing(getX(), getY(), getZ()));
					buffer.writeByte(0);
					buffer.writeVarInt(getId());
				});
			}
			return InteractionResult.SUCCESS;
		}
		return super.interact(player, hand);
	}

	protected String getSledName() {
		return "Sled with Chest";
	}
}
