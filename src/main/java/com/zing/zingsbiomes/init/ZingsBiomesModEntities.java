package com.zing.zingsbiomes.init;
import com.zing.zingsbiomes.ZiNGsBiomes;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import com.zing.zingsbiomes.ServerWorkQueue;
import com.zing.zingsbiomes.entity.*;


@EventBusSubscriber
public class ZingsBiomesModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, ZiNGsBiomes.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<ScorchedEntity>> SCORCHED = register("scorched",
			EntityType.Builder.<ScorchedEntity>of(ScorchedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.notInPeaceful().sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<TangledEntity>> TANGLED = register("tangled",
			EntityType.Builder.<TangledEntity>of(TangledEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<ThawedEntity>> THAWED = register("thawed",
			EntityType.Builder.<ThawedEntity>of(ThawedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<FloodCreeperEntity>> FLOOD_CREEPER = register("flood_creeper",
			EntityType.Builder.<FloodCreeperEntity>of(FloodCreeperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.7f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<NetherCreeperEntity>> NETHER_CREEPER = register("nether_creeper",
			EntityType.Builder.<NetherCreeperEntity>of(NetherCreeperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.notInPeaceful().sized(0.6f, 1.7f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<VineCreeperEntity>> VINE_CREEPER = register("vine_creeper",
			EntityType.Builder.<VineCreeperEntity>of(VineCreeperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.7f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<SnowCreeperEntity>> SNOW_CREEPER = register("snow_creeper",
			EntityType.Builder.<SnowCreeperEntity>of(SnowCreeperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.7f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<SandstoneCreeperEntity>> SANDSTONE_CREEPER = register("sandstone_creeper",
			EntityType.Builder.<SandstoneCreeperEntity>of(SandstoneCreeperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.7f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<DrenchedSpiderEntity>> DRENCHED_SPIDER = register("drenched_spider",
			EntityType.Builder.<DrenchedSpiderEntity>of(DrenchedSpiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(1.4f, 0.9f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<BurnedSpiderEntity>> BURNED_SPIDER = register("burned_spider",
			EntityType.Builder.<BurnedSpiderEntity>of(BurnedSpiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(1.4f, 0.9f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<PoisonedSpiderEntity>> POISONED_SPIDER = register("poisoned_spider",
			EntityType.Builder.<PoisonedSpiderEntity>of(PoisonedSpiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(1.4f, 0.9f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<IcySpiderEntity>> ICY_SPIDER = register("icy_spider",
			EntityType.Builder.<IcySpiderEntity>of(IcySpiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(1.4f, 0.9f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<SandySpiderEntity>> SANDY_SPIDER = register("sandy_spider",
			EntityType.Builder.<SandySpiderEntity>of(SandySpiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(1.4f, 0.9f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<SoulBurnedSpiderEntity>> SOUL_BURNED_SPIDER = register("soul_burned_spider",
			EntityType.Builder.<SoulBurnedSpiderEntity>of(SoulBurnedSpiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(1.4f, 0.9f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<OakWoodenBirdzingEntity>> WOODLAND_WOODEN_BIRDZING = register("woodland_wooden_birdzing",
			EntityType.Builder.<OakWoodenBirdzingEntity>of(OakWoodenBirdzingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.05f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<CrimsonWoodenBirdzingEntity>> NETHER_WOODEN_BIRDZING = register("nether_wooden_birdzing",
			EntityType.Builder.<CrimsonWoodenBirdzingEntity>of(CrimsonWoodenBirdzingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<CherryWoodenBirdzingEntity>> BERRY_WOODEN_BIRDZING = register("berry_wooden_birdzing",
			EntityType.Builder.<CherryWoodenBirdzingEntity>of(CherryWoodenBirdzingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<PaleWoodenBirdzingEntity>> WEEPING_WOODEN_BIRDZING = register("weeping_wooden_birdzing",
			EntityType.Builder.<PaleWoodenBirdzingEntity>of(PaleWoodenBirdzingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<BambooWoodenBirdzingEntity>> BAMBOO_WOODEN_BIRDZING = register("bamboo_wooden_birdzing",
			EntityType.Builder.<BambooWoodenBirdzingEntity>of(BambooWoodenBirdzingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<KapokBoatEntity>> KAPOK_BOAT = register("kapok_boat",
			EntityType.Builder.<KapokBoatEntity>of(KapokBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<RedDriftwoodBoatEntity>> RED_DRIFTWOOD_BOAT = register("red_driftwood_boat",
			EntityType.Builder.<RedDriftwoodBoatEntity>of(RedDriftwoodBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<DriftwoodBoatEntity>> DRIFTWOOD_BOAT = register("driftwood_boat",
			EntityType.Builder.<DriftwoodBoatEntity>of(DriftwoodBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<UltravioletOakBoatEntity>> ULTRAVIOLET_OAK_BOAT = register("ultraviolet_oak_boat",
			EntityType.Builder.<UltravioletOakBoatEntity>of(UltravioletOakBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<BlackwoodBoatEntity>> BLACKWOOD_BOAT = register("blackwood_boat",
			EntityType.Builder.<BlackwoodBoatEntity>of(BlackwoodBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<PalmBoatEntity>> PALM_BOAT = register("palm_boat",
			EntityType.Builder.<PalmBoatEntity>of(PalmBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<BaobabBoatEntity>> BAOBAB_BOAT = register("baobab_boat",
			EntityType.Builder.<BaobabBoatEntity>of(BaobabBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<FirBoatEntity>> FIR_BOAT = register("fir_boat",
			EntityType.Builder.<FirBoatEntity>of(FirBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<GrazedSpruceBoatEntity>> GRAZED_SPRUCE_BOAT = register("grazed_spruce_boat",
			EntityType.Builder.<GrazedSpruceBoatEntity>of(GrazedSpruceBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<FrozegroveBoatEntity>> FROZEGROVE_BOAT = register("frozegrove_boat",
			EntityType.Builder.<FrozegroveBoatEntity>of(FrozegroveBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<BlueberryBoatEntity>> BLUEBERRY_BOAT = register("blueberry_boat",
			EntityType.Builder.<BlueberryBoatEntity>of(BlueberryBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<MossbarkBoatEntity>> MOSSBARK_BOAT = register("mossbark_boat",
			EntityType.Builder.<MossbarkBoatEntity>of(MossbarkBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<KapokBoatWithChestEntity>> KAPOK_BOAT_WITH_CHEST = register("kapok_boat_with_chest",
			EntityType.Builder.<KapokBoatWithChestEntity>of(KapokBoatWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<RedDriftwoodBoatWithChestEntity>> RED_DRIFTWOOD_BOAT_WITH_CHEST = register("red_driftwood_boat_with_chest",
			EntityType.Builder.<RedDriftwoodBoatWithChestEntity>of(RedDriftwoodBoatWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<DriftwoodBoatWithChestEntity>> DRIFTWOOD_BOAT_WITH_CHEST = register("driftwood_boat_with_chest",
			EntityType.Builder.<DriftwoodBoatWithChestEntity>of(DriftwoodBoatWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<UltravioletOakBoatWithChestEntity>> ULTRAVIOLET_OAK_BOAT_WITH_CHEST = register("ultraviolet_oak_boat_with_chest",
			EntityType.Builder.<UltravioletOakBoatWithChestEntity>of(UltravioletOakBoatWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<BlackwoodBoatWithChestEntity>> BLACKWOOD_BOAT_WITH_CHEST = register("blackwood_boat_with_chest",
			EntityType.Builder.<BlackwoodBoatWithChestEntity>of(BlackwoodBoatWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<PalmBoatWithChestEntity>> PALM_BOAT_WITH_CHEST = register("palm_boat_with_chest",
			EntityType.Builder.<PalmBoatWithChestEntity>of(PalmBoatWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<BaobabBoatWithChestEntity>> BAOBAB_BOAT_WITH_CHEST = register("baobab_boat_with_chest",
			EntityType.Builder.<BaobabBoatWithChestEntity>of(BaobabBoatWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<FirBoatWithChestEntity>> FIR_BOAT_WITH_CHEST = register("fir_boat_with_chest",
			EntityType.Builder.<FirBoatWithChestEntity>of(FirBoatWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<GrazedSpruceBoatWithChestEntity>> GRAZED_SPRUCE_BOAT_WITH_CHEST = register("grazed_spruce_boat_with_chest",
			EntityType.Builder.<GrazedSpruceBoatWithChestEntity>of(GrazedSpruceBoatWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<FrozegroveBoatWithChestEntity>> FROZEGROVE_BOAT_WITH_CHEST = register("frozegrove_boat_with_chest",
			EntityType.Builder.<FrozegroveBoatWithChestEntity>of(FrozegroveBoatWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<BlueberryBoatWithChestEntity>> BLUEBERRY_BOAT_WITH_CHEST = register("blueberry_boat_with_chest",
			EntityType.Builder.<BlueberryBoatWithChestEntity>of(BlueberryBoatWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<MossbarkBoatWithChestEntity>> MOSSBARK_BOAT_WITH_CHEST = register("mossbark_boat_with_chest",
			EntityType.Builder.<MossbarkBoatWithChestEntity>of(MossbarkBoatWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<ShamrockWillowBoatEntity>> SHAMROCK_WILLOW_BOAT = register("shamrock_willow_boat",
			EntityType.Builder.<ShamrockWillowBoatEntity>of(ShamrockWillowBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<ShamrockWillowBoatWithChestEntity>> SHAMROCK_WILLOW_BOAT_WITH_CHEST = register("shamrock_willow_boat_with_chest",
			EntityType.Builder.<ShamrockWillowBoatWithChestEntity>of(ShamrockWillowBoatWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<InvertedShamrockCowEntity>> INVERTED_SHAMROCK_COW = register("inverted_shamrock_cow",
			EntityType.Builder.<InvertedShamrockCowEntity>of(InvertedShamrockCowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.9f, 1.4f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<ShamrockCowEntity>> SHAMROCK_COW = register("shamrock_cow",
			EntityType.Builder.<ShamrockCowEntity>of(ShamrockCowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.9f, 1.4f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<FennecFoxEntity>> FENNEC_FOX = register("fennec_fox",
			EntityType.Builder.<FennecFoxEntity>of(FennecFoxEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<PronghornEntity>> PRONGHORN = register("pronghorn",
			EntityType.Builder.<PronghornEntity>of(PronghornEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<MeerkatEntity>> MEERKAT = register("meerkat",
			EntityType.Builder.<MeerkatEntity>of(MeerkatEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<CoyoteEntity>> COYOTE = register("coyote",
			EntityType.Builder.<CoyoteEntity>of(CoyoteEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<PrarieDogEntity>> PRARIE_DOG = register("prarie_dog",
			EntityType.Builder.<PrarieDogEntity>of(PrarieDogEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<VultureEntity>> VULTURE = register("vulture",
			EntityType.Builder.<VultureEntity>of(VultureEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<HippoEntity>> HIPPO = register("hippo",
			EntityType.Builder.<HippoEntity>of(HippoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<GiraffeEntity>> GIRAFFE = register("giraffe",
			EntityType.Builder.<GiraffeEntity>of(GiraffeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 2.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<ZebraEntity>> ZEBRA = register("zebra",
			EntityType.Builder.<ZebraEntity>of(ZebraEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<TermiteEntity>> TERMITE = register("termite",
			EntityType.Builder.<TermiteEntity>of(TermiteEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<OstrichEntity>> OSTRICH = register("ostrich",
			EntityType.Builder.<OstrichEntity>of(OstrichEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<DragonflyEntity>> DRAGONFLY = register("dragonfly",
			EntityType.Builder.<DragonflyEntity>of(DragonflyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<BlackBearEntity>> BLACK_BEAR = register("black_bear",
			EntityType.Builder.<BlackBearEntity>of(BlackBearEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<PiranhaEntity>> PIRANHA = register("piranha",
			EntityType.Builder.<PiranhaEntity>of(PiranhaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<FlyEntity>> FLY = register("fly", EntityType.Builder.<FlyEntity>of(FlyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

			.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<ElkEntity>> ELK = register("elk", EntityType.Builder.<ElkEntity>of(ElkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

			.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<CaribouEntity>> CARIBOU = register("caribou",
			EntityType.Builder.<CaribouEntity>of(CaribouEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<LynxEntity>> LYNX = register("lynx",
			EntityType.Builder.<LynxEntity>of(LynxEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<DuckEntity>> DUCK = register("duck",
			EntityType.Builder.<DuckEntity>of(DuckEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<SwanEntity>> SWAN = register("swan",
			EntityType.Builder.<SwanEntity>of(SwanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<MuskoxEntity>> MUSKOX = register("muskox",
			EntityType.Builder.<MuskoxEntity>of(MuskoxEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<LadybugEntity>> LADYBUG = register("ladybug",
			EntityType.Builder.<LadybugEntity>of(LadybugEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<MountaineerEntity>> MOUNTAINEER = register("mountaineer",
			EntityType.Builder.<MountaineerEntity>of(MountaineerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<WaterBuffaloEntity>> WATER_BUFFALO = register("water_buffalo",
			EntityType.Builder.<WaterBuffaloEntity>of(WaterBuffaloEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<CaribouStrayEntity>> CARIBOU_STRAY = register("caribou_stray",
			EntityType.Builder.<CaribouStrayEntity>of(CaribouStrayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<SpruceLogFlumeEntity>> SPRUCE_LOG_FLUME = register("spruce_log_flume",
			EntityType.Builder.<SpruceLogFlumeEntity>of(SpruceLogFlumeEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<SpruceSledEntity>> SPRUCE_SLED = register("spruce_sled",
			EntityType.Builder.<SpruceSledEntity>of(SpruceSledEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).clientTrackingRange(10)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<SardineEntity>> SARDINE = register("sardine",
			EntityType.Builder.<SardineEntity>of(SardineEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<SeaUrchinEntity>> SEA_URCHIN = register("sea_urchin",
			EntityType.Builder.<SeaUrchinEntity>of(SeaUrchinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<SeaghastEntity>> SEAGHAST = register("seaghast",
			EntityType.Builder.<SeaghastEntity>of(SeaghastEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<StarfishEntity>> STARFISH = register("starfish",
			EntityType.Builder.<StarfishEntity>of(StarfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<ShrimpEntity>> SHRIMP = register("shrimp",
			EntityType.Builder.<ShrimpEntity>of(ShrimpEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<JellyfishEntity>> JELLYFISH = register("jellyfish",
			EntityType.Builder.<JellyfishEntity>of(JellyfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<LightfishEntity>> LIGHTFISH = register("lightfish",
			EntityType.Builder.<LightfishEntity>of(LightfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<BarreleyeEntity>> BARRELEYE = register("barreleye",
			EntityType.Builder.<BarreleyeEntity>of(BarreleyeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<JawfishEntity>> JAWFISH = register("jawfish",
			EntityType.Builder.<JawfishEntity>of(JawfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<SeahorseEntity>> SEAHORSE = register("seahorse",
			EntityType.Builder.<SeahorseEntity>of(SeahorseEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<AnglerfishEntity>> ANGLERFISH = register("anglerfish",
			EntityType.Builder.<AnglerfishEntity>of(AnglerfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<SwordfishEntity>> SWORDFISH = register("swordfish",
			EntityType.Builder.<SwordfishEntity>of(SwordfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<SunfishEntity>> SUNFISH = register("sunfish",
			EntityType.Builder.<SunfishEntity>of(SunfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<TunaEntity>> TUNA = register("tuna",
			EntityType.Builder.<TunaEntity>of(TunaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<MantaRayEntity>> MANTA_RAY = register("manta_ray",
			EntityType.Builder.<MantaRayEntity>of(MantaRayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<PenguinEntity>> PENGUIN = register("penguin",
			EntityType.Builder.<PenguinEntity>of(PenguinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<BubbleEntity>> BUBBLE = register("bubble",
			EntityType.Builder.<BubbleEntity>of(BubbleEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<CastawayEntity>> CASTAWAY = register("castaway",
			EntityType.Builder.<CastawayEntity>of(CastawayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<DriftwoodSurfboardEntity>> DRIFTWOOD_SURFBOARD = register("driftwood_surfboard",
			EntityType.Builder.<DriftwoodSurfboardEntity>of(DriftwoodSurfboardEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<BlowdartEntity>> BLOWDART = register("blowdart",
			EntityType.Builder.<BlowdartEntity>of(BlowdartEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<RedPandaEntity>> RED_PANDA = register("red_panda",
			EntityType.Builder.<RedPandaEntity>of(RedPandaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<LemurEntity>> LEMUR = register("lemur",
			EntityType.Builder.<LemurEntity>of(LemurEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<CapybaraEntity>> CAPYBARA = register("capybara",
			EntityType.Builder.<CapybaraEntity>of(CapybaraEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<MothEntity>> MOTH = register("moth",
			EntityType.Builder.<MothEntity>of(MothEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<BoarEntity>> BOAR = register("boar",
			EntityType.Builder.<BoarEntity>of(BoarEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<MoobloomEntity>> MOOBLOOM = register("moobloom",
			EntityType.Builder.<MoobloomEntity>of(MoobloomEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<ButterflyEntity>> BUTTERFLY = register("butterfly",
			EntityType.Builder.<ButterflyEntity>of(ButterflyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<DeerEntity>> DEER = register("deer",
			EntityType.Builder.<DeerEntity>of(DeerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<UltravioletCreakingEntity>> ULTRAVIOLET_CREAKING = register("ultraviolet_creaking",
			EntityType.Builder.<UltravioletCreakingEntity>of(UltravioletCreakingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<BlackberryBoatEntity>> BLACKBERRY_BOAT = register("blackberry_boat",
			EntityType.Builder.<BlackberryBoatEntity>of(BlackberryBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<BlackberryBoatWithChestEntity>> BLACKBERRY_BOAT_WITH_CHEST = register("blackberry_boat_with_chest",
			EntityType.Builder.<BlackberryBoatWithChestEntity>of(BlackberryBoatWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<GooseberryBoatEntity>> GOOSEBERRY_BOAT = register("gooseberry_boat",
			EntityType.Builder.<GooseberryBoatEntity>of(GooseberryBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<StrawberryBoatEntity>> STRAWBERRY_BOAT = register("strawberry_boat",
			EntityType.Builder.<StrawberryBoatEntity>of(StrawberryBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<RaspberryBoatEntity>> RASPBERRY_BOAT = register("raspberry_boat",
			EntityType.Builder.<RaspberryBoatEntity>of(RaspberryBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<GoldenberryBoatEntity>> GOLDENBERRY_BOAT = register("goldenberry_boat",
			EntityType.Builder.<GoldenberryBoatEntity>of(GoldenberryBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<GlowBerryBoatEntity>> GLOW_BERRY_BOAT = register("glow_berry_boat",
			EntityType.Builder.<GlowBerryBoatEntity>of(GlowBerryBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<SweetBerryBoatEntity>> SWEET_BERRY_BOAT = register("sweet_berry_boat",
			EntityType.Builder.<SweetBerryBoatEntity>of(SweetBerryBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<GooseberryBoatWithChestEntity>> GOOSEBERRY_BOAT_WITH_CHEST = register("gooseberry_boat_with_chest",
			EntityType.Builder.<GooseberryBoatWithChestEntity>of(GooseberryBoatWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<StrawberryBoatWithChestEntity>> STRAWBERRY_BOAT_WITH_CHEST = register("strawberry_boat_with_chest",
			EntityType.Builder.<StrawberryBoatWithChestEntity>of(StrawberryBoatWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<RaspberryBoatWithChestEntity>> RASPBERRY_BOAT_WITH_CHEST = register("raspberry_boat_with_chest",
			EntityType.Builder.<RaspberryBoatWithChestEntity>of(RaspberryBoatWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<GoldenberryBoatWithChestEntity>> GOLDENBERRY_BOAT_WITH_CHEST = register("goldenberry_boat_with_chest",
			EntityType.Builder.<GoldenberryBoatWithChestEntity>of(GoldenberryBoatWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<GlowBerryBoatWithChestEntity>> GLOW_BERRY_BOAT_WITH_CHEST = register("glow_berry_boat_with_chest",
			EntityType.Builder.<GlowBerryBoatWithChestEntity>of(GlowBerryBoatWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<SweetBerryBoatWithChestEntity>> SWEET_BERRY_BOAT_WITH_CHEST = register("sweet_berry_boat_with_chest",
			EntityType.Builder.<SweetBerryBoatWithChestEntity>of(SweetBerryBoatWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<SunshineBoatEntity>> SUNSHINE_BOAT = register("sunshine_boat",
			EntityType.Builder.<SunshineBoatEntity>of(SunshineBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<HoarfrostBoatEntity>> HOARFROST_BOAT = register("hoarfrost_boat",
			EntityType.Builder.<HoarfrostBoatEntity>of(HoarfrostBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<BlueDriftwoodBoatEntity>> BLUE_DRIFTWOOD_BOAT = register("blue_driftwood_boat",
			EntityType.Builder.<BlueDriftwoodBoatEntity>of(BlueDriftwoodBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<SunshineBoatWithChestEntity>> SUNSHINE_BOAT_WITH_CHEST = register("sunshine_boat_with_chest",
			EntityType.Builder.<SunshineBoatWithChestEntity>of(SunshineBoatWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<HoarfrostBoatWithChestEntity>> HOARFROST_BOAT_WITH_CHEST = register("hoarfrost_boat_with_chest",
			EntityType.Builder.<HoarfrostBoatWithChestEntity>of(HoarfrostBoatWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<BlueDriftwoodBoatWithChestEntity>> BLUE_DRIFTWOOD_BOAT_WITH_CHEST = register("blue_driftwood_boat_with_chest",
			EntityType.Builder.<BlueDriftwoodBoatWithChestEntity>of(BlueDriftwoodBoatWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<WillowBoatEntity>> WILLOW_BOAT = register("willow_boat",
			EntityType.Builder.<WillowBoatEntity>of(WillowBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<HeartwoodBoatEntity>> HEARTWOOD_BOAT = register("heartwood_boat",
			EntityType.Builder.<HeartwoodBoatEntity>of(HeartwoodBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<WillowBoatWithChestEntity>> WILLOW_BOAT_WITH_CHEST = register("willow_boat_with_chest",
			EntityType.Builder.<WillowBoatWithChestEntity>of(WillowBoatWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<HeartwoodBoatWithChestEntity>> HEARTWOOD_BOAT_WITH_CHEST = register("heartwood_boat_with_chest",
			EntityType.Builder.<HeartwoodBoatWithChestEntity>of(HeartwoodBoatWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<LavaSquidEntity>> LAVA_SQUID = register("lava_squid",
			EntityType.Builder.<LavaSquidEntity>of(LavaSquidEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.7f, 0.4f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<AshGuardianEntity>> ASH_GUARDIAN = register("ash_guardian",
			EntityType.Builder.<AshGuardianEntity>of(AshGuardianEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.notInPeaceful().sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<FireSalamanderEntity>> FIRE_SALAMANDER = register("fire_salamander",
			EntityType.Builder.<FireSalamanderEntity>of(FireSalamanderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<SeabunnyEntity>> SEABUNNY = register("seabunny",
			EntityType.Builder.<SeabunnyEntity>of(SeabunnyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.7f, 0.4f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<IguanaEntity>> IGUANA = register("iguana",
			EntityType.Builder.<IguanaEntity>of(IguanaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<SculkTNTPrimedEntity>> SCULK_TNT_PRIMED = register("sculk_tnt_primed",
			EntityType.Builder.<SculkTNTPrimedEntity>of(SculkTNTPrimedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<BomberryRedEntity>> BOMBERRY_RED = register("bomberry_red",
			EntityType.Builder.<BomberryRedEntity>of(BomberryRedEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BomberryYellowEntity>> BOMBERRY_YELLOW = register("bomberry_yellow",
			EntityType.Builder.<BomberryYellowEntity>of(BomberryYellowEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BomberryGreenEntity>> BOMBERRY_GREEN = register("bomberry_green",
			EntityType.Builder.<BomberryGreenEntity>of(BomberryGreenEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BomberryBlueEntity>> BOMBERRY_BLUE = register("bomberry_blue",
			EntityType.Builder.<BomberryBlueEntity>of(BomberryBlueEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BomberryPurpleEntity>> BOMBERRY_PURPLE = register("bomberry_purple",
			EntityType.Builder.<BomberryPurpleEntity>of(BomberryPurpleEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BomberryWhiteEntity>> BOMBERRY_WHITE = register("bomberry_white",
			EntityType.Builder.<BomberryWhiteEntity>of(BomberryWhiteEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<OakSledEntity>> OAK_SLED = register("oak_sled",
			EntityType.Builder.<OakSledEntity>of(OakSledEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).clientTrackingRange(10)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<BirchSledEntity>> BIRCH_SLED = register("birch_sled",
			EntityType.Builder.<BirchSledEntity>of(BirchSledEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).clientTrackingRange(10)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<JungleSledEntity>> JUNGLE_SLED = register("jungle_sled",
			EntityType.Builder.<JungleSledEntity>of(JungleSledEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).clientTrackingRange(10)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<AcaciaSledEntity>> ACACIA_SLED = register("acacia_sled",
			EntityType.Builder.<AcaciaSledEntity>of(AcaciaSledEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).clientTrackingRange(10)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<DarkOakSledEntity>> DARK_OAK_SLED = register("dark_oak_sled",
			EntityType.Builder.<DarkOakSledEntity>of(DarkOakSledEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).clientTrackingRange(10)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<MangroveSledEntity>> MANGROVE_SLED = register("mangrove_sled",
			EntityType.Builder.<MangroveSledEntity>of(MangroveSledEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).clientTrackingRange(10)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<CherrySledEntity>> CHERRY_SLED = register("cherry_sled",
			EntityType.Builder.<CherrySledEntity>of(CherrySledEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).clientTrackingRange(10)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<PaleOakSledEntity>> PALE_OAK_SLED = register("pale_oak_sled",
			EntityType.Builder.<PaleOakSledEntity>of(PaleOakSledEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).clientTrackingRange(10)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<OakSledWithChestEntity>> OAK_SLED_WITH_CHEST = register("oak_sled_with_chest",
			EntityType.Builder.<OakSledWithChestEntity>of(OakSledWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).clientTrackingRange(10)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<BirchSledWithChestEntity>> BIRCH_SLED_WITH_CHEST = register("birch_sled_with_chest",
			EntityType.Builder.<BirchSledWithChestEntity>of(BirchSledWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).clientTrackingRange(10)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<SpruceSledWithChestEntity>> SPRUCE_SLED_WITH_CHEST = register("spruce_sled_with_chest",
			EntityType.Builder.<SpruceSledWithChestEntity>of(SpruceSledWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).clientTrackingRange(10)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<JungleSledWithChestEntity>> JUNGLE_SLED_WITH_CHEST = register("jungle_sled_with_chest",
			EntityType.Builder.<JungleSledWithChestEntity>of(JungleSledWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).clientTrackingRange(10)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<AcaciaSledWithChestEntity>> ACACIA_SLED_WITH_CHEST = register("acacia_sled_with_chest",
			EntityType.Builder.<AcaciaSledWithChestEntity>of(AcaciaSledWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).clientTrackingRange(10)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<DarkOakSledWithChestEntity>> DARK_OAK_SLED_WITH_CHEST = register("dark_oak_sled_with_chest",
			EntityType.Builder.<DarkOakSledWithChestEntity>of(DarkOakSledWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).clientTrackingRange(10)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<MangroveSledWithChestEntity>> MANGROVE_SLED_WITH_CHEST = register("mangrove_sled_with_chest",
			EntityType.Builder.<MangroveSledWithChestEntity>of(MangroveSledWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).clientTrackingRange(10)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<CherrySledWithChestEntity>> CHERRY_SLED_WITH_CHEST = register("cherry_sled_with_chest",
			EntityType.Builder.<CherrySledWithChestEntity>of(CherrySledWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).clientTrackingRange(10)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<PaleOakSledWithChestEntity>> PALE_OAK_SLED_WITH_CHEST = register("pale_oak_sled_with_chest",
			EntityType.Builder.<PaleOakSledWithChestEntity>of(PaleOakSledWithChestEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).clientTrackingRange(10)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<OakLogFlumeEntity>> OAK_LOG_FLUME = register("oak_log_flume",
			EntityType.Builder.<OakLogFlumeEntity>of(OakLogFlumeEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<BirchLogFlumeEntity>> BIRCH_LOG_FLUME = register("birch_log_flume",
			EntityType.Builder.<BirchLogFlumeEntity>of(BirchLogFlumeEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<JungleLogFlumeEntity>> JUNGLE_LOG_FLUME = register("jungle_log_flume",
			EntityType.Builder.<JungleLogFlumeEntity>of(JungleLogFlumeEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<AcaciaLogFlumeEntity>> ACACIA_LOG_FLUME = register("acacia_log_flume",
			EntityType.Builder.<AcaciaLogFlumeEntity>of(AcaciaLogFlumeEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<DarkOakLogFlumeEntity>> DARK_OAK_LOG_FLUME = register("dark_oak_log_flume",
			EntityType.Builder.<DarkOakLogFlumeEntity>of(DarkOakLogFlumeEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<MangroveLogFlumeEntity>> MANGROVE_LOG_FLUME = register("mangrove_log_flume",
			EntityType.Builder.<MangroveLogFlumeEntity>of(MangroveLogFlumeEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<CherryLogFlumeEntity>> CHERRY_LOG_FLUME = register("cherry_log_flume",
			EntityType.Builder.<CherryLogFlumeEntity>of(CherryLogFlumeEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<PaleOakLogFlumeEntity>> PALE_OAK_LOG_FLUME = register("pale_oak_log_flume",
			EntityType.Builder.<PaleOakLogFlumeEntity>of(PaleOakLogFlumeEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<ArrowBlueApatiteEntity>> ARROW_BLUE_APATITE = register("arrow_blue_apatite",
			EntityType.Builder.<ArrowBlueApatiteEntity>of(ArrowBlueApatiteEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<TuffGolemEntity>> TUFF_GOLEM = register("tuff_golem",
			EntityType.Builder.<TuffGolemEntity>of(TuffGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<GlareEntity>> GLARE = register("glare",
			EntityType.Builder.<GlareEntity>of(GlareEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<SandWitchEntity>> SAND_WITCH = register("sand_witch",
			EntityType.Builder.<SandWitchEntity>of(SandWitchEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.notInPeaceful().sized(0.7f, 0.4f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<ScorchedOstrichEntity>> SCORCHED_OSTRICH = register("scorched_ostrich",
			EntityType.Builder.<ScorchedOstrichEntity>of(ScorchedOstrichEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<AzaleaWoodenBirdzingEntity>> AZALEA_WOODEN_BIRDZING = register("azalea_wooden_birdzing",
			EntityType.Builder.<AzaleaWoodenBirdzingEntity>of(AzaleaWoodenBirdzingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.05f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<EndWoodenBirdzingEntity>> END_WOODEN_BIRDZING = register("end_wooden_birdzing",
			EntityType.Builder.<EndWoodenBirdzingEntity>of(EndWoodenBirdzingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.95f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<BaldWoodenBirdzingEntity>> BALD_WOODEN_BIRDZING = register("bald_wooden_birdzing",
			EntityType.Builder.<BaldWoodenBirdzingEntity>of(BaldWoodenBirdzingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.05f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<RedstoneBugEntity>> REDSTONE_BUG = register("redstone_bug",
			EntityType.Builder.<RedstoneBugEntity>of(RedstoneBugEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.4f, 0.3f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<CrystalfishEntity>> CRYSTALFISH = register("crystalfish",
			EntityType.Builder.<CrystalfishEntity>of(CrystalfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.4f, 0.3f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<IcefishEntity>> ICEFISH = register("icefish",
			EntityType.Builder.<IcefishEntity>of(IcefishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).notInPeaceful().sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<LavafishEntity>> LAVAFISH = register("lavafish",
			EntityType.Builder.<LavafishEntity>of(LavafishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.notInPeaceful().sized(0.4f, 0.3f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<FloodfishEntity>> FLOODFISH = register("floodfish",
			EntityType.Builder.<FloodfishEntity>of(FloodfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.4f, 0.3f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<FungifishEntity>> FUNGIFISH = register("fungifish",
			EntityType.Builder.<FungifishEntity>of(FungifishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.4f, 0.3f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<SculkfishEntity>> SCULKFISH = register("sculkfish",
			EntityType.Builder.<SculkfishEntity>of(SculkfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.4f, 0.3f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<MossiverfishEntity>> MOSSIVERFISH = register("mossiverfish",
			EntityType.Builder.<MossiverfishEntity>of(MossiverfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.4f, 0.3f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<DripperfishEntity>> DRIPPERFISH = register("dripperfish",
			EntityType.Builder.<DripperfishEntity>of(DripperfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.4f, 0.3f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<BleatshroomEntity>> BLEATSHROOM = register("bleatshroom",
			EntityType.Builder.<BleatshroomEntity>of(BleatshroomEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.9f, 1.87f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<BleatshroomSpitEntity>> BLEATSHROOM_SPIT = register("bleatshroom_spit",
			EntityType.Builder.<BleatshroomSpitEntity>of(BleatshroomSpitEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<SporeeperEntity>> SPOREEPER = register("sporeeper",
			EntityType.Builder.<SporeeperEntity>of(SporeeperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(1.4f, 0.7f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<ShriekerEntity>> SHRIEKER = register("shrieker",
			EntityType.Builder.<ShriekerEntity>of(ShriekerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.7f, 0.4f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<CreakerEntity>> CREAKER = register("creaker",
			EntityType.Builder.<CreakerEntity>of(CreakerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.notInPeaceful().sized(0.6f, 1.7f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<SpidershroomEntity>> SPIDERSHROOM = register("spidershroom",
			EntityType.Builder.<SpidershroomEntity>of(SpidershroomEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(1.4f, 0.9f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<EmberSkullEntity>> EMBER_SKULL = register("ember_skull",
			EntityType.Builder.<EmberSkullEntity>of(EmberSkullEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<EmberWitherEntity>> EMBER_WITHER = register("ember_wither",
			EntityType.Builder.<EmberWitherEntity>of(EmberWitherEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.notInPeaceful().sized(0.6f, 1.95f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<BoneSpiderEntity>> BONE_SPIDER = register("bone_spider",
			EntityType.Builder.<BoneSpiderEntity>of(BoneSpiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(1.4f, 0.9f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<WavesEntity>> WAVES = register("waves",
			EntityType.Builder.<WavesEntity>of(WavesEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.notInPeaceful().sized(0.6f, 1.95f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<GrazeEntity>> GRAZE = register("graze",
			EntityType.Builder.<GrazeEntity>of(GrazeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(1f, 1f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<KoiEntity>> KOI = register("koi", EntityType.Builder.<KoiEntity>of(KoiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

			.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<TroutEntity>> TROUT = register("trout",
			EntityType.Builder.<TroutEntity>of(TroutEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<UltrabbitEntity>> ULTRABBIT = register("ultrabbit",
			EntityType.Builder.<UltrabbitEntity>of(UltrabbitEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<CreakSpiderEntity>> CREAK_SPIDER = register("creak_spider",
			EntityType.Builder.<CreakSpiderEntity>of(CreakSpiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.7f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<SunSpiderEntity>> SUN_SPIDER = register("sun_spider",
			EntityType.Builder.<SunSpiderEntity>of(SunSpiderEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 0.9f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<BadgerEntity>> BADGER = register("badger",
			EntityType.Builder.<BadgerEntity>of(BadgerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<EnderMothEntity>> ENDER_MOTH = register("ender_moth",
			EntityType.Builder.<EnderMothEntity>of(EnderMothEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.5f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<SpringtailEntity>> SPRINGTAIL = register("springtail",
			EntityType.Builder.<SpringtailEntity>of(SpringtailEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 0.9f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<ChorusSnailEntity>> CHORUS_SNAIL = register("chorus_snail",
			EntityType.Builder.<ChorusSnailEntity>of(ChorusSnailEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.7f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<EndCubeEntity>> END_CUBE = register("end_cube",
			EntityType.Builder.<EndCubeEntity>of(EndCubeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f)

	);

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(ZiNGsBiomes.MODID, registryname))));
	}

	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerEntity(Capabilities.Item.ENTITY, OAK_SLED_WITH_CHEST.get(), (living, context) -> living.getCombinedInventory());
		event.registerEntity(Capabilities.Item.ENTITY, BIRCH_SLED_WITH_CHEST.get(), (living, context) -> living.getCombinedInventory());
		event.registerEntity(Capabilities.Item.ENTITY, SPRUCE_SLED_WITH_CHEST.get(), (living, context) -> living.getCombinedInventory());
		event.registerEntity(Capabilities.Item.ENTITY, JUNGLE_SLED_WITH_CHEST.get(), (living, context) -> living.getCombinedInventory());
		event.registerEntity(Capabilities.Item.ENTITY, ACACIA_SLED_WITH_CHEST.get(), (living, context) -> living.getCombinedInventory());
		event.registerEntity(Capabilities.Item.ENTITY, DARK_OAK_SLED_WITH_CHEST.get(), (living, context) -> living.getCombinedInventory());
		event.registerEntity(Capabilities.Item.ENTITY, MANGROVE_SLED_WITH_CHEST.get(), (living, context) -> living.getCombinedInventory());
		event.registerEntity(Capabilities.Item.ENTITY, CHERRY_SLED_WITH_CHEST.get(), (living, context) -> living.getCombinedInventory());
		event.registerEntity(Capabilities.Item.ENTITY, PALE_OAK_SLED_WITH_CHEST.get(), (living, context) -> living.getCombinedInventory());
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		ScorchedEntity.init(event);
		TangledEntity.init(event);
		ThawedEntity.init(event);
		FloodCreeperEntity.init(event);
		NetherCreeperEntity.init(event);
		VineCreeperEntity.init(event);
		SnowCreeperEntity.init(event);
		SandstoneCreeperEntity.init(event);
		DrenchedSpiderEntity.init(event);
		BurnedSpiderEntity.init(event);
		PoisonedSpiderEntity.init(event);
		IcySpiderEntity.init(event);
		SandySpiderEntity.init(event);
		SoulBurnedSpiderEntity.init(event);
		OakWoodenBirdzingEntity.init(event);
		CrimsonWoodenBirdzingEntity.init(event);
		CherryWoodenBirdzingEntity.init(event);
		PaleWoodenBirdzingEntity.init(event);
		BambooWoodenBirdzingEntity.init(event);
		InvertedShamrockCowEntity.init(event);
		ShamrockCowEntity.init(event);
		FennecFoxEntity.init(event);
		PronghornEntity.init(event);
		MeerkatEntity.init(event);
		CoyoteEntity.init(event);
		PrarieDogEntity.init(event);
		VultureEntity.init(event);
		HippoEntity.init(event);
		GiraffeEntity.init(event);
		ZebraEntity.init(event);
		TermiteEntity.init(event);
		OstrichEntity.init(event);
		DragonflyEntity.init(event);
		BlackBearEntity.init(event);
		PiranhaEntity.init(event);
		FlyEntity.init(event);
		ElkEntity.init(event);
		CaribouEntity.init(event);
		LynxEntity.init(event);
		DuckEntity.init(event);
		SwanEntity.init(event);
		MuskoxEntity.init(event);
		LadybugEntity.init(event);
		MountaineerEntity.init(event);
		WaterBuffaloEntity.init(event);
		CaribouStrayEntity.init(event);
		SardineEntity.init(event);
		SeaUrchinEntity.init(event);
		SeaghastEntity.init(event);
		StarfishEntity.init(event);
		ShrimpEntity.init(event);
		JellyfishEntity.init(event);
		LightfishEntity.init(event);
		BarreleyeEntity.init(event);
		JawfishEntity.init(event);
		SeahorseEntity.init(event);
		AnglerfishEntity.init(event);
		SwordfishEntity.init(event);
		SunfishEntity.init(event);
		TunaEntity.init(event);
		MantaRayEntity.init(event);
		PenguinEntity.init(event);
		CastawayEntity.init(event);
		DriftwoodSurfboardEntity.init(event);
		RedPandaEntity.init(event);
		LemurEntity.init(event);
		CapybaraEntity.init(event);
		MothEntity.init(event);
		BoarEntity.init(event);
		MoobloomEntity.init(event);
		ButterflyEntity.init(event);
		DeerEntity.init(event);
		UltravioletCreakingEntity.init(event);
		LavaSquidEntity.init(event);
		AshGuardianEntity.init(event);
		FireSalamanderEntity.init(event);
		SeabunnyEntity.init(event);
		IguanaEntity.init(event);
		SculkTNTPrimedEntity.init(event);
		TuffGolemEntity.init(event);
		GlareEntity.init(event);
		SandWitchEntity.init(event);
		ScorchedOstrichEntity.init(event);
		AzaleaWoodenBirdzingEntity.init(event);
		EndWoodenBirdzingEntity.init(event);
		BaldWoodenBirdzingEntity.init(event);
		RedstoneBugEntity.init(event);
		CrystalfishEntity.init(event);
		IcefishEntity.init(event);
		LavafishEntity.init(event);
		FloodfishEntity.init(event);
		FungifishEntity.init(event);
		SculkfishEntity.init(event);
		MossiverfishEntity.init(event);
		DripperfishEntity.init(event);
		BleatshroomEntity.init(event);
		SporeeperEntity.init(event);
		ShriekerEntity.init(event);
		CreakerEntity.init(event);
		SpidershroomEntity.init(event);
		EmberWitherEntity.init(event);
		BoneSpiderEntity.init(event);
		WavesEntity.init(event);
		GrazeEntity.init(event);
		KoiEntity.init(event);
		TroutEntity.init(event);
		UltrabbitEntity.init(event);
		CreakSpiderEntity.init(event);
		SunSpiderEntity.init(event);
		BadgerEntity.init(event);
		EnderMothEntity.init(event);
		SpringtailEntity.init(event);
		ChorusSnailEntity.init(event);
		EndCubeEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SCORCHED.get(), ScorchedEntity.createAttributes().build());
		event.put(TANGLED.get(), TangledEntity.createAttributes().build());
		event.put(THAWED.get(), ThawedEntity.createAttributes().build());
		event.put(FLOOD_CREEPER.get(), FloodCreeperEntity.createAttributes().build());
		event.put(NETHER_CREEPER.get(), NetherCreeperEntity.createAttributes().build());
		event.put(VINE_CREEPER.get(), VineCreeperEntity.createAttributes().build());
		event.put(SNOW_CREEPER.get(), SnowCreeperEntity.createAttributes().build());
		event.put(SANDSTONE_CREEPER.get(), SandstoneCreeperEntity.createAttributes().build());
		event.put(DRENCHED_SPIDER.get(), DrenchedSpiderEntity.createAttributes().build());
		event.put(BURNED_SPIDER.get(), BurnedSpiderEntity.createAttributes().build());
		event.put(POISONED_SPIDER.get(), PoisonedSpiderEntity.createAttributes().build());
		event.put(ICY_SPIDER.get(), IcySpiderEntity.createAttributes().build());
		event.put(SANDY_SPIDER.get(), SandySpiderEntity.createAttributes().build());
		event.put(SOUL_BURNED_SPIDER.get(), SoulBurnedSpiderEntity.createAttributes().build());
		event.put(WOODLAND_WOODEN_BIRDZING.get(), OakWoodenBirdzingEntity.createAttributes().build());
		event.put(NETHER_WOODEN_BIRDZING.get(), CrimsonWoodenBirdzingEntity.createAttributes().build());
		event.put(BERRY_WOODEN_BIRDZING.get(), CherryWoodenBirdzingEntity.createAttributes().build());
		event.put(WEEPING_WOODEN_BIRDZING.get(), PaleWoodenBirdzingEntity.createAttributes().build());
		event.put(BAMBOO_WOODEN_BIRDZING.get(), BambooWoodenBirdzingEntity.createAttributes().build());
		event.put(INVERTED_SHAMROCK_COW.get(), InvertedShamrockCowEntity.createAttributes().build());
		event.put(SHAMROCK_COW.get(), ShamrockCowEntity.createAttributes().build());
		event.put(FENNEC_FOX.get(), FennecFoxEntity.createAttributes().build());
		event.put(PRONGHORN.get(), PronghornEntity.createAttributes().build());
		event.put(MEERKAT.get(), MeerkatEntity.createAttributes().build());
		event.put(COYOTE.get(), CoyoteEntity.createAttributes().build());
		event.put(PRARIE_DOG.get(), PrarieDogEntity.createAttributes().build());
		event.put(VULTURE.get(), VultureEntity.createAttributes().build());
		event.put(HIPPO.get(), HippoEntity.createAttributes().build());
		event.put(GIRAFFE.get(), GiraffeEntity.createAttributes().build());
		event.put(ZEBRA.get(), ZebraEntity.createAttributes().build());
		event.put(TERMITE.get(), TermiteEntity.createAttributes().build());
		event.put(OSTRICH.get(), OstrichEntity.createAttributes().build());
		event.put(DRAGONFLY.get(), DragonflyEntity.createAttributes().build());
		event.put(BLACK_BEAR.get(), BlackBearEntity.createAttributes().build());
		event.put(PIRANHA.get(), PiranhaEntity.createAttributes().build());
		event.put(FLY.get(), FlyEntity.createAttributes().build());
		event.put(ELK.get(), ElkEntity.createAttributes().build());
		event.put(CARIBOU.get(), CaribouEntity.createAttributes().build());
		event.put(LYNX.get(), LynxEntity.createAttributes().build());
		event.put(DUCK.get(), DuckEntity.createAttributes().build());
		event.put(SWAN.get(), SwanEntity.createAttributes().build());
		event.put(MUSKOX.get(), MuskoxEntity.createAttributes().build());
		event.put(LADYBUG.get(), LadybugEntity.createAttributes().build());
		event.put(MOUNTAINEER.get(), MountaineerEntity.createAttributes().build());
		event.put(WATER_BUFFALO.get(), WaterBuffaloEntity.createAttributes().build());
		event.put(CARIBOU_STRAY.get(), CaribouStrayEntity.createAttributes().build());
		event.put(SARDINE.get(), SardineEntity.createAttributes().build());
		event.put(SEA_URCHIN.get(), SeaUrchinEntity.createAttributes().build());
		event.put(SEAGHAST.get(), SeaghastEntity.createAttributes().build());
		event.put(STARFISH.get(), StarfishEntity.createAttributes().build());
		event.put(SHRIMP.get(), ShrimpEntity.createAttributes().build());
		event.put(JELLYFISH.get(), JellyfishEntity.createAttributes().build());
		event.put(LIGHTFISH.get(), LightfishEntity.createAttributes().build());
		event.put(BARRELEYE.get(), BarreleyeEntity.createAttributes().build());
		event.put(JAWFISH.get(), JawfishEntity.createAttributes().build());
		event.put(SEAHORSE.get(), SeahorseEntity.createAttributes().build());
		event.put(ANGLERFISH.get(), AnglerfishEntity.createAttributes().build());
		event.put(SWORDFISH.get(), SwordfishEntity.createAttributes().build());
		event.put(SUNFISH.get(), SunfishEntity.createAttributes().build());
		event.put(TUNA.get(), TunaEntity.createAttributes().build());
		event.put(MANTA_RAY.get(), MantaRayEntity.createAttributes().build());
		event.put(PENGUIN.get(), PenguinEntity.createAttributes().build());
		event.put(CASTAWAY.get(), CastawayEntity.createAttributes().build());
		event.put(DRIFTWOOD_SURFBOARD.get(), DriftwoodSurfboardEntity.createAttributes().build());
		event.put(RED_PANDA.get(), RedPandaEntity.createAttributes().build());
		event.put(LEMUR.get(), LemurEntity.createAttributes().build());
		event.put(CAPYBARA.get(), CapybaraEntity.createAttributes().build());
		event.put(MOTH.get(), MothEntity.createAttributes().build());
		event.put(BOAR.get(), BoarEntity.createAttributes().build());
		event.put(MOOBLOOM.get(), MoobloomEntity.createAttributes().build());
		event.put(BUTTERFLY.get(), ButterflyEntity.createAttributes().build());
		event.put(DEER.get(), DeerEntity.createAttributes().build());
		event.put(ULTRAVIOLET_CREAKING.get(), UltravioletCreakingEntity.createAttributes().build());
		event.put(LAVA_SQUID.get(), LavaSquidEntity.createAttributes().build());
		event.put(ASH_GUARDIAN.get(), AshGuardianEntity.createAttributes().build());
		event.put(FIRE_SALAMANDER.get(), FireSalamanderEntity.createAttributes().build());
		event.put(SEABUNNY.get(), SeabunnyEntity.createAttributes().build());
		event.put(IGUANA.get(), IguanaEntity.createAttributes().build());
		event.put(SCULK_TNT_PRIMED.get(), SculkTNTPrimedEntity.createAttributes().build());
		event.put(TUFF_GOLEM.get(), TuffGolemEntity.createAttributes().build());
		event.put(GLARE.get(), GlareEntity.createAttributes().build());
		event.put(SAND_WITCH.get(), SandWitchEntity.createAttributes().build());
		event.put(SCORCHED_OSTRICH.get(), ScorchedOstrichEntity.createAttributes().build());
		event.put(AZALEA_WOODEN_BIRDZING.get(), AzaleaWoodenBirdzingEntity.createAttributes().build());
		event.put(END_WOODEN_BIRDZING.get(), EndWoodenBirdzingEntity.createAttributes().build());
		event.put(BALD_WOODEN_BIRDZING.get(), BaldWoodenBirdzingEntity.createAttributes().build());
		event.put(REDSTONE_BUG.get(), RedstoneBugEntity.createAttributes().build());
		event.put(CRYSTALFISH.get(), CrystalfishEntity.createAttributes().build());
		event.put(ICEFISH.get(), IcefishEntity.createAttributes().build());
		event.put(LAVAFISH.get(), LavafishEntity.createAttributes().build());
		event.put(FLOODFISH.get(), FloodfishEntity.createAttributes().build());
		event.put(FUNGIFISH.get(), FungifishEntity.createAttributes().build());
		event.put(SCULKFISH.get(), SculkfishEntity.createAttributes().build());
		event.put(MOSSIVERFISH.get(), MossiverfishEntity.createAttributes().build());
		event.put(DRIPPERFISH.get(), DripperfishEntity.createAttributes().build());
		event.put(BLEATSHROOM.get(), BleatshroomEntity.createAttributes().build());
		event.put(SPOREEPER.get(), SporeeperEntity.createAttributes().build());
		event.put(SHRIEKER.get(), ShriekerEntity.createAttributes().build());
		event.put(CREAKER.get(), CreakerEntity.createAttributes().build());
		event.put(SPIDERSHROOM.get(), SpidershroomEntity.createAttributes().build());
		event.put(EMBER_WITHER.get(), EmberWitherEntity.createAttributes().build());
		event.put(BONE_SPIDER.get(), BoneSpiderEntity.createAttributes().build());
		event.put(WAVES.get(), WavesEntity.createAttributes().build());
		event.put(GRAZE.get(), GrazeEntity.createAttributes().build());
		event.put(KOI.get(), KoiEntity.createAttributes().build());
		event.put(TROUT.get(), TroutEntity.createAttributes().build());
		event.put(ULTRABBIT.get(), UltrabbitEntity.createAttributes().build());
		event.put(CREAK_SPIDER.get(), CreakSpiderEntity.createAttributes().build());
		event.put(SUN_SPIDER.get(), SunSpiderEntity.createAttributes().build());
		event.put(BADGER.get(), BadgerEntity.createAttributes().build());
		event.put(ENDER_MOTH.get(), EnderMothEntity.createAttributes().build());
		event.put(SPRINGTAIL.get(), SpringtailEntity.createAttributes().build());
		event.put(CHORUS_SNAIL.get(), ChorusSnailEntity.createAttributes().build());
		event.put(END_CUBE.get(), EndCubeEntity.createAttributes().build());
	}

    public static void queueServerWork(int ticks, Runnable task) {
        ServerWorkQueue.queueServerWork(ticks, task);
    }
}