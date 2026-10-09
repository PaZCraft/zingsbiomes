package com.zing.zingsbiomes.init;

import net.neoforged.neoforge.transfer.item.WorldlyContainerWrapper;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import com.zing.zingsbiomes.block.entity.*;
import com.zing.zingsbiomes.ZiNGsBiomes;


@EventBusSubscriber
public class ZingsBiomesModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, ZiNGsBiomes.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<TinContainerBlockBlockEntity>> TIN_CONTAINER_BLOCK = register("tin_container_block", ZingsBiomesModBlocks.TIN_CONTAINER_BLOCK, TinContainerBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ChiseledTinContainerBlockEntity>> CHISELED_TIN_CONTAINER = register("chiseled_tin_container", ZingsBiomesModBlocks.CHISELED_TIN_CONTAINER,
			ChiseledTinContainerBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MintCarpetBlockEntity>> MINT_CARPET = register("mint_carpet", ZingsBiomesModBlocks.MINT_CARPET, MintCarpetBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MintBedFootBlockEntity>> MINT_BED_FOOT = register("mint_bed_foot", ZingsBiomesModBlocks.MINT_BED_FOOT, MintBedFootBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MintBedHeadBlockEntity>> MINT_BED_HEAD = register("mint_bed_head", ZingsBiomesModBlocks.MINT_BED_HEAD, MintBedHeadBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<SmallFireBlockEntity>> SMALL_FIRE = register("small_fire", ZingsBiomesModBlocks.SMALL_FIRE, SmallFireBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<SculkTNTBlockEntity>> SCULK_TNT = register("sculk_tnt", ZingsBiomesModBlocks.SCULK_TNT, SculkTNTBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AmazoniteLanternBlockEntity>> AMAZONITE_LANTERN = register("amazonite_lantern", ZingsBiomesModBlocks.AMAZONITE_LANTERN, AmazoniteLanternBlockEntity::new);

	private static <T extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> new BlockEntityType(supplier, block.get()));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.Item.BLOCK, TIN_CONTAINER_BLOCK.get(), WorldlyContainerWrapper::new);
		event.registerBlockEntity(Capabilities.Item.BLOCK, CHISELED_TIN_CONTAINER.get(), WorldlyContainerWrapper::new);
		event.registerBlockEntity(Capabilities.Item.BLOCK, MINT_CARPET.get(), WorldlyContainerWrapper::new);
		event.registerBlockEntity(Capabilities.Item.BLOCK, MINT_BED_FOOT.get(), WorldlyContainerWrapper::new);
		event.registerBlockEntity(Capabilities.Item.BLOCK, MINT_BED_HEAD.get(), WorldlyContainerWrapper::new);
		event.registerBlockEntity(Capabilities.Item.BLOCK, SMALL_FIRE.get(), WorldlyContainerWrapper::new);
		event.registerBlockEntity(Capabilities.Item.BLOCK, SCULK_TNT.get(), WorldlyContainerWrapper::new);
		event.registerBlockEntity(Capabilities.Item.BLOCK, AMAZONITE_LANTERN.get(), WorldlyContainerWrapper::new);
	}
}