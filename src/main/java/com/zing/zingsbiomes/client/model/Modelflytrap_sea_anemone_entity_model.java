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

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelflytrap_sea_anemone_entity_model extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_biomes", "modelflytrap_sea_anemone_entity_model"), "main");
	public final ModelPart body;
	public final ModelPart jaw1;
	public final ModelPart tip1;
	public final ModelPart jaw2;
	public final ModelPart tip2;

	public Modelflytrap_sea_anemone_entity_model(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.jaw1 = this.body.getChild("jaw1");
		this.tip1 = this.jaw1.getChild("tip1");
		this.jaw2 = this.body.getChild("jaw2");
		this.tip2 = this.jaw2.getChild("tip2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(26, 0).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 23.0F, 0.0F));
		PartDefinition jaw1 = body
				.addOrReplaceChild(
						"jaw1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.125F, -8.5F, -6.0F, 1.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(25, 30).addBox(-1.125F, -12.5F, -6.0F, 0.0F, 4.0F, 12.0F, new CubeDeformation(0.0F))
								.texOffs(48, 46).addBox(-1.125F, -8.5F, -8.0F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 14).addBox(-1.125F, -8.5F, 6.0F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
						PartPose.offset(-0.875F, -0.5F, 0.0F));
		PartDefinition tip1 = jaw1.addOrReplaceChild("tip1", CubeListBuilder.create().texOffs(26, 30).addBox(0.0F, -4.0F, -6.0F, 0.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.125F, -8.5F, 0.0F));
		PartDefinition jaw2 = body
				.addOrReplaceChild(
						"jaw2", CubeListBuilder.create().texOffs(0, 20).addBox(0.125F, -8.5F, -6.0F, 1.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(26, 30).addBox(1.125F, -12.5F, -6.0F, 0.0F, 4.0F, 12.0F, new CubeDeformation(0.0F))
								.texOffs(48, 46).addBox(1.125F, -8.5F, -8.0F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 14).addBox(1.125F, -8.5F, 6.0F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.875F, -0.5F, 0.0F));
		PartDefinition tip2 = jaw2.addOrReplaceChild("tip2", CubeListBuilder.create().texOffs(25, 30).addBox(0.0F, -4.0F, -6.0F, 0.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.125F, -8.5F, 0.0F));
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