package net.mcreator.zingsbiomes.client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.Identifier;
import net.mcreator.zingsbiomes.client.model.Modelsled;
import net.mcreator.zingsbiomes.entity.JungleSledEntity;

public class JungleSledRenderer extends GroundSledRenderer<JungleSledEntity, Modelsled> {
	public JungleSledRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsled(context.bakeLayer(Modelsled.LAYER_LOCATION)), Identifier.parse("zings_biomes:textures/entities/sled_jungle.png"));
	}
}