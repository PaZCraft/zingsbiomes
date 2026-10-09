package com.zing.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.zing.zingsbiomes.entity.SeabunnyEntity;
import com.zing.zingsbiomes.client.model.Modelsea_bunny;

import com.mojang.blaze3d.vertex.PoseStack;

public class SeabunnyRenderer extends MobRenderer<SeabunnyEntity, LivingEntityRenderState, Modelsea_bunny> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/sea_bunny_white.png");

	public SeabunnyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsea_bunny(context.bakeLayer(Modelsea_bunny.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SeabunnyEntity entity, LivingEntityRenderState state, float partialTicks) {
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