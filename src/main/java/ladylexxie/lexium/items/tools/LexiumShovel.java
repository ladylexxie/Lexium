package ladylexxie.lexium.items.tools;

import ladylexxie.lexium.LexiumCreativeTab;
import ladylexxie.lexium.items.tiers.LexiumTier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;

public class LexiumShovel extends ShovelItem {
	public LexiumShovel() {
		super(LexiumTier.LEXIUM, 1.5f, -3.0f, new Item.Properties().tab(LexiumCreativeTab.TAB).durability(10240).fireResistant());
	}
}
