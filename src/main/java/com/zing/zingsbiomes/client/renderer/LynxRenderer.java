package net.mcreator.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zingsbiomes.entity.LynxEntity;
import net.mcreator.zingsbiomes.client.model.Modellynx;

import com.mojang.blaze3d.vertex.PoseStack;

public class LynxRenderer extends MobRenderer<LynxEntity, LivingEntityRenderState, Modellynx> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/lynx.png");

	public LynxRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellynx(context.bakeLayer(Modellynx.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(LynxEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(1.5f, 1.5f, 1.5f);
		poseStack.scale(state.ageScale, state.ageScale, state.ageScale);
	}
}