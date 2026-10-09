package com.zing.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.zing.zingsbiomes.entity.EndWoodenBirdzingEntity;
import com.zing.zingsbiomes.client.model.Modelwooden_birdzing_end;

import com.mojang.blaze3d.vertex.PoseStack;

public class EndWoodenBirdzingRenderer extends MobRenderer<EndWoodenBirdzingEntity, LivingEntityRenderState, Modelwooden_birdzing_end> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/wooden_birdzing_chorus.png");

	public EndWoodenBirdzingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwooden_birdzing_end(context.bakeLayer(Modelwooden_birdzing_end.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(EndWoodenBirdzingEntity entity, LivingEntityRenderState state, float partialTicks) {
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