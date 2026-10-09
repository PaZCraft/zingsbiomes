package com.zing.zingsbiomes.client.renderer;

import net.neoforged.neoforge.client.renderstate.RegisterRenderStateModifiersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.util.context.ContextKey;
import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ArmorModelSet;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.Minecraft;

import com.zing.zingsbiomes.entity.CastawayEntity;
import com.zing.zingsbiomes.client.model.animations.skeletonAnimation;
import com.zing.zingsbiomes.client.model.Modelskeleton;

import java.util.Map;

import com.mojang.blaze3d.vertex.PoseStack;

public class CastawayRenderer extends HumanoidMobRenderer<CastawayEntity, HumanoidRenderState, Modelskeleton> {
	private final Identifier entityTexture = Identifier.parse("zings_biomes:textures/entities/castaway.png");

	public CastawayRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelskeleton.LAYER_LOCATION)), 0.5f);
		this.addLayer(new HumanoidArmorLayer<>(this, ArmorModelSet.bake(ModelLayers.PLAYER_ARMOR, context.getModelSet(), HumanoidModel::new), context.getEquipmentRenderer()));
		this.addLayer(new RenderLayer<>(this) {
			final Identifier LAYER_TEXTURE = Identifier.parse("zings_biomes:textures/entities/castaway_glow.png");
			final EntityModel<HumanoidRenderState> LAYER_MODEL = new Modelskeleton(Minecraft.getInstance().getEntityModels().bakeLayer(Modelskeleton.LAYER_LOCATION));

			@Override
			public void submit(PoseStack poseStack, SubmitNodeCollector submitNodeCollector, int light, HumanoidRenderState state, float headYaw, float headPitch) {
				LAYER_MODEL.setupAnim(state);
				submitNodeCollector.submitModel(LAYER_MODEL, state, poseStack, net.minecraft.client.renderer.rendertype.RenderTypes.eyes(LAYER_TEXTURE), light, LivingEntityRenderer.getOverlayCoords(state, 0), state.outlineColor);
			}
		});
	}

	@Override
	public HumanoidRenderState createRenderState() {
		return new HumanoidRenderState();
	}

	@Override
	public void extractRenderState(CastawayEntity entity, HumanoidRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(HumanoidRenderState state) {
		return entityTexture;
	}

	private static final class AnimatedModel extends Modelskeleton {
		private final KeyframeAnimation keyframeAnimation0;
		private final KeyframeAnimation keyframeAnimation1;

		public AnimatedModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = safeBake(skeletonAnimation.melee);
			this.keyframeAnimation1 = safeBake(skeletonAnimation.sit);
		}

		private KeyframeAnimation safeBake(AnimationDefinition source) {
			try {
				return source.bake(root);
			} catch (IllegalArgumentException e) {
				return new AnimationDefinition(0, false, Map.of()).bake(root);
			}
		}

		@Override
		public void setupAnim(HumanoidRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			CastawayEntity entity = state.getRenderData(ENTITY_KEY);
			this.keyframeAnimation0.apply(entity.animationState0, state.ageInTicks, 1f);
			this.keyframeAnimation1.apply(entity.animationState1, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}

	public static final ContextKey<CastawayEntity> ENTITY_KEY = new ContextKey<>(Identifier.parse("zings_biomes:castaway_entity"));

	@EventBusSubscriber(Dist.CLIENT)
	public static class EntityStateAdder {
		@SubscribeEvent
		private static void registerRenderStateModifiersEvent(RegisterRenderStateModifiersEvent event) {
			event.registerEntityModifier(CastawayRenderer.class, (entity, state) -> state.setRenderData(ENTITY_KEY, entity));
		}
	}
}