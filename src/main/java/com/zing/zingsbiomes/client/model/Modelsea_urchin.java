package net.mcreator.zingsbiomes.client.model;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelsea_urchin extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_biomes", "modelsea_urchin"), "main");
	public final ModelPart body;

	public Modelsea_urchin(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(15, 28).addBox(-2.0F, -6.0F, 0.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 28)
						.addBox(-2.0F, -6.0F, 2.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 28).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 28)
						.addBox(-2.0F, 2.0F, -2.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(15, 28).addBox(-2.0F, 2.0F, 0.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 28)
						.addBox(-2.0F, 2.0F, 2.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 28).addBox(-2.0F, -2.0F, 2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 28)
						.addBox(-2.0F, 0.0F, 2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 28).addBox(-2.0F, 2.0F, 2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 28)
						.addBox(-2.0F, 2.0F, -6.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 28).addBox(-2.0F, 0.0F, -6.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 28)
						.addBox(-2.0F, -2.0F, -6.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 14).addBox(2.0F, -2.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 15)
						.addBox(2.0F, 0.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 15).addBox(2.0F, 2.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 15)
						.addBox(-6.0F, 2.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 14).addBox(-6.0F, 0.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 14)
						.addBox(-6.0F, -2.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 18.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}