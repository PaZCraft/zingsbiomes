package com.zing.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.zing.zingsbiomes.entity.OstrichEntity;
import com.zing.zingsbiomes.client.model.Modelostrich;

import com.mojang.blaze3d.vertex.PoseStack;

public class OstrichRenderer extends MobRenderer<OstrichEntity, LivingEntityRenderState, Modelostrich> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/ostrich.png");

	public OstrichRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelostrich(context.bakeLayer(Modelostrich.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(OstrichEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(state.ageScale, state.ageScale, state.ageScale);
	}
}