package ladylexxie.lexium.items;

import ladylexxie.lexium.Lexium;
import ladylexxie.lexium.util.LexiumCreativeTab;
import ladylexxie.lexium.blocks.LexiumBlocks;
import ladylexxie.lexium.items.armors.LexiumArmor;
import ladylexxie.lexium.items.tools.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class LexiumItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Lexium.MOD_ID);
	public static final DeferredRegister<Item> BLOCKITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Lexium.MOD_ID);
	public static final DeferredRegister<Item> TOOLS = DeferredRegister.create(ForgeRegistries.ITEMS, Lexium.MOD_ID);

	public static void register( IEventBus bus ) {
		ITEMS.register(bus);
		BLOCKITEMS.register(bus);
		TOOLS.register(bus);
	}

	public static final RegistryObject<LexiumIngot> LEXIUM_INGOT = ITEMS.register("lexium_ingot", LexiumIngot::new);
	public static final RegistryObject<LexiumSword> LEXIUM_SWORD = TOOLS.register("lexium_sword", LexiumSword::new);
	public static final RegistryObject<LexiumPickaxe> LEXIUM_PICKAXE = TOOLS.register("lexium_pickaxe", LexiumPickaxe::new);
	public static final RegistryObject<LexiumAxe> LEXIUM_AXE = TOOLS.register("lexium_axe", LexiumAxe::new);
	public static final RegistryObject<LexiumShovel> LEXIUM_SHOVEL = TOOLS.register("lexium_shovel", LexiumShovel::new);
	public static final RegistryObject<LexiumHoe> LEXIUM_HOE = TOOLS.register("lexium_hoe", LexiumHoe::new);
	public static final RegistryObject<LexiumPaxel> LEXIUM_PAXEL = TOOLS.register("lexium_paxel", LexiumPaxel::new);
	public static final RegistryObject<LexiumArmor> LEXIUM_HELMET = ITEMS.register("lexium_helmet", () -> new LexiumArmor(EquipmentSlot.HEAD));
	public static final RegistryObject<LexiumArmor> LEXIUM_CHESTPLATE = ITEMS.register("lexium_chestplate", () -> new LexiumArmor(EquipmentSlot.CHEST));
	public static final RegistryObject<LexiumArmor> LEXIUM_LEGGINGS = ITEMS.register("lexium_leggings", () -> new LexiumArmor(EquipmentSlot.LEGS));
	public static final RegistryObject<LexiumArmor> LEXIUM_BOOTS = ITEMS.register("lexium_boots", () -> new LexiumArmor(EquipmentSlot.FEET));

	public static final RegistryObject<Item> LEXIUM_ORE = BLOCKITEMS.register("lexium_ore", () -> new BlockItem(LexiumBlocks.LEXIUM_ORE.get(), new Item.Properties().tab(LexiumCreativeTab.TAB).rarity(Rarity.EPIC)));
	public static final RegistryObject<Item> LEXIUM_BLOCK = BLOCKITEMS.register("lexium_block", () -> new BlockItem(LexiumBlocks.LEXIUM_BLOCK.get(), new Item.Properties().tab(LexiumCreativeTab.TAB).rarity(Rarity.EPIC)));
}
