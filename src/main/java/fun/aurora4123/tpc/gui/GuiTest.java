package fun.aurora4123.tpc.gui;

import fun.aurora4123.tpc.TouhouPixelCanteen;
import fun.aurora4123.tpc.keys.KeyMappingHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.anningui.iui_forge.ImproperUIAPI;


@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class GuiTest {
    @SubscribeEvent
    public static void openGui(TickEvent.ClientTickEvent e) {

    }
}
