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
public class Modelladybug extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_biomes", "modelladybug"), "main");
	public final ModelPart body;
	public final ModelPart left_wing;
	public final ModelPart right_wing;
	public final ModelPart head;
	public final ModelPart front_left_leg;
	public final ModelPart front_right_leg;
	public final ModelPart middle_left_leg;
	public final ModelPart middle_right_leg;
	public final ModelPart back_left_leg;
	public final ModelPart back_right_leg;

	public Modelladybug(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.left_wing = this.body.getChild("left_wing");
		this.right_wing = this.body.getChild("right_wing");
		this.head = this.body.getChild("head");
		this.front_left_leg = this.head.getChild("front_left_leg");
		this.front_right_leg = this.head.getChild("front_right_leg");
		this.middle_left_leg = this.body.getChild("middle_left_leg");
		this.middle_right_leg = this.body.getChild("middle_right_leg");
		this.back_left_leg = this.body.getChild("back_left_leg");
		this.back_right_leg = this.body.getChild("back_right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 32).addBox(-2.0F, -0.9F, -4.9875F, 4.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.9F, -0.0125F));
		PartDefinition left_wing = body.addOrReplaceChild("left_wing", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -2.0F, -6.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.9F, 0.0125F));
		PartDefinition right_wing = body.addOrReplaceChild("right_wing", CubeListBuilder.create().texOffs(0, 16).addBox(0.0F, -2.0F, -6.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.9F, 0.0125F));
		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(32, 0).addBox(-3.0F, -1.7F, -2.9F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 22)
				.addBox(-1.0F, -0.7F, -4.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 6).addBox(-3.0F, -0.7F, -8.9F, 6.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.2F, -6.0875F));
		PartDefinition front_left_leg = head.addOrReplaceChild("front_left_leg", CubeListBuilder.create().texOffs(32, 10).addBox(-5.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 0.8F, -1.4F));
		PartDefinition front_right_leg = head.addOrReplaceChild("front_right_leg", CubeListBuilder.create().texOffs(32, 12).addBox(0.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 0.8F, -1.4F));
		PartDefinition middle_left_leg = body.addOrReplaceChild("middle_left_leg", CubeListBuilder.create().texOffs(32, 16).addBox(-5.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.5F, 0.6F, -0.4875F));
		PartDefinition middle_right_leg = body.addOrReplaceChild("middle_right_leg", CubeListBuilder.create().texOffs(32, 14).addBox(0.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.5F, 0.6F, -0.4875F));
		PartDefinition back_left_leg = body.addOrReplaceChild("back_left_leg", CubeListBuilder.create().texOffs(32, 20).addBox(-5.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.5F, 0.6F, 3.5125F));
		PartDefinition back_right_leg = body.addOrReplaceChild("back_right_leg", CubeListBuilder.create().texOffs(32, 18).addBox(0.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.5F, 0.6F, 3.5125F));
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