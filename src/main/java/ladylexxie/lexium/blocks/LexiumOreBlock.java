package ladylexxie.lexium.blocks;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;

import javax.annotation.Nullable;
import java.util.List;

public class LexiumOreBlock extends Block {
	public LexiumOreBlock() {
		super(Properties.of(Material.STONE)
				.strength(3.0f)
				.requiresCorrectToolForDrops()
		);
	}

	@Override
	public void appendHoverText( ItemStack stack, @Nullable BlockGetter reader, List<Component> list, TooltipFlag flags ) {
		list.add(new TranslatableComponent("tooltip.lexium_ore"));
	}
}
