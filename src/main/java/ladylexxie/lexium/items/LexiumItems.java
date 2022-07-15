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
	public static final RegistryObject<LexiumSword> LEXIUM_SWORD = ITEMS.register("lexium_sword", LexiumSword::new);
	public static final RegistryObject<LexiumPickaxe> LEXIUM_PICKAXE = ITEMS.register("lexium_pickaxe", LexiumPickaxe::new);
	public static final RegistryObject<LexiumAxe> LEXIUM_AXE = ITEMS.register("lexium_axe", LexiumAxe::new);
	public static final RegistryObject<LexiumShovel> LEXIUM_SHOVEL = ITEMS.register("lexium_shovel", LexiumShovel::new);
	public static final RegistryObject<LexiumHoe> LEXIUM_HOE = ITEMS.register("lexium_hoe", LexiumHoe::new);

	public static final RegistryObject<Item> LEXIUM_ORE = ITEMS.register("lexium_ore", () -> new BlockItem(LexiumBlocks.LEXIUM_ORE.get(), new Item.Properties().tab(LexiumCreativeTab.TAB).rarity(Rarity.EPIC)));
	public static final RegistryObject<Item> LEXIUM_BLOCK = ITEMS.register("lexium_block", () -> new BlockItem(LexiumBlocks.LEXIUM_BLOCK.get(), new Item.Properties().tab(LexiumCreativeTab.TAB).rarity(Rarity.EPIC)));
}
