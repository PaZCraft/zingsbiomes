package com.zing.zingsbiomes.client.renderer;

import org.joml.Matrix4f;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.SubmitNodeCollector;

import com.zing.zingsbiomes.entity.BomberryBlueEntity;
import com.zing.zingsbiomes.client.model.Modelbomberry;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.PoseStack;

public class BomberryBlueRenderer extends EntityRenderer<BomberryBlueEntity, LivingEntityRenderState> {
	private static final Identifier texture = Identifier.parse("zings_biomes:textures/entities/bomberry_blue.png");
	private final Modelbomberry model;

	public BomberryBlueRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelbomberry(context.bakeLayer(Modelbomberry.LAYER_LOCATION));
	}

	@Override
	public void submit(LivingEntityRenderState state, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, CameraRenderState camera) {
		poseStack.pushPose();
		poseStack.mulPose(new Matrix4f().rotate(Axis.YP.rotationDegrees(state.yRot - 90)));
		poseStack.mulPose(new Matrix4f().rotate(Axis.ZP.rotationDegrees(90 + state.xRot)));
		model.setupAnim(state);
		submitNodeCollector.submitModel(this.model, state, poseStack, texture, state.lightCoords, OverlayTexture.NO_OVERLAY, state.outlineColor);
		poseStack.popPose();
		super.submit(state, poseStack, submitNodeCollector, camera);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BomberryBlueEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		state.xRot = entity.getXRot(partialTicks);
		state.yRot = entity.getYRot(partialTicks);
	}
}