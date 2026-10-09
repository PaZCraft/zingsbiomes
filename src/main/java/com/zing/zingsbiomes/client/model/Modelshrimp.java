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
public class Modelshrimp extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_biomes", "modelshrimp"), "main");
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart left_antenna;
	public final ModelPart right_antenna;
	public final ModelPart leg1;
	public final ModelPart leg2;
	public final ModelPart leg3;
	public final ModelPart leg4;
	public final ModelPart leg5;
	public final ModelPart leg6;
	public final ModelPart leg7;
	public final ModelPart leg8;
	public final ModelPart leg9;
	public final ModelPart leg10;
	public final ModelPart abdomen1;
	public final ModelPart swimmeret1;
	public final ModelPart swimmeret2;
	public final ModelPart abdomen2;
	public final ModelPart swimmeret3;
	public final ModelPart swimmeret4;
	public final ModelPart abdomen3;
	public final ModelPart swimmeret5;
	public final ModelPart swimmeret6;
	public final ModelPart abdomen4;
	public final ModelPart swimmeret7;
	public final ModelPart swimmeret8;
	public final ModelPart abdomen5;
	public final ModelPart swimmeret9;
	public final ModelPart swimmeret10;
	public final ModelPart abdomen6;
	public final ModelPart tail;

	public Modelshrimp(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.head = this.body.getChild("head");
		this.left_antenna = this.head.getChild("left_antenna");
		this.right_antenna = this.head.getChild("right_antenna");
		this.leg1 = this.head.getChild("leg1");
		this.leg2 = this.head.getChild("leg2");
		this.leg3 = this.head.getChild("leg3");
		this.leg4 = this.head.getChild("leg4");
		this.leg5 = this.head.getChild("leg5");
		this.leg6 = this.head.getChild("leg6");
		this.leg7 = this.head.getChild("leg7");
		this.leg8 = this.head.getChild("leg8");
		this.leg9 = this.head.getChild("leg9");
		this.leg10 = this.head.getChild("leg10");
		this.abdomen1 = this.body.getChild("abdomen1");
		this.swimmeret1 = this.abdomen1.getChild("swimmeret1");
		this.swimmeret2 = this.abdomen1.getChild("swimmeret2");
		this.abdomen2 = this.abdomen1.getChild("abdomen2");
		this.swimmeret3 = this.abdomen2.getChild("swimmeret3");
		this.swimmeret4 = this.abdomen2.getChild("swimmeret4");
		this.abdomen3 = this.abdomen2.getChild("abdomen3");
		this.swimmeret5 = this.abdomen3.getChild("swimmeret5");
		this.swimmeret6 = this.abdomen3.getChild("swimmeret6");
		this.abdomen4 = this.abdomen3.getChild("abdomen4");
		this.swimmeret7 = this.abdomen4.getChild("swimmeret7");
		this.swimmeret8 = this.abdomen4.getChild("swimmeret8");
		this.abdomen5 = this.abdomen4.getChild("abdomen5");
		this.swimmeret9 = this.abdomen5.getChild("swimmeret9");
		this.swimmeret10 = this.abdomen5.getChild("swimmeret10");
		this.abdomen6 = this.abdomen4.getChild("abdomen6");
		this.tail = this.abdomen6.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 20.0F, -2.0F));
		PartDefinition head = body.addOrReplaceChild(
				"head", CubeListBuilder.create().texOffs(34, 0).addBox(-2.0F, -3.3125F, -4.9375F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(24, 40).addBox(2.0F, -2.3125F, -5.9375F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(26, 40).addBox(-2.0F, -2.3125F, -5.9375F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 37).addBox(-1.0F, -3.3125F, -9.9375F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -0.6875F, -2.0625F));
		PartDefinition left_antenna = head.addOrReplaceChild("left_antenna", CubeListBuilder.create().texOffs(24, 42).addBox(0.0F, -0.5F, -4.8333F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(0.0F, -4.5F, -4.8333F, 0.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(52, 0).addBox(0.0F, -3.5F, -4.8333F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -0.8125F, -5.1042F));
		PartDefinition right_antenna = head.addOrReplaceChild("right_antenna", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -4.5F, -4.8333F, 0.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(52, 0)
				.addBox(0.0F, -3.5F, -4.8333F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 42).addBox(0.0F, -0.5F, -4.8333F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -0.8125F, -5.1042F));
		PartDefinition leg1 = head.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(16, 46).addBox(-0.5F, -0.5F, -3.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 1.1875F, -3.4375F));
		PartDefinition leg2 = head.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(16, 46).addBox(-0.5F, -0.5F, -3.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 1.1875F, -3.4375F));
		PartDefinition leg3 = head.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(46, 37).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 0.6875F, -3.4375F));
		PartDefinition leg4 = head.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(46, 37).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 0.6875F, -3.4375F));
		PartDefinition leg5 = head.addOrReplaceChild("leg5", CubeListBuilder.create().texOffs(46, 37).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 0.6875F, -1.4375F));
		PartDefinition leg6 = head.addOrReplaceChild("leg6", CubeListBuilder.create().texOffs(46, 37).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 0.6875F, -1.4375F));
		PartDefinition leg7 = head.addOrReplaceChild("leg7", CubeListBuilder.create().texOffs(46, 37).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 0.6875F, 0.5625F));
		PartDefinition leg8 = head.addOrReplaceChild("leg8", CubeListBuilder.create().texOffs(46, 37).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 0.6875F, 0.5625F));
		PartDefinition leg9 = head.addOrReplaceChild("leg9", CubeListBuilder.create().texOffs(46, 37).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 0.6875F, -0.4375F));
		PartDefinition leg10 = head.addOrReplaceChild("leg10", CubeListBuilder.create().texOffs(46, 37).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 0.6875F, -0.4375F));
		PartDefinition abdomen1 = body.addOrReplaceChild("abdomen1", CubeListBuilder.create().texOffs(34, 16).addBox(-2.0F, -2.5F, 0.125F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.5F, -2.125F));
		PartDefinition swimmeret1 = abdomen1.addOrReplaceChild("swimmeret1", CubeListBuilder.create().texOffs(46, 38).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 0.0F, 1.625F));
		PartDefinition swimmeret2 = abdomen1.addOrReplaceChild("swimmeret2", CubeListBuilder.create().texOffs(46, 38).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 0.0F, 1.625F));
		PartDefinition abdomen2 = abdomen1.addOrReplaceChild("abdomen2", CubeListBuilder.create().texOffs(34, 16).addBox(-2.0F, -2.5F, 0.375F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.75F));
		PartDefinition swimmeret3 = abdomen2.addOrReplaceChild("swimmeret3", CubeListBuilder.create().texOffs(46, 38).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 0.0F, 1.875F));
		PartDefinition swimmeret4 = abdomen2.addOrReplaceChild("swimmeret4", CubeListBuilder.create().texOffs(46, 38).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 0.0F, 1.875F));
		PartDefinition abdomen3 = abdomen2.addOrReplaceChild("abdomen3", CubeListBuilder.create().texOffs(34, 16).addBox(-2.0F, -2.5F, 0.625F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.75F));
		PartDefinition swimmeret5 = abdomen3.addOrReplaceChild("swimmeret5", CubeListBuilder.create().texOffs(46, 38).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 0.0F, 2.125F));
		PartDefinition swimmeret6 = abdomen3.addOrReplaceChild("swimmeret6", CubeListBuilder.create().texOffs(46, 38).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 0.0F, 2.125F));
		PartDefinition abdomen4 = abdomen3.addOrReplaceChild("abdomen4", CubeListBuilder.create().texOffs(35, 17).addBox(-2.0F, -1.6F, 0.4F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.9F, 3.225F));
		PartDefinition swimmeret7 = abdomen4.addOrReplaceChild("swimmeret7", CubeListBuilder.create().texOffs(46, 38).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 0.9F, 1.9F));
		PartDefinition swimmeret8 = abdomen4.addOrReplaceChild("swimmeret8", CubeListBuilder.create().texOffs(46, 38).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 0.9F, 1.9F));
		PartDefinition abdomen5 = abdomen4.addOrReplaceChild("abdomen5", CubeListBuilder.create().texOffs(35, 17).addBox(-2.0F, -2.3333F, 0.6667F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.7333F, 1.7333F));
		PartDefinition swimmeret9 = abdomen5.addOrReplaceChild("swimmeret9", CubeListBuilder.create().texOffs(46, 38).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 0.1667F, 2.1667F));
		PartDefinition swimmeret10 = abdomen5.addOrReplaceChild("swimmeret10", CubeListBuilder.create().texOffs(46, 38).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 0.1667F, 2.1667F));
		PartDefinition abdomen6 = abdomen4.addOrReplaceChild("abdomen6", CubeListBuilder.create().texOffs(34, 9).addBox(-2.0F, -2.25F, 0.5F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.65F, 3.9F));
		PartDefinition tail = abdomen6.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(0, 36).addBox(-2.0F, -1.5F, 0.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 36).addBox(-2.0F, 1.5F, 0.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
						.addBox(2.0F, -1.5F, 0.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 46).addBox(-2.0F, -1.5F, 0.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -0.75F, 4.5F));
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