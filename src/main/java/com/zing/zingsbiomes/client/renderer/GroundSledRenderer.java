package net.mcreator.zingsbiomes.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.model.EntityModel;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.Entity;

public class GroundSledRenderer<T extends Entity, M extends EntityModel<EntityRenderState>> extends EntityRenderer<T, EntityRenderState> {
	private final M model;
	private final Identifier texture;

	public GroundSledRenderer(EntityRendererProvider.Context context, M model, Identifier texture) {
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
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(180.0F - state.yRot));
		poseStack.scale(2.0F, 2.0F, 2.0F);
		model.setupAnim(state);
		model.renderToBuffer(poseStack, bufferSource.getBuffer(model.renderType(texture)), packedLight, 0);
		poseStack.popPose();
		super.render(state, poseStack, bufferSource, packedLight);
	}
}
