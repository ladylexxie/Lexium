package ladylexxie.lexium.items.tools;

import ladylexxie.lexium.LexiumCreativeTab;
import ladylexxie.lexium.items.tiers.LexiumTier;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;

public class LexiumHoe extends HoeItem {
	public LexiumHoe() {
		super(LexiumTier.LEXIUM, -5, 0.0f, new Item.Properties().tab(LexiumCreativeTab.TAB).durability(10240).fireResistant());
	}
}
