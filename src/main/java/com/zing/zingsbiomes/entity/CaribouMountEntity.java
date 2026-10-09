package net.mcreator.zingsbiomes.entity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.world.ContainerHelper;

public abstract class CaribouMountEntity extends TamableAnimal {
	public static final EntityDataAccessor<Boolean> DATA_IS_SADDLED = SynchedEntityData.defineId(CaribouMountEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<Boolean> DATA_IS_ARMORED = SynchedEntityData.defineId(CaribouMountEntity.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<String> DATA_ARMOR_TYPE = SynchedEntityData.defineId(CaribouMountEntity.class, EntityDataSerializers.STRING);
	public static final EntityDataAccessor<Boolean> DATA_HAS_CHEST = SynchedEntityData.defineId(CaribouMountEntity.class, EntityDataSerializers.BOOLEAN);

	private final SimpleContainer chestInventory = new SimpleContainer(27) {
		@Override
		public boolean stillValid(Player player) {
			return CaribouMountEntity.this.hasCaribouChest() && CaribouMountEntity.this.isOwnedBy(player) && CaribouMountEntity.this.distanceToSqr(player) <= 64.0;
		}
	};

	protected CaribouMountEntity(EntityType<? extends TamableAnimal> type, Level level) {
		super(type, level);
	}

	@Override
	protected void defineSynchedData(SynchedEntityData.Builder builder) {
		super.defineSynchedData(builder);
		builder.define(DATA_IS_SADDLED, false);
		builder.define(DATA_IS_ARMORED, false);
		builder.define(DATA_ARMOR_TYPE, "none");
		builder.define(DATA_HAS_CHEST, false);
	}

	public boolean isCaribouSaddled() {
		return this.entityData.get(DATA_IS_SADDLED);
	}

	public boolean hasCaribouArmor() {
		return this.entityData.get(DATA_IS_ARMORED);
	}

	public String getCaribouArmorType() {
		return this.entityData.get(DATA_ARMOR_TYPE);
	}

	public boolean hasCaribouChest() {
		return this.entityData.get(DATA_HAS_CHEST);
	}

	protected InteractionResult interactWithCaribouGear(Player player, InteractionHand hand) {
		ItemStack heldStack = player.getItemInHand(hand);
		if (!this.isTame() || !this.isOwnedBy(player))
			return InteractionResult.PASS;

		Item heldItem = heldStack.getItem();
		if (heldItem == Items.SADDLE && !this.isCaribouSaddled()) {
			if (!this.level().isClientSide()) {
				this.entityData.set(DATA_IS_SADDLED, true);
				this.consumeEquipmentItem(player, heldStack);
				this.level().playSound(null, this.blockPosition(), SoundEvents.HORSE_SADDLE, SoundSource.NEUTRAL, 0.5F, 1.0F);
			}
			return InteractionResult.SUCCESS;
		}

		if (heldItem == Items.CHEST && !this.hasCaribouChest()) {
			if (!this.level().isClientSide()) {
				this.entityData.set(DATA_HAS_CHEST, true);
				this.consumeEquipmentItem(player, heldStack);
				this.level().playSound(null, this.blockPosition(), SoundEvents.ARMOR_EQUIP_LEATHER, SoundSource.NEUTRAL, 0.5F, 1.0F);
			}
			return InteractionResult.SUCCESS;
		}

		String itemPath = BuiltInRegistries.ITEM.getKey(heldItem).getPath();
		if (itemPath.endsWith("_caribou_armor") && !this.hasCaribouArmor()) {
			if (!this.level().isClientSide()) {
				this.entityData.set(DATA_ARMOR_TYPE, itemPath);
				this.entityData.set(DATA_IS_ARMORED, true);
				this.consumeEquipmentItem(player, heldStack);
				this.level().playSound(null, this.blockPosition(), SoundEvents.ARMOR_EQUIP_IRON, SoundSource.NEUTRAL, 0.5F, 1.0F);
			}
			return InteractionResult.SUCCESS;
		}

		if (heldStack.isEmpty() && player.isSecondaryUseActive() && this.hasCaribouChest()) {
			if (!this.level().isClientSide() && player instanceof ServerPlayer serverPlayer) {
				serverPlayer.openMenu(new MenuProvider() {
					@Override
					public net.minecraft.network.chat.Component getDisplayName() {
						return net.minecraft.network.chat.Component.translatable("container.zings_biomes.caribou");
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player menuPlayer) {
						return ChestMenu.threeRows(id, inventory, chestInventory);
					}
				});
			}
			return InteractionResult.SUCCESS;
		}

		return InteractionResult.PASS;
	}

	private void consumeEquipmentItem(Player player, ItemStack stack) {
		if (!player.getAbilities().instabuild)
			stack.shrink(1);
	}

	@Override
	public void addAdditionalSaveData(ValueOutput output) {
		super.addAdditionalSaveData(output);
		output.putBoolean("Datais_saddled", this.isCaribouSaddled());
		output.putBoolean("Datais_armored", this.hasCaribouArmor());
		output.putString("Dataarmor_type", this.getCaribouArmorType());
		output.putBoolean("Datahas_chest", this.hasCaribouChest());
		ContainerHelper.saveAllItems(output.child("CaribouInventory"), this.chestInventory.getItems());
	}

	@Override
	public void readAdditionalSaveData(ValueInput input) {
		super.readAdditionalSaveData(input);
		this.entityData.set(DATA_IS_SADDLED, input.getBooleanOr("Datais_saddled", false));
		this.entityData.set(DATA_IS_ARMORED, input.getBooleanOr("Datais_armored", false));
		this.entityData.set(DATA_ARMOR_TYPE, input.getStringOr("Dataarmor_type", "none"));
		this.entityData.set(DATA_HAS_CHEST, input.getBooleanOr("Datahas_chest", false));
		input.child("CaribouInventory").ifPresent(child -> ContainerHelper.loadAllItems(child, this.chestInventory.getItems()));
	}

	@Override
	protected void dropCustomDeathLoot(ServerLevel level, DamageSource source, boolean recentlyHit) {
		super.dropCustomDeathLoot(level, source, recentlyHit);
		for (ItemStack stack : this.chestInventory.getItems()) {
			if (!stack.isEmpty())
				this.spawnAtLocation(level, stack.copy());
		}
		this.chestInventory.clearContent();
		if (this.isCaribouSaddled())
			this.spawnAtLocation(level, new ItemStack(Items.SADDLE));
		if (this.hasCaribouChest())
			this.spawnAtLocation(level, new ItemStack(Items.CHEST));
		if (this.hasCaribouArmor()) {
			String armorType = this.getCaribouArmorType();
			if (armorType.matches("(tin|silver|iron|copper|golden|diamond|netherite|enderite)_caribou_armor")) {
				Item armor = BuiltInRegistries.ITEM.getValue(Identifier.fromNamespaceAndPath("zings_biomes", armorType));
				if (armor != Items.AIR)
					this.spawnAtLocation(level, new ItemStack(armor));
			}
		}
	}
}
