package com.zing.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.zing.zingsbiomes.entity.EmberWitherEntity;
import com.zing.zingsbiomes.client.model.Modelember_wither;

public class EmberWitherRenderer extends MobRenderer<EmberWitherEntity, LivingEntityRenderState, Modelember_wither> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/ember_wither.png");

	public EmberWitherRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelember_wither(context.bakeLayer(Modelember_wither.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(EmberWitherEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}