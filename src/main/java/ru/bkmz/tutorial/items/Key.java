package ru.bkmz.tutorial.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import ru.bkmz.tutorial.ModMain;

public class Key extends Item {
   public static String name = "key";
    public Key ()
    {
        setRegistryName(name);
        setUnlocalizedName(ModMain.MODID + ".key");
        setCreativeTab(CreativeTabs.MISC);
    }

    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
