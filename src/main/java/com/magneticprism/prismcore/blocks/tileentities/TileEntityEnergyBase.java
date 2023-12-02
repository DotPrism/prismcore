package com.magneticprism.prismcore.blocks.tileentities;

import com.magneticprism.prismcore.energy.PrismicFlux;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.energy.CapabilityEnergy;

public class TileEntityEnergyBase extends TileEntity implements ITickable
{
    public PrismicFlux storage;

    public void setStorage(int capacity, int maxTransferRate)
    {
        this.storage = new PrismicFlux(capacity, maxTransferRate);
    }

    @Override
    public void update()
    {
        
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing)
    {
        if (this.storage == null) throw new IllegalStateException("Storage not initialized...");
        if (capability == CapabilityEnergy.ENERGY) return (T)this.storage;
        return super.getCapability(capability, facing);
    }

    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing facing)
    {
        if (capability == CapabilityEnergy.ENERGY) return true;
        return super.hasCapability(capability, facing);
    }
}
