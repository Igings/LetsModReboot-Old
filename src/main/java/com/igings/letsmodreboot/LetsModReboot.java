package com.igings.letsmodreboot;

import com.igings.letsmodreboot.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="LetsModReboot",name="Lets Mod Reboot", version="1.7.2-1.0")
public class LetsModReboot
{
    @Mod.Instance("LetsModReboot")
    public static LetsModReboot instance;

    @SidedProxy(clientSide="com.igings.letsmodreboot.proxy.ClientProxy",serverSide = "com.igings.letsmodreboot.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {//Initialisation for items, blocks, keybinds, network, etc

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {//Initialisation for GUI, TE, crafting, other event handlers

    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {//Used for anything after other mods are loaded

    }
}
