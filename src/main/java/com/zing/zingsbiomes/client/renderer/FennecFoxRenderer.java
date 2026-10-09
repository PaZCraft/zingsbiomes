package com.zing.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.zing.zingsbiomes.entity.FennecFoxEntity;
import com.zing.zingsbiomes.client.model.Modelfennec_fox;

import com.mojang.blaze3d.vertex.PoseStack;

public class FennecFoxRenderer extends MobRenderer<FennecFoxEntity, LivingEntityRenderState, Modelfennec_fox> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/fennec_fox.png");

	public FennecFoxRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfennec_fox(context.bakeLayer(Modelfennec_fox.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(FennecFoxEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(0.7f, 0.7f, 0.7f);
		poseStack.scale(state.ageScale, state.ageScale, state.ageScale);
	}
}