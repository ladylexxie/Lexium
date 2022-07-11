package ladylexxie.lexium.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LexiumDataGenerators {
	@SubscribeEvent
	public static void gatherData( GatherDataEvent event ){
		DataGenerator generator = event.getGenerator();
		if(event.includeClient()){
			generator.addProvider(new LangGen(generator));
		}
		if(event.includeServer()){
			generator.addProvider(new RecipeGen(generator));
		}
	}
}
