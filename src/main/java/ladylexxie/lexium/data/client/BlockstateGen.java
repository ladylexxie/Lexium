package ladylexxie.lexium.data.client;

import ladylexxie.lexium.Lexium;
import ladylexxie.lexium.blocks.LexiumBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockstateGen extends BlockStateProvider {
	public BlockstateGen( DataGenerator gen, ExistingFileHelper exFileHelper ) {
		super(gen, Lexium.MOD_ID, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		Lexium.LOGGER.debug("Generating blockstate files...");
		simpleBlock(LexiumBlocks.LEXIUM_ORE.get());
		simpleBlock(LexiumBlocks.LEXIUM_BLOCK.get());
	}
}
