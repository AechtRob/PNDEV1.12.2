package net.lepidodendron.world.gen;

import net.lepidodendron.block.*;
import net.lepidodendron.util.Functions;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockVine;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class VineGenerator extends WorldGenerator
{
	public static final PropertyDirection FACING = BlockDirectional.FACING;
	private BlockVine Vine;
    private IBlockState state;

    public VineGenerator(BlockVine VineIn)
    {
        this.setGeneratedBlock(VineIn);
    }

    public void setGeneratedBlock(BlockVine VineIn)
    {
        this.Vine = VineIn;
        this.state = VineIn.getDefaultState();
    }

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        for (int i = 0; i < 64; ++i)
        {
            int j = position.getX() + rand.nextInt(4) - rand.nextInt(4);
            int k = position.getY() + rand.nextInt(4) - rand.nextInt(4);
            int l = position.getZ() + rand.nextInt(4) - rand.nextInt(4);

            if (k >= Functions.getAdjustedSeaLevel(worldIn, new BlockPos(j, k, l)) && this.Vine.canPlaceBlockAt(worldIn, new BlockPos(j, k, l))
            	&& (worldIn.getBlockState(new BlockPos(j, k, l)).getMaterial().isReplaceable())
					&& (worldIn.getBlockState(new BlockPos(j, k, l)).getMaterial() != Material.WATER)
					&& (worldIn.getBlockState(new BlockPos(j, k, l)).getMaterial() != Material.LAVA) ){
				//figure out a position and facing to place this at!
				for (EnumFacing enumfacing : FACING.getAllowedValues())
		        {
		        	BlockPos pos = new BlockPos(j, k, l);
		        	if (enumfacing == EnumFacing.NORTH) {pos = new BlockPos(j, k, l + 1);}
		        	if (enumfacing == EnumFacing.SOUTH) {pos = new BlockPos(j, k, l - 1);}
		        	if (enumfacing == EnumFacing.EAST) {pos = new BlockPos(j - 1, k, l);}
		        	if (enumfacing == EnumFacing.WEST) {pos = new BlockPos(j + 1, k, l);}

		            if (this.Vine.canPlaceBlockOnSide(worldIn, new BlockPos(j, k, l), enumfacing)
		            	&& (worldIn.getBlockState(pos).getMaterial() == Material.WOOD
						|| worldIn.getBlockState(pos).getMaterial() == Material.LEAVES))
		            {
						int vinecounter = 0;
						while (worldIn.isAirBlock(new BlockPos(j, k - vinecounter, l)) && k - vinecounter > 0) {
							try {
								if (this.state == BlockAristolochiaFlower.block.getDefaultState()) {
									this.state = BlockAristolochia.block.getDefaultState();
								}
								if (this.Vine == BlockAristolochia.block && rand.nextInt(6) == 0) {
									this.state = BlockAristolochiaFlower.block.getDefaultState();
								}
								if (this.state == BlockHopsFruit.block.getDefaultState()) {
									this.state = BlockHops.block.getDefaultState();
								}
								if (this.Vine == BlockHops.block && rand.nextInt(6) == 0) {
									this.state = BlockHopsFruit.block.getDefaultState();
								}
								if (this.state == BlockVitisGrape.block.getDefaultState()) {
									this.state = BlockVitis.block.getDefaultState();
								}
								if (this.Vine == BlockVitis.block && rand.nextInt(6) == 0) {
									this.state = BlockVitisGrape.block.getDefaultState();
								}
								if (this.state == BlockHederaFruit.block.getDefaultState()) {
									this.state = BlockHedera.block.getDefaultState();
								}
								if (this.Vine == BlockHedera.block && rand.nextInt(6) == 0) {
									this.state = BlockHederaFruit.block.getDefaultState();
								}
								if (this.state == BlockActinideaFruit.block.getDefaultState()) {
									this.state = BlockActinidea.block.getDefaultState();
								}
								if (this.Vine == BlockActinidea.block && rand.nextInt(6) == 0) {
									this.state = BlockActinideaFruit.block.getDefaultState();
								}
								if (this.state == BlockKajanthusFlower.block.getDefaultState()) {
									this.state = BlockKajanthus.block.getDefaultState();
								}
								if (this.Vine == BlockKajanthus.block && rand.nextInt(6) == 0) {
									this.state = BlockKajanthusFlower.block.getDefaultState();
								}
								if (this.state == BlockSchisandraFruit.block.getDefaultState()) {
									this.state = BlockSchisandra.block.getDefaultState();
								}
								if (this.Vine == BlockSchisandra.block && rand.nextInt(6) == 0) {
									this.state = BlockSchisandraFruit.block.getDefaultState();
								}
								if (enumfacing == EnumFacing.NORTH) {
									Functions.setBlockStateAndCheckForDoublePlant(worldIn, new BlockPos(j, k - vinecounter, l), this.state.withProperty(BlockVine.SOUTH, true), 2);
								}
								if (enumfacing == EnumFacing.EAST) {
									Functions.setBlockStateAndCheckForDoublePlant(worldIn, new BlockPos(j, k - vinecounter, l), this.state.withProperty(BlockVine.WEST, true), 2);
								}
								if (enumfacing == EnumFacing.SOUTH) {
									Functions.setBlockStateAndCheckForDoublePlant(worldIn, new BlockPos(j, k - vinecounter, l), this.state.withProperty(BlockVine.NORTH, true), 2);
								}
								if (enumfacing == EnumFacing.WEST) {
									Functions.setBlockStateAndCheckForDoublePlant(worldIn, new BlockPos(j, k - vinecounter, l), this.state.withProperty(BlockVine.EAST, true), 2);
								}
							}
							catch (Exception e) {}
							vinecounter = vinecounter + 1;
						}
						return true;
		            }
		        }
            }
        }
        return true;
    }

}
