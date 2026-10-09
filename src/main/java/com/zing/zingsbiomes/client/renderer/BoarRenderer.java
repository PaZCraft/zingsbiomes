package net.mcreator.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zingsbiomes.entity.BoarEntity;
import net.mcreator.zingsbiomes.client.model.Modelboar;

public class BoarRenderer extends MobRenderer<BoarEntity, LivingEntityRenderState, Modelboar> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/boar.png");

	public BoarRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboar(context.bakeLayer(Modelboar.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BoarEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}