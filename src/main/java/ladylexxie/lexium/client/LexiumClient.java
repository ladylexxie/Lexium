package ladylexxie.lexium.client;

import ladylexxie.lexium.client.InitRenderTypes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod.EventBusSubscriber
@OnlyIn( Dist.CLIENT )
public class LexiumClient {
	public LexiumClient() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		bus.addListener(this::modelRegistryEvent);
	}

	@OnlyIn( Dist.CLIENT )
	public void modelRegistryEvent( ModelRegistryEvent event ) {
		InitRenderTypes.init();
	}
}
