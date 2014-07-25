package com.igings.letsmodreboot;

import com.igings.letsmodreboot.proxy.IProxy;
import com.igings.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID,name=Reference.MOD_NAME, version=Reference.VERSION)
public class LetsModReboot
{
    @Mod.Instance(Reference.MOD_ID)
    public static LetsModReboot instance;

    @SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS,serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {//Initialisation for items, blocks, key-binds, network, etc

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
