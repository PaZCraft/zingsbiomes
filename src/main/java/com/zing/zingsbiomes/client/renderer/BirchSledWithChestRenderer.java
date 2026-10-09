package net.mcreator.zingsbiomes.client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.Identifier;
import net.mcreator.zingsbiomes.client.model.Modelsled_with_chest;
import net.mcreator.zingsbiomes.entity.BirchSledWithChestEntity;

public class BirchSledWithChestRenderer extends GroundSledRenderer<BirchSledWithChestEntity, Modelsled_with_chest> {
	public BirchSledWithChestRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsled_with_chest(context.bakeLayer(Modelsled_with_chest.LAYER_LOCATION)), Identifier.parse("zings_biomes:textures/entities/sled_birch_with_chest.png"));
	}
}