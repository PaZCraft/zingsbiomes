package com.zing.zingsbiomes.client.model;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
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
public class Modelsled_with_chest extends EntityModel<EntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("zings_biomes", "modelsled_with_chest"), "main");
	public final ModelPart base;
	public final ModelPart chest;

	public Modelsled_with_chest(ModelPart root) {
		super(root);
		this.base = root.getChild("base");
		this.chest = this.base.getChild("chest");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition base = partdefinition.addOrReplaceChild("base",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -8.0F, 6.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(44, 12).addBox(-4.0F, -5.0F, -9.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 14)
						.addBox(-4.0F, -5.0F, 8.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 53).addBox(-4.0F, -7.0F, 8.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 41)
						.addBox(3.0F, -7.0F, -3.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(44, 0).addBox(-4.0F, -7.0F, -3.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 53)
						.addBox(-4.0F, -5.0F, -3.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(24, 53).addBox(3.0F, -5.0F, -3.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(36, 17)
						.addBox(3.0F, -3.0F, -3.0F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(36, 29).addBox(-5.0F, -3.0F, -3.0F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(3.0F, -1.0F, -9.0F, 1.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(0, 35).addBox(-4.0F, -1.0F, -9.0F, 1.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(60, 50)
						.addBox(-4.0F, -2.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 60).addBox(3.0F, -2.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 55)
						.addBox(4.0F, -7.0F, 4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 41).addBox(-5.0F, -7.0F, 4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 55)
						.addBox(4.0F, -7.0F, -2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 55).addBox(-5.0F, -7.0F, -2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 55)
						.addBox(3.0F, -2.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 46).addBox(3.0F, -4.0F, -9.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 60)
						.addBox(-4.0F, -4.0F, -9.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 60).addBox(-4.0F, -2.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition chest = base.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(0, 70).addBox(-2.0F, -7.0F, 3.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(EntityRenderState state) {
	}
}