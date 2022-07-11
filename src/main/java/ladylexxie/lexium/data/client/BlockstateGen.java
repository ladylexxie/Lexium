package ladylexxie.lexium.data.client;

import ladylexxie.lexium.Lexium;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockstateGen extends BlockStateProvider {
	public BlockstateGen( DataGenerator gen, ExistingFileHelper exFileHelper ) {
		super(gen, Lexium.MOD_ID, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {

	}
}
