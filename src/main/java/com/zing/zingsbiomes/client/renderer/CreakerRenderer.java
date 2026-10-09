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
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import com.zing.zingsbiomes.entity.CreakerEntity;
import com.zing.zingsbiomes.client.model.Modelcreaker;

import com.mojang.blaze3d.vertex.PoseStack;

public class CreakerRenderer extends MobRenderer<CreakerEntity, LivingEntityRenderState, Modelcreaker> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/creaker.png");

	public CreakerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcreaker(context.bakeLayer(Modelcreaker.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<>(this) {
			final Identifier LAYER_TEXTURE = Identifier.parse("zings_biomes:textures/entities/creaker_glow.png");
			final RenderType RENDER_TYPE = RenderTypes.eyes(LAYER_TEXTURE);
			final EntityModel LAYER_MODEL = new Modelcreaker(Minecraft.getInstance().getEntityModels().bakeLayer(Modelcreaker.LAYER_LOCATION));

			@Override
			public void submit(PoseStack poseStack, SubmitNodeCollector submitNodeCollector, int light, LivingEntityRenderState state, float headYaw, float headPitch) {
				LAYER_MODEL.setupAnim(state);
				submitNodeCollector.submitModel(LAYER_MODEL, state, poseStack, RENDER_TYPE, light, OverlayTexture.NO_OVERLAY, state.outlineColor, null);
			}
		});
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CreakerEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}