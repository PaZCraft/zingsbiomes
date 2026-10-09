package net.mcreator.zingsbiomes.client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.Identifier;
import net.mcreator.zingsbiomes.client.model.Modelsled_with_chest;
import net.mcreator.zingsbiomes.entity.JungleSledWithChestEntity;

public class JungleSledWithChestRenderer extends GroundSledRenderer<JungleSledWithChestEntity, Modelsled_with_chest> {
	public JungleSledWithChestRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsled_with_chest(context.bakeLayer(Modelsled_with_chest.LAYER_LOCATION)), Identifier.parse("zings_biomes:textures/entities/sled_jungle_with_chest.png"));
	}
}