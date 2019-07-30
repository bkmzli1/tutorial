package ru.bkmz.tutorial.items;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import ru.bkmz.tutorial.ModMain;

public class AllItems {
    @GameRegistry.ObjectHolder(ModMain.MODID +":key")
    public static Key key;
    @GameRegistry.ObjectHolder(ModMain.MODID + ":redonite_ingot")
    public static RedoniteIngot redoniteIngot;


    @SideOnly(Side.CLIENT)
    public static void initModels() {
        key.initModel();
        redoniteIngot.initModel();
    }


    public static void registerOreDictionary() {
        OreDictionary.registerOre("ingotIron", new ItemStack(AllItems.redoniteIngot));
    }
}
