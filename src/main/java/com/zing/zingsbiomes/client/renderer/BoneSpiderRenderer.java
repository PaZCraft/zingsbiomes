package com.zing.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.monster.spider.SpiderModel;
import net.minecraft.client.model.geom.ModelLayers;

import com.zing.zingsbiomes.entity.BoneSpiderEntity;

public class BoneSpiderRenderer extends MobRenderer<BoneSpiderEntity, LivingEntityRenderState, SpiderModel> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/bone_spider.png");

	public BoneSpiderRenderer(EntityRendererProvider.Context context) {
		super(context, new SpiderModel(context.bakeLayer(ModelLayers.SPIDER)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BoneSpiderEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}