package ladylexxie.lexium.blocks;

import ladylexxie.lexium.Lexium;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class LexiumBlocks {
	private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Lexium.MOD_ID);

	public static void register( IEventBus bus ) { BLOCKS.register(bus); }

	public static final RegistryObject<Block> LEXIUM_ORE = BLOCKS.register("lexium_ore", LexiumOreBlock::new);
}
