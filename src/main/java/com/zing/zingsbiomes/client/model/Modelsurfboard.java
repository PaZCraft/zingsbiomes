package com.zing.zingsbiomes.client.model;

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
public class Modelsurfboard extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_biomes", "modelsurfboard"), "main");
	public final ModelPart base;

	public Modelsurfboard(ModelPart root) {
		super(root);
		this.base = root.getChild("base");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition base = partdefinition.addOrReplaceChild("base",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -0.9F, -19.9F, 10.0F, 1.0F, 29.0F, new CubeDeformation(0.0F)).texOffs(0, 35).addBox(1.0F, -0.9F, 9.1F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 35)
						.addBox(-5.0F, -0.9F, 9.1F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 30).addBox(-2.0F, 0.1F, 6.1F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(-4.0F, -0.9F, -23.9F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 23.9F, 3.9F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}