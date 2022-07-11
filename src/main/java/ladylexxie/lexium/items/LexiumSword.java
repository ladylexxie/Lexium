package ladylexxie.lexium.items;

import ladylexxie.lexium.LexiumCreativeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

public class LexiumSword extends SwordItem {
	public LexiumSword() {
		super(Tiers.NETHERITE, 59, 100.0f, new Item.Properties().tab(LexiumCreativeTab.TAB).durability(10240));
	}
}
