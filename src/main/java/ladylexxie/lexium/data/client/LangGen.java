package ladylexxie.lexium.data.client;

import ladylexxie.lexium.Lexium;
import ladylexxie.lexium.blocks.LexiumBlocks;
import ladylexxie.lexium.items.LexiumItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class LangGen extends LanguageProvider {
	public LangGen( DataGenerator gen ) {
		super(gen, Lexium.MOD_ID, "en_us");
	}

	@Override
	protected void addTranslations() {
		Lexium.LOGGER.debug("Generating lang files...");
		add(LexiumItems.LEXIUM_INGOT.get(), "Lexium Ingot");

		add(LexiumBlocks.LEXIUM_ORE.get(), "Lexium Ore");
		add(LexiumBlocks.LEXIUM_BLOCK.get(), "Lexium Block");

		addLexiumTooltip("lexium_ingot", "Lexium Ingot Tooltip");
		addLexiumTooltip("lexium_ore", "Lexium Ore Tooltip");
		addLexiumTooltip("lexium_block", "Lexium Block Tooltip");

		add("itemGroup.lexium_creative_tab", "Lexium");
	}

	private void addLexiumTooltip( String id, String lang ) { add("tooltip.lexium." + id, lang); }
}
