package ladylexxie.lexium.world.feature;

import ladylexxie.lexium.blocks.LexiumBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;

import java.util.List;

public class LexiumConfiguredFeature {
	public static final List<OreConfiguration.TargetBlockState> OVERWORLD_LEXIUM_ORES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, LexiumBlocks.LEXIUM_ORE.get().defaultBlockState()));
	//			OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, LexiumBlocks.DEEPSLATE_LEXIUM_ORE.get().defaultBlockState()));

	public static final Holder<ConfiguredFeature<OreConfiguration, ?>> LEXIUM_ORE = FeatureUtils.register("lexium_ore", Feature.ORE, new OreConfiguration(OVERWORLD_LEXIUM_ORES, 9));
}