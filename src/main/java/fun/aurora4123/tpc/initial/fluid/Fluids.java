package fun.aurora4123.tpc.initial.fluid;

import fun.aurora4123.tpc.initial.ModBlocks;
import fun.aurora4123.tpc.initial.items.MItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;

import fun.aurora4123.tpc.TouhouPixelCanteen;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class Fluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, TouhouPixelCanteen.MODID);

    // 流体属性
    public static final RegistryObject<FlowingFluid> VINEGAR_SOURCE = FLUIDS.register("vinegar",
            () -> new ForgeFlowingFluid.Source(Fluids.VINEGAR_PROPERTIES));

    public static final RegistryObject<FlowingFluid> VINEGAR_FLOWING = FLUIDS.register("vinegar_flowing",
            () -> new ForgeFlowingFluid.Flowing(Fluids.VINEGAR_PROPERTIES));

    // 流体属性配置
    public static final ForgeFlowingFluid.Properties VINEGAR_PROPERTIES = new ForgeFlowingFluid.Properties(
            FluidTypes.VINEGAR_TYPE,
            VINEGAR_SOURCE,
            VINEGAR_FLOWING)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.VINEGAR_BLOCK::get)
            .bucket(MItems.VINEGAR_BUCKET::get);
   }

