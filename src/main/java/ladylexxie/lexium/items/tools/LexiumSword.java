package ladylexxie.lexium.items.tools;

import ladylexxie.lexium.LexiumCreativeTab;
import ladylexxie.lexium.items.tiers.LexiumTier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

public class LexiumSword extends SwordItem {
	public LexiumSword() {
		super(LexiumTier.LEXIUM, 58, 124.0f, new Item.Properties().tab(LexiumCreativeTab.TAB).durability(10240).fireResistant());
	}
}
