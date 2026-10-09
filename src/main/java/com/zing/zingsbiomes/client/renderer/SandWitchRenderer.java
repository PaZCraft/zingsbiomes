package com.zing.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.zing.zingsbiomes.entity.SandWitchEntity;
import com.zing.zingsbiomes.client.model.Modelwitch;

public class SandWitchRenderer extends MobRenderer<SandWitchEntity, LivingEntityRenderState, Modelwitch> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/sand_witch.png");

	public SandWitchRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwitch(context.bakeLayer(Modelwitch.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SandWitchEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}