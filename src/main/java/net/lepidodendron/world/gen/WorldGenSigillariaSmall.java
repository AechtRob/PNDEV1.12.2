package net.lepidodendron.world.gen;

import net.lepidodendron.block.*;
import net.lepidodendron.procedure.ProcedureTreeLog;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;


public class WorldGenSigillariaSmall extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 50; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockSigillariaSapling.block.canPlaceBlockAt(worldIn, blockpos)
            	&& (worldIn.getBlockState(blockpos.east()).getBlock() != BlockSigillariaStem.block)
            	&& (worldIn.getBlockState(blockpos.west()).getBlock() != BlockSigillariaStem.block)
            	&& (worldIn.getBlockState(blockpos.north()).getBlock() != BlockSigillariaStem.block)
            	&& (worldIn.getBlockState(blockpos.south()).getBlock() != BlockSigillariaStem.block)
                && (worldIn.getBlockState(blockpos.east().up()).getBlock() != BlockSigillariaStem.block)
                && (worldIn.getBlockState(blockpos.west().up()).getBlock() != BlockSigillariaStem.block)
                && (worldIn.getBlockState(blockpos.north().up()).getBlock() != BlockSigillariaStem.block)
                && (worldIn.getBlockState(blockpos.south().up()).getBlock() != BlockSigillariaStem.block)
                && (worldIn.getBlockState(blockpos.east().up(2)).getBlock() != BlockSigillariaStem.block)
                && (worldIn.getBlockState(blockpos.west().up(2)).getBlock() != BlockSigillariaStem.block)
                && (worldIn.getBlockState(blockpos.north().up(2)).getBlock() != BlockSigillariaStem.block)
                && (worldIn.getBlockState(blockpos.south().up(2)).getBlock() != BlockSigillariaStem.block)
            	)
            {
                int ii = rand.nextInt(10);
                int iii = 0;
                while (iii <= ii) {
                    worldIn.setBlockState(blockpos.up(iii), BlockSigillariaStem.block.getDefaultState(), 3);
                    iii += 1;
                }
                worldIn.setBlockState(blockpos.up(iii), BlockSigillariaShoot.block.getDefaultState(), 3);
                worldIn.setBlockState(blockpos.up(iii + 1), BlockSigillariaShootCentre.block.getDefaultState(), 3);
                worldIn.setBlockState(blockpos.up(iii + 2), BlockSigillariaShootTop.block.getDefaultState(), 3);


                if (Math.random() > 0.25 && ii > 5) {
                    ProcedureTreeLog.executeProcedure((int) blockpos.getX() + 1, (int) (blockpos.up(iii).getY() - 1), (int) blockpos.getZ(), worldIn, BlockSigillariaStrobilus.block, EnumFacing.EAST);
                    if (!worldIn.isRemote) {
                        BlockPos _bp = new BlockPos((int) blockpos.getX() + 1, (int) (blockpos.up(iii).getY() - 1), (int) blockpos.getZ());
                        TileEntity _tileEntity = worldIn.getTileEntity(_bp);
                        IBlockState _bs = worldIn.getBlockState(_bp);
                        if (_tileEntity != null)
                            _tileEntity.getTileData().setBoolean("decayable", (true));
                        worldIn.notifyBlockUpdate(_bp, _bs, _bs, 3);
                    }
                }
                if (Math.random() > 0.25 && ii > 5) {
                    ProcedureTreeLog.executeProcedure((int) blockpos.getX() - 1, (int) (blockpos.up(iii).getY() - 1), (int) blockpos.getZ(), worldIn, BlockSigillariaStrobilus.block, EnumFacing.WEST);
                    if (!worldIn.isRemote) {
                        BlockPos _bp = new BlockPos((int) blockpos.getX() - 1, (int) (blockpos.up(iii).getY() - 1), (int) blockpos.getZ());
                        TileEntity _tileEntity = worldIn.getTileEntity(_bp);
                        IBlockState _bs = worldIn.getBlockState(_bp);
                        if (_tileEntity != null)
                            _tileEntity.getTileData().setBoolean("decayable", (true));
                        worldIn.notifyBlockUpdate(_bp, _bs, _bs, 3);
                    }
                }
                if (Math.random() > 0.25 && ii > 5) {
                    ProcedureTreeLog.executeProcedure((int) blockpos.getX(), (int) (blockpos.up(iii).getY() - 1), (int) blockpos.getZ() + 1, worldIn, BlockSigillariaStrobilus.block, EnumFacing.SOUTH);
                    if (!worldIn.isRemote) {
                        BlockPos _bp = new BlockPos((int) blockpos.getX(), (int) (blockpos.up(iii).getY() - 1), (int) blockpos.getZ() + 1);
                        TileEntity _tileEntity = worldIn.getTileEntity(_bp);
                        IBlockState _bs = worldIn.getBlockState(_bp);
                        if (_tileEntity != null)
                            _tileEntity.getTileData().setBoolean("decayable", (true));
                        worldIn.notifyBlockUpdate(_bp, _bs, _bs, 3);
                    }
                }
                if (Math.random() > 0.25 && ii > 5) {
                    ProcedureTreeLog.executeProcedure((int) blockpos.getX(), (int) (blockpos.up(iii).getY() - 1), (int) blockpos.getZ() - 1, worldIn, BlockSigillariaStrobilus.block, EnumFacing.NORTH);
                    if (!worldIn.isRemote) {
                        BlockPos _bp = new BlockPos((int) blockpos.getX(), (int) (blockpos.up(iii).getY() - 1), (int) blockpos.getZ() - 1);
                        TileEntity _tileEntity = worldIn.getTileEntity(_bp);
                        IBlockState _bs = worldIn.getBlockState(_bp);
                        if (_tileEntity != null)
                            _tileEntity.getTileData().setBoolean("decayable", (true));
                        worldIn.notifyBlockUpdate(_bp, _bs, _bs, 3);
                    }
                }


                flag = true;
            }
        }

        return flag;
    }
}
