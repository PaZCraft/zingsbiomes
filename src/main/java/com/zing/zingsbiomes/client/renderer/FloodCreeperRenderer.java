package com.zing.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.CreeperRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.monster.creeper.CreeperModel;
import net.minecraft.client.model.geom.ModelLayers;

import com.zing.zingsbiomes.entity.FloodCreeperEntity;

public class FloodCreeperRenderer extends MobRenderer<FloodCreeperEntity, CreeperRenderState, CreeperModel> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/flood_creeper_mob.png");

	public FloodCreeperRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public CreeperRenderState createRenderState() {
		return new CreeperRenderState();
	}

	@Override
	public void extractRenderState(FloodCreeperEntity entity, CreeperRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(CreeperRenderState state) {
		return entityTexture;
	}
}