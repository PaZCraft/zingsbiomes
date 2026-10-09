package com.zing.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.zing.zingsbiomes.entity.FireSalamanderEntity;
import com.zing.zingsbiomes.client.model.Modelfire_salamander;

import com.mojang.blaze3d.vertex.PoseStack;

public class FireSalamanderRenderer extends MobRenderer<FireSalamanderEntity, LivingEntityRenderState, Modelfire_salamander> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/fire_salamander_yellow.png");

	public FireSalamanderRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfire_salamander(context.bakeLayer(Modelfire_salamander.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(FireSalamanderEntity entity, LivingEntityRenderState state, float partialTicks) {
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