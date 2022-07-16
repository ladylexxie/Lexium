package ladylexxie.lexium.world.feature;

import ladylexxie.lexium.Lexium;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.DeferredRegister;

public class LexiumPlacedFeatures {
	public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Lexium.MOD_ID);

	public static final Holder<PlacedFeature> LEXIUM_ORE_PLACED = PlacementUtils.register("lexium_ore_placed", LexiumConfiguredFeature.LEXIUM_ORE, LexiumOrePlacement.commonOrePlacement(9, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
}