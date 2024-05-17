package net.lepidodendron.world.gen;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.block.BlockParadoxopterisLog;
import net.lepidodendron.block.BlockParadoxopterisLogWater;
import net.lepidodendron.block.BlockParadoxopterisSapling;
import net.lepidodendron.procedure.ProcedureWorldGenParadoxopteris;
import net.lepidodendron.util.Functions;
import net.lepidodendron.world.biome.ChunkGenSpawner;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fluids.BlockFluidBase;

import java.util.Random;

public class WorldGenParadoxopteris extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position) {
        return generate(worldIn, rand, position, false, false);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, boolean waterOnly, boolean landOnly)
    {
        boolean flag = false;

        for (int i = 0; i < 6; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), 0, rand.nextInt(8) - rand.nextInt(8));
            blockpos = ChunkGenSpawner.getTopSolidBlock(blockpos, worldIn).up();

            if ( (!worldIn.provider.isNether() || blockpos.getY() < 254) && canPlaceBlockAt(worldIn, blockpos, waterOnly, landOnly))
            {
                Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap <> ();
                $_dependencies.put("x", blockpos.getX());
                $_dependencies.put("y", blockpos.getY());
                $_dependencies.put("z", blockpos.getZ());
                $_dependencies.put("world", worldIn);
                ProcedureWorldGenParadoxopteris.executeProcedure($_dependencies);
                flag = true;
            }
        }

        return flag;
    }
    
    public static boolean canPlaceBlockAt(World world, BlockPos pos, boolean waterOnly, boolean landOnly) {
        IBlockState state = world.getBlockState(pos);
        if (state.getMaterial() == Material.WATER) {
            if (landOnly) {
                return false;
            }
            if (state.getBlock() instanceof BlockFluidBase || state.getBlock() instanceof BlockLiquid) {
                //Get the water column height:
                int i = 0;
                while (i <= 6 && world.getBlockState(pos.up(i)).getMaterial() == Material.WATER) {
                    i ++;
                }
                if  (i >= 6) {
                    return false;
                }
                return ((world.getBlockState(pos.east()).getBlock() != BlockParadoxopterisLog.block)
                        && (world.getBlockState(pos.west()).getBlock() != BlockParadoxopterisLog.block)
                        && (world.getBlockState(pos.north()).getBlock() != BlockParadoxopterisLog.block)
                        && (world.getBlockState(pos.south()).getBlock() != BlockParadoxopterisLog.block)
                        && (world.getBlockState(pos.east().up()).getBlock() != BlockParadoxopterisLog.block)
                        && (world.getBlockState(pos.west().up()).getBlock() != BlockParadoxopterisLog.block)
                        && (world.getBlockState(pos.north().up()).getBlock() != BlockParadoxopterisLog.block)
                        && (world.getBlockState(pos.south().up()).getBlock() != BlockParadoxopterisLog.block)
                        && (world.getBlockState(pos.east().up(2)).getBlock() != BlockParadoxopterisLog.block)
                        && (world.getBlockState(pos.west().up(2)).getBlock() != BlockParadoxopterisLog.block)
                        && (world.getBlockState(pos.north().up(2)).getBlock() != BlockParadoxopterisLog.block)
                        && (world.getBlockState(pos.south().up(2)).getBlock() != BlockParadoxopterisLog.block)
                        && (world.getBlockState(pos.east()).getBlock() != BlockParadoxopterisLogWater.block)
                        && (world.getBlockState(pos.west()).getBlock() != BlockParadoxopterisLogWater.block)
                        && (world.getBlockState(pos.north()).getBlock() != BlockParadoxopterisLogWater.block)
                        && (world.getBlockState(pos.south()).getBlock() != BlockParadoxopterisLogWater.block)
                        && (world.getBlockState(pos.east().up()).getBlock() != BlockParadoxopterisLogWater.block)
                        && (world.getBlockState(pos.west().up()).getBlock() != BlockParadoxopterisLogWater.block)
                        && (world.getBlockState(pos.north().up()).getBlock() != BlockParadoxopterisLogWater.block)
                        && (world.getBlockState(pos.south().up()).getBlock() != BlockParadoxopterisLogWater.block)
                        && (world.getBlockState(pos.east().up(2)).getBlock() != BlockParadoxopterisLogWater.block)
                        && (world.getBlockState(pos.west().up(2)).getBlock() != BlockParadoxopterisLogWater.block)
                        && (world.getBlockState(pos.north().up(2)).getBlock() != BlockParadoxopterisLogWater.block)
                        && (world.getBlockState(pos.south().up(2)).getBlock() != BlockParadoxopterisLogWater.block)
                );
            }
            return false;
        }
        //Otherwise we are on land we hope:
        if (pos.getY() >= Functions.getAdjustedSeaLevel(world, pos)-4 && world.isAirBlock(pos) && (!world.provider.isNether() || pos.getY() < 254) && BlockParadoxopterisSapling.block.canPlaceBlockAt(world, pos)
                && (world.getBlockState(pos.east()).getBlock() != BlockParadoxopterisLog.block)
                && (world.getBlockState(pos.west()).getBlock() != BlockParadoxopterisLog.block)
                && (world.getBlockState(pos.north()).getBlock() != BlockParadoxopterisLog.block)
                && (world.getBlockState(pos.south()).getBlock() != BlockParadoxopterisLog.block)
                && (world.getBlockState(pos.east().up()).getBlock() != BlockParadoxopterisLog.block)
                && (world.getBlockState(pos.west().up()).getBlock() != BlockParadoxopterisLog.block)
                && (world.getBlockState(pos.north().up()).getBlock() != BlockParadoxopterisLog.block)
                && (world.getBlockState(pos.south().up()).getBlock() != BlockParadoxopterisLog.block)
                && (world.getBlockState(pos.east().up(2)).getBlock() != BlockParadoxopterisLog.block)
                && (world.getBlockState(pos.west().up(2)).getBlock() != BlockParadoxopterisLog.block)
                && (world.getBlockState(pos.north().up(2)).getBlock() != BlockParadoxopterisLog.block)
                && (world.getBlockState(pos.south().up(2)).getBlock() != BlockParadoxopterisLog.block)
                && !waterOnly
        ) {
            return true;
        }
        return false;
    }
}
