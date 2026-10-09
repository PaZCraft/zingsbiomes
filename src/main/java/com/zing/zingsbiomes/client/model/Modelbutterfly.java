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
public class Modelbutterfly extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_biomes", "modelbutterfly"), "main");
	public final ModelPart body;
	public final ModelPart left_wing_upper;
	public final ModelPart right_wing_upper;
	public final ModelPart left_wing_lower;
	public final ModelPart right_wing_lower;
	public final ModelPart leg1;
	public final ModelPart leg2;
	public final ModelPart leg3;
	public final ModelPart leg4;
	public final ModelPart leg5;
	public final ModelPart leg6;
	public final ModelPart head;
	public final ModelPart left_antenna;
	public final ModelPart right_antenna;

	public Modelbutterfly(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.left_wing_upper = this.body.getChild("left_wing_upper");
		this.right_wing_upper = this.body.getChild("right_wing_upper");
		this.left_wing_lower = this.body.getChild("left_wing_lower");
		this.right_wing_lower = this.body.getChild("right_wing_lower");
		this.leg1 = this.body.getChild("leg1");
		this.leg2 = this.body.getChild("leg2");
		this.leg3 = this.body.getChild("leg3");
		this.leg4 = this.body.getChild("leg4");
		this.leg5 = this.body.getChild("leg5");
		this.leg6 = this.body.getChild("leg6");
		this.head = this.body.getChild("head");
		this.left_antenna = this.head.getChild("left_antenna");
		this.right_antenna = this.head.getChild("right_antenna");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 34).addBox(-2.3846F, -5.2692F, -1.8077F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(22, 34).addBox(-3.3846F, -5.2692F, -7.8077F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.3846F, 23.2692F, -0.1923F));
		PartDefinition left_wing_upper = body.addOrReplaceChild("left_wing_upper", CubeListBuilder.create().texOffs(0, 22).addBox(-16.0F, 0.0F, -3.0F, 14.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.3846F, -5.2692F, -4.8077F));
		PartDefinition right_wing_upper = body.addOrReplaceChild("right_wing_upper", CubeListBuilder.create().texOffs(0, 28).addBox(2.0F, 0.0F, -3.0F, 14.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.3846F, -5.2692F, -4.8077F));
		PartDefinition left_wing_lower = body.addOrReplaceChild("left_wing_lower", CubeListBuilder.create().texOffs(0, 11).addBox(-13.5F, 0.0F, -5.5F, 13.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8846F, -5.2692F, 3.6923F));
		PartDefinition right_wing_lower = body.addOrReplaceChild("right_wing_lower", CubeListBuilder.create().texOffs(0, 0).addBox(0.5F, 0.0F, -5.5F, 13.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.8846F, -5.2692F, 3.6923F));
		PartDefinition leg1 = body.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(22, 43).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.8846F, -3.2692F, -6.8077F));
		PartDefinition leg2 = body.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(22, 43).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.1154F, -3.2692F, -6.8077F));
		PartDefinition leg3 = body.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(22, 43).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.8846F, -3.2692F, -4.8077F));
		PartDefinition leg4 = body.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(22, 43).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.1154F, -3.2692F, -4.8077F));
		PartDefinition leg5 = body.addOrReplaceChild("leg5", CubeListBuilder.create().texOffs(22, 43).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.8846F, -3.2692F, -1.8077F));
		PartDefinition leg6 = body.addOrReplaceChild("leg6", CubeListBuilder.create().texOffs(22, 43).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.1154F, -3.2692F, -1.8077F));
		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(42, 36).addBox(-1.0F, -1.375F, -3.125F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(42, 42).addBox(0.0F, 0.625F, -4.125F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.3846F, -3.8942F, -7.6827F));
		PartDefinition left_antenna = head.addOrReplaceChild("left_antenna", CubeListBuilder.create().texOffs(40, 22).addBox(-1.0F, 0.0F, -6.5F, 4.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -1.375F, -3.625F));
		PartDefinition right_antenna = head.addOrReplaceChild("right_antenna", CubeListBuilder.create().texOffs(42, 29).addBox(-3.0F, 0.0F, -6.5F, 4.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -1.375F, -3.625F));
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