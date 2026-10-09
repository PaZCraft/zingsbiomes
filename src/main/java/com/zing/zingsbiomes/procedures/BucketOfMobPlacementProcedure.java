package net.mcreator.zingsbiomes.procedures;

import net.neoforged.neoforge.transfer.transaction.Transaction;
import net.neoforged.neoforge.transfer.item.ItemResource;
import net.neoforged.neoforge.transfer.access.ItemAccess;
import net.neoforged.neoforge.transfer.ResourceHandler;
import net.neoforged.neoforge.event.entity.living.LivingEntityUseItemEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.zingsbiomes.init.ZingsBiomesModItems;
import net.mcreator.zingsbiomes.init.ZingsBiomesModEntities;

import javax.annotation.Nullable;

@EventBusSubscriber
public class BucketOfMobPlacementProcedure {
	@SubscribeEvent
	public static void onUseItemStart(LivingEntityUseItemEvent.Start event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getItem());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		execute(null, world, x, y, z, entity, itemstack);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entUseItem0 ? _entUseItem0.getUseItem() : ItemStack.EMPTY).getItem() == ZingsBiomesModItems.BUCKET_OF_PIRANHA.get()) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.WATER.defaultBlockState(), 3);
			ItemStack _itemStack4 = itemstack;
			if (_itemStack4.getCapability(Capabilities.Item.ITEM, ItemAccess.forStack(_itemStack4)) instanceof ResourceHandler<ItemResource> _resourceHandler) {
				setStackInSlot(_resourceHandler, 0, ItemResource.of(new ItemStack(Items.BUCKET)), 1);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.bucket.empty_fish")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.bucket.empty_fish")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = ZingsBiomesModEntities.PIRANHA.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
		if ((entity instanceof LivingEntity _entUseItem7 ? _entUseItem7.getUseItem() : ItemStack.EMPTY).getItem() == ZingsBiomesModItems.BUCKET_OF_SUNFISH.get()) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.WATER.defaultBlockState(), 3);
			ItemStack _itemStack11 = itemstack;
			if (_itemStack11.getCapability(Capabilities.Item.ITEM, ItemAccess.forStack(_itemStack11)) instanceof ResourceHandler<ItemResource> _resourceHandler) {
				setStackInSlot(_resourceHandler, 0, ItemResource.of(new ItemStack(Items.BUCKET)), 1);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.bucket.empty_fish")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.bucket.empty_fish")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = ZingsBiomesModEntities.SUNFISH.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
		if ((entity instanceof LivingEntity _entUseItem14 ? _entUseItem14.getUseItem() : ItemStack.EMPTY).getItem() == ZingsBiomesModItems.BUCKET_OF_LIGHTFISH.get()) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.WATER.defaultBlockState(), 3);
			ItemStack _itemStack18 = itemstack;
			if (_itemStack18.getCapability(Capabilities.Item.ITEM, ItemAccess.forStack(_itemStack18)) instanceof ResourceHandler<ItemResource> _resourceHandler) {
				setStackInSlot(_resourceHandler, 0, ItemResource.of(new ItemStack(Items.BUCKET)), 1);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.bucket.empty_fish")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.bucket.empty_fish")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = ZingsBiomesModEntities.LIGHTFISH.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
		if ((entity instanceof LivingEntity _entUseItem21 ? _entUseItem21.getUseItem() : ItemStack.EMPTY).getItem() == ZingsBiomesModItems.BUCKET_OF_JAWFISH.get()) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.WATER.defaultBlockState(), 3);
			ItemStack _itemStack25 = itemstack;
			if (_itemStack25.getCapability(Capabilities.Item.ITEM, ItemAccess.forStack(_itemStack25)) instanceof ResourceHandler<ItemResource> _resourceHandler) {
				setStackInSlot(_resourceHandler, 0, ItemResource.of(new ItemStack(Items.BUCKET)), 1);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.bucket.empty_fish")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.bucket.empty_fish")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = ZingsBiomesModEntities.JAWFISH.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
		if ((entity instanceof LivingEntity _entUseItem28 ? _entUseItem28.getUseItem() : ItemStack.EMPTY).getItem() == ZingsBiomesModItems.BUCKET_OF_JELLYFISH.get()) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.WATER.defaultBlockState(), 3);
			ItemStack _itemStack32 = itemstack;
			if (_itemStack32.getCapability(Capabilities.Item.ITEM, ItemAccess.forStack(_itemStack32)) instanceof ResourceHandler<ItemResource> _resourceHandler) {
				setStackInSlot(_resourceHandler, 0, ItemResource.of(new ItemStack(Items.BUCKET)), 1);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.bucket.empty_fish")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.bucket.empty_fish")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = ZingsBiomesModEntities.JELLYFISH.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
		if ((entity instanceof LivingEntity _entUseItem35 ? _entUseItem35.getUseItem() : ItemStack.EMPTY).getItem() == ZingsBiomesModItems.BUCKET_OF_SEA_URCHIN.get()) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.WATER.defaultBlockState(), 3);
			ItemStack _itemStack39 = itemstack;
			if (_itemStack39.getCapability(Capabilities.Item.ITEM, ItemAccess.forStack(_itemStack39)) instanceof ResourceHandler<ItemResource> _resourceHandler) {
				setStackInSlot(_resourceHandler, 0, ItemResource.of(new ItemStack(Items.BUCKET)), 1);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.bucket.empty_fish")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.bucket.empty_fish")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = ZingsBiomesModEntities.SEA_URCHIN.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
		if ((entity instanceof LivingEntity _entUseItem42 ? _entUseItem42.getUseItem() : ItemStack.EMPTY).getItem() == ZingsBiomesModItems.BUCKET_OF_SHRIMP.get()) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.WATER.defaultBlockState(), 3);
			ItemStack _itemStack46 = itemstack;
			if (_itemStack46.getCapability(Capabilities.Item.ITEM, ItemAccess.forStack(_itemStack46)) instanceof ResourceHandler<ItemResource> _resourceHandler) {
				setStackInSlot(_resourceHandler, 0, ItemResource.of(new ItemStack(Items.BUCKET)), 1);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.bucket.empty_fish")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.bucket.empty_fish")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = ZingsBiomesModEntities.SHRIMP.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
		if ((entity instanceof LivingEntity _entUseItem49 ? _entUseItem49.getUseItem() : ItemStack.EMPTY).getItem() == ZingsBiomesModItems.BUCKET_OF_TUNA.get()) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.WATER.defaultBlockState(), 3);
			ItemStack _itemStack53 = itemstack;
			if (_itemStack53.getCapability(Capabilities.Item.ITEM, ItemAccess.forStack(_itemStack53)) instanceof ResourceHandler<ItemResource> _resourceHandler) {
				setStackInSlot(_resourceHandler, 0, ItemResource.of(new ItemStack(Items.BUCKET)), 1);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.bucket.empty_fish")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.bucket.empty_fish")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = ZingsBiomesModEntities.TUNA.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
		if ((entity instanceof LivingEntity _entUseItem56 ? _entUseItem56.getUseItem() : ItemStack.EMPTY).getItem() == ZingsBiomesModItems.BUCKET_OF_SARDINE.get()) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.WATER.defaultBlockState(), 3);
			ItemStack _itemStack60 = itemstack;
			if (_itemStack60.getCapability(Capabilities.Item.ITEM, ItemAccess.forStack(_itemStack60)) instanceof ResourceHandler<ItemResource> _resourceHandler) {
				setStackInSlot(_resourceHandler, 0, ItemResource.of(new ItemStack(Items.BUCKET)), 1);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.bucket.empty_fish")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.bucket.empty_fish")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = ZingsBiomesModEntities.SARDINE.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
		if ((entity instanceof LivingEntity _entUseItem63 ? _entUseItem63.getUseItem() : ItemStack.EMPTY).getItem() == ZingsBiomesModItems.BUCKET_OF_SEAHORSE.get()) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.WATER.defaultBlockState(), 3);
			ItemStack _itemStack67 = itemstack;
			if (_itemStack67.getCapability(Capabilities.Item.ITEM, ItemAccess.forStack(_itemStack67)) instanceof ResourceHandler<ItemResource> _resourceHandler) {
				setStackInSlot(_resourceHandler, 0, ItemResource.of(new ItemStack(Items.BUCKET)), 1);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.bucket.empty_fish")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.bucket.empty_fish")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = ZingsBiomesModEntities.SEAHORSE.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
		if ((entity instanceof LivingEntity _entUseItem70 ? _entUseItem70.getUseItem() : ItemStack.EMPTY).getItem() == ZingsBiomesModItems.BUCKET_OF_TROUT.get()) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.WATER.defaultBlockState(), 3);
			ItemStack _itemStack74 = itemstack;
			if (_itemStack74.getCapability(Capabilities.Item.ITEM, ItemAccess.forStack(_itemStack74)) instanceof ResourceHandler<ItemResource> _resourceHandler) {
				setStackInSlot(_resourceHandler, 0, ItemResource.of(new ItemStack(Items.BUCKET)), 1);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.bucket.empty_fish")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.bucket.empty_fish")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = ZingsBiomesModEntities.TROUT.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
		if ((entity instanceof LivingEntity _entUseItem77 ? _entUseItem77.getUseItem() : ItemStack.EMPTY).getItem() == ZingsBiomesModItems.BUCKET_OF_KOI.get()) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.WATER.defaultBlockState(), 3);
			ItemStack _itemStack81 = itemstack;
			if (_itemStack81.getCapability(Capabilities.Item.ITEM, ItemAccess.forStack(_itemStack81)) instanceof ResourceHandler<ItemResource> _resourceHandler) {
				setStackInSlot(_resourceHandler, 0, ItemResource.of(new ItemStack(Items.BUCKET)), 1);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.bucket.empty_fish")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.bucket.empty_fish")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = ZingsBiomesModEntities.KOI.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
		if ((entity instanceof LivingEntity _entUseItem84 ? _entUseItem84.getUseItem() : ItemStack.EMPTY).getItem() == ZingsBiomesModItems.BUCKET_OF_SEABUNNY.get()) {
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.WATER.defaultBlockState(), 3);
			ItemStack _itemStack88 = itemstack;
			if (_itemStack88.getCapability(Capabilities.Item.ITEM, ItemAccess.forStack(_itemStack88)) instanceof ResourceHandler<ItemResource> _resourceHandler) {
				setStackInSlot(_resourceHandler, 0, ItemResource.of(new ItemStack(Items.BUCKET)), 1);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.bucket.empty_fish")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("item.bucket.empty_fish")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = ZingsBiomesModEntities.SEABUNNY.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
	}

	private static void setStackInSlot(ResourceHandler<ItemResource> handler, int index, ItemResource resource, int amount) {
		try (var tx = Transaction.openRoot()) {
			if (!handler.getResource(index).isEmpty())
				handler.extract(index, handler.getResource(index), handler.getAmountAsInt(index), tx);
			if (!resource.isEmpty() && amount > 0)
				handler.insert(index, resource, amount, tx);
			tx.commit();
		}
	}
}