package ladylexxie.lexium.util;

import ladylexxie.lexium.Lexium;
import ladylexxie.lexium.items.LexiumItems;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.level.ItemLike;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Consumer;

public class LexiumRecipeBuilder {
	public static void shaped( ItemLike output, int count, String[] patterns, Map<Character, ItemLike> definitions, String id, Consumer<FinishedRecipe> consumer ) {
		ShapedRecipeBuilder recipe = new ShapedRecipeBuilder(output, count).unlockedBy("has_lexium_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(LexiumItems.LEXIUM_INGOT.get()));
		Arrays.stream(patterns).forEach(recipe::pattern);
		definitions.forEach(recipe::define);

		recipe.save(consumer, Lexium.resourceLocation(id));
	}

	public static void shaped( ItemLike output, String[] patterns, Map<Character, ItemLike> definitions, String id, Consumer<FinishedRecipe> consumer ) {
		shaped(output, 1, patterns, definitions, id, consumer);
	}
}
