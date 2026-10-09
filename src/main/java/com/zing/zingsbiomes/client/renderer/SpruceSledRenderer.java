package com.zing.zingsbiomes.client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.Identifier;
import com.zing.zingsbiomes.client.model.Modelsled;
import com.zing.zingsbiomes.entity.SpruceSledEntity;

public class SpruceSledRenderer extends GroundSledRenderer<SpruceSledEntity, Modelsled> {
	public SpruceSledRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsled(context.bakeLayer(Modelsled.LAYER_LOCATION)), Identifier.parse("zings_biomes:textures/entities/sled_spruce.png"));
	}
}