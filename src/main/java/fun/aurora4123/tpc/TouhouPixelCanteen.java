package fun.aurora4123.tpc;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.builders.FluidBuilder;
import com.tterrag.registrate.util.entry.FluidEntry;
import fun.aurora4123.tpc.initial.ModBlocks;
import fun.aurora4123.tpc.initial.Tabs;
import fun.aurora4123.tpc.initial.fluids.Fluids;
import fun.aurora4123.tpc.initial.items.MItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.anningui.iui_forge.ImproperUIAPI;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TouhouPixelCanteen.MODID)
public class TouhouPixelCanteen
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "touhoupixelcanteen";
    public static final Registrate REGISTRATE = Registrate.create("touhoupixelcanteen");



    //注册物品或方块时需要用到的模型及纹理文件目录(均在resources目录的assets下)：
    //物品模型：models/item; 方块：~/block(注意不是blocks)
    //材质：/textures/item(或者block)
    //方块状态：blockstates
    //语言文件：lang/zh_cn(en_us);
    public TouhouPixelCanteen(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();
        //所有物品注册到总线
        MItems.ITEMS.register(modEventBus);
        //所有方块注册到总线
        ModBlocks.BLOCKS.register(modEventBus);
        //注册创造模式物品栏到总线
        Tabs.register(modEventBus);
        //注册流体
        Fluids.register();

        //ImproperUIAPI.init(TouhouPixelCanteen.MODID, TouhouPixelCanteen.class,
        //      "1.ui");
        initGui(TouhouPixelCanteen.class, "assets/touhoupixelcanteen/improperui/test.ui","1.ui");
    }
    public static void initGui(Class<?> clazz,String... scriptPath){
        ImproperUIAPI.init(TouhouPixelCanteen.MODID, clazz, scriptPath);
    }

}
