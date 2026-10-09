package net.mcreator.zingsbiomes.client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.Identifier;
import net.mcreator.zingsbiomes.client.model.Modelsled;
import net.mcreator.zingsbiomes.entity.PaleOakSledEntity;

public class PaleOakSledRenderer extends GroundSledRenderer<PaleOakSledEntity, Modelsled> {
	public PaleOakSledRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsled(context.bakeLayer(Modelsled.LAYER_LOCATION)), Identifier.parse("zings_biomes:textures/entities/sled_pale_oak.png"));
	}
}