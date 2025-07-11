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
    //注册机，创建注册类型为创造物品栏
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TouhouPixelCanteen.MODID);
    //通过注册机进行注册
    public static final RegistryObject<CreativeModeTab> MAIN = CREATIVE_TABS.register("main",
            //注册的物品栏图标所对应的物品以及物品栏本身的名称
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MItems.CASH.get())).title(Component.translatable("creativetab.main"))
                    //物品栏中要显示的物品
                    .displayItems((itemDisplayParameters, output) ->{
                        output.accept(MItems.CASH.get());
                        output.accept(MItems.UNPROCESS_DISH.get());
                        output.accept(MItems.DISH.get());
                        output.accept(MItems.DESK.get());
                        output.accept(MItems.STOOL.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> FOOD =
            CREATIVE_TABS.register("food",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(MItems.RICE_WITH_EGG.get())).title(Component.translatable("creativetab.food"))
                            .displayItems((itemDisplayParameters, output) -> {
                                //请在此处添加已注册的菜品
                                //output.accept(/.../);
                                //output.accept(MItems.POTATO_AND_CARROT.get());
                                output.accept(MItems.CHILI_PEPPER_SEED.get());
                                output.accept(MItems.EGG_WASH.get());
                                output.accept(MItems.EGGSHELL.get());
                                output.accept(MItems.BOILED_EGG.get());
                                output.accept(MItems.BOILED_EGG_PEELED.get());
                                output.accept(MItems.BOILED_EGG_PEELED_HALF.get());
                                output.accept(MItems.TEA_EGG.get());
                                output.accept(MItems.MELON_FLESH.get());
                                output.accept(MItems.MELON_RIND.get());
                                output.accept(MItems.MALTOSE.get());
                                output.accept(MItems.CHILI_PEPPER.get());
                                output.accept(MItems.EGG_CUSTARD.get());
                                output.accept(MItems.RICE_WITH_EGG.get());
                                output.accept(MItems.OYAKODON.get());
                                output.accept(MItems.SEAWEED_AND_EGG_SOUP.get());
                                output.accept(MItems.RICE_CONGEE.get());
                                output.accept(MItems.PICKLE_CONGEE.get());
                                output.accept(MItems.SLIME_SWIRLED_MUSHROOMS.get());
                                output.accept(MItems.PUMPKIN_CONGEE.get());
                                output.accept(MItems.SCRAMBLED_EGGS_WITH_TOMATO.get());
                                output.accept(MItems.TAMAGO.get());
                                output.accept(MItems.WESTLAKE_FISH.get());
                                output.accept(MItems.DONGPO_PORK.get());
                                output.accept(MItems.FIRED_SOYBEAN_SCUM_ROL .get());
                            }).build());
    /**
     * 将内容注册到一个总线上
     * @param bus 需要进行内容注册的总线
     */
    public static void register(IEventBus bus) {
        CREATIVE_TABS.register(bus);
    }
}
