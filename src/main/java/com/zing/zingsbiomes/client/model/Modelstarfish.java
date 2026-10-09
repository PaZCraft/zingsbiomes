package net.mcreator.zingsbiomes.client.model;

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
public class Modelstarfish extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_biomes", "modelstarfish"), "main");
	public final ModelPart body;
	public final ModelPart tip1;
	public final ModelPart tip2;
	public final ModelPart tip3;
	public final ModelPart tip4;
	public final ModelPart tip5;

	public Modelstarfish(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.tip1 = this.body.getChild("tip1");
		this.tip2 = this.body.getChild("tip2");
		this.tip3 = this.body.getChild("tip3");
		this.tip4 = this.body.getChild("tip4");
		this.tip5 = this.body.getChild("tip5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 14).addBox(-2.0F, -0.8333F, -2.3333F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 23.8333F, -0.6667F));
		PartDefinition tip1 = body.addOrReplaceChild("tip1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.3333F, 1.6667F));
		PartDefinition tip2 = body.addOrReplaceChild("tip2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1667F, -0.3333F));
		PartDefinition cube_r1 = tip2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5F, 1.0F, 0.0F, -0.829F, 0.0F));
		PartDefinition tip3 = body.addOrReplaceChild("tip3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1667F, -0.3333F));
		PartDefinition cube_r2 = tip3.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5F, 1.0F, 0.0F, 0.829F, 0.0F));
		PartDefinition tip4 = body.addOrReplaceChild("tip4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1667F, -0.3333F));
		PartDefinition cube_r3 = tip4.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 0).addBox(-1.0F, -0.5F, -6.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -0.5F, -1.0F, 0.0F, 0.6545F, 0.0F));
		PartDefinition tip5 = body.addOrReplaceChild("tip5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1667F, -0.3333F));
		PartDefinition cube_r4 = tip5.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(16, 7).addBox(-1.0F, -0.5F, -6.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -0.5F, -1.0F, 0.0F, -0.6545F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}