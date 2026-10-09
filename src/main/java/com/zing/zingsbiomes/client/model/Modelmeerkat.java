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
public class Modelmeerkat extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_biomes", "modelmeerkat"), "main");
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart upper_left;
	public final ModelPart upper_right;
	public final ModelPart lower_left;
	public final ModelPart lower_right;
	public final ModelPart lower_tail;
	public final ModelPart tail;

	public Modelmeerkat(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.head = this.body.getChild("head");
		this.upper_left = this.body.getChild("upper_left");
		this.upper_right = this.body.getChild("upper_right");
		this.lower_left = this.body.getChild("lower_left");
		this.lower_right = this.body.getChild("lower_right");
		this.lower_tail = this.body.getChild("lower_tail");
		this.tail = this.lower_tail.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -4.0F, -7.0F, 4.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 21.0F, 0.0F));
		PartDefinition head = body
				.addOrReplaceChild(
						"head", CubeListBuilder.create().texOffs(0, 18).addBox(-2.0F, -2.25F, -4.625F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 26).addBox(-2.0F, -0.25F, -5.625F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
								.texOffs(26, 29).addBox(2.0F, -1.25F, -2.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 30).addBox(-3.0F, -1.25F, -2.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, -1.75F, -6.375F));
		PartDefinition upper_left = body.addOrReplaceChild("upper_left", CubeListBuilder.create().texOffs(26, 25).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, -0.5F, -5.5F));
		PartDefinition upper_right = body.addOrReplaceChild("upper_right", CubeListBuilder.create().texOffs(26, 25).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, -0.5F, -5.5F));
		PartDefinition lower_left = body.addOrReplaceChild("lower_left", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, -0.5F, 5.5F));
		PartDefinition lower_right = body.addOrReplaceChild("lower_right", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, -0.5F, 5.5F));
		PartDefinition lower_tail = body.addOrReplaceChild("lower_tail", CubeListBuilder.create().texOffs(16, 25).addBox(-0.5F, -0.25F, 0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.75F, 6.5F));
		PartDefinition tail = lower_tail.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(16, 18).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.25F, 4.5F));
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
		this.upper_left.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.upper_right.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.lower_right.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.lower_left.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}