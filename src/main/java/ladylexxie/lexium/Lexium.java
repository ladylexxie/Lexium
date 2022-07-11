package ladylexxie.lexium;

import com.mojang.logging.LogUtils;
import ladylexxie.lexium.blocks.LexiumBlocks;
import ladylexxie.lexium.items.LexiumItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Lexium.MOD_ID)
public class Lexium {
    public static final String MOD_ID = "lexium";
    public static final String MOD_NAME = "Lexium";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Lexium(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
//        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);
//        Config.loadConfig(Config.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve(PerpetualDurability.MOD_ID + "-common.toml").toString());

        MinecraftForge.EVENT_BUS.register(this);

        LexiumBlocks.register(bus);
        LexiumItems.register(bus);
    }
}
