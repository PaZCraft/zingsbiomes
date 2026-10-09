package com.zing.zingsbiomes.client.model;

import net.minecraft.util.Mth;
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
public class Modelfire_salamander extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_biomes", "modelfire_salamander"), "main");
	public final ModelPart back_body;
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart eyes;
	public final ModelPart tongue;
	public final ModelPart left_arm;
	public final ModelPart right_arm;
	public final ModelPart left_leg;
	public final ModelPart right_leg;
	public final ModelPart tail;

	public Modelfire_salamander(ModelPart root) {
		super(root);
		this.back_body = root.getChild("back_body");
		this.body = this.back_body.getChild("body");
		this.head = this.body.getChild("head");
		this.eyes = this.head.getChild("eyes");
		this.tongue = this.head.getChild("tongue");
		this.left_arm = this.body.getChild("left_arm");
		this.right_arm = this.body.getChild("right_arm");
		this.left_leg = this.back_body.getChild("left_leg");
		this.right_leg = this.back_body.getChild("right_leg");
		this.tail = this.back_body.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition back_body = partdefinition.addOrReplaceChild("back_body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -6.0F, 5.0F, 6.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition body = back_body.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 4.0F));
		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(32, 19).addBox(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
				.addBox(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 31).addBox(-3.5F, 1.0F, -7.0F, 7.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, -1.0F));
		PartDefinition eyes = head.addOrReplaceChild("eyes",
				CubeListBuilder.create().texOffs(50, 51).addBox(-3.0F, -4.0F, -8.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(14, 52).addBox(1.0F, -4.0F, -8.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.5F, 0.0F, 2.0F));
		PartDefinition tongue = head.addOrReplaceChild("tongue", CubeListBuilder.create().texOffs(0, 42).addBox(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.9F, 2.0F));
		PartDefinition left_arm = body.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(26, 52).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 28).addBox(-4.0F, 3.01F, -5.0F, 8.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, -1.0F, -6.5F));
		PartDefinition right_arm = body.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(36, 52).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(43, 35).addBox(-4.0F, 3.01F, -5.0F, 8.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, -1.0F, -6.5F));
		PartDefinition left_leg = back_body.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(0, 49).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(33, 28).addBox(-2.0F, 3.01F, -4.0F, 8.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.5F, -3.0F, 18.0F));
		PartDefinition right_leg = back_body.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(50, 44).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(42, 35).addBox(-6.0F, 3.01F, -4.0F, 8.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.5F, -3.0F, 18.0F));
		PartDefinition tail = back_body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(22, 44).addBox(-2.0F, -6.0F, 19.0F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 44)
				.addBox(-1.0F, -5.0F, 22.0F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 56).addBox(0.0F, -4.0F, 27.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}