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
public class Modeldragonfly extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_biomes", "modeldragonfly"), "main");
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart leg1;
	public final ModelPart leg2;
	public final ModelPart leg3;
	public final ModelPart leg4;
	public final ModelPart leg5;
	public final ModelPart leg6;
	public final ModelPart upper_left_wing;
	public final ModelPart upper_right_wing;
	public final ModelPart lower_left_wing;
	public final ModelPart lower_right_wing;

	public Modeldragonfly(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.head = this.body.getChild("head");
		this.leg1 = this.body.getChild("leg1");
		this.leg2 = this.body.getChild("leg2");
		this.leg3 = this.body.getChild("leg3");
		this.leg4 = this.body.getChild("leg4");
		this.leg5 = this.body.getChild("leg5");
		this.leg6 = this.body.getChild("leg6");
		this.upper_left_wing = this.body.getChild("upper_left_wing");
		this.upper_right_wing = this.body.getChild("upper_right_wing");
		this.lower_left_wing = this.body.getChild("lower_left_wing");
		this.lower_right_wing = this.body.getChild("lower_right_wing");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(30, 27).addBox(-2.0F, -5.9643F, -6.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 33)
				.addBox(-2.0F, -3.9643F, -8.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, -4.9643F, -2.5F, 2.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.9643F, -0.5F));
		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 33).addBox(-2.0F, -3.0F, -4.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.9643F, -8.5F));
		PartDefinition leg1 = body.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(30, 35).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, -1.9643F, -7.5F));
		PartDefinition leg2 = body.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(30, 35).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, -1.9643F, -7.5F));
		PartDefinition leg3 = body.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(30, 35).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, -1.9643F, -5.5F));
		PartDefinition leg4 = body.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(30, 35).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, -1.9643F, -5.5F));
		PartDefinition leg5 = body.addOrReplaceChild("leg5", CubeListBuilder.create().texOffs(30, 35).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, -1.9643F, -2.5F));
		PartDefinition leg6 = body.addOrReplaceChild("leg6", CubeListBuilder.create().texOffs(30, 35).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, -1.9643F, -2.5F));
		PartDefinition upper_left_wing = body.addOrReplaceChild("upper_left_wing", CubeListBuilder.create().texOffs(0, 19).addBox(-14.0F, 0.0F, -2.0F, 14.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -5.9643F, -6.5F));
		PartDefinition upper_right_wing = body.addOrReplaceChild("upper_right_wing", CubeListBuilder.create().texOffs(0, 23).addBox(0.0F, 0.0F, -2.0F, 14.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -5.9643F, -6.5F));
		PartDefinition lower_left_wing = body.addOrReplaceChild("lower_left_wing", CubeListBuilder.create().texOffs(0, 27).addBox(-12.0F, 0.0F, -1.5F, 12.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -5.9643F, -2.0F));
		PartDefinition lower_right_wing = body.addOrReplaceChild("lower_right_wing", CubeListBuilder.create().texOffs(0, 30).addBox(0.0F, 0.0F, -1.5F, 12.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -5.9643F, -2.0F));
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