/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zingsbiomes.init;

import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.zingsbiomes.client.particle.*;

@EventBusSubscriber(Dist.CLIENT)
public class ZingsBiomesModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(ZingsBiomesModParticleTypes.HOARFROST_LEAF.get(), HoarfrostLeafParticle::provider);
		event.registerSpriteSet(ZingsBiomesModParticleTypes.YELLOW_SUNSHINE_LEAF.get(), YellowSunshineLeafParticle::provider);
		event.registerSpriteSet(ZingsBiomesModParticleTypes.GREEN_SUNSHINE_LEAF.get(), GreenSunshineLeafParticle::provider);
		event.registerSpriteSet(ZingsBiomesModParticleTypes.SHAMROCK_WILLOW_LEAF.get(), ShamrockWillowLeafParticle::provider);
		event.registerSpriteSet(ZingsBiomesModParticleTypes.KAPOK_LEAF.get(), KapokLeafParticle::provider);
		event.registerSpriteSet(ZingsBiomesModParticleTypes.END_SPRUCE_LEAF.get(), EndSpruceLeafParticle::provider);
		event.registerSpriteSet(ZingsBiomesModParticleTypes.CHORUS_LEAF.get(), ChorusLeafParticle::provider);
		event.registerSpriteSet(ZingsBiomesModParticleTypes.ULTRABLOSSOM_OPEN_TRAIL.get(), UltrablossomOpenTrailParticle::provider);
		event.registerSpriteSet(ZingsBiomesModParticleTypes.DARKBLOSSOM_OPEN_TRAIL.get(), DarkblossomOpenTrailParticle::provider);
		event.registerSpriteSet(ZingsBiomesModParticleTypes.SEABLOSSOM_OPEN_TRAIL.get(), SeablossomOpenTrailParticle::provider);
	}
}