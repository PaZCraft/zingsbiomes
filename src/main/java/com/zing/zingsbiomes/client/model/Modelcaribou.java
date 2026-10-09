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
import com.zing.zingsbiomes.client.renderer.CaribouRenderState;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcaribou extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_biomes", "modelcaribou"), "main");
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
	public final ModelPart saddle;
	public final ModelPart chest;

	public Modelcaribou(ModelPart root) {
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
		this.saddle = this.body.getChild("saddle");
		this.chest = this.body.getChild("chest");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -10.7857F, -7.0F, 8.0F, 7.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 21.7857F, 0.0F));
		PartDefinition mane = body.addOrReplaceChild("mane",
				CubeListBuilder.create().texOffs(0, 42).addBox(-3.0F, -5.25F, -3.75F, 6.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(68, 95).addBox(-3.5F, -5.25F, -11.75F, 7.0F, 7.0F, 11.0F, new CubeDeformation(0.1F)),
				PartPose.offset(0.0F, -6.5357F, -6.25F));
		PartDefinition head = mane.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(18, 42).addBox(-2.0F, -3.8333F, -4.0833F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(44, 9).addBox(-1.0F, -1.8333F, -7.0833F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-2.0F, -13.8333F, -3.0833F, 0.0F, 10.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 21).addBox(2.0F, -13.8333F, -3.0833F, 0.0F, 10.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(24, 66)
						.addBox(-2.5F, -3.8333F, -4.0833F, 5.0F, 14.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(52, 64).addBox(-1.5F, -1.8333F, -7.0833F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(74, 70)
						.addBox(1.5F, -1.8333F, -6.0833F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(109, 53).mirror().addBox(3.51F, -0.8333F, -4.0833F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(109, 53).mirror()
						.addBox(-3.49F, -0.8333F, -4.0833F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(84, 57).mirror().addBox(-3.5F, -3.8333F, 1.9167F, 7.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, -5.4167F, -2.6667F));
		PartDefinition bridle_r1 = head.addOrReplaceChild("bridle_r1", CubeListBuilder.create().texOffs(74, 70).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -0.8333F, -5.0833F, 0.0F, 3.1416F, 0.0F));
		PartDefinition left_ear = head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(44, 37).addBox(-3.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, -2.8333F, -1.0833F));
		PartDefinition right_ear = head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(44, 35).addBox(0.5F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, -2.8333F, -1.0833F));
		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(44, 30).addBox(-1.0F, -1.0F, 0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.7857F, 6.5F));
		PartDefinition front_left_leg = body.addOrReplaceChild("front_left_leg", CubeListBuilder.create().texOffs(44, 14).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, -3.7857F, -5.0F));
		PartDefinition front_right_leg = body.addOrReplaceChild("front_right_leg", CubeListBuilder.create().texOffs(44, 14).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, -3.7857F, -5.0F));
		PartDefinition back_left_leg = body.addOrReplaceChild("back_left_leg", CubeListBuilder.create().texOffs(36, 42).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -3.7857F, 5.5F));
		PartDefinition back_right_leg = body.addOrReplaceChild("back_right_leg", CubeListBuilder.create().texOffs(36, 42).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -3.7857F, 5.5F));
		PartDefinition saddle = body.addOrReplaceChild("saddle", CubeListBuilder.create().texOffs(16, 104).addBox(-4.5F, 2.2143F, -7.0F, 9.0F, 8.0F, 14.0F, new CubeDeformation(0.1F)), PartPose.offset(0.0F, -13.0F, 0.0F));
		PartDefinition chest = body.addOrReplaceChild("chest",
				CubeListBuilder.create().texOffs(109, -4).addBox(-5.0F, -11.0F, -4.0F, 0.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(107, 4).addBox(4.0F, -11.0F, -4.0F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(117, 4)
						.addBox(4.0F, -11.0F, 4.0F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(107, 4).addBox(4.0F, -3.0F, -4.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(108, 4)
						.addBox(4.0F, -11.0F, -4.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(108, 4).addBox(-5.0F, -11.0F, -4.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(107, 4)
						.addBox(-5.0F, -3.0F, -4.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(117, 4).addBox(-5.0F, -11.0F, 4.0F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(107, 4)
						.addBox(-5.0F, -11.0F, -4.0F, 1.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(109, -4).addBox(0.0F, -4.0F, -4.0F, 0.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -7.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(LivingEntityRenderState state) {
		this.saddle.visible = state instanceof CaribouRenderState caribouState && caribouState.saddled;
		this.chest.visible = state instanceof CaribouRenderState caribouState && caribouState.chested;
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.front_right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.back_right_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.back_left_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.front_left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}