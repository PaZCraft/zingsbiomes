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
public class Modelchorus_snail extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_biomes", "modelchorus_snail"), "main");
	public final ModelPart body;
	public final ModelPart body2;
	public final ModelPart left_antenna;
	public final ModelPart right_antenna;

	public Modelchorus_snail(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.left_antenna = this.body2.getChild("left_antenna");
		this.right_antenna = this.body2.getChild("right_antenna");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -6.75F, -2.75F, 8.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 21.75F, 1.75F));
		PartDefinition body2 = body.addOrReplaceChild("body2",
				CubeListBuilder.create().texOffs(0, 18).addBox(-2.0F, -2.5F, -6.875F, 4.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(26, 18).addBox(-2.0F, 1.5F, -8.875F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.75F, -2.875F));
		PartDefinition left_antenna = body2.addOrReplaceChild("left_antenna", CubeListBuilder.create().texOffs(26, 20).addBox(-0.5F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, -2.5F, -5.875F));
		PartDefinition right_antenna = body2.addOrReplaceChild("right_antenna", CubeListBuilder.create().texOffs(26, 20).addBox(-0.5F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, -2.5F, -5.875F));
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