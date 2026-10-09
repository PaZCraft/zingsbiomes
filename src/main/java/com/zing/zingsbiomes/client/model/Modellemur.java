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
public class Modellemur extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_biomes", "modellemur"), "main");
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart hat;
	public final ModelPart front_left_leg;
	public final ModelPart front_right_leg;
	public final ModelPart back_left_leg;
	public final ModelPart back_right_leg;
	public final ModelPart tail;
	public final ModelPart tail_mid;
	public final ModelPart tail_tip;

	public Modellemur(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.head = this.body.getChild("head");
		this.hat = this.head.getChild("hat");
		this.front_left_leg = this.body.getChild("front_left_leg");
		this.front_right_leg = this.body.getChild("front_right_leg");
		this.back_left_leg = this.body.getChild("back_left_leg");
		this.back_right_leg = this.body.getChild("back_right_leg");
		this.tail = this.body.getChild("tail");
		this.tail_mid = this.tail.getChild("tail_mid");
		this.tail_tip = this.tail_mid.getChild("tail_tip");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5714F, -2.8571F, -4.8214F, 5.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.4286F, 19.8571F, -0.1786F));
		PartDefinition head = body
				.addOrReplaceChild(
						"head", CubeListBuilder.create().texOffs(14, 21).addBox(-1.5F, -2.0F, -3.25F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 14).addBox(-0.5F, 0.0F, -4.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
								.texOffs(20, 27).addBox(-2.5F, -3.0F, -1.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28).addBox(0.5F, -3.0F, -1.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
						PartPose.offset(-0.0714F, -0.8571F, -4.5714F));
		PartDefinition hat = head.addOrReplaceChild("hat", CubeListBuilder.create().texOffs(26, 21).addBox(-3.0F, -6.0F, -2.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition front_left_leg = body.addOrReplaceChild("front_left_leg", CubeListBuilder.create().texOffs(6, 28).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0714F, 0.6429F, -4.3214F));
		PartDefinition front_right_leg = body.addOrReplaceChild("front_right_leg", CubeListBuilder.create().texOffs(10, 28).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9286F, 0.6429F, -4.3214F));
		PartDefinition back_left_leg = body.addOrReplaceChild("back_left_leg", CubeListBuilder.create().texOffs(14, 27).addBox(-0.5F, 0.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0714F, 0.6429F, 4.1786F));
		PartDefinition back_right_leg = body.addOrReplaceChild("back_right_leg", CubeListBuilder.create().texOffs(26, 25).addBox(-0.5F, 0.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9286F, 0.6429F, 4.1786F));
		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, -1.0F, 0.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.4286F, -0.8571F, 4.6786F));
		PartDefinition tail_mid = tail.addOrReplaceChild("tail_mid", CubeListBuilder.create().texOffs(14, 14).addBox(-1.0F, -1.0F, 0.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition tail_tip = tail_mid.addOrReplaceChild("tail_tip", CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, -1.0F, 0.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 5.0F));
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
		this.front_right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.back_right_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.back_left_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.front_left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}