package net.lepidodendron.world.gen;

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

public class WorldGenSingleStaticInWaterColumn extends WorldGenerator
{
    public final PropertyDirection FACING = BlockDirectional.FACING;

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        return generate(null, worldIn, rand, position, 1, 255, 1, 0, 1);
    }

    public boolean generate(@Nullable IBlockState staticBlock, World worldIn, Random rand, BlockPos position, int minWaterDepth, int maxWaterDepth, int minY, int maxY, int columnHeight)
    {

        if (staticBlock == null) {
            return false;
        }
        if (columnHeight < 1) {
            columnHeight = 1;
        }

        columnHeight = rand.nextInt(columnHeight) + 1;

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

            for (int h = 1; h <= columnHeight; h++) {
                if (canAttachToSide(staticBlock.getBlock(), worldIn, blockpos.up(h - 1), EnumFacing.UP)) {
                    if (staticBlock.getPropertyKeys().contains(FACING)) {
                        Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos.up(h - 1), staticBlock.withProperty(FACING, EnumFacing.UP), 2);
                    } else {
                        Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos.up(h - 1), staticBlock, 2);
                    }
                } else {
                    break;
                }
            }
        }
        return true;
    }

    public boolean canAttachToSide(Block block, World worldIn, BlockPos pos, EnumFacing facing) {
        IBlockState attachBlock = worldIn.getBlockState(pos.offset(facing.getOpposite()));
        boolean flag1 = (((attachBlock.getMaterial() == Material.SAND)
                || (attachBlock.getMaterial() == Material.ROCK && attachBlock.getBlock() != Blocks.MAGMA)
                || (attachBlock.getMaterial() == Material.GROUND)
                || (attachBlock.getMaterial() == Material.GRASS)
                || (attachBlock.getMaterial() == Material.CLAY)
                || (attachBlock.getMaterial() == Material.CORAL)
                || (attachBlock.getMaterial() == Material.SPONGE)
                || (attachBlock.getMaterial() == Material.GLASS)
                || (attachBlock.getMaterial() == Material.IRON)
                || (attachBlock.getMaterial() == Material.WOOD))
                && (attachBlock.getBlockFaceShape(worldIn, pos.offset(facing.getOpposite()), facing) == BlockFaceShape.SOLID))
                || (attachBlock.getBlock() == block);
        boolean flag2 = worldIn.getBlockState(pos).getMaterial() == Material.WATER
                && (worldIn.getBlockState(pos).getBlock() instanceof BlockFluidBase || worldIn.getBlockState(pos).getBlock() instanceof BlockLiquid);
        boolean flag3 = (!worldIn.isAirBlock(pos.north())) && (!worldIn.isAirBlock(pos.east())) && (!worldIn.isAirBlock(pos.south())) && (!worldIn.isAirBlock(pos.west()));
        boolean flag4 = block.canPlaceBlockAt(worldIn, pos);

        return flag1 && flag2 && flag3 && flag4;
    }
}