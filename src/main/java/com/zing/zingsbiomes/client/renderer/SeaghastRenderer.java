package com.zing.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.zing.zingsbiomes.entity.SeaghastEntity;
import com.zing.zingsbiomes.client.model.Modelseaghast;

import com.mojang.blaze3d.vertex.PoseStack;

public class SeaghastRenderer extends MobRenderer<SeaghastEntity, LivingEntityRenderState, Modelseaghast> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/seaghast.png");

	public SeaghastRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelseaghast(context.bakeLayer(Modelseaghast.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SeaghastEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(2f, 2f, 2f);
	}
}