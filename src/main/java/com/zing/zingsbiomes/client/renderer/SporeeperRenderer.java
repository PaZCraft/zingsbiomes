package net.mcreator.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zingsbiomes.entity.SporeeperEntity;
import net.mcreator.zingsbiomes.client.model.Modelsporeeper;

public class SporeeperRenderer extends MobRenderer<SporeeperEntity, LivingEntityRenderState, Modelsporeeper> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/sporeeper.png");

	public SporeeperRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsporeeper(context.bakeLayer(Modelsporeeper.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SporeeperEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}