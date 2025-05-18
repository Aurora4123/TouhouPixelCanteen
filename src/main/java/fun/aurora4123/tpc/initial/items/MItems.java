package fun.aurora4123.tpc.initial.items;

import fun.aurora4123.tpc.TouhouPixelCanteen;
import fun.aurora4123.tpc.initial.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MItems {
    //创建注册机，create中传入要注册的物品类型和modid
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TouhouPixelCanteen.MODID);
    //使用RegistryObject通过注册机注册一个物品；
    public static final RegistryObject<Item> CASH =
                            //----↓注册名-------↓要注册的类型-------↓属性
            ITEMS.register("cash", () -> new Item(new Item.Properties().stacksTo(10240)));
    //注册方块对应的物品
    public static final RegistryObject<Item> DESK =
            ITEMS.register(
                    //直接获取方块的注册名
                    ModBlocks.DESK.getId().getPath(),
                    ()-> new BlockItem(
                            ModBlocks.DESK.get(),
                            //设置属性：最大堆叠64
                            new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> STOOL =
            ITEMS.register(
                    //直接获取方块的注册名
                    ModBlocks.STOOL.getId().getPath(),
                    ()-> new BlockItem(
                            ModBlocks.STOOL.get(),
                            //设置属性：最大堆叠64
                            new Item.Properties().stacksTo(64)));


}
