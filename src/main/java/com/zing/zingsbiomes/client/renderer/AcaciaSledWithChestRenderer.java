package com.zing.zingsbiomes.client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.Identifier;
import com.zing.zingsbiomes.client.model.Modelsled_with_chest;
import com.zing.zingsbiomes.entity.AcaciaSledWithChestEntity;

public class AcaciaSledWithChestRenderer extends GroundSledRenderer<AcaciaSledWithChestEntity, Modelsled_with_chest> {
	public AcaciaSledWithChestRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsled_with_chest(context.bakeLayer(Modelsled_with_chest.LAYER_LOCATION)), Identifier.parse("zings_biomes:textures/entities/sled_acacia_with_chest.png"));
	}
}