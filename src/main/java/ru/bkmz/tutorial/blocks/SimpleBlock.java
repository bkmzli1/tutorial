package ru.bkmz.tutorial.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SimpleBlock extends Block
{
  protected String name;
  
  public SimpleBlock(Material material, String name)
  {
    super(material);
    this.name = name;
    
    setRegistryName("theothersidecore." + name);
    setRegistryName(name);
  }
  
  @SideOnly(Side.CLIENT)
  public void initModel() {
    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
  }
  
  @SideOnly(Side.CLIENT)
  public void initItemModel()
  {
    Item itemBlock = (Item)Item.REGISTRY.getObject(new net.minecraft.util.ResourceLocation("theothersidecore", name));
    ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation(getRegistryName(), "inventory");
    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlock, 0, itemModelResourceLocation);
  }
}
