package fun.aurora4123.tpc.initial;

import fun.aurora4123.tpc.TouhouPixelCanteen;
import fun.aurora4123.tpc.initial.items.MItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class Tabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TouhouPixelCanteen.MODID);

    public static final RegistryObject<CreativeModeTab> MAIN = CREATIVE_TABS.register("main",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MItems.CASH.get())).title(Component.translatable("creativetab.main"))
                    .displayItems((itemDisplayParameters, output) ->{
                        output.accept(MItems.CASH.get());
                        output.accept(MItems.DESK.get());
                    }).build());
    public static void register(IEventBus bus) {
        CREATIVE_TABS.register(bus);
    }
}
