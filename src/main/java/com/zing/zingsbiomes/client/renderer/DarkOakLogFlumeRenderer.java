package com.zing.zingsbiomes.client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.Identifier;
import com.zing.zingsbiomes.client.model.Modellog_flume;
import com.zing.zingsbiomes.entity.DarkOakLogFlumeEntity;

public class DarkOakLogFlumeRenderer extends LogFlumeRenderer<DarkOakLogFlumeEntity> {
	public DarkOakLogFlumeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellog_flume(context.bakeLayer(Modellog_flume.LAYER_LOCATION)), Identifier.parse("zings_biomes:textures/entities/log_flume_dark_oak.png"));
	}
}
