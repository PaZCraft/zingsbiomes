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
public class Modelmooshroom extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_biomes", "modelmooshroom"), "main");
	public final ModelPart head;
	public final ModelPart mushroom1;
	public final ModelPart body;
	public final ModelPart mushrooms;
	public final ModelPart mushroom2;
	public final ModelPart mushroom3;
	public final ModelPart leg1;
	public final ModelPart leg2;
	public final ModelPart leg3;
	public final ModelPart leg4;

	public Modelmooshroom(ModelPart root) {
		super(root);
		this.head = root.getChild("head");
		this.mushroom1 = this.head.getChild("mushroom1");
		this.body = root.getChild("body");
		this.mushrooms = this.body.getChild("mushrooms");
		this.mushroom2 = this.mushrooms.getChild("mushroom2");
		this.mushroom3 = this.mushrooms.getChild("mushroom3");
		this.leg1 = root.getChild("leg1");
		this.leg2 = root.getChild("leg2");
		this.leg3 = root.getChild("leg3");
		this.leg4 = root.getChild("leg4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(22, 0).addBox(-5.0F, -5.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, -4.0F, -6.0F, 8.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
						.addBox(4.0F, -5.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 36).addBox(-3.0F, 1.0F, -7.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.0F, -8.0F));
		PartDefinition mushroom1 = head.addOrReplaceChild("mushroom1",
				CubeListBuilder.create().texOffs(7, 43).addBox(-8.0F, -13.0F, 0.0F, 16.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(7, 27).addBox(0.0F, -13.0F, -8.0F, 0.0F, 13.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, -3.2F, 0.0F, -0.576F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(18, 4).addBox(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(31, 25).addBox(-2.0F, 2.0F, -8.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, 2.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition mushrooms = body.addOrReplaceChild("mushrooms", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.0F, 3.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition mushroom2 = mushrooms.addOrReplaceChild("mushroom2",
				CubeListBuilder.create().texOffs(7, 43).addBox(-8.0F, -13.0F, 0.0F, 16.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(7, 27).addBox(0.0F, -13.0F, -8.0F, 0.0F, 13.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.025F, 0.0F, 2.8F, 0.0F, 0.6807F, 0.0F));
		PartDefinition mushroom3 = mushrooms.addOrReplaceChild("mushroom3",
				CubeListBuilder.create().texOffs(7, 43).addBox(-8.0F, -13.0F, 0.0F, 16.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(7, 27).addBox(0.0F, -13.0F, -8.0F, 0.0F, 13.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2F, 0.0F, 11.0F, 0.0F, -0.0524F, 0.0F));
		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 12.0F, 7.0F));
		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 12.0F, 7.0F));
		PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 12.0F, -6.0F));
		PartDefinition leg4 = partdefinition.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 12.0F, -6.0F));
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
		this.leg1.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg4.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg3.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}