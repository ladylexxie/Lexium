package ladylexxie.lexium.world;

import ladylexxie.lexium.Lexium;
import ladylexxie.lexium.world.gen.LexiumOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber( modid = Lexium.MOD_ID )
public class LexiumWorldGenEvents {
	@SubscribeEvent
	public static void biomeLoadingEvent( final BiomeLoadingEvent event ) {
		LexiumOreGeneration.generateOres(event);
	}
}
