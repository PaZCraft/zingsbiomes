package com.zing.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.zing.zingsbiomes.entity.SeaUrchinEntity;
import com.zing.zingsbiomes.client.model.Modelsea_urchin;

public class SeaUrchinRenderer extends MobRenderer<SeaUrchinEntity, LivingEntityRenderState, Modelsea_urchin> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/sea_urchin.png");

	public SeaUrchinRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsea_urchin(context.bakeLayer(Modelsea_urchin.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SeaUrchinEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}