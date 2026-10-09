package net.mcreator.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zingsbiomes.entity.BaldWoodenBirdzingEntity;
import net.mcreator.zingsbiomes.client.model.Modelwooden_birdzing_woodland;

import com.mojang.blaze3d.vertex.PoseStack;

public class BaldWoodenBirdzingRenderer extends MobRenderer<BaldWoodenBirdzingEntity, LivingEntityRenderState, Modelwooden_birdzing_woodland> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/wooden_birdzing_driftwood_yellow.png");

	public BaldWoodenBirdzingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwooden_birdzing_woodland(context.bakeLayer(Modelwooden_birdzing_woodland.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BaldWoodenBirdzingEntity entity, LivingEntityRenderState state, float partialTicks) {
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