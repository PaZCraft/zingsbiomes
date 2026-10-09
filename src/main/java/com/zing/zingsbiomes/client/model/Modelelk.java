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
public class Modelelk extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_biomes", "modelelk"), "main");
	public final ModelPart body;
	public final ModelPart mane;
	public final ModelPart head;
	public final ModelPart left_ear;
	public final ModelPart right_ear;
	public final ModelPart tail;
	public final ModelPart front_left_leg;
	public final ModelPart front_right_leg;
	public final ModelPart back_left_leg;
	public final ModelPart back_right_leg;

	public Modelelk(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.mane = this.body.getChild("mane");
		this.head = this.mane.getChild("head");
		this.left_ear = this.head.getChild("left_ear");
		this.right_ear = this.head.getChild("right_ear");
		this.tail = this.body.getChild("tail");
		this.front_left_leg = this.body.getChild("front_left_leg");
		this.front_right_leg = this.body.getChild("front_right_leg");
		this.back_left_leg = this.body.getChild("back_left_leg");
		this.back_right_leg = this.body.getChild("back_right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -10.7857F, -7.0F, 8.0F, 7.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 21.7857F, 0.0F));
		PartDefinition mane = body.addOrReplaceChild("mane", CubeListBuilder.create().texOffs(36, 21).addBox(-3.0F, -5.25F, -3.75F, 6.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.5357F, -6.25F));
		PartDefinition head = mane.addOrReplaceChild(
				"head", CubeListBuilder.create().texOffs(36, 31).addBox(-2.0F, -3.8333F, -4.0833F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(32, 40).addBox(-1.0F, -1.8333F, -6.0833F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(0, 21).addBox(-2.0F, -13.8333F, -1.0833F, 0.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 21).addBox(2.0F, -13.8333F, -1.0833F, 0.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.4167F, -2.6667F));
		PartDefinition left_ear = head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(44, 0).addBox(-3.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, -2.8333F, -1.0833F));
		PartDefinition right_ear = head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(44, 2).addBox(0.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, -2.8333F, -1.0833F));
		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(40, 40).addBox(-1.0F, -1.0F, 0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.7857F, 6.5F));
		PartDefinition front_left_leg = body.addOrReplaceChild("front_left_leg", CubeListBuilder.create().texOffs(20, 40).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, -3.7857F, -5.0F));
		PartDefinition front_right_leg = body.addOrReplaceChild("front_right_leg", CubeListBuilder.create().texOffs(26, 40).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, -3.7857F, -5.0F));
		PartDefinition back_left_leg = body.addOrReplaceChild("back_left_leg", CubeListBuilder.create().texOffs(10, 40).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -3.7857F, 5.5F));
		PartDefinition back_right_leg = body.addOrReplaceChild("back_right_leg", CubeListBuilder.create().texOffs(0, 40).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -3.7857F, 5.5F));
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
	}
}