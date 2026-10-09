package net.mcreator.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zingsbiomes.entity.DuckEntity;
import net.mcreator.zingsbiomes.client.model.Modelduck;

import com.mojang.blaze3d.vertex.PoseStack;

public class DuckRenderer extends MobRenderer<DuckEntity, LivingEntityRenderState, Modelduck> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/duck.png");

	public DuckRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelduck(context.bakeLayer(Modelduck.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(DuckEntity entity, LivingEntityRenderState state, float partialTicks) {
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