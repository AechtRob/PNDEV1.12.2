package net.lepidodendron.world.gen;

import net.lepidodendron.block.*;
import net.lepidodendron.util.Functions;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class AlgaeGenerator extends WorldGenerator
{
	public static final PropertyDirection FACING = BlockDirectional.FACING;
	private Block algae;
    private IBlockState state;

    public AlgaeGenerator(Block algaeIn)
    {
        this.setGeneratedBlock(algaeIn);
    }

    public void setGeneratedBlock(Block algaeIn)
    {
        this.algae = algaeIn;
        this.state = algaeIn.getDefaultState();
    }

    //marine int: -1  = non-marine, 0 = bothk 1 = marine only
    public boolean generate(World worldIn, Random rand, BlockPos position)
    {

		for (int i = 0; i < 12; ++i)
		{

			int j = position.getX() + rand.nextInt(4) - rand.nextInt(4);
			int k = position.getY() + rand.nextInt(4) - rand.nextInt(4);;
			int l = position.getZ() + rand.nextInt(4) - rand.nextInt(4);;

			if (worldIn.isBlockLoaded(new BlockPos(j, k, l))) {

				if (this.algae.canPlaceBlockAt(worldIn, new BlockPos(j, k, l))
						&& (Functions.isWater(worldIn, new BlockPos(j, k, l)))
						&& !worldIn.isAirBlock(new BlockPos(j, k, l + 1))
						&& !worldIn.isAirBlock(new BlockPos(j, k, l - 1))
						&& !worldIn.isAirBlock(new BlockPos(j + 1, k, l))
						&& !worldIn.isAirBlock(new BlockPos(j - 1, k, l))) {

					//Check water levels are OK::
					boolean waterDepthCheckMin = true;
					boolean waterDepthCheckMax = true;
					if ((this.algae == BlockDarkPinkSponge.block)
						|| (this.algae == BlockPinkSponge.block)
						|| (this.algae == BlockYellowSponge.block)
						|| (this.algae == BlockDarkOrangeSponge.block)
						|| (this.algae == BlockWhiteSponge.block)
						|| (this.algae == BlockBlueSponge.block)
						|| (this.algae == BlockOrangeSponge.block)
						|| (this.algae == BlockRedSponge.block)
						|| (this.algae == BlockBrownSponge.block)
						|| (this.algae == BlockBranchedSponge.block)
						|| (this.algae == BlockGlassSponge.block)
					) {
						int yy = 1;
						while (yy <= 4 && waterDepthCheckMin) { //Sponge water must be 4 deep or more
							if (worldIn.getBlockState(new BlockPos(j, k + yy, l)).getMaterial() != Material.WATER) {
								waterDepthCheckMin = false;
							}
							yy += 1;
						}
					}

					if (this.algae == BlockCoralBamboo.block || this.algae == BlockBoneWorm.block
					) {
						int yy = 1;
						while (yy <= 18 && waterDepthCheckMin) { //Coral bamboo water must be 10 deep or more
							if (worldIn.getBlockState(new BlockPos(j, k + yy, l)).getMaterial() != Material.WATER) {
								waterDepthCheckMin = false;
							}
							yy += 1;
						}
					}

					if (waterDepthCheckMin && (this.algae == BlockGreenAlgaeMat.block
							|| this.algae == BlockGreenCharaAlgae.block
							|| this.algae == BlockPiledAlgae.block
							|| this.algae == BlockStalkedAlgae.block
							|| this.algae == BlockGreenLeafyAlgae.block
							|| this.algae == BlockGreenCodiumAlgae.block
							|| this.algae == BlockGreenSproutingAlgae.block
							|| this.algae == BlockGreenStemmedAlgae.block
							|| this.algae == BlockGreenCrustedAlgae.block
							|| this.algae == BlockPiledAlgae.block
							|| this.algae == BlockSeaGrass.block)
					) {
						int yy = 1;
						while (yy <= 16) { //Green algae water must be 15 deep or less
							if (worldIn.getBlockState(new BlockPos(j, k + yy, l)).getMaterial() != Material.WATER) {
								break;
							}
							yy += 1;
						}
						if (yy > 15) {
							waterDepthCheckMax = false;
						}
					}

					if (waterDepthCheckMin && (this.algae == BlockRedAlgaeMat.block
							|| this.algae == BlockRedLeafyAlgae.block
							|| this.algae == BlockRedTuftedAlgae.block
							|| this.algae == BlockBrownAlgae.block
							|| this.algae == BlockBrownAscendingAlgae.block
							|| this.algae == BlockStalkyBrownAlgae.block)
					) {
						int yy = 1;
						while (yy <= 31) { //Green algae water must be 15 deep or less
							if (worldIn.getBlockState(new BlockPos(j, k + yy, l)).getMaterial() != Material.WATER) {
								break;
							}
							yy += 1;
						}
						if (yy > 30) {
							waterDepthCheckMax = false;
						}
					}

					if (waterDepthCheckMin && waterDepthCheckMax) {
						//figure out a position and facing to place this at!
						//First try regular uprights and then the rotations:
						EnumFacing enumfacing = EnumFacing.UP;
						BlockPos pos = new BlockPos(j, k - 1, l);
						if (((worldIn.getBlockState(pos).getMaterial() == Material.SAND)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.ROCK && worldIn.getBlockState(pos).getBlock() != Blocks.MAGMA)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.GROUND)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.CLAY)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.CORAL)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.SPONGE)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.GLASS)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.IRON)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.WOOD))
								&& (worldIn.getBlockState(pos).getBlockFaceShape(worldIn, pos, EnumFacing.UP) == BlockFaceShape.SOLID)
						) {
							if (this.algae != BlockSeaGrass.block) {
								Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j, k, l), this.state.withProperty(FACING, enumfacing), 2);
							} else {
								Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j, k, l), this.state, 2);
							}

						} else {
							if ( //exclude ones which are better not/can't go sideways!
									(this.algae != BlockGreenCharaAlgae.block)
											&& (this.algae != BlockGreenLeafyAlgae.block)
											&& (this.algae != BlockDarkPinkSponge.block)
											&& (this.algae != BlockGlassSponge.block)
											&& (this.algae != BlockPinkSponge.block)
											&& (this.algae != BlockYellowSponge.block)
											&& (this.algae != BlockAnemone1.block)
											&& (this.algae != BlockAnemone2.block)
											&& (this.algae != BlockAnemone3.block)
											&& (this.algae != BlockAnemone4.block)
											&& (this.algae != BlockAnemone5.block)
											&& (this.algae != BlockAnemone6.block)
											&& (this.algae != BlockAnemone7.block)
											&& (this.algae != BlockAnemone8.block)
											&& (this.algae != BlockAnemone9.block)
											&& (this.algae != BlockWaterBottomGunk.block)
											&& (this.algae != BlockSeaGrass.block)
							) {
								for (EnumFacing enumfacing1 : FACING.getAllowedValues()) {
									pos = new BlockPos(j, k, l);

									if (enumfacing1 == EnumFacing.NORTH) {
										pos = new BlockPos(j, k, l + 1);
									}
									if (enumfacing1 == EnumFacing.SOUTH) {
										pos = new BlockPos(j, k, l - 1);
									}
									if (enumfacing1 == EnumFacing.EAST) {
										pos = new BlockPos(j - 1, k, l);
									}
									if (enumfacing1 == EnumFacing.WEST) {
										pos = new BlockPos(j + 1, k, l);
									}

									if (enumfacing1 != EnumFacing.UP && enumfacing1 != EnumFacing.DOWN &&
											((worldIn.getBlockState(pos).getMaterial() == Material.SAND)
												|| (worldIn.getBlockState(pos).getMaterial() == Material.ROCK)
												|| (worldIn.getBlockState(pos).getMaterial() == Material.GROUND)
												|| (worldIn.getBlockState(pos).getMaterial() == Material.CLAY)
												|| (worldIn.getBlockState(pos).getMaterial() == Material.CORAL)
												|| (worldIn.getBlockState(pos).getMaterial() == Material.SPONGE)
												|| (worldIn.getBlockState(pos).getMaterial() == Material.GLASS)
												|| (worldIn.getBlockState(pos).getMaterial() == Material.IRON)
												|| (worldIn.getBlockState(pos).getMaterial() == Material.WOOD))
											&& (worldIn.getBlockState(pos).getBlockFaceShape(worldIn, pos, enumfacing1) == BlockFaceShape.SOLID)) {
										Functions.setBlockStateAndCheckForDoublePlant(worldIn,new BlockPos(j, k, l), this.state.withProperty(FACING, enumfacing1), 2);

									}
								}
							}
						}
					}

				}
			}
		}
		return true;
	}

}
