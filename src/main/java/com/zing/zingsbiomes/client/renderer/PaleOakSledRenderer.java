package com.zing.zingsbiomes.client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.Identifier;
import com.zing.zingsbiomes.client.model.Modelsled;
import com.zing.zingsbiomes.entity.PaleOakSledEntity;

public class PaleOakSledRenderer extends GroundSledRenderer<PaleOakSledEntity, Modelsled> {
	public PaleOakSledRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsled(context.bakeLayer(Modelsled.LAYER_LOCATION)), Identifier.parse("zings_biomes:textures/entities/sled_pale_oak.png"));
	}
}