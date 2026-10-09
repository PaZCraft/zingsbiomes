/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zingsbiomes.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.core.dispenser.BoatDispenseItemBehavior;

@EventBusSubscriber
public class ZingsBiomesModDispenseBehaviors {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			DispenserBlock.registerBehavior(ZingsBiomesModItems.KAPOK_BOAT.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.KAPOK_BOAT.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.RED_DRIFTWOOD_BOAT.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.RED_DRIFTWOOD_BOAT.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.DRIFTWOOD_BOAT.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.DRIFTWOOD_BOAT.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.ULTRAVIOLET_OAK_BOAT.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.ULTRAVIOLET_OAK_BOAT.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.BLACKWOOD_BOAT.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.BLACKWOOD_BOAT.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.PALM_BOAT.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.PALM_BOAT.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.BAOBAB_BOAT.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.BAOBAB_BOAT.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.FIR_BOAT.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.FIR_BOAT.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.GRAZED_SPRUCE_BOAT.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.GRAZED_SPRUCE_BOAT.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.FROZEGROVE_BOAT.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.FROZEGROVE_BOAT.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.BLUEBERRY_BOAT.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.BLUEBERRY_BOAT.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.MOSSBARK_BOAT.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.MOSSBARK_BOAT.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.KAPOK_BOAT_WITH_CHEST.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.KAPOK_BOAT_WITH_CHEST.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.RED_DRIFTWOOD_BOAT_WITH_CHEST.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.RED_DRIFTWOOD_BOAT_WITH_CHEST.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.DRIFTWOOD_BOAT_WITH_CHEST.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.DRIFTWOOD_BOAT_WITH_CHEST.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.ULTRAVIOLET_OAK_BOAT_WITH_CHEST.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.ULTRAVIOLET_OAK_BOAT_WITH_CHEST.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.BLACKWOOD_BOAT_WITH_CHEST.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.BLACKWOOD_BOAT_WITH_CHEST.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.PALM_BOAT_WITH_CHEST.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.PALM_BOAT_WITH_CHEST.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.BAOBAB_BOAT_WITH_CHEST.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.BAOBAB_BOAT_WITH_CHEST.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.FIR_BOAT_WITH_CHEST.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.FIR_BOAT_WITH_CHEST.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.GRAZED_SPRUCE_BOAT_WITH_CHEST.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.GRAZED_SPRUCE_BOAT_WITH_CHEST.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.FROZEGROVE_BOAT_WITH_CHEST.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.FROZEGROVE_BOAT_WITH_CHEST.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.BLUEBERRY_BOAT_WITH_CHEST.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.BLUEBERRY_BOAT_WITH_CHEST.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.MOSSBARK_BOAT_WITH_CHEST.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.MOSSBARK_BOAT_WITH_CHEST.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.SHAMROCK_WILLOW_BOAT.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.SHAMROCK_WILLOW_BOAT.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.SHAMROCK_WILLOW_BOAT_WITH_CHEST.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.SHAMROCK_WILLOW_BOAT_WITH_CHEST.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.BLACKBERRY_BOAT.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.BLACKBERRY_BOAT.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.BLACKBERRY_BOAT_WITH_CHEST.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.BLACKBERRY_BOAT_WITH_CHEST.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.GOOSEBERRY_BOAT.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.GOOSEBERRY_BOAT.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.STRAWBERRY_BOAT.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.STRAWBERRY_BOAT.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.RASPBERRY_BOAT.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.RASPBERRY_BOAT.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.GOLDENBERRY_BOAT.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.GOLDENBERRY_BOAT.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.GLOW_BERRY_BOAT.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.GLOW_BERRY_BOAT.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.SWEET_BERRY_BOAT.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.SWEET_BERRY_BOAT.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.GOOSEBERRY_BOAT_WITH_CHEST.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.GOOSEBERRY_BOAT_WITH_CHEST.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.STRAWBERRY_BOAT_WITH_CHEST.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.STRAWBERRY_BOAT_WITH_CHEST.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.RASPBERRY_BOAT_WITH_CHEST.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.RASPBERRY_BOAT_WITH_CHEST.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.GOLDENBERRY_BOAT_WITH_CHEST.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.GOLDENBERRY_BOAT_WITH_CHEST.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.GLOW_BERRY_BOAT_WITH_CHEST.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.GLOW_BERRY_BOAT_WITH_CHEST.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.SWEET_BERRY_BOAT_WITH_CHEST.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.SWEET_BERRY_BOAT_WITH_CHEST.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.SUNSHINE_BOAT.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.SUNSHINE_BOAT.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.HOARFROST_BOAT.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.HOARFROST_BOAT.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.BLUE_DRIFTWOOD_BOAT.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.BLUE_DRIFTWOOD_BOAT.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.SUNSHINE_BOAT_WITH_CHEST.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.SUNSHINE_BOAT_WITH_CHEST.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.HOARFROST_BOAT_WITH_CHEST.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.HOARFROST_BOAT_WITH_CHEST.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.BLUE_DRIFTWOOD_BOAT_WITH_CHEST.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.BLUE_DRIFTWOOD_BOAT_WITH_CHEST.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.WILLOW_BOAT.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.WILLOW_BOAT.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.HEARTWOOD_BOAT.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.HEARTWOOD_BOAT.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.WILLOW_BOAT_WITH_CHEST.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.WILLOW_BOAT_WITH_CHEST.get()));
			DispenserBlock.registerBehavior(ZingsBiomesModItems.HEARTWOOD_BOAT_WITH_CHEST.get(), new BoatDispenseItemBehavior(ZingsBiomesModEntities.HEARTWOOD_BOAT_WITH_CHEST.get()));
		});
	}
}