package fun.aurora4123.tpc.initial.items;

import fun.aurora4123.tpc.TouhouPixelCanteen;
import fun.aurora4123.tpc.initial.ModBlocks;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MItems {
    //创建注册机，create中传入要注册的物品类型和modid
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TouhouPixelCanteen.MODID);
    //使用RegistryObject通过注册机注册一个物品；
    public static final RegistryObject<Item> CASH =
                            //----↓注册名-------↓要注册的类型-------↓属性
            ITEMS.register("cash", () -> new Item(new Item.Properties().stacksTo(10240)));
    //注册方块对应的物品
    public static final RegistryObject<Item> DESK =
            ITEMS.register(
                    //直接获取方块的注册名
                    ModBlocks.DESK.getId().getPath(),
                    ()-> new BlockItem(
                            ModBlocks.DESK.get(),
                            //设置属性：最大堆叠64
                            new Item.Properties().stacksTo(64)));
    //凳子
    public static final RegistryObject<Item> STOOL =
            ITEMS.register(
                    //直接获取方块的注册名
                    ModBlocks.STOOL.getId().getPath(),
                    ()-> new BlockItem(
                            ModBlocks.STOOL.get(),
                            //设置属性：最大堆叠64
                            new Item.Properties().stacksTo(64)));
    //
    public static final RegistryObject<Item> POTATO_AND_CARROT =
          ITEMS.register(
                  "cooked_potato_and_gold_carrot",
                  () -> new Item(
                          new Item.Properties()
                                  .food(
                                          new FoodProperties.Builder()
                                                  .nutrition(11)
                                                  .saturationMod(20.4F)
                                                  .build()
                                  )
                  )
          );

//    public static final RegistryObject<Item> FOOD =
//            ITEMS.register(
//                    "example_food",
//                    () -> new Item(
//                            new Item.Properties()------物品属性
//                                    .food(------可食用
//                                            new FoodProperties.Builder()
//                                                    .nutrition(2)-----饱食度
//                                                    .saturationMod(0.6F)------饱和度
//                                                    .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 600, 0), 1.0f)------食用后的效果，可多次添加
//                                                    .effect(() -> {...})
//                                            .build()
//                                    )
//                    )
//            )
}
