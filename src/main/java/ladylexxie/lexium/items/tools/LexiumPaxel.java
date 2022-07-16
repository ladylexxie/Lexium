package ladylexxie.lexium.items.tools;

import ladylexxie.lexium.LexiumCreativeTab;
import ladylexxie.lexium.items.tiers.LexiumTier;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;

public class LexiumPaxel extends DiggerItem {
	public LexiumPaxel() {
		super(1, -2.8f, LexiumTier.LEXIUM, BlockTags.MINEABLE_WITH_PICKAXE, new Item.Properties().tab(LexiumCreativeTab.TAB).durability(10240).fireResistant());
	}

	@Override
	public float getDestroySpeed( ItemStack p_41004_, BlockState p_41005_) {
		return this.speed;
	}

	@Override
	public boolean isCorrectToolForDrops(ItemStack stack, BlockState state) {
		return net.minecraftforge.common.TierSortingRegistry.isCorrectTierForDrops(getTier(), state);
	}
}
