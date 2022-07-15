package ladylexxie.lexium.world.feature;

import ladylexxie.lexium.Lexium;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class LexiumPlacedFeatures {
	public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Lexium.MOD_ID);
	public static final RegistryObject<PlacedFeature> LEXIUM_ORE_PLACED = PLACED_FEATURES.register("lexium_ore_placed", () -> new PlacedFeature((Holder<ConfiguredFeature<?, ?>>) (Holder<? extends ConfiguredFeature<?, ?>>) LexiumConfiguredFeature.LEXIUM_ORE, LexiumOrePlacement.commonOrePlacement(9, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

	public static void register( IEventBus eventBus ) {
		PLACED_FEATURES.register(eventBus);
	}
}
