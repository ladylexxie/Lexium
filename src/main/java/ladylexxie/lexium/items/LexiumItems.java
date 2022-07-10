package ladylexxie.lexium.items;

import ladylexxie.lexium.Lexium;
import ladylexxie.lexium.LexiumCreativeTab;
import ladylexxie.lexium.blocks.LexiumBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class LexiumItems {
	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Lexium.MOD_ID);

	public static void register(IEventBus bus) {
		ITEMS.register(bus);
	}

	public static RegistryObject<Item> registerItem( String id ){
		return ITEMS.register(id, () -> new Item(new Item.Properties().tab(LexiumCreativeTab.TAB).rarity(Rarity.EPIC)));
	}

	public static RegistryObject<Item> registerBlockItem( String id, Block block ){
		return ITEMS.register(id, () -> new BlockItem(block, new Item.Properties().tab(LexiumCreativeTab.TAB).rarity(Rarity.EPIC)));
	}

	public static final RegistryObject<Item> LEXIUM_INGOT = registerItem("lexium_ingot");
	public static final RegistryObject<Item> LEXIUM_ORE = registerBlockItem("lexium_ore", LexiumBlocks.LEXIUM_ORE.get());
}
