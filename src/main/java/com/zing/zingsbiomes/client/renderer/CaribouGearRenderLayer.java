package net.mcreator.zingsbiomes.client.renderer;

import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.resources.Identifier;

import net.mcreator.zingsbiomes.client.model.Modelcaribou;
import net.mcreator.zingsbiomes.client.model.Modelcaribou_armor;

import com.mojang.blaze3d.vertex.PoseStack;

public class CaribouGearRenderLayer<S extends LivingEntityRenderState> extends RenderLayer<S, Modelcaribou> {
	private final Modelcaribou_armor armorModel;

	public CaribouGearRenderLayer(MobRenderer<?, S, Modelcaribou> renderer, EntityModelSet modelSet) {
		super(renderer);
		this.armorModel = new Modelcaribou_armor(modelSet.bakeLayer(Modelcaribou_armor.LAYER_LOCATION));
	}

	@Override
	public void submit(PoseStack poseStack, SubmitNodeCollector collector, int light, S state, float headYaw, float headPitch) {
		if (!(state instanceof CaribouRenderState caribouState) || "none".equals(caribouState.armorType))
			return;

		String textureMaterial = switch (caribouState.armorType) {
			case "golden_caribou_armor" -> "gold";
			default -> caribouState.armorType.replace("_caribou_armor", "");
		};
		Identifier texture = Identifier.fromNamespaceAndPath("zings_biomes", "textures/entities/caribou_armor_" + textureMaterial + ".png");
		this.armorModel.setupAnim(state);
		collector.submitModel(this.armorModel, state, poseStack, RenderTypes.entityCutout(texture), light, LivingEntityRenderer.getOverlayCoords(state, 0), state.outlineColor, null);
	}
}
