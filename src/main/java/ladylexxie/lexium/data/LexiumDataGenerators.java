package ladylexxie.lexium.data;

import ladylexxie.lexium.data.client.BlockModelGen;
import ladylexxie.lexium.data.client.BlockstateGen;
import ladylexxie.lexium.data.client.ItemModelGen;
import ladylexxie.lexium.data.client.LangGen;
import ladylexxie.lexium.data.server.RecipeGen;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber( bus = Mod.EventBusSubscriber.Bus.MOD )
public class LexiumDataGenerators {
	@SubscribeEvent
	public static void gatherData( GatherDataEvent event ) {
		DataGenerator generator = event.getGenerator();
		if( event.includeClient() ) {
			generator.addProvider(new LangGen(generator));
			generator.addProvider(new ItemModelGen(generator, event.getExistingFileHelper()));
			generator.addProvider(new BlockModelGen(generator, event.getExistingFileHelper()));
			generator.addProvider(new BlockstateGen(generator, event.getExistingFileHelper()));
		}
		if( event.includeServer() ) {
			generator.addProvider(new RecipeGen(generator));
		}
	}
}
