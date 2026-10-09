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
public class Modelpiranha extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_biomes", "modelpiranha"), "main");
	public final ModelPart body;
	public final ModelPart tailfin;
	public final ModelPart left_fin;
	public final ModelPart right_fin;
	public final ModelPart head;
	public final ModelPart lower_jaw;

	public Modelpiranha(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.tailfin = this.body.getChild("tailfin");
		this.left_fin = this.body.getChild("left_fin");
		this.right_fin = this.body.getChild("right_fin");
		this.head = this.body.getChild("head");
		this.lower_jaw = this.head.getChild("lower_jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(12, 12).addBox(-1.0F, -5.0F, 2.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, -6.0F, -4.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(8, 20)
						.addBox(0.0F, 0.0F, 1.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 18).addBox(0.0F, 0.0F, -2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 23)
						.addBox(0.0F, -6.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 0).addBox(0.0F, -8.0F, -2.0F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition tailfin = body.addOrReplaceChild("tailfin", CubeListBuilder.create().texOffs(0, 19).addBox(0.0F, -2.5F, 0.0F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.5F, 5.0F));
		PartDefinition left_fin = body.addOrReplaceChild("left_fin", CubeListBuilder.create().texOffs(16, 8).addBox(-2.0F, 0.0F, -1.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -2.0F, -2.5F));
		PartDefinition right_fin = body.addOrReplaceChild("right_fin", CubeListBuilder.create().texOffs(16, 8).addBox(0.0F, 0.0F, -1.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -2.0F, -2.5F));
		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -2.5F, -4.3333F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 11).addBox(-1.0F, 0.5F, -2.3333F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.5F, -3.6667F));
		PartDefinition lower_jaw = head.addOrReplaceChild("lower_jaw",
				CubeListBuilder.create().texOffs(22, 15).addBox(-1.0F, 0.0F, -1.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 11).addBox(-1.0F, -1.0F, -1.4F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.5F, -2.7333F));
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