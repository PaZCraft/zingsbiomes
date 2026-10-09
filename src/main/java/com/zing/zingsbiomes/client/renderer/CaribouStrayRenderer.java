package net.mcreator.zingsbiomes.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zingsbiomes.entity.CaribouStrayEntity;
import net.mcreator.zingsbiomes.client.model.Modelcaribou;

import com.mojang.blaze3d.vertex.PoseStack;

public class CaribouStrayRenderer extends MobRenderer<CaribouStrayEntity, LivingEntityRenderState, Modelcaribou> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/caribou_stray.png");

	public CaribouStrayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcaribou(context.bakeLayer(Modelcaribou.LAYER_LOCATION)), 0.5f);
		this.addLayer(new CaribouGearRenderLayer<>(this, context.getModelSet()));
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new CaribouRenderState();
	}

	@Override
	public void extractRenderState(CaribouStrayEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		CaribouRenderState caribouState = (CaribouRenderState) state;
		caribouState.saddled = entity.isCaribouSaddled();
		caribouState.chested = entity.hasCaribouChest();
		caribouState.armorType = entity.hasCaribouArmor() ? entity.getCaribouArmorType() : "none";
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(1.35f, 1.35f, 1.35f);
		poseStack.scale(state.ageScale, state.ageScale, state.ageScale);
	}
}