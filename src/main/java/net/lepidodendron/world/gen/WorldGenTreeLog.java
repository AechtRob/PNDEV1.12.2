package net.lepidodendron.world.gen;

import net.lepidodendron.util.Functions;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenTreeLog extends WorldGenerator
{
    private final Block block;

    public WorldGenTreeLog(Block blockIn)
    {
        super(false);
        this.block = blockIn;
    }

	public static final PropertyDirection FACING = BlockDirectional.FACING;
		
    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
    	boolean flag = false;
    	BlockPos blockpos = position;

		Material material = worldIn.getBlockState(blockpos.down()).getMaterial();

        if (worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254)
        && (material == Material.GROUND || material == Material.GRASS || material == Material.SAND || material == Material.ROCK))
        {
			if (Math.random() > 0.8) { //Standing log
				Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, this.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 4);
				Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(), this.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 4);
				worldIn.setBlockToAir(blockpos.up(2));
				if (Math.random() > 0.5) {
					Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(2), this.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 4);
					worldIn.setBlockToAir(blockpos.up(3));
					if (Math.random() > 0.5) {
						Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up().east(), this.block.getDefaultState().withProperty(FACING, EnumFacing.UP), 4);
						worldIn.setBlockToAir(blockpos.up(2).east());
					}
					if (Math.random() > 0.6) {
						Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(3), this.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 4);
						worldIn.setBlockToAir(blockpos.up(4));
					}
				}
			}
				else {
				int direction = rand.nextInt(2);
				if (direction == 1) {
					//North-South
					Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, this.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 4);
					worldIn.setBlockToAir(blockpos.up());
					Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.north(), this.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 4);
					worldIn.setBlockToAir(blockpos.up().north());
					if (Math.random() > 0.5 && !worldIn.isAirBlock(blockpos.down().north(2)) ) {
						Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.north(2), this.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 4);
						worldIn.setBlockToAir(blockpos.up().north(2));
						if (Math.random() > 0.5) {
							Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.north().up(), this.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 4);
							worldIn.setBlockToAir(blockpos.up(2).north());
						}
						if (Math.random() > 0.6 && !worldIn.isAirBlock(blockpos.down().north(3)) ) {
							Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.north(3), this.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 4);
							worldIn.setBlockToAir(blockpos.up().north(3));
						}
					}
				}
				else {
					//East-West
					Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, this.block.getDefaultState().withProperty(FACING, EnumFacing.UP), 4);
					worldIn.setBlockToAir(blockpos.up());
					Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.east(), this.block.getDefaultState().withProperty(FACING, EnumFacing.UP), 4);
					worldIn.setBlockToAir(blockpos.up().east());
					if (Math.random() > 0.5 && !worldIn.isAirBlock(blockpos.down().east(2))) {
						Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.east(2), this.block.getDefaultState().withProperty(FACING, EnumFacing.UP), 4);
						worldIn.setBlockToAir(blockpos.up().east(2));
						if (Math.random() > 0.5) {
							Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.east().up(), this.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 4);
							worldIn.setBlockToAir(blockpos.up(2).east());
						}
						if (Math.random() > 0.6 && !worldIn.isAirBlock(blockpos.down().east(3)) ) {
							Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.east(3), this.block.getDefaultState().withProperty(FACING, EnumFacing.UP), 4);
							worldIn.setBlockToAir(blockpos.up(4));
						}
					}
					
				}
			}
			
            flag = true;
        }
            
        return flag;
    }
}

