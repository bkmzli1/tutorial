package ru.bkmz.tutorial.gui;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.bkmz.tutorial.ModMain;
import ru.bkmz.tutorial.blocks.AllBlocks;

public class ITPCreativeTab extends CreativeTabs {


    public ITPCreativeTab() {
        super(ModMain.MODID);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(AllBlocks.keyHole);
    }
}
