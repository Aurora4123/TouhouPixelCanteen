package fun.aurora4123.tpc.initial.fluids;

import com.tterrag.registrate.util.entry.FluidEntry;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fluids.ForgeFlowingFluid;

import static fun.aurora4123.tpc.TouhouPixelCanteen.REGISTRATE;

public class Fluids {
    //注册醋
    public static final FluidEntry<ForgeFlowingFluid.Flowing> VINEGAR = REGISTRATE.fluid("vinegar",
                    new ResourceLocation("touhoupixelcanteen:fluid/vinegar_still"), //这是第一行有问题的代码，下面那行是第二行
                    new ResourceLocation("touhoupixelcanteen:fluid/vinegar_flow")) //这两行代码在编译时会提示一个过时提示，实际似乎确实跑不了，但是少了就NPE，需要解决一下
            .lang(f -> "fluid.touhoupixelcanteen.vinegar", "Vinegar")//我不知道这个name有什么意义。但是机械动力是这么写的
            .properties(p -> p.viscosity(1000) //粘性
                    .density(140).canSwim(true))  //密度，还有能不能在里面泡澡
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2) //每个方块减少多少流体
                    .tickRate(15)    //可能是流动速度
                    .slopeFindDistance(6)   //能流多远
                    .explosionResistance(100F))  //抗爆
            .source(ForgeFlowingFluid.Source::new)  //不知道，抄来的，拼好醋
            .register();

        public static void register() {}
}
