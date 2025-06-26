package fun.aurora4123.tpc.tips;

import fun.aurora4123.tpc.TouhouPixelCanteen;
import fun.aurora4123.tpc.initial.Tabs;
import fun.aurora4123.tpc.initial.items.MItems;
import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.tags.ITagManager;
import org.jetbrains.annotations.NotNull;
import vectorwing.farmersdelight.common.registry.ModItems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.FORGE)
public class ToolTipHandler {
    public static final Component MOD_NAME = Component.literal(TouhouPixelCanteen.MODID).withStyle(ChatFormatting.BLUE, ChatFormatting.ITALIC);
    @SubscribeEvent
    public static void setToolTip(ItemTooltipEvent event) {
        if (event.getItemStack().getItem() == MItems.POTATO_AND_CARROT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.cooked_potato_and_gold_carrot"));
        }
        if (event.getItemStack().getItem() == MItems.STOOL.get()) {
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.stool"));
        }
        if (event.getItemStack().getItem() == MItems.DESK.get()) {
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.desk"));
        }
        if (event.getItemStack().getItem() == MItems.UNPROCESS_DISH.get()) {
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.unprocess_dish"));
        }
        if (event.getItemStack().getItem() == MItems.DISH.get()) {
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.dish"));
        }
        if (event.getItemStack().getItem() == MItems.CASH.get()) {
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.cash"));
        }
        if (event.getItemStack().getItem() == MItems.EGG_WASH.get()) {
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.egg_wash"));
        }
        if (event.getItemStack().getItem() == MItems.EGGSHELL.get()) {
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.eggshell"));
        }
        if (event.getItemStack().getItem() == MItems.BOILED_EGG.get()) {
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.boilsh_egg"));
        }
        if (event.getItemStack().getItem() == MItems.BOILED_EGG_PEELED.get()) {
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.boilsh_egg_peeled"));
        }
        if (event.getItemStack().getItem() == MItems.BOILED_EGG_PEELED_HALF.get()) {
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.boilsh_egg_peeled_half"));
        }
        if (event.getItemStack().getItem() == MItems.TEA_EGG.get()) {
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.tea_egg"));
        }
        if (event.getItemStack().getItem() == MItems.MELON_FLESH.get()) {
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.melon_flesh"));
        }
        if (event.getItemStack().getItem() == MItems.MELON_RIND.get()) {
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.melon_rind"));
        }
        if (event.getItemStack().getItem() == MItems.MALTOSE.get()) {
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.maltose"));
        }
        if (event.getItemStack().getItem() == MItems.CHILI_PEPPER.get()) {
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.chili_pepper"));
        }
        if (event.getItemStack().getItem() == MItems.EGG_CUSTARD.get()) {
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.egg_custard"));
        }
        if (event.getItemStack().getItem() == MItems.SCRAMBLED_EGGS_WITH_TOMATO.get()) {
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.scrambled_eggs_with_tomato"));
        }
        if (event.getItemStack().getItem() == MItems.RICE_WITH_EGG.get()) {
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.rice_with_egg"));
        }
        if (event.getItemStack().getItem() == MItems.OYAKODON.get()) {
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.oyakodon"));
        }
        if (event.getItemStack().getItem() == MItems.SEAWEED_AND_EGG_SOUP.get()) {
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.seaweed_and_egg_soup"));
        }
        if (event.getItemStack().getItem() == MItems.PICKLE_CONGEE.get()) {
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.pickle_congee"));
        }
        if (event.getItemStack().getItem() == MItems.SLIME_SWIRLED_MUSHROOMS.get()) {
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.slime_swirled_mushrooms"));
        }
        if (event.getItemStack().getItem() == MItems.RICE_CONGEE.get()) {
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.rice_congee"));
        }

        if(event.getItemStack().getItem() == MItems.PUMPKIN_CONGEE.get()){
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.pumpkin_congee"));
        }
        if (event.getItemStack().getItem() == MItems.TAMAGO.get()) {
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.tamago"));
        }
        if (event.getItemStack().getItem() == MItems.WESTLAKE_FISH.get()) {
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.westlake_fish"));
        }
        if(event.getItemStack().getItem() == MItems.DONGPO_PORK.get()){
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.dongpo_pork"));
        }
        if(event.getItemStack().getItem() == MItems.FIRED_SOYBEAN_SCUM_ROL.get()){
            event.getToolTip().add(Component.translatable("tooltip.touhoupixelcanteen.fired_soybean_scum_rol"));
        }
        //下面是对农夫乐事食物进行的追加说明
        if (event.getItemStack().getItem() == ModItems.TOMATO.get()) {
            event.getToolTip().add(Component.translatable("tooltip.farmersdelight.tomato"));
        }
        if (event.getItemStack().getItem() == ModItems.COOKING_POT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.farmersdelight.cooking_pot"));
        }
        if (event.getItemStack().getItem() == ModItems.ONION.get()) {
            event.getToolTip().add(Component.translatable("tooltip.farmersdelight.onion"));
        }
        //下面是对Minecraft原版食物进行的tooltip追加
        if (event.getItemStack().getItem() == Items.CARROT) {
            event.getToolTip().add(Component.translatable("tooltip.minecraft.carrot"));
        }
        if (event.getItemStack().getItem() == Items.DRIED_KELP) {
            event.getToolTip().add(Component.translatable("tooltip.minecraft.kelp"));
        }
        if (event.getItemStack().getItem() == Items.POTATO) {
            event.getToolTip().add(Component.translatable("tooltip.minecraft.potato"));
        }
        if (event.getItemStack().getItem() == Items.PUMPKIN) {
            event.getToolTip().add(Component.translatable("tooltip.minecraft.pumpkin"));
        }
        if (event.getItemStack().getItem() == Items.BAMBOO) {
            event.getToolTip().add(Component.translatable("tooltip.minecraft.bamboo"));
        }
        if (event.getItemStack().getItem() == Items.EGG) {
            event.getToolTip().add(Component.translatable("tooltip.minecraft.egg"));
        }
        if (event.getItemStack().getItem() == Items.PORKCHOP) {
            event.getToolTip().add(Component.translatable("tooltip.minecraft.porkchop"));
        }
        if (event.getItemStack().getItem() == Items.BEEF) {
            event.getToolTip().add(Component.translatable("tooltip.minecraft.beef"));
        }
        if (event.getItemStack().getItem() == Items.PUFFERFISH) {
            event.getToolTip().add(Component.translatable("tooltip.minecraft.pufferfish"));
        }
        if (event.getItemStack().getItem() == Items.HONEY_BOTTLE) {
            event.getToolTip().add(Component.translatable("tooltip.minecraft.honey_bottle"));
        }
        if (event.getItemStack().getItem() == Items.SALMON) {
            event.getToolTip().add(Component.translatable("tooltip.minecraft.salmon"));
        }
        if (event.getItemStack().getItem() == Items.BROWN_MUSHROOM) {
            event.getToolTip().add(Component.translatable("tooltip.minecraft.mushroom"));
        }
        if (event.getItemStack().getItem() == Items.RED_MUSHROOM) {
            event.getToolTip().add(Component.translatable("tooltip.minecraft.mushroom"));
        }


        //请按如下格式为物品添加tooltip
//        if(event.getItemStack().getItem() == ...){------此处为需要添加tooltip的物品
//            event.getToolTip().add(Component.translatable("..."));------需要为物品添加的tooltip的翻译键
//        }
    }
    //大败而归家人们
}
