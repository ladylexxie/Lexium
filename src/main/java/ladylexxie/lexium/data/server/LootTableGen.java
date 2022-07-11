package ladylexxie.lexium.data.server;

import ladylexxie.lexium.blocks.LexiumBlocks;
import net.minecraft.data.DataGenerator;

public class LootTableGen extends BaseLootTableProvider {
	public LootTableGen( DataGenerator generator ) {
		super(generator);
	}

	@Override
	protected void addTables() {
		lootTables.put(LexiumBlocks.LEXIUM_ORE.get(), createStandardTable("lexium_ore", LexiumBlocks.LEXIUM_ORE.get()));
		lootTables.put(LexiumBlocks.LEXIUM_BLOCK.get(), createStandardTable("lexium_block", LexiumBlocks.LEXIUM_BLOCK.get()));
	}
}
