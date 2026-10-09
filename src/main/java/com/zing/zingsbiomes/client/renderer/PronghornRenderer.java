package net.mcreator.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zingsbiomes.entity.PronghornEntity;
import net.mcreator.zingsbiomes.client.model.Modelpronghorn;

public class PronghornRenderer extends MobRenderer<PronghornEntity, LivingEntityRenderState, Modelpronghorn> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/pronghorn.png");

	public PronghornRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpronghorn(context.bakeLayer(Modelpronghorn.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(PronghornEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}