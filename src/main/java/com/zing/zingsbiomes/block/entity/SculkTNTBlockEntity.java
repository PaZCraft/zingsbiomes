package net.mcreator.zingsbiomes.block.entity;

import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.gameevent.vibrations.VibrationSystem;
import net.minecraft.world.level.gameevent.PositionSource;
import net.minecraft.world.level.gameevent.GameEventListener;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.gameevent.BlockPositionSource;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.ContainerHelper;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.network.chat.Component;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.NonNullList;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Holder;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.zingsbiomes.procedures.SculkTNTVibrationReceivedProcedure;
import net.mcreator.zingsbiomes.init.ZingsBiomesModBlockEntities;

import javax.annotation.Nullable;

import java.util.stream.IntStream;

public class SculkTNTBlockEntity extends RandomizableContainerBlockEntity implements WorldlyContainer, GameEventListener.Provider<VibrationSystem.Listener>, VibrationSystem {
	private NonNullList<ItemStack> stacks = NonNullList.withSize(9, ItemStack.EMPTY);
	private final VibrationSystem.Listener vibrationListener = new VibrationSystem.Listener(this);
	private final VibrationSystem.User vibrationUser = new VibrationUser(this.getBlockPos());
	private VibrationSystem.Data vibrationData = new VibrationSystem.Data();

	public SculkTNTBlockEntity(BlockPos position, BlockState state) {
		super(ZingsBiomesModBlockEntities.SCULK_TNT.get(), position, state);
	}

	@Override
	public void loadAdditional(ValueInput valueInput) {
		super.loadAdditional(valueInput);
		if (!this.tryLoadLootTable(valueInput))
			this.stacks = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
		ContainerHelper.loadAllItems(valueInput, this.stacks);
		this.vibrationData = valueInput.read("listener", VibrationSystem.Data.CODEC).orElseGet(VibrationSystem.Data::new);
	}

	@Override
	public void saveAdditional(ValueOutput valueOutput) {
		super.saveAdditional(valueOutput);
		if (!this.trySaveLootTable(valueOutput))
			ContainerHelper.saveAllItems(valueOutput, this.stacks);
		valueOutput.store("listener", VibrationSystem.Data.CODEC, this.vibrationData);
	}

	@Override
	public ClientboundBlockEntityDataPacket getUpdatePacket() {
		return ClientboundBlockEntityDataPacket.create(this);
	}

	@Override
	public CompoundTag getUpdateTag(HolderLookup.Provider lookupProvider) {
		return this.saveWithFullMetadata(lookupProvider);
	}

	@Override
	public int getContainerSize() {
		return stacks.size();
	}

	@Override
	public boolean isEmpty() {
		for (ItemStack itemstack : this.stacks)
			if (!itemstack.isEmpty())
				return false;
		return true;
	}

	@Override
	public Component getDefaultName() {
		return Component.literal("sculk_tnt");
	}

	@Override
	public AbstractContainerMenu createMenu(int id, Inventory inventory) {
		return ChestMenu.threeRows(id, inventory);
	}

	@Override
	public Component getDisplayName() {
		return Component.literal("Sculk TNT");
	}

	@Override
	protected NonNullList<ItemStack> getItems() {
		return this.stacks;
	}

	@Override
	protected void setItems(NonNullList<ItemStack> stacks) {
		this.stacks = stacks;
	}

	@Override
	public boolean canPlaceItem(int index, ItemStack stack) {
		return true;
	}

	@Override
	public int[] getSlotsForFace(Direction side) {
		return IntStream.range(0, this.getContainerSize()).toArray();
	}

	@Override
	public boolean canPlaceItemThroughFace(int index, ItemStack itemstack, @Nullable Direction direction) {
		return this.canPlaceItem(index, itemstack);
	}

	@Override
	public boolean canTakeItemThroughFace(int index, ItemStack itemstack, Direction direction) {
		return true;
	}

	@Override
	public VibrationSystem.Data getVibrationData() {
		return this.vibrationData;
	}

	@Override
	public VibrationSystem.User getVibrationUser() {
		return this.vibrationUser;
	}

	@Override
	public VibrationSystem.Listener getListener() {
		return this.vibrationListener;
	}

	private class VibrationUser implements VibrationSystem.User {
		private final int x;
		private final int y;
		private final int z;
		private final PositionSource positionSource;

		public VibrationUser(BlockPos blockPos) {
			this.x = blockPos.getX();
			this.y = blockPos.getY();
			this.z = blockPos.getZ();
			this.positionSource = new BlockPositionSource(blockPos);
		}

		@Override
		public PositionSource getPositionSource() {
			return this.positionSource;
		}

		@Override
		public TagKey<GameEvent> getListenableEvents() {
			return TagKey.create(Registries.GAME_EVENT, Identifier.withDefaultNamespace("sculk_tnt_can_listen"));
		}

		@Override
		public int getListenerRadius() {
			return 5;
		}

		@Override
		public boolean canReceiveVibration(ServerLevel world, BlockPos vibrationPos, Holder<GameEvent> holder, GameEvent.Context context) {
			return true;
		}

		@Override
		public void onReceiveVibration(ServerLevel world, BlockPos vibrationPos, Holder<GameEvent> holder, Entity entity, Entity sourceentity, float distance) {
			SculkTNTVibrationReceivedProcedure.execute(world, x, y, z);
		}

		@Override
		public void onDataChanged() {
			SculkTNTBlockEntity.this.setChanged();
		}

		@Override
		public boolean requiresAdjacentChunksToBeTicking() {
			return true;
		}
	}
}