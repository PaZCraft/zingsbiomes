package net.mcreator.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zingsbiomes.entity.BlackBearEntity;
import net.mcreator.zingsbiomes.client.model.Modelblack_bear;

import com.mojang.blaze3d.vertex.PoseStack;

public class BlackBearRenderer extends MobRenderer<BlackBearEntity, LivingEntityRenderState, Modelblack_bear> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/bear_black.png");

	public BlackBearRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelblack_bear(context.bakeLayer(Modelblack_bear.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BlackBearEntity entity, LivingEntityRenderState state, float partialTicks) {
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