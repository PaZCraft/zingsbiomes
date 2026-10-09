package net.mcreator.zingsbiomes.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.zingsbiomes.init.ZingsBiomesModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements ZingsBiomesModBiomes.ZingsBiomesModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> zings_biomes_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.zings_biomes_dimensionTypeReference != null) {
			retval = ZingsBiomesModBiomes.adaptSurfaceRule(retval, this.zings_biomes_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setzings_biomesDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.zings_biomes_dimensionTypeReference = dimensionType;
	}
}