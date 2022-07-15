package ladylexxie.lexium.data.client;

import ladylexxie.lexium.Lexium;
import ladylexxie.lexium.items.LexiumItems;
import net.minecraft.core.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

public class ItemModelGen extends ItemModelProvider {
	public ItemModelGen( DataGenerator generator, ExistingFileHelper existingFileHelper ) {
		super(generator, Lexium.MOD_ID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		Lexium.LOGGER.debug("Generating item model files...");
		basicItem(LexiumItems.LEXIUM_INGOT.get());
		basicItem(LexiumItems.LEXIUM_SWORD.get());
		basicItem(LexiumItems.LEXIUM_HOE.get());
		basicItem(LexiumItems.LEXIUM_AXE.get());
		basicItem(LexiumItems.LEXIUM_PICKAXE.get());
		basicItem(LexiumItems.LEXIUM_SHOVEL.get());

		basicBlockItem(LexiumItems.LEXIUM_ORE.get());
		basicBlockItem(LexiumItems.LEXIUM_BLOCK.get());
	}

	private void basicBlockItem( Item block ) {
		String name = Registry.ITEM.getKey(block).getPath();
		getBuilder(name).parent(new ModelFile.UncheckedModelFile("lexium:block/" + name));
	}

	@Override
	public @NotNull String getName() {
		return "Lexium Item Model Datagen";
	}
}
