package com.magneticprism.prismcore.util.handlers;

import com.magneticprism.prismcore.init.ModBlocks;
import com.magneticprism.prismcore.init.ModItems;
import com.magneticprism.prismcore.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
	
		for(Item item : ModItems.ITEMS) { if (item instanceof IHasModel) {
		((IHasModel)item).registerModels(); } }
		
		for(Block block : ModBlocks.BLOCKS) { if (block instanceof IHasModel) {
		((IHasModel)block).registerModels(); } }
		
	}

	public static void preInitRegistries(FMLPreInitializationEvent event)
	{
		
	}
	
	public static void initRegistries(FMLInitializationEvent event)
	{
			
	}
	
	public static void postInitRegistries(FMLPostInitializationEvent event)
	{
		
	}
}
