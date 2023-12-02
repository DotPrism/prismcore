package com.magneticprism.prismcore.world;

import java.util.Random;

import com.magneticprism.prismcore.init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator
{
    @Override
    public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
    {
        if (world.provider.getDimension() == 0)
        {
            generateOverworld(rand, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
        else if (world.provider.getDimension() == 1)
        {
            generateNether(rand, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
        else
        {
            generateEnd(rand, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
    }

    private void generateOverworld(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    { }

    private void generateNether(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    { }

    private void generateEnd(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    { }

    private void generateOre(IBlockState ore, World world, Random rand, int chunkX, int chunkZ, int minY, int maxY, int size, int chances)
    {
        int detlaY = maxY - minY;
        for (int i = 0; i  < chances; i++)
        {
            BlockPos pos = new BlockPos(chunkX + rand.nextInt(16), minY + rand.nextInt(detlaY), chunkZ + rand.nextInt(16));

            WorldGenMinable generator = new WorldGenMinable(ore, size);
            generator.generate(world, rand, pos);
        }
    }
}
