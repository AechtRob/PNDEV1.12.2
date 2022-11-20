package net.lepidodendron.world.gen;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.block.*;
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
		int dimID = worldIn.provider.getDimension();
		boolean dimensionCriteria = false;
		boolean algae = (this.algae == BlockGreenAlgaeMat.block || this.algae == BlockBrownAlgae.block || this.algae == BlockGreenCharaAlgae.block || this.algae == BlockGreenCodiumAlgae.block || this.algae == BlockGreenCrustedAlgae.block || this.algae == BlockGreenLeafyAlgae.block || this.algae == BlockGreenSproutingAlgae.block || this.algae == BlockPiledAlgae.block || this.algae == BlockStalkedAlgae.block || this.algae == BlockStalkyBrownAlgae.block);
		boolean gunk = (this.algae == BlockWaterBottomGunk.block);
		boolean rugosas = (this.algae == BlockRugosa1.block || this.algae == BlockRugosa2.block || this.algae == BlockRugosa3.block || this.algae == BlockRugosa4.block || this.algae == BlockRugosa5.block);
		boolean anemones = (this.algae == BlockAnemone1.block || this.algae == BlockAnemone2.block || this.algae == BlockAnemone3.block || this.algae == BlockAnemone4.block || this.algae == BlockAnemone5.block || this.algae == BlockAnemone6.block || this.algae == BlockAnemone7.block || this.algae == BlockAnemone8.block || this.algae == BlockAnemone9.block);
		boolean cystoids = (this.algae == BlockCystoidAristocystites.block || this.algae == BlockCystoidBolboporites.block || this.algae == BlockCystoidEchinosphaerites.block || this.algae == BlockCystoidPseudocrinites.block);
		boolean ediacaran = (this.algae == BlockTawuia.block);
		int[] dimCheck = LepidodendronConfigPlants.dimAlgae;
		if (rugosas) {dimCheck = LepidodendronConfigPlants.dimRugosa;}
		if (anemones) {dimCheck = LepidodendronConfigPlants.dimAnemone;}
		if (cystoids) {dimCheck = LepidodendronConfigPlants.dimCrinoid;}
		if (ediacaran) {dimCheck = LepidodendronConfigPlants.dimEdiacaran;}
		if (shouldGenerateInDimension(dimID, dimCheck))
		dimensionCriteria = true;
		if ((dimID == LepidodendronConfig.dimDevonian && (!cystoids) && (!ediacaran))
			|| ((dimID == LepidodendronConfig.dimOrdovician || dimID == LepidodendronConfig.dimSilurian) && (!ediacaran))
			|| (dimID == LepidodendronConfig.dimCambrian && (!rugosas) && (!cystoids) && (!ediacaran))
			|| (dimID == LepidodendronConfig.dimPrecambrian && (!rugosas) && (!cystoids) && (!anemones))
			|| ((dimID == LepidodendronConfig.dimCarboniferous ) && (!cystoids) && (!ediacaran))
			|| ((dimID == LepidodendronConfig.dimPermian ) && (!cystoids) && (!ediacaran))
			|| ((dimID == LepidodendronConfig.dimTriassic ) && (!cystoids) && (!ediacaran) && (!rugosas))
			|| ((dimID == LepidodendronConfig.dimJurassic ) && (!cystoids) && (!ediacaran) && (!rugosas))
			) {
			dimensionCriteria = true;
		}

		if (!dimensionCriteria)
			return true;

		int bound = 8;
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
			|| (this.algae == BlockGigantospongia.block)
			|| (this.algae == BlockFenestellaGiantBlue.block)
			|| (this.algae == BlockFenestellaGiantOrange.block)
			|| (this.algae == BlockFenestellaGiantRed.block)
			|| (this.algae == BlockFenestellaGiantYellow.block)) {
		bound = 4;
	}

		int multiplier = 1;
		if (algae) {
			multiplier = 4;
		}
		if (gunk) {
			multiplier = 10;
		}

		for (int i = 0; i < (64 * multiplier); ++i)
		{
			int j = position.getX() + rand.nextInt(bound) - rand.nextInt(bound);
			int k = position.getY() + rand.nextInt(4) - rand.nextInt(4);
			int l = position.getZ() + rand.nextInt(bound) - rand.nextInt(bound);

			if (worldIn.isBlockLoaded(new BlockPos(j, k, l))) {

				if (this.algae.canPlaceBlockAt(worldIn, new BlockPos(j, k, l))
						&& (worldIn.getBlockState(new BlockPos(j, k, l)).getBlock() == Blocks.WATER || worldIn.getBlockState(new BlockPos(j, k, l)).getBlock() == Blocks.FLOWING_WATER)
						&& !worldIn.isAirBlock(new BlockPos(j, k, l + 1))
						&& !worldIn.isAirBlock(new BlockPos(j, k, l - 1))
						&& !worldIn.isAirBlock(new BlockPos(j + 1, k, l))
						&& !worldIn.isAirBlock(new BlockPos(j - 1, k, l))) {

					//Check that at least enough water is over the position (sponges):
					boolean waterDepthCheckMin = true;
					if (dimID != LepidodendronConfig.dimCambrian &&
							(this.algae == BlockDarkPinkSponge.block)
							|| (this.algae == BlockPinkSponge.block)
							|| (this.algae == BlockYellowSponge.block)
							|| (this.algae == BlockDarkOrangeSponge.block)
							|| (this.algae == BlockWhiteSponge.block)
							|| (this.algae == BlockBlueSponge.block)
							|| (this.algae == BlockOrangeSponge.block)
							|| (this.algae == BlockRedSponge.block)
							|| (this.algae == BlockBrownSponge.block)
							|| (this.algae == BlockBranchedSponge.block)
							|| (this.algae == BlockGigantospongia.block)
							|| (this.algae == BlockFenestellaGiantBlue.block)
							|| (this.algae == BlockFenestellaGiantOrange.block)
							|| (this.algae == BlockFenestellaGiantRed.block)
							|| (this.algae == BlockFenestellaGiantYellow.block)
							|| (this.algae == BlockAmblysiphonella.block)
					) {
						int yy = 1;
						while (yy <= 4 && waterDepthCheckMin) {
							if (worldIn.getBlockState(new BlockPos(j, k + yy, l)).getMaterial() != Material.WATER) {
								waterDepthCheckMin = false;
							}
							yy += 1;
						}
					}

					//And check that algae do not generate too deep and some other tests:
					if (algae && (k + (rand.nextInt(3) - 1)) < (worldIn.getSeaLevel() - 10)) {
						waterDepthCheckMin = false;
					}
					if (rugosas && this.algae != BlockRugosa5.block && (k + (rand.nextInt(3) - 1)) < (worldIn.getSeaLevel() - 18)) {
						waterDepthCheckMin = false;
					}
					if (gunk && (k + (rand.nextInt(3) - 1)) > (worldIn.getSeaLevel() - 22)) {
						waterDepthCheckMin = false;
					}

					if (waterDepthCheckMin) {
						//figure out a position and facing to place this at!
						//First try regular uprights and then the rotations:
						EnumFacing enumfacing = EnumFacing.UP;
						BlockPos pos = new BlockPos(j, k - 1, l);
						if (((worldIn.getBlockState(pos).getMaterial() == Material.SAND)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.ROCK)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.GROUND)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.CLAY)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.CORAL)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.GLASS)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.IRON)
								|| (worldIn.getBlockState(pos).getMaterial() == Material.WOOD))
								&& (worldIn.getBlockState(pos).getBlockFaceShape(worldIn, pos, EnumFacing.UP) == BlockFaceShape.SOLID)
								&& (this.algae != BlockCystoidPseudocrinites.block) //this is preferred on the sides
								&& (this.algae != BlockGigantospongia.block) //this is preferred on the sides
								&& (this.algae != BlockFenestellaGiantBlue.block) //this is preferred on the sides
								&& (this.algae != BlockFenestellaGiantOrange.block) //this is preferred on the sides
								&& (this.algae != BlockFenestellaGiantRed.block) //this is preferred on the sides
								&& (this.algae != BlockFenestellaGiantYellow.block) //this is preferred on the sides
						) {
							if (this.algae != BlockCrinoidPetalocrinus.block && this.algae != BlockCrinoidVadarocrinus.block) {
								worldIn.setBlockState(new BlockPos(j, k, l), this.state.withProperty(FACING, enumfacing), 2);
							} else {
								worldIn.setBlockState(new BlockPos(j, k, l), this.state, 2);
							}
							return true;
						} else {
							if ( //exclude ones which are better not/can't go sideways!
									(this.algae != BlockGreenCharaAlgae.block)
											&& (this.algae != BlockGreenLeafyAlgae.block)
											&& (this.algae != BlockDarkPinkSponge.block)
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
											&& (this.algae != BlockCystoidBolboporites.block)
											&& (this.algae != BlockCystoidEchinosphaerites.block)
											&& (this.algae != BlockCystoidAristocystites.block)
											&& (this.algae != BlockCrinoidPetalocrinus.block)
											&& (this.algae != BlockCrinoidVadarocrinus.block)
											&& (this.algae != BlockWaterBottomGunk.block)
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
												|| (worldIn.getBlockState(pos).getMaterial() == Material.GLASS)
												|| (worldIn.getBlockState(pos).getMaterial() == Material.IRON)
												|| (worldIn.getBlockState(pos).getMaterial() == Material.WOOD))
											&& (worldIn.getBlockState(pos).getBlockFaceShape(worldIn, pos, enumfacing1) == BlockFaceShape.SOLID)) {
										worldIn.setBlockState(new BlockPos(j, k, l), this.state.withProperty(FACING, enumfacing1), 2);
										return true;
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


	public boolean shouldGenerateInDimension(int id, int[] dims) {
		int[] var2 = dims;
		int var3 = dims.length;
		for (int var4 = 0; var4 < var3; ++var4) {
			int dim = var2[var4];
			if (dim == id) {
				return true;
			}
		}
		return false;
    }
}
