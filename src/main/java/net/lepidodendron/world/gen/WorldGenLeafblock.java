package net.lepidodendron.world.gen;

import net.lepidodendron.block.*;
import net.lepidodendron.procedure.ProcedureWorldGenCordaitesDry;
import net.lepidodendron.util.Functions;
import net.minecraft.block.BlockBush;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenLeafblock extends WorldGenerator
{
    public boolean generate(World worldIn, Random rand, BlockPos position) {return true;}

    public boolean generate(BlockBush placechecker, IBlockState leafState, IBlockState logState, World worldIn, Random rand, BlockPos position, int minHeight, int maxHeight) {
        return generate(placechecker, leafState, logState, worldIn, rand, position, minHeight, maxHeight, false);
    }

    public boolean generate(BlockBush placechecker, IBlockState leafState, IBlockState logState, World worldIn, Random rand, BlockPos position, int minHeight, int maxHeight, boolean ignoreGround)
    {
        if (minHeight == 0) {
            minHeight = Functions.getAdjustedSeaLevel(worldIn, position) - 4;
        }
        boolean flag = false;

        for (int i = 0; i < 48; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(7) - rand.nextInt(7), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(7) - rand.nextInt(7));

            if (!ignoreGround) {

                if (worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && placechecker.canBlockStay(worldIn, blockpos, placechecker.getDefaultState())
                        && (blockpos.getY() > minHeight + (rand.nextInt(5) - 2))
                        && (blockpos.getY() < maxHeight + (rand.nextInt(5) - 2))
                ) {
                    if (rand.nextInt(4) == 0) {

                        if (rand.nextInt(4) == 0 && leafState.getBlock() == BlockCordaitesDryLeaves.block) {
                            Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos, logState, 2);
                            ProcedureWorldGenCordaitesDry.PlaceLeaves(worldIn, blockpos.up());
                        }
                        else {

                            Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos, logState, 2);
                            if (worldIn.isAirBlock(blockpos.up())) {
                                Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos.up(), getleafstate(leafState), 2);
                            }
                            if (worldIn.isAirBlock(blockpos.north())) {
                                Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos.north(), getleafstate(leafState), 2);
                            }
                            if (worldIn.isAirBlock(blockpos.south())) {
                                Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos.south(), getleafstate(leafState), 2);
                            }
                            if (worldIn.isAirBlock(blockpos.east())) {
                                Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos.east(), getleafstate(leafState), 2);
                            }
                            if (worldIn.isAirBlock(blockpos.west())) {
                                Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos.west(), getleafstate(leafState), 2);
                            }
                        }
                    } else {
                        Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, getleafstate(leafState).withProperty(BlockBrachyphyllumLeaves.BlockCustom.CHECK_DECAY, false).withProperty(BlockBrachyphyllumLeaves.BlockCustom.DECAYABLE, false), 2);
                    }
                    flag = true;
                }
            }
            else { //can spawn on any flat surface
                if (worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && worldIn.getBlockState(blockpos.down()).getBlockFaceShape(worldIn, blockpos.down(), EnumFacing.UP) == BlockFaceShape.SOLID
                        && worldIn.canSeeSky(blockpos)
                        && (blockpos.getY() > minHeight + (rand.nextInt(5) - 2))
                        && (blockpos.getY() < maxHeight + (rand.nextInt(5) - 2))
                ) {
                    if (rand.nextInt(4) == 0) {
                        Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, logState, 2);
                        if (worldIn.isAirBlock(blockpos.up())) {
                            Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(), getleafstate(leafState), 2);
                        }
                        if (worldIn.isAirBlock(blockpos.north())) {
                            Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.north(), getleafstate(leafState), 2);
                        }
                        if (worldIn.isAirBlock(blockpos.south())) {
                            Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.south(), getleafstate(leafState), 2);
                        }
                        if (worldIn.isAirBlock(blockpos.east())) {
                            Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.east(), getleafstate(leafState), 2);
                        }
                        if (worldIn.isAirBlock(blockpos.west())) {
                            Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.west(), getleafstate(leafState), 2);
                        }
                    } else {
                        Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, getleafstate(leafState).withProperty(BlockBrachyphyllumLeaves.BlockCustom.CHECK_DECAY, false).withProperty(BlockBrachyphyllumLeaves.BlockCustom.DECAYABLE, false), 2);
                    }
                    flag = true;
                }
            }
        }

        return flag;
    }

    private IBlockState getleafstate(IBlockState state) {
        if (state.getBlock() == BlockPodocarpLeaves.block && Math.random() > 0.6) {
            state = BlockPodocarpLeavesBerries.block.getDefaultState();
        }
        else if (state.getBlock() == BlockRissikiaLeaves.block && Math.random() > 0.6) {
            state = BlockRissikiaLeavesBerries.block.getDefaultState();
        }
        else if (state.getBlock() == BlockScarburgiaLeaves.block && Math.random() > 0.6) {
            state = BlockScarburgiaLeavesBerries.block.getDefaultState();
        }
        else if (state.getBlock() == BlockYewLeaves.block && Math.random() > 0.6) {
            state = BlockYewLeavesBerries.block.getDefaultState();
        }
        else if (state.getBlock() == BlockDesmiophyllumLeaves.block && Math.random() > 0.6) {
            state = BlockDesmiophyllumLeavesBerries.block.getDefaultState();
        }
        return state;
    }
}
