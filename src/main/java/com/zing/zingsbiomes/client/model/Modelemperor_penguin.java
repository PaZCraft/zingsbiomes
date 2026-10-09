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
public class Modelemperor_penguin extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_biomes", "modelemperor_penguin"), "main");
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart left_flipper;
	public final ModelPart right_flipper;
	public final ModelPart left_foot;
	public final ModelPart right_foot;

	public Modelemperor_penguin(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.head = this.body.getChild("head");
		this.left_flipper = this.body.getChild("left_flipper");
		this.right_flipper = this.body.getChild("right_flipper");
		this.left_foot = this.body.getChild("left_foot");
		this.right_foot = this.body.getChild("right_foot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -6.0714F, -3.25F, 8.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(28, 0).addBox(-1.0F, 1.9286F, 2.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 16.0714F, 0.25F));
		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 18).addBox(-2.0F, -4.5F, -2.25F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(26, 18).addBox(-1.0F, -4.5F, -5.25F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.5714F, -1.0F));
		PartDefinition left_flipper = body.addOrReplaceChild("left_flipper", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.5F, -4.0714F, -0.25F));
		PartDefinition right_flipper = body.addOrReplaceChild("right_flipper", CubeListBuilder.create().texOffs(16, 18).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.5F, -4.0714F, -0.25F));
		PartDefinition left_foot = body.addOrReplaceChild("left_foot",
				CubeListBuilder.create().texOffs(10, 26).addBox(-0.5F, 0.5F, 0.75F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(26, 26).addBox(-1.5F, 2.5F, -2.25F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 5.4286F, -1.0F));
		PartDefinition right_foot = body.addOrReplaceChild("right_foot",
				CubeListBuilder.create().texOffs(12, 26).addBox(-0.5F, 0.5F, 0.75F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(26, 23).addBox(-1.5F, 2.5F, -2.25F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, 5.4286F, -1.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.right_foot.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.left_foot.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}