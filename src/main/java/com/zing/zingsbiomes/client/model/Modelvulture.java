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
public class Modelvulture extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_biomes", "modelvulture"), "main");
	public final ModelPart body;
	public final ModelPart neck;
	public final ModelPart head;
	public final ModelPart left_wing;
	public final ModelPart right_wing;
	public final ModelPart leg1;
	public final ModelPart leg2;
	public final ModelPart tail;

	public Modelvulture(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.neck = this.body.getChild("neck");
		this.head = this.neck.getChild("head");
		this.left_wing = this.body.getChild("left_wing");
		this.right_wing = this.body.getChild("right_wing");
		this.leg1 = this.body.getChild("leg1");
		this.leg2 = this.body.getChild("leg2");
		this.tail = this.body.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -5.1875F, -5.25F, 8.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 33).addBox(-3.0F, -6.1875F, -7.25F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.0211F, -0.5142F, -0.2618F, 0.0F, 0.0F));
		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(20, 38).addBox(-1.0F, -1.75F, -8.5F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.4375F, -1.75F));
		PartDefinition head = neck.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(36, 19).addBox(-2.0F, -2.5F, -0.25F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 27).addBox(-1.0F, -0.5F, -3.25F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.6868F, -10.6533F, 0.2618F, 0.0F, 0.0F));
		PartDefinition left_wing = body.addOrReplaceChild("left_wing", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.5F, -5.1875F, 0.75F));
		PartDefinition right_wing = body.addOrReplaceChild("right_wing", CubeListBuilder.create().texOffs(18, 19).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(4.5F, -5.1875F, 0.75F));
		PartDefinition leg1 = body.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offset(-2.3333F, 1.9939F, 2.4714F));
		PartDefinition cube_r1 = leg1.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(40, 12).addBox(0.0F, 2.0F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 6).addBox(0.0F, -1.0F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6667F, 2.8186F, 0.2786F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r2 = leg1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(32, 38).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3333F, 0.8186F, -0.7214F, 0.2618F, 0.0F, 0.0F));
		PartDefinition leg2 = body.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offset(2.3333F, 1.9939F, 2.4714F));
		PartDefinition cube_r3 = leg2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(40, 12).addBox(0.0F, 2.0F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 6).addBox(0.0F, -1.0F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3333F, 2.8186F, 0.2786F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r4 = leg2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(40, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3333F, 0.8186F, -0.7214F, 0.2618F, 0.0F, 0.0F));
		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(20, 33).addBox(-3.0F, -5.0F, 6.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.8125F, 0.75F));
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