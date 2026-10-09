package net.mcreator.zingsbiomes.client.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.resources.Identifier;

import net.mcreator.zingsbiomes.client.model.Modellog_flume;
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
	public Identifier getTextureLocation(EntityRenderState state) {
		return texture;
	}

	@Override
	public void render(EntityRenderState state, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {
		super.render(state, poseStack, bufferSource, packedLight);
		poseStack.pushPose();
		poseStack.scale(1.05F, 1.05F, 1.05F);
		model.setupAnim(state);
		model.renderToBuffer(poseStack, bufferSource.getBuffer(model.renderType(texture)), packedLight, 0);
		poseStack.popPose();
	}
}
