package com.magneticprism.prismcore.blocks;

import com.magneticprism.prismcore.PrismCore;
import com.magneticprism.prismcore.init.ModBlocks;
import com.magneticprism.prismcore.init.ModItems;
import com.magneticprism.prismcore.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material mat, CreativeTabs tab)
	{
		super(mat);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() 
	{
		PrismCore.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
