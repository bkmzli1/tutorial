package ru.zigthehedge.tutorial.items;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.zigthehedge.tutorial.Tutorial;

public class TutorialItems {
    @GameRegistry.ObjectHolder(Tutorial.MODID + ":key")
    public static Key key;
    @SideOnly(Side.CLIENT)
    public static void initModels() {
        key.initModel();
    }


}
