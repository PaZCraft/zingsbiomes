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
public class Modelkoi extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_biomes", "modelkoi"), "main");
	public final ModelPart body_front;
	public final ModelPart fin_left;
	public final ModelPart fin_left2;
	public final ModelPart fin_right;
	public final ModelPart fin_right2;
	public final ModelPart head;
	public final ModelPart body_back;
	public final ModelPart fin_bottom_1;
	public final ModelPart fin_back_2;
	public final ModelPart tail;

	public Modelkoi(ModelPart root) {
		super(root);
		this.body_front = root.getChild("body_front");
		this.fin_left = this.body_front.getChild("fin_left");
		this.fin_left2 = this.body_front.getChild("fin_left2");
		this.fin_right = this.body_front.getChild("fin_right");
		this.fin_right2 = this.body_front.getChild("fin_right2");
		this.head = this.body_front.getChild("head");
		this.body_back = this.body_front.getChild("body_back");
		this.fin_bottom_1 = this.body_back.getChild("fin_bottom_1");
		this.fin_back_2 = this.body_back.getChild("fin_back_2");
		this.tail = this.body_back.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body_front = partdefinition.addOrReplaceChild("body_front", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 21.5F, -8.0F));
		PartDefinition fin_left = body_front.addOrReplaceChild("fin_left", CubeListBuilder.create().texOffs(0, 26).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 1.5F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition fin_left2 = body_front.addOrReplaceChild("fin_left2", CubeListBuilder.create().texOffs(0, 29).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 2.5F, 5.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition fin_right = body_front.addOrReplaceChild("fin_right", CubeListBuilder.create().texOffs(10, 26).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 1.5F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition fin_right2 = body_front.addOrReplaceChild("fin_right2", CubeListBuilder.create().texOffs(10, 29).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 2.5F, 5.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition head = body_front.addOrReplaceChild("head", CubeListBuilder.create().texOffs(22, 21).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 26)
				.addBox(-2.0F, 1.0F, -3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 27).addBox(1.0F, 1.0F, -3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition body_back = body_front.addOrReplaceChild("body_back", CubeListBuilder.create().texOffs(0, 13).addBox(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 8.0F));
		PartDefinition fin_bottom_1 = body_back.addOrReplaceChild("fin_bottom_1", CubeListBuilder.create(), PartPose.offset(-0.2071F, 2.2071F, 5.5F));
		PartDefinition fin_right_r1 = fin_bottom_1.addOrReplaceChild("fin_right_r1", CubeListBuilder.create().texOffs(20, 28).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition fin_back_2 = body_back.addOrReplaceChild("fin_back_2", CubeListBuilder.create().texOffs(22, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.5F, -1.0F));
		PartDefinition tail = body_back.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(22, 10).addBox(0.0F, -2.5F, 0.0F, 0.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 8.0F));
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