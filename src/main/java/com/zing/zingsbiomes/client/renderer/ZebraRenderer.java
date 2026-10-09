package com.zing.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.zing.zingsbiomes.entity.ZebraEntity;
import com.zing.zingsbiomes.client.model.Modelzebra;

import com.mojang.blaze3d.vertex.PoseStack;

public class ZebraRenderer extends MobRenderer<ZebraEntity, LivingEntityRenderState, Modelzebra> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/zebra.png");

	public ZebraRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelzebra(context.bakeLayer(Modelzebra.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ZebraEntity entity, LivingEntityRenderState state, float partialTicks) {
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