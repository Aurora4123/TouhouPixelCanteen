package fun.aurora4123.tpc.initial.items;

import fun.aurora4123.tpc.TouhouPixelCanteen;
import fun.aurora4123.tpc.initial.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MItems {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TouhouPixelCanteen.MODID);

    public static final RegistryObject<Item> CASH = ITEMS.register("cash", () -> new Item(new Item.Properties().stacksTo(10240)));
    public static final RegistryObject<Item> DESK = ITEMS.register(ModBlocks.DESK.getId().getPath(), ()-> new BlockItem(ModBlocks.DESK.get(), new Item.Properties().stacksTo(64)));


}
