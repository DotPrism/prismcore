package com.magneticprism.prismcore.blocks.machines;

import com.magneticprism.prismcore.PrismCore;
import com.magneticprism.prismcore.blocks.BlockBase;
import com.magneticprism.prismcore.blocks.tileentities.TileEntityGlowstoneGenerator;
import com.magneticprism.prismcore.util.Reference;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GlowstoneGenerator extends BlockBase
{
    public GlowstoneGenerator(String name, Material mat, CreativeTabs tab) 
    {
        super(name, mat, tab);
    }
    
    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if (!worldIn.isRemote)
        {
            playerIn.openGui(PrismCore.instance, Reference.GUI_GLOWSTONE_GENERATOR, worldIn, pos.getX(), pos.getY(), pos.getZ());
        }

        return true;
    }

    @Override
    public boolean hasTileEntity(IBlockState state)
    {
        return true;
    }

    @Override
    public TileEntity createTileEntity(World worldIn, IBlockState state)
    {
        return new TileEntityGlowstoneGenerator();
    }
}
