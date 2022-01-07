package mod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("painting_abundance")
public class PaintingAbundance
{


    private static final Logger LOGGER = LogManager.getLogger();

    public PaintingAbundance() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        Paintings.register();
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }





}
