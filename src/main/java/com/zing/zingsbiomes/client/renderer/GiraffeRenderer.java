package net.mcreator.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zingsbiomes.entity.GiraffeEntity;
import net.mcreator.zingsbiomes.client.model.Modelgiraffe;

import com.mojang.blaze3d.vertex.PoseStack;

public class GiraffeRenderer extends MobRenderer<GiraffeEntity, LivingEntityRenderState, Modelgiraffe> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/giraffe.png");

	public GiraffeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgiraffe(context.bakeLayer(Modelgiraffe.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(GiraffeEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(3f, 3f, 3f);
		poseStack.scale(state.ageScale, state.ageScale, state.ageScale);
	}
}