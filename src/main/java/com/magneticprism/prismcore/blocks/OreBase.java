package com.magneticprism.prismcore.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class OreBase extends BlockBase
{
    public OreBase(String name, Material mat, CreativeTabs tab, float hardness, float resistance, int toolLevel) 
    {
        super(name, mat, tab);
        setSoundType(SoundType.STONE);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel("pickaxe", toolLevel);
    }
}