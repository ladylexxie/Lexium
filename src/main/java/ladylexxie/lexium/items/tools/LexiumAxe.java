package ladylexxie.lexium.items.tools;

import ladylexxie.lexium.LexiumCreativeTab;
import ladylexxie.lexium.items.tiers.LexiumTier;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;

public class LexiumAxe extends AxeItem {
	public LexiumAxe() {
		super(LexiumTier.LEXIUM, 5.0f, -2.8f, new Item.Properties().tab(LexiumCreativeTab.TAB).durability(10240).fireResistant());
	}
}
