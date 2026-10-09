package com.zing.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.zing.zingsbiomes.entity.WaterBuffaloEntity;
import com.zing.zingsbiomes.client.model.Modelwater_buffalo;

public class WaterBuffaloRenderer extends MobRenderer<WaterBuffaloEntity, LivingEntityRenderState, Modelwater_buffalo> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/water_buffalo_black.png");

	public WaterBuffaloRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwater_buffalo(context.bakeLayer(Modelwater_buffalo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(WaterBuffaloEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}