package net.lepidodendron.world.gen;

import net.lepidodendron.block.*;
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

import javax.annotation.Nullable;
import java.util.Random;

public class WorldGenSingleSpongeSideways extends WorldGenerator
{
    public final PropertyDirection FACING = BlockDirectional.FACING;

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        return generate(worldIn, rand, position, 1, 255, 1, 0, null);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, int minWaterDepth, int maxWaterDepth, int minY, int maxY, @Nullable Block coralIn)
    {

        if (maxY == 0) {
            maxY = Functions.getAdjustedSeaLevel(worldIn, position);
        }
        if (maxY <= minY) {
            maxY = minY + 1;
        }

        position = new BlockPos(position.getX(), minY + rand.nextInt(maxY - minY), position.getZ());

        for (int i = 0; i < 100; ++i) {
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

            int facer = rand.nextInt(4);
            if (canAttachToSide(BlockBlueSponge.block, worldIn, blockpos, EnumFacing.byHorizontalIndex(facer))) {
                int type = rand.nextInt(10);
                IBlockState state = BlockBlueSponge.block.getDefaultState();
                if (coralIn != null) {
                    state = coralIn.getDefaultState();
                }
                else {
                    switch (type) {

                        case 0:
                        default:
                            state = BlockBlueSponge.block.getDefaultState();
                            break;

                        case 1:
                            state = BlockBranchedSponge.block.getDefaultState();
                            break;

                        case 2:
                            state = BlockBrownSponge.block.getDefaultState();
                            break;

                        case 3:
                            state = BlockOrangeSponge.block.getDefaultState();
                            break;

                        case 4:
                            state = BlockPinkSponge.block.getDefaultState();
                            break;

                        case 5:
                            state = BlockRedSponge.block.getDefaultState();
                            break;

                        case 6:
                            state = BlockYellowSponge.block.getDefaultState();
                            break;

                        case 7:
                            state = BlockWhiteSponge.block.getDefaultState();
                            break;

                        case 8:
                            state = BlockDarkOrangeSponge.block.getDefaultState();
                            break;

                        case 9:
                            state = BlockDarkPinkSponge.block.getDefaultState();
                            break;

                    }
                }

                Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos, state.withProperty(FACING, EnumFacing.byHorizontalIndex(facer)), 2);
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
        boolean flag5 = block.canPlaceBlockOnSide(worldIn, pos, facing);

        return flag1 && flag2 && flag3 && flag4 && flag5;
    }
}