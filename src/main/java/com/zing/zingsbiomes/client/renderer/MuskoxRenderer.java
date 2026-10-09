package com.zing.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.zing.zingsbiomes.entity.MuskoxEntity;
import com.zing.zingsbiomes.client.model.Modelmuskox;

import com.mojang.blaze3d.vertex.PoseStack;

public class MuskoxRenderer extends MobRenderer<MuskoxEntity, LivingEntityRenderState, Modelmuskox> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/muskox.png");

	public MuskoxRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmuskox(context.bakeLayer(Modelmuskox.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(MuskoxEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(2f, 2f, 2f);
		poseStack.scale(state.ageScale, state.ageScale, state.ageScale);
	}
}