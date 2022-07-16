package ladylexxie.lexium.world.gen;

import ladylexxie.lexium.world.feature.LexiumPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class LexiumOreGeneration {
	public static void generateOres(final BiomeLoadingEvent event) {
		List<Holder<PlacedFeature>> base =
				event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

		base.add(LexiumPlacedFeatures.LEXIUM_ORE_PLACED);
	}
}