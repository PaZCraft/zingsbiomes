package net.mcreator.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.monster.silverfish.SilverfishModel;
import net.minecraft.client.model.geom.ModelLayers;

import net.mcreator.zingsbiomes.entity.CrystalfishEntity;

public class CrystalfishRenderer extends MobRenderer<CrystalfishEntity, LivingEntityRenderState, SilverfishModel> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/crystalfish.png");

	public CrystalfishRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel(context.bakeLayer(ModelLayers.SILVERFISH)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CrystalfishEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}