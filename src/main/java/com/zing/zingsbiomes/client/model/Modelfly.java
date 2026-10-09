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
public class Modelfly extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_biomes", "modelfly"), "main");
	public final ModelPart body;
	public final ModelPart left_wing;
	public final ModelPart right_wing;
	public final ModelPart front_legs;
	public final ModelPart front_left_leg;
	public final ModelPart front_right_leg;
	public final ModelPart middle_legs;
	public final ModelPart middle_left_leg;
	public final ModelPart middle_right_leg;
	public final ModelPart back_legs;
	public final ModelPart back_left_leg;
	public final ModelPart back_right_leg;
	public final ModelPart mouth;

	public Modelfly(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.left_wing = this.body.getChild("left_wing");
		this.right_wing = this.body.getChild("right_wing");
		this.front_legs = this.body.getChild("front_legs");
		this.front_left_leg = this.front_legs.getChild("front_left_leg");
		this.front_right_leg = this.front_legs.getChild("front_right_leg");
		this.middle_legs = this.body.getChild("middle_legs");
		this.middle_left_leg = this.middle_legs.getChild("middle_left_leg");
		this.middle_right_leg = this.middle_legs.getChild("middle_right_leg");
		this.back_legs = this.body.getChild("back_legs");
		this.back_left_leg = this.back_legs.getChild("back_left_leg");
		this.back_right_leg = this.back_legs.getChild("back_right_leg");
		this.mouth = this.body.getChild("mouth");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5714F, -2.5714F, -2.7143F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.4286F, 20.5714F, -0.2857F));
		PartDefinition left_wing = body.addOrReplaceChild("left_wing", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -8.0F, 0.0F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0714F, -2.5714F, -0.7143F, -1.0908F, 0.0F, 0.0F));
		PartDefinition right_wing = body.addOrReplaceChild("right_wing", CubeListBuilder.create().texOffs(0, 10).addBox(1.5F, -8.0F, 0.0F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0714F, -2.5714F, -0.7143F, -1.0908F, 0.0F, 0.0F));
		PartDefinition front_legs = body.addOrReplaceChild("front_legs", CubeListBuilder.create(), PartPose.offset(0.4286F, 1.4286F, -2.7143F));
		PartDefinition front_left_leg = front_legs.addOrReplaceChild("front_left_leg", CubeListBuilder.create().texOffs(12, 12).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 0.0F, 0.0F));
		PartDefinition front_right_leg = front_legs.addOrReplaceChild("front_right_leg", CubeListBuilder.create().texOffs(12, 12).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 0.0F, 0.0F));
		PartDefinition middle_legs = body.addOrReplaceChild("middle_legs", CubeListBuilder.create(), PartPose.offset(0.4286F, 1.4286F, 0.2857F));
		PartDefinition middle_left_leg = middle_legs.addOrReplaceChild("middle_left_leg", CubeListBuilder.create().texOffs(12, 12).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 0.0F, 0.0F));
		PartDefinition middle_right_leg = middle_legs.addOrReplaceChild("middle_right_leg", CubeListBuilder.create().texOffs(12, 12).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 0.0F, 0.0F));
		PartDefinition back_legs = body.addOrReplaceChild("back_legs", CubeListBuilder.create(), PartPose.offset(0.4286F, 1.4286F, 3.2857F));
		PartDefinition back_left_leg = back_legs.addOrReplaceChild("back_left_leg", CubeListBuilder.create().texOffs(12, 12).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 0.0F, 0.0F));
		PartDefinition back_right_leg = back_legs.addOrReplaceChild("back_right_leg", CubeListBuilder.create().texOffs(12, 12).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 0.0F, 0.0F));
		PartDefinition mouth = body.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(12, 10).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.4286F, 0.4286F, -2.8143F));
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