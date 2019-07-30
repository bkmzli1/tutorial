package ru.zigthehedge.tutorial.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import ru.zigthehedge.tutorial.Tutorial;

public class Key extends Item {
    public Key ()
    {
        setRegistryName("key");
        setUnlocalizedName(Tutorial.MODID + ".key");
        setCreativeTab(CreativeTabs.MISC);
    }

    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
