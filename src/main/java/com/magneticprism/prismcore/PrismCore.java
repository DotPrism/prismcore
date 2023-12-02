package com.magneticprism.prismcore;

import com.magneticprism.prismcore.proxy.CommonProxy;
import com.magneticprism.prismcore.tabs.PrismCoreTab;
import com.magneticprism.prismcore.util.Reference;
import com.magneticprism.prismcore.util.handlers.RegistryHandler;
import com.magneticprism.prismcore.world.WorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class PrismCore 
{
	public static final CreativeTabs prismcore_tab = new PrismCoreTab("prismmodtab");

	@Instance
	public static PrismCore instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.preInitRegistries(event);
		GameRegistry.registerWorldGenerator(new WorldGen(), 3);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		RegistryHandler.initRegistries(event);
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		RegistryHandler.postInitRegistries(event);
	}
}
