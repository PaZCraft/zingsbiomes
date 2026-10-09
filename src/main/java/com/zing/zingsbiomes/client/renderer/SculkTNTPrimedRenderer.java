package com.zing.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.zing.zingsbiomes.entity.SculkTNTPrimedEntity;
import com.zing.zingsbiomes.client.model.Modeltnt;

public class SculkTNTPrimedRenderer extends MobRenderer<SculkTNTPrimedEntity, LivingEntityRenderState, Modeltnt> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/tnt_sculk.png");

	public SculkTNTPrimedRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltnt(context.bakeLayer(Modeltnt.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SculkTNTPrimedEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}

	@Override
	protected boolean isShaking(LivingEntityRenderState state) {
		return true;
	}
}