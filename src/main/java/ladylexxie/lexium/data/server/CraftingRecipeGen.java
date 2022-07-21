package ladylexxie.lexium.data.server;

import ladylexxie.lexium.Lexium;
import ladylexxie.lexium.items.LexiumItems;
import ladylexxie.lexium.util.LexiumRecipeBuilder;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class CraftingRecipeGen extends RecipeProvider {
	public CraftingRecipeGen( DataGenerator generator ) {
		super(generator);
	}

	@Override
	protected void buildCraftingRecipes( @NotNull Consumer<FinishedRecipe> consumer ) {
		// items/tools
		LexiumRecipeBuilder.shaped(LexiumItems.LEXIUM_HOE.get(), new String[]{ "xx", " s", " s" }, Map.of('x', LexiumItems.LEXIUM_INGOT.get(), 's', Items.STICK), "items/tools/lexium_hoe", consumer);
		LexiumRecipeBuilder.shaped(LexiumItems.LEXIUM_PICKAXE.get(), new String[]{ "xxx", " s ", " s " }, Map.of('x', LexiumItems.LEXIUM_INGOT.get(), 's', Items.STICK), "items/tools/lexium_pickaxe", consumer);
		LexiumRecipeBuilder.shaped(LexiumItems.LEXIUM_SHOVEL.get(), new String[]{ "x", "s", "s" }, Map.of('x', LexiumItems.LEXIUM_INGOT.get(), 's', Items.STICK), "items/tools/lexium_shovel", consumer);
		LexiumRecipeBuilder.shaped(LexiumItems.LEXIUM_AXE.get(), new String[]{ "xxx", "xs ", " s " }, Map.of('x', LexiumItems.LEXIUM_INGOT.get(), 's', Items.STICK), "items/tools/lexium_axe", consumer);
		LexiumRecipeBuilder.shaped(LexiumItems.LEXIUM_SWORD.get(), new String[]{ "  x", " x ", "s  " }, Map.of('x', LexiumItems.LEXIUM_INGOT.get(), 's', Items.STICK), "items/tools/lexium_sword", consumer);
		LexiumRecipeBuilder.shaped(LexiumItems.LEXIUM_PAXEL.get(), new String[]{ "aps", " x ", " x " }, Map.of('x', LexiumItems.LEXIUM_INGOT.get(), 'a', LexiumItems.LEXIUM_AXE.get(), 'p', LexiumItems.LEXIUM_PICKAXE.get(), 's', LexiumItems.LEXIUM_SHOVEL.get()), "items/tools/lexium_paxel", consumer);

		// items/armor
		LexiumRecipeBuilder.shaped(LexiumItems.LEXIUM_HELMET.get(), new String[]{ "xxx", "x x" }, Map.of('x', LexiumItems.LEXIUM_INGOT.get()), "items/armor/lexium_helmet", consumer);
		LexiumRecipeBuilder.shaped(LexiumItems.LEXIUM_CHESTPLATE.get(), new String[]{ "x x", "xxx", "xxx" }, Map.of('x', LexiumItems.LEXIUM_INGOT.get()), "items/armor/lexium_chestplate", consumer);
		LexiumRecipeBuilder.shaped(LexiumItems.LEXIUM_LEGGINGS.get(), new String[]{ "xxx", "x x", "x x" }, Map.of('x', LexiumItems.LEXIUM_INGOT.get()), "items/armor/lexium_leggings", consumer);
		LexiumRecipeBuilder.shaped(LexiumItems.LEXIUM_BOOTS.get(), new String[]{ "x x", "x x" }, Map.of('x', LexiumItems.LEXIUM_INGOT.get()), "items/armor/lexium_boots", consumer);

		// blocks/storage
		LexiumRecipeBuilder.shaped(LexiumItems.LEXIUM_BLOCK.get(), new String[]{ "xxx", "xxx", "xxx" }, Map.of('x', LexiumItems.LEXIUM_INGOT.get()), "blocks/storage/lexium_block", consumer);
	}

	@Override
	public @NotNull String getName() {
		return "Lexium Crafting Recipe Datagen";
	}
}
