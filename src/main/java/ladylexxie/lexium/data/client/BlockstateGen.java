package ladylexxie.lexium.data.client;

import ladylexxie.lexium.Lexium;
import ladylexxie.lexium.blocks.LexiumBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
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
//		basicBlock(LexiumBlocks.LEXIUM_BLOCK.get());
	}

//	private void basicBlock( Block block ) {
//		String name = Registry.BLOCK.getKey(block).getPath();
//		simpleBlock(LexiumBlocks.LEXIUM_BLOCK.get(), models().cubeAll(name, new ResourceLocation(Lexium.MOD_ID, "block/" + name)));
//	}
}
