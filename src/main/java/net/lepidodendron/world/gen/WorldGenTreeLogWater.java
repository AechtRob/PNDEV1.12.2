package net.lepidodendron.world.gen;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenTreeLogWater extends WorldGenerator
{
    private final Block block;

    public WorldGenTreeLogWater(Block blockIn)
    {
        super(false);
        this.block = blockIn;
    }

	public static final PropertyDirection FACING = BlockDirectional.FACING;
		
    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
    	boolean flag = false;
    	BlockPos blockpos = position.down();
		if (!isWaterBlock(worldIn, blockpos)) {
			return false;
		}

    	//Go to bottom of water:
		int i = 0;
		while (i < 5 && isWaterBlock(worldIn, blockpos.down(i))) {
			i = i + 1;
		}

		blockpos = position.down(i);
		Material material = worldIn.getBlockState(blockpos.down()).getMaterial();

        if (isWaterBlock(worldIn, blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254)
        && (material == Material.GROUND || material == Material.GRASS || material == Material.SAND || material == Material.ROCK))
        {
			if (Math.random() > 0.8) { //Standing log
				worldIn.setBlockState(blockpos, this.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 4);
				worldIn.setBlockState(blockpos.up(), this.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 4);
				//worldIn.setBlockToAir(blockpos.up(2));
				if (Math.random() > 0.5) {
					worldIn.setBlockState(blockpos.up(2), this.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 4);
					//worldIn.setBlockToAir(blockpos.up(3));
					if (Math.random() > 0.5) {
						worldIn.setBlockState(blockpos.up().east(), this.block.getDefaultState().withProperty(FACING, EnumFacing.UP), 4);
						//worldIn.setBlockToAir(blockpos.up(2).east());
					}
					if (Math.random() > 0.6) {
						worldIn.setBlockState(blockpos.up(3), this.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 4);
						//worldIn.setBlockToAir(blockpos.up(4));
						if (Math.random() > 0.6) {
							worldIn.setBlockState(blockpos.up(4), this.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 4);
							//worldIn.setBlockToAir(blockpos.up(4));
							if (Math.random() > 0.6) {
								worldIn.setBlockState(blockpos.up(5), this.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 4);
								if (Math.random() > 0.25) {
									worldIn.setBlockState(blockpos.up(4).west(), this.block.getDefaultState().withProperty(FACING, EnumFacing.UP), 4);
									//worldIn.setBlockToAir(blockpos.up(2).east());
								}
								else if (Math.random() > 0.25) {
									worldIn.setBlockState(blockpos.up(4).east(), this.block.getDefaultState().withProperty(FACING, EnumFacing.UP), 4);
									//worldIn.setBlockToAir(blockpos.up(2).east());
								}
								else if (Math.random() > 0.25) {
									worldIn.setBlockState(blockpos.up(4).north(), this.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 4);
									//worldIn.setBlockToAir(blockpos.up(2).east());
								}
								else if (Math.random() > 0.25) {
									worldIn.setBlockState(blockpos.up(4).south(), this.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 4);
									//worldIn.setBlockToAir(blockpos.up(2).east());
								}
								if (Math.random() > 0.6) {
									worldIn.setBlockState(blockpos.up(6), this.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 4);
									//worldIn.setBlockToAir(blockpos.up(4));
									if (Math.random() > 0.6) {
										worldIn.setBlockState(blockpos.up(7), this.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 4);
										//worldIn.setBlockToAir(blockpos.up(4));
									}
								}
							}
						}
					}
				}
			}
				else {
				int direction = rand.nextInt(2);
				if (direction == 1) {
					//North-South
					worldIn.setBlockState(blockpos, this.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 4);
					//worldIn.setBlockToAir(blockpos.up());
					worldIn.setBlockState(blockpos.north(), this.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 4);
					//worldIn.setBlockToAir(blockpos.up().north());
					if (Math.random() > 0.5 && !worldIn.isAirBlock(blockpos.down().north(2)) ) {
						worldIn.setBlockState(blockpos.north(2), this.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 4);
						//worldIn.setBlockToAir(blockpos.up().north(2));
						if (Math.random() > 0.5) {
							worldIn.setBlockState(blockpos.north().up(), this.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 4);
							//worldIn.setBlockToAir(blockpos.up(2).north());
						}
						if (Math.random() > 0.6 && !worldIn.isAirBlock(blockpos.down().north(3)) ) {
							worldIn.setBlockState(blockpos.north(3), this.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 4);
							//worldIn.setBlockToAir(blockpos.up().north(3));
						}
					}
				}
				else {
					//East-West
					worldIn.setBlockState(blockpos, this.block.getDefaultState().withProperty(FACING, EnumFacing.UP), 4);
					//worldIn.setBlockToAir(blockpos.up());
					worldIn.setBlockState(blockpos.east(), this.block.getDefaultState().withProperty(FACING, EnumFacing.UP), 4);
					//worldIn.setBlockToAir(blockpos.up().east());
					if (Math.random() > 0.5 && !worldIn.isAirBlock(blockpos.down().east(2))) {
						worldIn.setBlockState(blockpos.east(2), this.block.getDefaultState().withProperty(FACING, EnumFacing.UP), 4);
						//worldIn.setBlockToAir(blockpos.up().east(2));
						if (Math.random() > 0.5) {
							worldIn.setBlockState(blockpos.east().up(), this.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 4);
							//worldIn.setBlockToAir(blockpos.up(2).east());
						}
						if (Math.random() > 0.6 && !worldIn.isAirBlock(blockpos.down().east(3)) ) {
							worldIn.setBlockState(blockpos.east(3), this.block.getDefaultState().withProperty(FACING, EnumFacing.UP), 4);
							//worldIn.setBlockToAir(blockpos.up(4));
						}
					}
					
				}
			}
			
            flag = true;
        }
            
        return flag;
    }

    public boolean isWaterBlock(World world, BlockPos pos) {
    	return (world.getBlockState(pos).getMaterial() == Material.WATER);
	}
}

