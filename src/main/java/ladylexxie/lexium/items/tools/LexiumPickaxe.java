package ladylexxie.lexium.items.tools;

import ladylexxie.lexium.util.LexiumCreativeTab;
import ladylexxie.lexium.items.tiers.LexiumTier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;

public class LexiumPickaxe extends PickaxeItem {
	public LexiumPickaxe() {
		super(LexiumTier.LEXIUM, 1, -2.8f, new Item.Properties().tab(LexiumCreativeTab.TAB).durability(10240).fireResistant());
	}
}
