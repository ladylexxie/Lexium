package ladylexxie.lexium.data;

import ladylexxie.lexium.Lexium;
import ladylexxie.lexium.blocks.LexiumBlocks;
import ladylexxie.lexium.items.LexiumItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class LexiumLang extends LanguageProvider {
	public LexiumLang( DataGenerator gen ) {
		super(gen, Lexium.MOD_ID, "en_us");
	}

	@Override
	protected void addTranslations() {
		addItem(LexiumItems.LEXIUM_INGOT, "Lexium Ingot");
		addItem(LexiumItems.LEXIUM_ORE, "Lexium Ore");
		addBlock(LexiumBlocks.LEXIUM_ORE, "Lexium Ore");
	}
}
