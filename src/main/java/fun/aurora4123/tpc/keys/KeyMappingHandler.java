package fun.aurora4123.tpc.keys;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.glfw.GLFW;
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class KeyMappingHandler {
    public static final Lazy<KeyMapping> GUI_STARTER =
            Lazy.of(() -> new KeyMapping(
                    "key.touhoupixelcanteen.openGui",
                    KeyConflictContext.UNIVERSAL,
                    InputConstants.Type.KEYSYM,
                    GLFW.GLFW_KEY_G,
                    "key.category.touhoupixelcanteeen.gui"
            ));

    @SubscribeEvent
    public static void regKeyBindings(RegisterKeyMappingsEvent e) {
        e.register(GUI_STARTER.get());
    }

}
