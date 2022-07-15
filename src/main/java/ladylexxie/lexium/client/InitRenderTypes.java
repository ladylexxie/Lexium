package ladylexxie.lexium.client;

import ladylexxie.lexium.blocks.LexiumBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn( Dist.CLIENT )
public final class InitRenderTypes {
	private InitRenderTypes() { }

	public static void init() {
		System.out.println("BOOBS");
		ItemBlockRenderTypes.setRenderLayer(LexiumBlocks.LEXIUM_ORE.get(), RenderType.cutout());
	}
}
