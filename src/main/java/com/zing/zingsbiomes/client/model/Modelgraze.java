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
public class Modelgraze extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_biomes", "modelgraze"), "main");
	public final ModelPart head;
	public final ModelPart rods;
	public final ModelPart rod_1;
	public final ModelPart rotation_2;
	public final ModelPart rod_2;
	public final ModelPart rotation_3;
	public final ModelPart rod_3;
	public final ModelPart body;

	public Modelgraze(ModelPart root) {
		super(root);
		this.head = root.getChild("head");
		this.rods = root.getChild("rods");
		this.rod_1 = this.rods.getChild("rod_1");
		this.rotation_2 = this.rods.getChild("rotation_2");
		this.rod_2 = this.rotation_2.getChild("rod_2");
		this.rotation_3 = this.rods.getChild("rotation_3");
		this.rod_3 = this.rotation_3.getChild("rod_3");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 2.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 13.0F, 0.0F));
		PartDefinition rods = partdefinition.addOrReplaceChild("rods", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, 0.0F));
		PartDefinition rod_1 = rods.addOrReplaceChild("rod_1", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -12.9343F, 2.3576F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition rotation_2 = rods.addOrReplaceChild("rotation_2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, -3.1416F, 1.0472F, -3.1416F));
		PartDefinition rod_2 = rotation_2.addOrReplaceChild("rod_2", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -12.9343F, 2.3576F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition rotation_3 = rods.addOrReplaceChild("rotation_3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, -3.1416F, -1.0472F, 3.1416F));
		PartDefinition rod_3 = rotation_3.addOrReplaceChild("rod_3", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -12.9343F, 2.3576F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
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