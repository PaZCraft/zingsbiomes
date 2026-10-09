package net.mcreator.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zingsbiomes.entity.PrarieDogEntity;
import net.mcreator.zingsbiomes.client.model.Modelprarie_dog;

import com.mojang.blaze3d.vertex.PoseStack;

public class PrarieDogRenderer extends MobRenderer<PrarieDogEntity, LivingEntityRenderState, Modelprarie_dog> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/prarie_dog.png");

	public PrarieDogRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelprarie_dog(context.bakeLayer(Modelprarie_dog.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(PrarieDogEntity entity, LivingEntityRenderState state, float partialTicks) {
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