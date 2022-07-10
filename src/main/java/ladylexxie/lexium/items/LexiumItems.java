package ladylexxie.lexium.items;

import ladylexxie.lexium.Lexium;
import ladylexxie.lexium.LexiumCreativeTab;
import ladylexxie.lexium.blocks.LexiumBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class LexiumItems {
	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Lexium.MOD_ID);

	public static void register(IEventBus bus) {
		ITEMS.register(bus);
	}

	public static final RegistryObject<LexiumIngot> LEXIUM_INGOT = ITEMS.register("lexium_ingot", LexiumIngot::new);
	public static final RegistryObject<Item> LEXIUM_ORE = ITEMS.register("lexium_ore", () -> new BlockItem(LexiumBlocks.LEXIUM_ORE.get(), new Item.Properties().tab(LexiumCreativeTab.TAB).rarity(Rarity.EPIC)));
}
