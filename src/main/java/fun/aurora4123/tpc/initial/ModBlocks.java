package fun.aurora4123.tpc.initial;

import fun.aurora4123.tpc.TouhouPixelCanteen;
import fun.aurora4123.tpc.initial.blocks.DeskBlock;
import fun.aurora4123.tpc.initial.blocks.DishBlock;
import fun.aurora4123.tpc.initial.blocks.EggShell;
import fun.aurora4123.tpc.initial.blocks.StoolBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModBlocks {
    //注册机：与注册物品相同，将类型改为方块即可
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TouhouPixelCanteen.MODID);
    //使用注册机注册方块
    public static RegistryObject<Block> DESK = BLOCKS.register("desk", DeskBlock::new);
    //方块需要有对应的方块物品，方块物品的注册详见MItems.java
    public static RegistryObject<Block> STOOL = BLOCKS.register("stool", StoolBlock::new);
    public static RegistryObject<Block> EGGSHELL = BLOCKS.register("eggshell", EggShell::new);
    public static RegistryObject<Block> DISH = BLOCKS.register("dish", DishBlock::new);

}
