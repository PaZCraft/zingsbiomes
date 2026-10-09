package com.zing.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.model.monster.spider.SpiderModel;
import net.minecraft.client.model.geom.ModelLayers;

import com.zing.zingsbiomes.entity.SoulBurnedSpiderEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class SoulBurnedSpiderRenderer extends MobRenderer<SoulBurnedSpiderEntity, BurnedSpiderRenderer.BurnedSpiderRenderState, SpiderModel> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/burned_spider_mob.png");
	private final Identifier soulEntityTexture = Identifier.parse("zings_biomes:textures/entities/soul_burned_spider_mob.png");

	public SoulBurnedSpiderRenderer(EntityRendererProvider.Context context) {
		super(context, new SpiderModel(context.bakeLayer(ModelLayers.SPIDER)), 0.5f);
		this.addLayer(new RenderLayer<>(this) {
			final Identifier BURNED_LAYER_TEXTURE = Identifier.parse("zings_biomes:textures/entities/burned_spider_mob_eyes.png");
			final Identifier SOUL_LAYER_TEXTURE = Identifier.parse("zings_biomes:textures/entities/soul_burned_spider_mob_eyes.png");

			@Override
			public void submit(PoseStack poseStack, SubmitNodeCollector submitNodeCollector, int light, LivingEntityRenderState state, float headYaw, float headPitch) {
				BurnedSpiderRenderer.BurnedSpiderRenderState burnedState = (BurnedSpiderRenderer.BurnedSpiderRenderState) state;
				Identifier glowTexture = burnedState.soulVariant ? SOUL_LAYER_TEXTURE : BURNED_LAYER_TEXTURE;
				submitNodeCollector.submitModel(this.getParentModel(), state, poseStack, RenderTypes.eyes(glowTexture), light, OverlayTexture.NO_OVERLAY, state.outlineColor, null);
			}
		});
	}

	@Override
	public BurnedSpiderRenderer.BurnedSpiderRenderState createRenderState() {
		return new BurnedSpiderRenderer.BurnedSpiderRenderState();
	}

	@Override
	public void extractRenderState(SoulBurnedSpiderEntity entity, BurnedSpiderRenderer.BurnedSpiderRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		state.soulVariant = entity.isSoulVariant();
	}

	@Override
	public Identifier getTextureLocation(BurnedSpiderRenderer.BurnedSpiderRenderState state) {
		return state.soulVariant ? soulEntityTexture : entityTexture;
	}
}