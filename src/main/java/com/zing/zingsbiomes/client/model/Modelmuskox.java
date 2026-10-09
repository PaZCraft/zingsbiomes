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
public class Modelmuskox extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_biomes", "modelmuskox"), "main");
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart leg1;
	public final ModelPart leg2;
	public final ModelPart leg3;
	public final ModelPart leg4;

	public Modelmuskox(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.head = this.body.getChild("head");
		this.leg1 = this.body.getChild("leg1");
		this.leg2 = this.body.getChild("leg2");
		this.leg3 = this.body.getChild("leg3");
		this.leg4 = this.body.getChild("leg4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 24).addBox(-7.0F, -18.0F, -7.0F, 14.0F, 14.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-7.0F, -16.0F, 3.0F, 14.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(48, 24)
						.addBox(-7.0F, -4.0F, -7.0F, 0.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(48, 24).addBox(7.0F, -4.0F, -7.0F, 0.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(52, 6)
						.addBox(-7.0F, -4.0F, -7.0F, 14.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(52, 6).addBox(-7.0F, -4.0F, 15.0F, 14.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(44, 48).addBox(-5.0F, -15.0F, -13.0F, 9.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(52, 10).addBox(-5.0F, -4.0F, -13.0F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(52, 10)
						.addBox(4.0F, -4.0F, -13.0F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(52, 18).addBox(-5.0F, -4.0F, -13.0F, 9.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(52, 0)
						.addBox(-5.0F, -17.0F, -11.0F, 9.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 72).addBox(-7.0F, -17.0F, -8.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 72)
						.addBox(4.0F, -17.0F, -8.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 20).addBox(6.0F, -11.0F, -8.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 22)
						.addBox(-9.0F, -11.0F, -8.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 20).addBox(-9.0F, -12.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 22)
						.addBox(7.0F, -12.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leg1 = body.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(44, 65).addBox(-6.0F, -4.0F, -4.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leg2 = body.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(44, 65).addBox(3.0F, -4.0F, -4.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leg3 = body.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(44, 65).addBox(-6.0F, -4.0F, 9.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leg4 = body.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(44, 65).addBox(3.0F, -4.0F, 9.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.leg1.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg4.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg3.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}