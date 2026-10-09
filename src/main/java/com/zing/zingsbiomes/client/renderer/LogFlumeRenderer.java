package com.zing.zingsbiomes.client.renderer;

import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.resources.Identifier;

import com.zing.zingsbiomes.client.model.Modellog_flume;
import net.minecraft.world.entity.vehicle.boat.Boat;
import com.mojang.blaze3d.vertex.PoseStack;

public class LogFlumeRenderer<T extends Boat> extends EntityRenderer<T, EntityRenderState> {
	private final Modellog_flume model;
	private final Identifier texture;

	public LogFlumeRenderer(EntityRendererProvider.Context context, Modellog_flume model, Identifier texture) {
		super(context);
		this.model = model;
		this.texture = texture;
	}

	@Override
	public EntityRenderState createRenderState() {
		return new EntityRenderState();
	}

	@Override
	public void submit(EntityRenderState state, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, CameraRenderState camera) {
		super.submit(state, poseStack, submitNodeCollector, camera);
		poseStack.pushPose();
		poseStack.scale(1.05F, 1.05F, 1.05F);
		model.setupAnim(state);
		submitNodeCollector.submitModel(model, state, poseStack, model.renderType(texture), state.lightCoords, 0, state.outlineColor);
		poseStack.popPose();
	}
}
