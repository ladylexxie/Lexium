package ladylexxie.lexium.items.armors;

import ladylexxie.lexium.LexiumCreativeTab;
import ladylexxie.lexium.items.tiers.LexiumArmorMaterials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;

public class LexiumArmor extends ArmorItem {
	public LexiumArmor( EquipmentSlot slot ) {
		super(LexiumArmorMaterials.LEXIUM, slot, new Item.Properties().tab(LexiumCreativeTab.TAB).fireResistant());
	}
}
