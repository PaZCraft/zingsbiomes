package net.mcreator.zingsbiomes.client.model;

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
public class Modelostrich extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_biomes", "modelostrich"), "main");
	public final ModelPart body;
	public final ModelPart neck;
	public final ModelPart left_wing;
	public final ModelPart right_wing;
	public final ModelPart leg1;
	public final ModelPart leg2;
	public final ModelPart tail;
	public final ModelPart saddle;

	public Modelostrich(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.neck = this.body.getChild("neck");
		this.left_wing = this.body.getChild("left_wing");
		this.right_wing = this.body.getChild("right_wing");
		this.leg1 = this.body.getChild("leg1");
		this.leg2 = this.body.getChild("leg2");
		this.tail = this.body.getChild("tail");
		this.saddle = this.body.getChild("saddle");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -14.0F, -6.0F, 10.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 34).addBox(-4.0F, -13.0F, -9.0F, 8.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 20.0F, 0.0F));
		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(22, 34).addBox(-1.0F, -13.8333F, -3.1667F, 2.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 20)
				.addBox(-2.0F, -17.8333F, -4.1667F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 28).addBox(-2.0F, -14.8333F, -6.1667F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -10.1667F, -8.8333F));
		PartDefinition left_wing = body.addOrReplaceChild("left_wing", CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, 0.0F, -4.0F, 2.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -13.0F, 0.0F));
		PartDefinition right_wing = body.addOrReplaceChild("right_wing", CubeListBuilder.create().texOffs(20, 20).addBox(-1.0F, 0.0F, -4.0F, 2.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -13.0F, 0.0F));
		PartDefinition leg1 = body.addOrReplaceChild("leg1",
				CubeListBuilder.create().texOffs(0, 43).addBox(-1.0F, 0.5F, 0.5F, 2.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 43).addBox(-1.0F, 10.5F, -1.5F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, -6.5F, -0.5F));
		PartDefinition leg2 = body.addOrReplaceChild("leg2",
				CubeListBuilder.create().texOffs(0, 43).addBox(-1.0F, 0.5F, 0.5F, 2.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 43).addBox(-1.0F, 10.5F, -1.5F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, -6.5F, -0.5F));
		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(32, 34).addBox(-3.0F, -0.5F, 0.5F, 6.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -10.5F, 5.5F));
		PartDefinition saddle = body.addOrReplaceChild("saddle", CubeListBuilder.create().texOffs(25, 95).addBox(-5.0F, -8.0F, -9.0F, 10.0F, 9.0F, 9.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, -6.0F, 2.0F));
		return LayerDefinition.create(meshdefinition, 64, 128);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.leg1.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.neck.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.neck.xRot = headPitch / (180F / (float) Math.PI);
	}
}