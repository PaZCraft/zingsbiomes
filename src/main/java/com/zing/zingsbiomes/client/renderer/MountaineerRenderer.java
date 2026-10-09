package com.zing.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.zing.zingsbiomes.entity.MountaineerEntity;
import com.zing.zingsbiomes.client.model.Modelmountaineer;

public class MountaineerRenderer extends MobRenderer<MountaineerEntity, LivingEntityRenderState, Modelmountaineer> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/mountaineer.png");

	public MountaineerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmountaineer(context.bakeLayer(Modelmountaineer.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(MountaineerEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}