package com.zing.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.zing.zingsbiomes.entity.DriftwoodSurfboardEntity;
import com.zing.zingsbiomes.client.model.Modelsurfboard;

public class DriftwoodSurfboardRenderer extends MobRenderer<DriftwoodSurfboardEntity, LivingEntityRenderState, Modelsurfboard> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/surfboard_driftwood.png");

	public DriftwoodSurfboardRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsurfboard(context.bakeLayer(Modelsurfboard.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(DriftwoodSurfboardEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}