package com.zing.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.zing.zingsbiomes.entity.StarfishEntity;
import com.zing.zingsbiomes.client.model.Modelstarfish;

public class StarfishRenderer extends MobRenderer<StarfishEntity, LivingEntityRenderState, Modelstarfish> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/starfish_orange.png");

	public StarfishRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelstarfish(context.bakeLayer(Modelstarfish.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(StarfishEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}