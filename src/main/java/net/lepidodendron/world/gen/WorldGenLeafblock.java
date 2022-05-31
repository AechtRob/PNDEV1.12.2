package net.lepidodendron.world.gen;

import net.lepidodendron.block.*;
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
        boolean flag = false;

        for (int i = 0; i < 48; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (!ignoreGround) {

                if (blockpos.getY() >= worldIn.getSeaLevel() - 4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && placechecker.canBlockStay(worldIn, blockpos, placechecker.getDefaultState())
                        && (blockpos.getY() > minHeight + (rand.nextInt(5) - 2))
                        && (blockpos.getY() < maxHeight + (rand.nextInt(5) - 2))
                ) {
                    if (rand.nextInt(4) == 0) {
                        worldIn.setBlockState(blockpos, logState, 2);
                        if (worldIn.isAirBlock(blockpos.up())) {
                            worldIn.setBlockState(blockpos.up(), getleafstate(leafState), 2);
                        }
                        if (worldIn.isAirBlock(blockpos.north())) {
                            worldIn.setBlockState(blockpos.north(), getleafstate(leafState), 2);
                        }
                        if (worldIn.isAirBlock(blockpos.south())) {
                            worldIn.setBlockState(blockpos.south(), getleafstate(leafState), 2);
                        }
                        if (worldIn.isAirBlock(blockpos.east())) {
                            worldIn.setBlockState(blockpos.east(), getleafstate(leafState), 2);
                        }
                        if (worldIn.isAirBlock(blockpos.west())) {
                            worldIn.setBlockState(blockpos.west(), getleafstate(leafState), 2);
                        }
                    } else {
                        worldIn.setBlockState(blockpos, getleafstate(leafState).withProperty(BlockBrachyphyllumLeaves.BlockCustom.CHECK_DECAY, false).withProperty(BlockBrachyphyllumLeaves.BlockCustom.DECAYABLE, false), 2);
                    }
                    flag = true;
                }
            }
            else { //can spawn on any flat surface
                if (blockpos.getY() >= worldIn.getSeaLevel() - 4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && worldIn.getBlockState(blockpos.down()).getBlockFaceShape(worldIn, blockpos.down(), EnumFacing.UP) == BlockFaceShape.SOLID
                        && worldIn.canSeeSky(blockpos)
                        && (blockpos.getY() > minHeight + (rand.nextInt(5) - 2))
                        && (blockpos.getY() < maxHeight + (rand.nextInt(5) - 2))
                ) {
                    if (rand.nextInt(4) == 0) {
                        worldIn.setBlockState(blockpos, logState, 2);
                        if (worldIn.isAirBlock(blockpos.up())) {
                            worldIn.setBlockState(blockpos.up(), getleafstate(leafState), 2);
                        }
                        if (worldIn.isAirBlock(blockpos.north())) {
                            worldIn.setBlockState(blockpos.north(), getleafstate(leafState), 2);
                        }
                        if (worldIn.isAirBlock(blockpos.south())) {
                            worldIn.setBlockState(blockpos.south(), getleafstate(leafState), 2);
                        }
                        if (worldIn.isAirBlock(blockpos.east())) {
                            worldIn.setBlockState(blockpos.east(), getleafstate(leafState), 2);
                        }
                        if (worldIn.isAirBlock(blockpos.west())) {
                            worldIn.setBlockState(blockpos.west(), getleafstate(leafState), 2);
                        }
                    } else {
                        worldIn.setBlockState(blockpos, getleafstate(leafState).withProperty(BlockBrachyphyllumLeaves.BlockCustom.CHECK_DECAY, false).withProperty(BlockBrachyphyllumLeaves.BlockCustom.DECAYABLE, false), 2);
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
        if (state.getBlock() == BlockYewLeaves.block && Math.random() > 0.6) {
            state = BlockYewLeavesBerries.block.getDefaultState();
        }
        return state;
    }
}
