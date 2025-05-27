package fun.aurora4123.tpc.tips;

import fun.aurora4123.tpc.TouhouPixelCanteen;
import fun.aurora4123.tpc.initial.Tabs;
import fun.aurora4123.tpc.initial.items.MItems;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.FORGE)
public class ToolTipHandler {
    public static final Component MOD_NAME = Component.literal(TouhouPixelCanteen.MODID).withStyle(ChatFormatting.BLUE, ChatFormatting.ITALIC);
    @SubscribeEvent
    public static void setToolTip(ItemTooltipEvent event) {
        if(event.getItemStack().getItem() == MItems.POTATO_AND_CARROT.get()){
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.cooked_potato_and_gold_carrot"));
        }
        //请按如下格式为物品添加tooltip
//        if(event.getItemStack().getItem() == ...){------此处为需要添加tooltip的物品
//            event.getToolTip().add(Component.translatable("..."));------需要为物品添加的tooltip的翻译键
//        }
    }
}
