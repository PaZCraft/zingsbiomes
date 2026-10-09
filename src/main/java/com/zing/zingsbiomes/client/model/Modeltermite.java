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

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeltermite extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_biomes", "modeltermite"), "main");
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart left_antenna;
	public final ModelPart right_antenna;
	public final ModelPart front_left_leg;
	public final ModelPart front_right_leg;
	public final ModelPart mid_left_leg;
	public final ModelPart mid_right_leg;
	public final ModelPart back_left_leg;
	public final ModelPart back_right_leg;

	public Modeltermite(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.head = this.body.getChild("head");
		this.left_antenna = this.head.getChild("left_antenna");
		this.right_antenna = this.head.getChild("right_antenna");
		this.front_left_leg = this.body.getChild("front_left_leg");
		this.front_right_leg = this.body.getChild("front_right_leg");
		this.mid_left_leg = this.body.getChild("mid_left_leg");
		this.mid_right_leg = this.body.getChild("mid_right_leg");
		this.back_left_leg = this.body.getChild("back_left_leg");
		this.back_right_leg = this.body.getChild("back_right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -6.0F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 14).addBox(-2.0F, -2.5F, -4.3333F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.5F, -5.6667F));
		PartDefinition left_antenna = head.addOrReplaceChild("left_antenna", CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, -8.0F, -10.0F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.5F, 5.6667F));
		PartDefinition right_antenna = head.addOrReplaceChild("right_antenna", CubeListBuilder.create().texOffs(0, 21).addBox(1.0F, -8.0F, -10.0F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.5F, 5.6667F));
		PartDefinition front_left_leg = body.addOrReplaceChild("front_left_leg", CubeListBuilder.create(), PartPose.offset(-3.301F, -1.248F, -5.0F));
		PartDefinition cube_r1 = front_left_leg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(6, 21).addBox(-3.0F, -2.0F, -1.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.301F, 1.248F, 1.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition front_right_leg = body.addOrReplaceChild("front_right_leg", CubeListBuilder.create(), PartPose.offset(-2.0F, 0.0F, 0.0F));
		PartDefinition cube_r2 = front_right_leg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(22, 14).addBox(-3.0F, -2.0F, -1.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.7994F, 0.0F, -2.1165F, 0.0F, 0.0F, 0.2182F));
		PartDefinition mid_left_leg = body.addOrReplaceChild("mid_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r3 = mid_left_leg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(6, 22).addBox(-3.0F, -2.0F, -1.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition mid_right_leg = body.addOrReplaceChild("mid_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r4 = mid_right_leg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(22, 15).addBox(-3.0F, -2.0F, -1.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition back_left_leg = body.addOrReplaceChild("back_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r5 = back_left_leg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(14, 22).addBox(-3.0F, -2.0F, -1.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 5.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition back_right_leg = body.addOrReplaceChild("back_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r6 = back_right_leg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(22, 16).addBox(-3.0F, -2.0F, -1.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.2182F));
		return LayerDefinition.create(meshdefinition, 32, 32);
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