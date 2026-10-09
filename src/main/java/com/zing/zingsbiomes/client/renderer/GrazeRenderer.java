package com.zing.zingsbiomes.client.renderer;

import net.neoforged.neoforge.client.renderstate.RegisterRenderStateModifiersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.util.context.ContextKey;
import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.Minecraft;

import com.zing.zingsbiomes.entity.GrazeEntity;
import com.zing.zingsbiomes.client.model.animations.grazeAnimation;
import com.zing.zingsbiomes.client.model.Modelgraze;

import java.util.Map;

import com.mojang.blaze3d.vertex.PoseStack;

public class GrazeRenderer extends MobRenderer<GrazeEntity, LivingEntityRenderState, Modelgraze> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/graze.png");

	public GrazeRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelgraze.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<>(this) {
			final Identifier LAYER_TEXTURE = Identifier.parse("zings_biomes:textures/entities/graze_eyes.png");
			final RenderType RENDER_TYPE = RenderTypes.eyes(LAYER_TEXTURE);
			final EntityModel LAYER_MODEL = new Modelgraze(Minecraft.getInstance().getEntityModels().bakeLayer(Modelgraze.LAYER_LOCATION));

			@Override
			public void submit(PoseStack poseStack, SubmitNodeCollector submitNodeCollector, int light, LivingEntityRenderState state, float headYaw, float headPitch) {
				LAYER_MODEL.setupAnim(state);
				submitNodeCollector.submitModel(LAYER_MODEL, state, poseStack, RENDER_TYPE, light, LivingEntityRenderer.getOverlayCoords(state, 0), state.outlineColor);
			}
		});
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(GrazeEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}

	private static final class AnimatedModel extends Modelgraze {
		private final KeyframeAnimation keyframeAnimation0;

		public AnimatedModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = safeBake(grazeAnimation.idle);
		}

		private KeyframeAnimation safeBake(AnimationDefinition source) {
			try {
				return source.bake(root);
			} catch (IllegalArgumentException e) {
				return new AnimationDefinition(0, false, Map.of()).bake(root);
			}
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			GrazeEntity entity = state.getRenderData(ENTITY_KEY);
			this.keyframeAnimation0.apply(entity.animationState0, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}

	public static final ContextKey<GrazeEntity> ENTITY_KEY = new ContextKey<>(Identifier.parse("zings_biomes:graze_entity"));

	@EventBusSubscriber(Dist.CLIENT)
	public static class EntityStateAdder {
		@SubscribeEvent
		private static void registerRenderStateModifiersEvent(RegisterRenderStateModifiersEvent event) {
			event.registerEntityModifier(GrazeRenderer.class, (entity, state) -> state.setRenderData(ENTITY_KEY, entity));
		}
	}
}