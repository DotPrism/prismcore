package com.magneticprism.prismcore.items;

import com.magneticprism.prismcore.items.ItemBase;
import com.magneticprism.prismcore.util.interfaces.IHasModel;
import com.magneticprism.prismcore.PrismCore;
import com.magneticprism.prismcore.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{	
	
	public ItemBase(String name, CreativeTabs tab)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		PrismCore.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
