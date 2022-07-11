package ladylexxie.lexium.items;

import ladylexxie.lexium.LexiumCreativeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class LexiumIngot extends Item {

	public LexiumIngot() {
		super(new Item.Properties()
				.tab(LexiumCreativeTab.TAB)
				.rarity(Rarity.EPIC)
		);
	}

	@Override
	public void appendHoverText( @NotNull ItemStack stack, Level level, List<Component> list, TooltipFlag flags ) {
		list.add(new TranslatableComponent("tooltip.lexium.lexium_ingot"));
	}
}
