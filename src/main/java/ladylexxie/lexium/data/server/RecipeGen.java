package ladylexxie.lexium.data.server;

import ladylexxie.lexium.items.LexiumItems;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class RecipeGen extends RecipeProvider {
	public RecipeGen( DataGenerator generator ) {
		super(generator);
	}

	@Override
	protected void buildCraftingRecipes( @NotNull Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder.shaped(LexiumItems.LEXIUM_BLOCK.get())
				.pattern("xxx")
				.pattern("xxx")
				.pattern("xxx")
				.define('x', LexiumItems.LEXIUM_INGOT.get())
				.unlockedBy("has_lexium_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(LexiumItems.LEXIUM_BLOCK.get()))
				.save(consumer);

		SimpleCookingRecipeBuilder.smelting(Ingredient.of(LexiumItems.LEXIUM_INGOT.get()), LexiumItems.LEXIUM_ORE.get(), 0.3f, 200)
				.unlockedBy("has_lexium_ore", has(LexiumItems.LEXIUM_ORE.get()))
				.save(consumer);
	}
}
