package ladylexxie.lexium.data.server;

import ladylexxie.lexium.items.LexiumItems;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class CraftingRecipeGen extends RecipeProvider {
	public CraftingRecipeGen( DataGenerator generator ) {
		super(generator);
	}

	@Override
	protected void buildCraftingRecipes( @NotNull Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder.shaped(LexiumItems.LEXIUM_HOE.get())
				.pattern("xx")
				.pattern(" s")
				.pattern(" s")
				.define('x', LexiumItems.LEXIUM_INGOT.get())
				.define('s', Items.STICK)
				.unlockedBy("has_lexium_hoe", InventoryChangeTrigger.TriggerInstance.hasItems(LexiumItems.LEXIUM_INGOT.get()))
				.save(consumer);

		ShapedRecipeBuilder.shaped(LexiumItems.LEXIUM_PICKAXE.get())
				.pattern("xxx")
				.pattern(" s ")
				.pattern(" s ")
				.define('x', LexiumItems.LEXIUM_INGOT.get())
				.define('s', Items.STICK)
				.unlockedBy("has_lexium_pickaxe", InventoryChangeTrigger.TriggerInstance.hasItems(LexiumItems.LEXIUM_INGOT.get()))
				.save(consumer);

		ShapedRecipeBuilder.shaped(LexiumItems.LEXIUM_SHOVEL.get())
				.pattern("x")
				.pattern("s")
				.pattern("s")
				.define('x', LexiumItems.LEXIUM_INGOT.get())
				.define('s', Items.STICK)
				.unlockedBy("has_lexium_shovel", InventoryChangeTrigger.TriggerInstance.hasItems(LexiumItems.LEXIUM_INGOT.get()))
				.save(consumer);

		ShapedRecipeBuilder.shaped(LexiumItems.LEXIUM_AXE.get())
				.pattern("xx")
				.pattern("xs")
				.pattern(" s")
				.define('x', LexiumItems.LEXIUM_INGOT.get())
				.define('s', Items.STICK)
				.unlockedBy("has_lexium_axe", InventoryChangeTrigger.TriggerInstance.hasItems(LexiumItems.LEXIUM_INGOT.get()))
				.save(consumer);

		ShapedRecipeBuilder.shaped(LexiumItems.LEXIUM_SWORD.get())
				.pattern("  x")
				.pattern(" x ")
				.pattern("s  ")
				.define('x', LexiumItems.LEXIUM_INGOT.get())
				.define('s', Items.STICK)
				.unlockedBy("has_lexium_sword", InventoryChangeTrigger.TriggerInstance.hasItems(LexiumItems.LEXIUM_INGOT.get()))
				.save(consumer);

		ShapedRecipeBuilder.shaped(LexiumItems.LEXIUM_BLOCK.get())
				.pattern("xxx")
				.pattern("xxx")
				.pattern("xxx")
				.define('x', LexiumItems.LEXIUM_INGOT.get())
				.unlockedBy("has_lexium_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(LexiumItems.LEXIUM_INGOT.get()))
				.save(consumer);
	}

	@Override
	public @NotNull String getName() {
		return "Lexium Crafting Recipe Datagen";
	}
}
