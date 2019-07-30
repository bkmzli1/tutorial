package ru.bkmz.tutorial.proxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ru.bkmz.tutorial.blocks.BathroomTile;
import ru.bkmz.tutorial.blocks.AllBlocks;
import ru.bkmz.tutorial.blocks.KeyHole;
import ru.bkmz.tutorial.blocks.RedoniteOre;
import ru.bkmz.tutorial.items.AllItems;
import ru.bkmz.tutorial.items.Key;
import ru.bkmz.tutorial.items.RedoniteIngot;
import ru.bkmz.tutorial.world.RedoniteGenerator;


@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
    }

    public void init(FMLInitializationEvent e) {
        GameRegistry.registerWorldGenerator(new RedoniteGenerator(), 0);
        GameRegistry.addSmelting(new ItemStack(AllBlocks.redoniteOre), new ItemStack(AllItems.redoniteIngot), 100);
        AllItems.registerOreDictionary();
        AllBlocks.registerOreDictionary();
    }

    public void postInit(FMLPostInitializationEvent e) {
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new Key());
        event.getRegistry().register(new RedoniteIngot());

        event.getRegistry().register(new ItemBlock(AllBlocks.bathroomTile).setRegistryName(AllBlocks.bathroomTile.getRegistryName()));
        event.getRegistry().register(new ItemBlock(AllBlocks.redoniteOre).setRegistryName(AllBlocks.redoniteOre.getRegistryName()));
        event.getRegistry().register(new ItemBlock(AllBlocks.keyHole).setRegistryName(AllBlocks.keyHole.getRegistryName()));
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new BathroomTile());
        event.getRegistry().register(new RedoniteOre());
        event.getRegistry().register(new KeyHole());
    }
}
