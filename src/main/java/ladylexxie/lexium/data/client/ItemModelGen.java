package ladylexxie.lexium.data.client;

import ladylexxie.lexium.Lexium;
import ladylexxie.lexium.blocks.LexiumBlocks;
import ladylexxie.lexium.items.LexiumItems;
import net.minecraft.core.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class ItemModelGen extends ItemModelProvider {
	public ItemModelGen( DataGenerator generator, ExistingFileHelper existingFileHelper ) {
		super(generator, Lexium.MOD_ID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		Lexium.LOGGER.debug("Generating item model files...");

		LexiumItems.ITEMS.getEntries().forEach(item -> basicItem(item.get()));
		LexiumItems.TOOLS.getEntries().forEach(item -> basicToolItem(item.get()));

		basicBlockItem(LexiumItems.LEXIUM_BLOCK.get());
	}

	private void basicBlockItem( Item block ) {
		String name = Registry.ITEM.getKey(block).getPath();
		getBuilder(name).parent(new ModelFile.UncheckedModelFile("lexium:block/" + name));
	}

	private void basicToolItem( Item item ) {
		String name = Registry.ITEM.getKey(item).getPath();
		getBuilder(name).parent(new ModelFile.UncheckedModelFile("minecraft:item/handheld")).texture("layer0", "lexium:item/" + name);
	}

	@Override
	public @NotNull String getName() {
		return "Lexium Item Model Datagen";
	}
}
