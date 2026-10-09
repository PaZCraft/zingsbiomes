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
public class Modelpenguin extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_biomes", "modelpenguin"), "main");
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart left_flipper;
	public final ModelPart right_flipper;
	public final ModelPart left_leg;
	public final ModelPart right_leg;
	public final ModelPart tail;

	public Modelpenguin(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.head = this.body.getChild("head");
		this.left_flipper = this.body.getChild("left_flipper");
		this.right_flipper = this.body.getChild("right_flipper");
		this.left_leg = this.body.getChild("left_leg");
		this.right_leg = this.body.getChild("right_leg");
		this.tail = this.body.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.5714F, -3.2143F, 8.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 14.5714F, 0.2143F));
		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 21).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 0).addBox(-1.0F, -3.0F, -6.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -7.5714F, -0.2143F));
		PartDefinition left_flipper = body.addOrReplaceChild("left_flipper", CubeListBuilder.create().texOffs(16, 21).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.5F, -6.5714F, -0.2143F));
		PartDefinition right_flipper = body.addOrReplaceChild("right_flipper", CubeListBuilder.create().texOffs(26, 21).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.5F, -6.5714F, -0.2143F));
		PartDefinition left_leg = body.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(28, 6).addBox(-1.0F, -0.25F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 17).addBox(-1.0F, 0.75F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 7.6786F, -1.2143F));
		PartDefinition right_leg = body.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(28, 10).addBox(-1.0F, -0.25F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 14).addBox(-1.0F, 0.75F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 7.6786F, -1.2143F));
		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 29).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.4286F, 3.2857F));
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