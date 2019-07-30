package ru.bkmz.tutorial.items;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.bkmz.tutorial.ModMain;

public class RedoniteIngot extends Item {
    String name = "redonite_ingot";
    public RedoniteIngot ()
    {
        setRegistryName(name);
        setUnlocalizedName(ModMain.MODID + ".redonite_ingot");
        setCreativeTab(CreativeTabs.MISC);
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}