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
public class Modelseaghast extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_biomes", "modelseaghast"), "main");
	public final ModelPart body;
	public final ModelPart tentacle1;
	public final ModelPart tentacle2;
	public final ModelPart tentacle3;
	public final ModelPart tentacle4;
	public final ModelPart tentacle5;
	public final ModelPart tentacle6;
	public final ModelPart tentacle7;
	public final ModelPart tentacle8;
	public final ModelPart tentacle9;

	public Modelseaghast(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.tentacle1 = this.body.getChild("tentacle1");
		this.tentacle2 = this.body.getChild("tentacle2");
		this.tentacle3 = this.body.getChild("tentacle3");
		this.tentacle4 = this.body.getChild("tentacle4");
		this.tentacle5 = this.body.getChild("tentacle5");
		this.tentacle6 = this.body.getChild("tentacle6");
		this.tentacle7 = this.body.getChild("tentacle7");
		this.tentacle8 = this.body.getChild("tentacle8");
		this.tentacle9 = this.body.getChild("tentacle9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 16.0F, 0.0F));
		PartDefinition tentacle1 = body.addOrReplaceChild("tentacle1", CubeListBuilder.create().texOffs(40, 44).addBox(-1.0F, 13.0F, 7.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7F, 7.0F, -5.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition tentacle2 = body.addOrReplaceChild("tentacle2", CubeListBuilder.create().texOffs(40, 44).addBox(3.0F, 13.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3F, 7.0F, -5.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition tentacle3 = body.addOrReplaceChild("tentacle3", CubeListBuilder.create().texOffs(40, 44).addBox(-6.0F, -26.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3F, 7.0F, -5.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition tentacle4 = body.addOrReplaceChild("tentacle4", CubeListBuilder.create().texOffs(40, 44).addBox(-1.0F, 8.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.3F, 7.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition tentacle5 = body.addOrReplaceChild("tentacle5", CubeListBuilder.create().texOffs(40, 44).addBox(-1.0F, 8.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3F, 7.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition tentacle6 = body.addOrReplaceChild("tentacle6", CubeListBuilder.create().texOffs(40, 44).addBox(-1.0F, 8.0F, 2.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7F, 7.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition tentacle7 = body.addOrReplaceChild("tentacle7", CubeListBuilder.create().texOffs(40, 44).addBox(-1.0F, 0.0F, 3.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7F, 7.0F, 5.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition tentacle8 = body.addOrReplaceChild("tentacle8", CubeListBuilder.create().texOffs(40, 44).addBox(4.0F, 0.0F, 6.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3F, 7.0F, 5.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition tentacle9 = body.addOrReplaceChild("tentacle9", CubeListBuilder.create().texOffs(40, 44).addBox(-6.0F, 3.0F, 10.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3F, 7.0F, 5.0F, 1.5708F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}