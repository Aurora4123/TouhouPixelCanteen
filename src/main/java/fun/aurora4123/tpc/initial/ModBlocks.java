package fun.aurora4123.tpc.initial;

import fun.aurora4123.tpc.TouhouPixelCanteen;
import it.unimi.dsi.fastutil.chars.CharImmutableList;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import fun.aurora4123.tpc.initial.blocks.DeskBlock;
import fun.aurora4123.tpc.initial.blocks.DishBlock;
import fun.aurora4123.tpc.initial.blocks.EggShell;
import fun.aurora4123.tpc.initial.blocks.StoolBlock;
import fun.aurora4123.tpc.initial.blocks.UniversalBowl;
import fun.aurora4123.tpc.initial.blocks.UniversalDish;
import fun.aurora4123.tpc.initial.blocks.ChiliPepperBlock;


public class ModBlocks {
    //注册机：与注册物品相同，将类型改为方块即可
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TouhouPixelCanteen.MODID);
    //使用注册机注册方块
    public static RegistryObject<Block> DESK = BLOCKS.register("desk", DeskBlock::new);
    //方块需要有对应的方块物品，方块物品的注册详见MItems.java
    public static RegistryObject<Block> STOOL = BLOCKS.register("stool", StoolBlock::new);
    //下面是植物示例
    public static RegistryObject<Block> CHILI_PEPPER_BLOCK = BLOCKS.register("cabbages", () -> new ChiliPepperBlock(Block.Properties.copy(Blocks.WHEAT)));
    public static RegistryObject<Block> EGGSHELL = BLOCKS.register("eggshell", EggShell::new);
    public static RegistryObject<Block> DISH = BLOCKS.register("dish", DishBlock::new);
    public static RegistryObject<Block> SCRAMBLED_EGGS_WITH_TOMATO = BLOCKS.register("scrambled_eggs_with_tomato", UniversalDish::new);
    public static RegistryObject<Block> EGG_CUSTARD = BLOCKS.register("egg_custard", UniversalBowl::new);
    public static RegistryObject<Block> RICE_WITH_EGG = BLOCKS.register("rice_with_egg", UniversalBowl::new);
    public static RegistryObject<Block> OYAKODON = BLOCKS.register("oyakodon", UniversalBowl::new);
    public static RegistryObject<Block> SEAWEED_AND_EGG_SOUP = BLOCKS.register("seaweed_and_egg_soup", UniversalBowl::new);
    public static RegistryObject<Block> PICKLE_CONGEE = BLOCKS.register("pickle_congee", UniversalBowl::new);
    public static RegistryObject<Block> SLIME_SWIRLED_MUSHROOMS = BLOCKS.register("slime_swirled_mushrooms", UniversalBowl::new);
    public static RegistryObject<Block> RICE_CONGEE = BLOCKS.register("rice_congee", UniversalBowl::new);
    public static RegistryObject<Block> PUMPKIN_CONGEE = BLOCKS.register("pumpkin_congee", UniversalBowl::new);
    public static RegistryObject<Block> TAMAGO = BLOCKS.register("tamago", UniversalDish::new);
    public static RegistryObject<Block> WESTLAKE_FISH = BLOCKS.register("westlake_fish", UniversalDish::new);
    public static RegistryObject<Block> DONGPO_PORK = BLOCKS.register("dongpo_pork", UniversalDish::new);
    public static RegistryObject<Block> FIRED_SOYBEAN_SCUM_ROL = BLOCKS.register("fired_soybean_scum_rol", UniversalDish::new);
}
