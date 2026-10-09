package net.mcreator.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zingsbiomes.entity.AzaleaWoodenBirdzingEntity;
import net.mcreator.zingsbiomes.client.model.Modelwooden_birdzing_azalea;

import com.mojang.blaze3d.vertex.PoseStack;

public class AzaleaWoodenBirdzingRenderer extends MobRenderer<AzaleaWoodenBirdzingEntity, LivingEntityRenderState, Modelwooden_birdzing_azalea> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/wooden_birdzing_azalea.png");

	public AzaleaWoodenBirdzingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwooden_birdzing_azalea(context.bakeLayer(Modelwooden_birdzing_azalea.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(AzaleaWoodenBirdzingEntity entity, LivingEntityRenderState state, float partialTicks) {
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