package ru.bkmz.tutorial;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import ru.bkmz.tutorial.gui.ITPCreativeTab;
import ru.bkmz.tutorial.proxy.CommonProxy;

@Mod(modid = ModMain.MODID, name = ModMain.NAME, version = ModMain.VERSION)
public class ModMain {
    public static final String MODID = "tutorial";
    public static final String NAME = "ModMain Mod";
    public static final String VERSION = "1.0";
    public static Logger logger;
    public static final CreativeTabs creativeTabsAllmod = new ITPCreativeTab();
    @SidedProxy(clientSide = "ru.bkmz.tutorial.proxy.ClientProxy", serverSide = "ru.bkmz.tutorial.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        logger = e.getModLog();
        proxy.preInit(e);

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
