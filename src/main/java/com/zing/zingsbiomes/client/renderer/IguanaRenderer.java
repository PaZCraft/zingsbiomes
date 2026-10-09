package com.zing.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.zing.zingsbiomes.entity.IguanaEntity;
import com.zing.zingsbiomes.client.model.Modeliguana;

import com.mojang.blaze3d.vertex.PoseStack;

public class IguanaRenderer extends MobRenderer<IguanaEntity, LivingEntityRenderState, Modeliguana> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/iguana.png");

	public IguanaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeliguana(context.bakeLayer(Modeliguana.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(IguanaEntity entity, LivingEntityRenderState state, float partialTicks) {
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