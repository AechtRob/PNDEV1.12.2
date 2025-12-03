package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockTabulata_1;
import net.lepidodendron.block.BlockTabulata_2;
import net.lepidodendron.block.BlockTabulata_3;
import net.lepidodendron.block.BlockTabulata_4;
import net.lepidodendron.util.Functions;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fluids.BlockFluidBase;

import java.util.Random;

public class WorldGenSingleTabulateCoral extends WorldGenerator
{
    public final PropertyDirection FACING = BlockDirectional.FACING;

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        return generate(worldIn, rand, position, 1, 255, 1, 0, -1);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, int minWaterDepth, int maxWaterDepth, int minY, int maxY, int specificVariant)
    {

        if (maxY == 0) {
            maxY = Functions.getAdjustedSeaLevel(worldIn, position);
        }
        if (maxY <= minY) {
            maxY = minY + 1;
        }

        if (position.getY() >= maxY || position.getY() <= minY) {
            return true;
        }

        for (int i = 0; i < 25; ++i) {
            BlockPos blockpos = position.add(rand.nextInt(6) - rand.nextInt(6), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(6) - rand.nextInt(6));

            if (blockpos.getY() + maxWaterDepth < Functions.getAdjustedSeaLevel(worldIn, blockpos)) {
                continue;
            }

            int yy = 1;
            boolean minWaterTest = true;
            while (yy <= minWaterDepth && minWaterTest) {
                if (worldIn.getBlockState(blockpos.up(yy)).getMaterial() != Material.WATER) {
                    minWaterTest = false;
                    break;
                }
                yy++;
            }
            if (!minWaterTest) {
                continue;
            }

            if (canAttachToSide(BlockTabulata_1.block, worldIn, blockpos, EnumFacing.UP)) {
                int type = rand.nextInt(4);
                if (specificVariant >= 1 && specificVariant <= 4) {
                    type = specificVariant - 1;
                }
                switch (type) {
                    case 0: default:
                        Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos, BlockTabulata_1.block.getDefaultState(), 2);
                        break;

                    case 1:
                        Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos, BlockTabulata_2.block.getDefaultState(), 2);
                        break;

                    case 2:
                        Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos, BlockTabulata_3.block.getDefaultState(), 2);
                        break;

                    case 3:
                        Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos, BlockTabulata_4.block.getDefaultState(), 2);
                        break;

                }
            }
        }
        return true;
    }

    public boolean canAttachToSide(Block block, World worldIn, BlockPos pos, EnumFacing facing) {
        IBlockState attachBlock = worldIn.getBlockState(pos.offset(facing.getOpposite()));
        boolean flag1 = ((attachBlock.getMaterial() == Material.SAND)
                || (attachBlock.getMaterial() == Material.ROCK && attachBlock.getBlock() != Blocks.MAGMA)
                || (attachBlock.getMaterial() == Material.GROUND)
                || (attachBlock.getMaterial() == Material.GRASS)
                || (attachBlock.getMaterial() == Material.CLAY)
                || (attachBlock.getMaterial() == Material.CORAL)
                || (attachBlock.getMaterial() == Material.SPONGE)
                || (attachBlock.getMaterial() == Material.GLASS)
                || (attachBlock.getMaterial() == Material.IRON)
                || (attachBlock.getMaterial() == Material.WOOD))
                && (attachBlock.getBlockFaceShape(worldIn, pos.offset(facing.getOpposite()), facing) == BlockFaceShape.SOLID);
        boolean flag2 = worldIn.getBlockState(pos).getMaterial() == Material.WATER
                && (worldIn.getBlockState(pos).getBlock() instanceof BlockFluidBase || worldIn.getBlockState(pos).getBlock() instanceof BlockLiquid);
        boolean flag3 = (!worldIn.isAirBlock(pos.north())) && (!worldIn.isAirBlock(pos.east())) && (!worldIn.isAirBlock(pos.south())) && (!worldIn.isAirBlock(pos.west()));
        boolean flag4 = block.canPlaceBlockAt(worldIn, pos);

        return flag1 && flag2 && flag3 && flag4;
    }
}