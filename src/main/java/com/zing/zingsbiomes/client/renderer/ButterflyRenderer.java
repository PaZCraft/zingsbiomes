package com.zing.zingsbiomes.client.renderer;

import net.neoforged.neoforge.client.renderstate.RegisterRenderStateModifiersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.util.context.ContextKey;
import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.animation.AnimationDefinition;

import com.zing.zingsbiomes.entity.ButterflyEntity;
import com.zing.zingsbiomes.client.model.animations.butterflyAnimation;
import com.zing.zingsbiomes.client.model.Modelbutterfly;

import java.util.Map;

import com.mojang.blaze3d.vertex.PoseStack;

public class ButterflyRenderer extends MobRenderer<ButterflyEntity, LivingEntityRenderState, Modelbutterfly> {
	private final Identifier entityTexture_monarch_orange = Identifier.parse("zings_biomes:textures/entity/butterfly/butterfly_monarch_orange.png");
	private final Identifier entityTexture_deadleaf = Identifier.parse("zings_biomes:textures/entity/butterfly/butterfly_dead_leaf.png");
	private final Identifier entityTexture_decaying = Identifier.parse("zings_biomes:textures/entity/butterfly/butterfly_decaying.png");
	private final Identifier entityTexture_disruptive = Identifier.parse("zings_biomes:textures/entity/butterfly/butterfly_disruptive.png");
	private final Identifier entityTexture_eyespot = Identifier.parse("zings_biomes:textures/entity/butterfly/butterfly_eyespot.png");
	private final Identifier entityTexture_glasswing_amber = Identifier.parse("zings_biomes:textures/entity/butterfly/butterfly_glasswing_amber.png");
	private final Identifier entityTexture_glasswing_black = Identifier.parse("zings_biomes:textures/entity/butterfly/butterfly_glasswing_black.png");
	private final Identifier entityTexture_glasswing_pink = Identifier.parse("zings_biomes:textures/entity/butterfly/butterfly_glasswing_pink.png");
	private final Identifier entityTexture_glasswing_white = Identifier.parse("zings_biomes:textures/entity/butterfly/butterfly_glasswing_white.png");
	private final Identifier entityTexture_granite = Identifier.parse("zings_biomes:textures/entity/butterfly/butterfly_granite.png");
	private final Identifier entityTexture_monarch_cream = Identifier.parse("zings_biomes:textures/entity/butterfly/butterfly_monarch_cream.png");
	private final Identifier entityTexture_moss = Identifier.parse("zings_biomes:textures/entity/butterfly/butterfly_moss.png");
	private final Identifier entityTexture_shimmering_blue = Identifier.parse("zings_biomes:textures/entity/butterfly/butterfly_shimmering_blue.png");
	private final Identifier entityTexture_shimmering_gold = Identifier.parse("zings_biomes:textures/entity/butterfly/butterfly_shimmering_gold.png");
	private final Identifier entityTexture_shimmering_green = Identifier.parse("zings_biomes:textures/entity/butterfly/butterfly_shimmering_green.png");
	private final Identifier entityTexture_shimmering_purple = Identifier.parse("zings_biomes:textures/entity/butterfly/butterfly_shimmering_purple.png");
	private final Identifier entityTexture_shimmering_rainbow = Identifier.parse("zings_biomes:textures/entity/butterfly/butterfly_shimmering_rainbow.png");
	private final Identifier entityTexture_shimmering_silver = Identifier.parse("zings_biomes:textures/entity/butterfly/butterfly_shimmering_silver.png");

	public ButterflyRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelbutterfly.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ButterflyEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		switch (entity.getVariant());
			case monarch_orange:
				return entityTexture_monarch_orange;
			case deadleaf:
				return entityTexture_dead_leaf;
			case decaying:
				return entityTexture_decaying;
			case disruptive:
				return entityTexture_disruptive;
			case eyespot:
				return entityTexture_eyespot;
			case glasswing_amber:
				return entityTexture_glasswing_amber;
			case glasswing_black:
				return entityTexture_glasswing_black;
			case glasswing_pink:
				return entityTexture_glasswing_pink;
			case glasswing_white:
				return entityTexture_glasswing_white;
			case granite:
				return entityTexture_granite;
			case monarch_cream:
				return entityTexture_monarch_cream;
			case moss:
				return entityTexture_moss;
			case shimmering_blue:
				return entityTexture_shimmering_blue;
			case shimmering_gold:
				return entityTexture_shimmering_gold;
			case shimmering_green:
				return entityTexture_shimmering_green;
			case shimmering_purple:
				return entityTexture_shimmering_purple;
			case shimmering_rainbow:
				return entityTexture_shimmering_rainbow;
			case shimmering_silver:
				return entityTexture_shimmering_silver;
		}
		return entityTexture_monarch_orange
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(state.ageScale, state.ageScale, state.ageScale);
	}

	private static final class AnimatedModel extends Modelbutterfly {
		private final KeyframeAnimation keyframeAnimation0;

		public AnimatedModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = safeBake(butterflyAnimation.fly);
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
			ButterflyEntity entity = state.getRenderData(ENTITY_KEY);
			this.keyframeAnimation0.apply(entity.animationState0, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}

	public static final ContextKey<ButterflyEntity> ENTITY_KEY = new ContextKey<>(Identifier.parse("zings_biomes:butterfly_entity"));

	@EventBusSubscriber(Dist.CLIENT)
	public static class EntityStateAdder {
		@SubscribeEvent
		private static void registerRenderStateModifiersEvent(RegisterRenderStateModifiersEvent event) {
			event.registerEntityModifier(ButterflyRenderer.class, (entity, state) -> state.setRenderData(ENTITY_KEY, entity));
		}
	}
}