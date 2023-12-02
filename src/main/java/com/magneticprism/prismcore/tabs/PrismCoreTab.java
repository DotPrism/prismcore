package com.magneticprism.prismcore.tabs;

import com.magneticprism.prismcore.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PrismCoreTab extends CreativeTabs
{
    public PrismCoreTab(String label)
    {
        super(label);
    }

    @Override
    public ItemStack getTabIconItem() 
    {
        return new ItemStack(ModItems.PRISMCORE_TAB_ICON);
    }
}
