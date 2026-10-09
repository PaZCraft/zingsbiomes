package net.mcreator.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zingsbiomes.entity.TuffGolemEntity;
import net.mcreator.zingsbiomes.client.model.Modeltuff_golem;

public class TuffGolemRenderer extends MobRenderer<TuffGolemEntity, LivingEntityRenderState, Modeltuff_golem> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/tuff_golem.png");

	public TuffGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltuff_golem(context.bakeLayer(Modeltuff_golem.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(TuffGolemEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}