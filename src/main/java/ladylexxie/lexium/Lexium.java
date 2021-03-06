package ladylexxie.lexium;

import com.mojang.logging.LogUtils;
import ladylexxie.lexium.blocks.LexiumBlocks;
import ladylexxie.lexium.client.LexiumClient;
import ladylexxie.lexium.items.LexiumItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod( Lexium.MOD_ID )
public class Lexium {
	public static final String MOD_ID = "lexium";
	public static final String MOD_NAME = "Lexium";
	public static final Logger LOGGER = LogUtils.getLogger();

	public Lexium() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		LexiumBlocks.register(bus);
		LexiumItems.register(bus);

		MinecraftForge.EVENT_BUS.register(this);

		DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> LexiumClient::new);
	}

	public static ResourceLocation resourceLocation( String location ) { return new ResourceLocation(MOD_ID, location); }
}
