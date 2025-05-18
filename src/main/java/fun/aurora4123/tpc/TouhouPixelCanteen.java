package fun.aurora4123.tpc;

import fun.aurora4123.tpc.initial.ModBlocks;
import fun.aurora4123.tpc.initial.Tabs;
import fun.aurora4123.tpc.initial.items.MItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TouhouPixelCanteen.MODID)
public class TouhouPixelCanteen
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "touhoupixelcanteen";



    public TouhouPixelCanteen(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();
        MItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        Tabs.register(modEventBus);
    }
}
