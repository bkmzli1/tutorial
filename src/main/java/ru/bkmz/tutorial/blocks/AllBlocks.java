package ru.bkmz.tutorial.blocks;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.bkmz.tutorial.ModMain;

public class AllBlocks {
    @GameRegistry.ObjectHolder(ModMain.MODID + ":bathroomtile")
    public static BathroomTile bathroomTile;

    @GameRegistry.ObjectHolder(ModMain.MODID + ":redoniteore")
    public static RedoniteOre redoniteOre;

    @GameRegistry.ObjectHolder(ModMain.MODID + ":keyHole")
    public static KeyHole keyHole;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        bathroomTile.initModel();
        redoniteOre.initModel();
        keyHole.initModel();
    }

    @SideOnly(Side.CLIENT)
    public static void initBlockItemModels() {
        bathroomTile.initItemModel();
        redoniteOre.initItemModel();
        keyHole.initItemModel();
    }
    public static void registerOreDictionary()
    {

    }
}
