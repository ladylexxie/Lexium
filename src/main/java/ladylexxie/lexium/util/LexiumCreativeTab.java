package ladylexxie.lexium.util;

import ladylexxie.lexium.items.LexiumItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class LexiumCreativeTab extends CreativeModeTab {
	public static CreativeModeTab TAB = new LexiumCreativeTab();

	private LexiumCreativeTab() {super("lexium_creative_tab");}

	@Override
	public @NotNull ItemStack makeIcon() {
		return new ItemStack(LexiumItems.LEXIUM_INGOT.get());
	}
}
