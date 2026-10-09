package com.zing.zingsbiomes.client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.Identifier;
import com.zing.zingsbiomes.client.model.Modelsled_with_chest;
import com.zing.zingsbiomes.entity.CherrySledWithChestEntity;

public class CherrySledWithChestRenderer extends GroundSledRenderer<CherrySledWithChestEntity, Modelsled_with_chest> {
	public CherrySledWithChestRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsled_with_chest(context.bakeLayer(Modelsled_with_chest.LAYER_LOCATION)), Identifier.parse("zings_biomes:textures/entities/sled_cherry_with_chest.png"));
	}
}