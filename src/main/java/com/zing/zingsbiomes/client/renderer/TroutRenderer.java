package net.mcreator.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zingsbiomes.entity.TroutEntity;
import net.mcreator.zingsbiomes.client.model.Modeltrout;

public class TroutRenderer extends MobRenderer<TroutEntity, LivingEntityRenderState, Modeltrout> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/trout.png");

	public TroutRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltrout(context.bakeLayer(Modeltrout.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(TroutEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}