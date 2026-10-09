package net.mcreator.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zingsbiomes.entity.SpringtailEntity;
import net.mcreator.zingsbiomes.client.model.Modelspringtail;

public class SpringtailRenderer extends MobRenderer<SpringtailEntity, LivingEntityRenderState, Modelspringtail> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/springtail_pink.png");

	public SpringtailRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelspringtail(context.bakeLayer(Modelspringtail.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SpringtailEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}