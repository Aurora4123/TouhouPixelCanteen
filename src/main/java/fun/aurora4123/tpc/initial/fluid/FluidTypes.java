package fun.aurora4123.tpc.initial.fluid;


import fun.aurora4123.tpc.TouhouPixelCanteen;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;
import net.minecraftforge.common.SoundActions;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Consumer;

public class FluidTypes {
    public static final ResourceLocation VINEGAR_STILL_TEXTURE = new ResourceLocation("touhoupixelcanteen:fluid/vinegar_still");
    public static final ResourceLocation VINEGAR_FLOWING_TEXTURE = new ResourceLocation("touhoupixelcanteen:fluid/vinegar_flow");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, TouhouPixelCanteen.MODID);

    public static final RegistryObject<FluidType> VINEGAR_TYPE = register("vinegar",
            FluidType.Properties.create()
                    .density(1010)
                    .viscosity(1200)
                    .temperature(295)
                    .canSwim(false)
                    .canDrown(true)
                    .canPushEntity(true)
                    .canHydrate(false)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)
    );

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new FluidType(properties) {
            @Override
            public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
                consumer.accept(new IClientFluidTypeExtensions() {
                    @Override
                    public ResourceLocation getStillTexture() {
                        return VINEGAR_STILL_TEXTURE;
                    }

                    @Override
                    public ResourceLocation getFlowingTexture() {
                        return VINEGAR_FLOWING_TEXTURE;
                    }

                    @Override
                    public int getTintColor() {
                        return 0xFFF5F5DC;
                    }
                });
            }
        });
    }
}
