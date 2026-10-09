package com.zing.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.zing.zingsbiomes.entity.EndCubeEntity;
import com.zing.zingsbiomes.client.model.Modelender_cube;

public class EndCubeRenderer extends MobRenderer<EndCubeEntity, LivingEntityRenderState, Modelender_cube> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/ender_cube.png");

	public EndCubeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelender_cube(context.bakeLayer(Modelender_cube.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(EndCubeEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}

	@Override
	protected boolean isBodyVisible(LivingEntityRenderState state) {
		return false;
	}
}