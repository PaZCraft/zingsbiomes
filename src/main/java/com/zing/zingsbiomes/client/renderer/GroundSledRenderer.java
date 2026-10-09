package com.zing.zingsbiomes.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.model.EntityModel;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.Entity;
import org.joml.Matrix4f;

public class GroundSledRenderer<T extends Entity, M extends EntityModel<EntityRenderState>> extends EntityRenderer<T, GroundSledRenderState> {
	private final M model;
	private final Identifier texture;

	public GroundSledRenderer(EntityRendererProvider.Context context, M model, Identifier texture) {
		super(context);
		this.model = model;
		this.texture = texture;
	}

	@Override
	public void submit(GroundSledRenderState state, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, CameraRenderState camera) {
		poseStack.pushPose();
		poseStack.mulPose(new Matrix4f().rotate(Axis.YP.rotationDegrees(180.0F - state.yRot)));
		poseStack.scale(2.0F, 2.0F, 2.0F);
		model.setupAnim(state);
		submitNodeCollector.submitModel(model, state, poseStack, model.renderType(texture), state.lightCoords, 0, state.outlineColor);
		poseStack.popPose();
		super.submit(state, poseStack, submitNodeCollector, camera);
	}

	@Override
	public GroundSledRenderState createRenderState() {
		return new GroundSledRenderState();
	}

	@Override
	public void extractRenderState(T entity, GroundSledRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		state.yRot = entity.getYRot(partialTicks);
	}
}
