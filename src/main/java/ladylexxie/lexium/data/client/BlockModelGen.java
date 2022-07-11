package ladylexxie.lexium.data.client;

import ladylexxie.lexium.Lexium;
import ladylexxie.lexium.blocks.LexiumBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockModelGen extends BlockModelProvider {
	public BlockModelGen( DataGenerator generator, ExistingFileHelper existingFileHelper ) {
		super(generator, Lexium.MOD_ID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		basicBlock(LexiumBlocks.LEXIUM_ORE.get());
		basicBlock(LexiumBlocks.LEXIUM_BLOCK.get());
	}

	private void basicBlock( Block block ) {
		String name = Registry.BLOCK.getKey(block).getPath();
		withExistingParent(name, "block/cube_all").texture("all", "lexium:block/" + name);
	}
}
