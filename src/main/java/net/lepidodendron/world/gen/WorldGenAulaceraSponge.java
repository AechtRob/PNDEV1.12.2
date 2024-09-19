package net.lepidodendron.world.gen;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.block.BlockAulacera;
import net.lepidodendron.procedure.ProcedureWorldGenAulacera;
import net.lepidodendron.util.Functions;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;


public class WorldGenAulaceraSponge extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        //for (int i = 0; i < 18; ++i) {
            //BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));
            BlockPos blockpos = position;
            BlockPos down = blockpos.down();
            IBlockState state = worldIn.getBlockState(down);
            boolean isSoil = (BlockAulacera.block.canPlaceBlockAt(worldIn, position) &&
                    (state.getBlockFaceShape(worldIn, down, EnumFacing.UP) == BlockFaceShape.SOLID));

            //System.err.println("Generator running 1");

            if (blockpos.getY() < Functions.getAdjustedSeaLevel(worldIn, blockpos) && isSoil) {

                //System.err.println("Generator running 2");

                if ((!worldIn.provider.isNether())
                        && (worldIn.getBlockState(blockpos.east()).getBlock() != BlockAulacera.block)
                        && (worldIn.getBlockState(blockpos.west()).getBlock() != BlockAulacera.block)
                        && (worldIn.getBlockState(blockpos.north()).getBlock() != BlockAulacera.block)
                        && (worldIn.getBlockState(blockpos.south()).getBlock() != BlockAulacera.block)
                        && (worldIn.getBlockState(blockpos.east().up()).getBlock() != BlockAulacera.block)
                        && (worldIn.getBlockState(blockpos.west().up()).getBlock() != BlockAulacera.block)
                        && (worldIn.getBlockState(blockpos.north().up()).getBlock() != BlockAulacera.block)
                        && (worldIn.getBlockState(blockpos.south().up()).getBlock() != BlockAulacera.block)
                        && (worldIn.getBlockState(blockpos.east().up(2)).getBlock() != BlockAulacera.block)
                        && (worldIn.getBlockState(blockpos.west().up(2)).getBlock() != BlockAulacera.block)
                        && (worldIn.getBlockState(blockpos.north().up(2)).getBlock() != BlockAulacera.block)
                        && (worldIn.getBlockState(blockpos.south().up(2)).getBlock() != BlockAulacera.block)
                ) {
                    Functions.setBlockStateAndCheckForDoublePlant(worldIn,position, BlockAulacera.block.getDefaultState(), 2);
                    Object2ObjectOpenHashMap<String, Object> $_dependencies = new Object2ObjectOpenHashMap <> ();
                    $_dependencies.put("x", blockpos.getX());
                    $_dependencies.put("y", blockpos.getY());
                    $_dependencies.put("z", blockpos.getZ());
                    $_dependencies.put("world", worldIn);
                    ProcedureWorldGenAulacera.executeProcedure($_dependencies);
                    flag = true;
                }
            }
       // }
        return flag;
    }
}
