
package net.lepidodendron.world.structure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.BlockTrackwayArthropodBent;
import net.lepidodendron.block.BlockTrackwayArthropodStraight;
import net.lepidodendron.world.biome.ChunkGenSpawner;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class StructureTrackwayArthropod extends ElementsLepidodendronMod.ModElement {
	public StructureTrackwayArthropod(ElementsLepidodendronMod instance) {
		super(instance, 44);
	}

	private BlockPos posCurrent;
	private int downer = 0;

	@Override
	public void generateWorld(Random random, int i2, int k2, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {

		if (world.isRemote) {
			return;
		}

		int multiplier = 2;

		if (dimID != LepidodendronConfig.dimOrdovician
				&& dimID != LepidodendronConfig.dimSilurian
				&& dimID != LepidodendronConfig.dimDevonian)
			return;

		if (dimID == LepidodendronConfig.dimOrdovician
				|| dimID == LepidodendronConfig.dimSilurian) {
			multiplier = 1;
		}

		for (int n = 0; n <= 6 * multiplier; ++n) {
			this.downer = 0;
			//if ((random.nextInt(1000000) + 1) <= GenChance) {
			int i = i2 + random.nextInt(16) + 8;
			int k = k2 + random.nextInt(16) + 8;
			Biome biome = world.getBiome(new BlockPos(i, 0, k));
			if ((!biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_springs"))
					&& (!biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_conulariid"))
					&& (!biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_conulariid_land"))
					&& (!biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_meadow"))
					&& (!biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_meadow"))
					&& (!biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_bog"))
					&& (!biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_creek_bog"))
					&& (!biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_beach"))
					&& (!biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_lush_patch"))
					&& (!biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_silty_swamp"))
					&& (!biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_cooksonia"))) {
				continue;
			}
			BlockPos pos = ChunkGenSpawner.getTopSolidBlock(new BlockPos(i, 0, k), world).up();
			if ((!BlockTrackwayArthropodStraight.block.canPlaceBlockAt(world, pos))
					|| world.getBlockState(pos).getBlock() == BlockTrackwayArthropodStraight.block
					|| world.getBlockState(pos).getBlock() == BlockTrackwayArthropodBent.block
					|| !(world.getBlockState(pos).getMaterial() == Material.PLANTS || world.isAirBlock(pos))) {
				continue;
			}
			//Must start off next to water, and we need to know which way that is:
			EnumFacing posWater = getWaterPos(world, pos);
			if (posWater == null) { //There is nowhere to start from here
				continue;
			}
			//We need to know where we are going before we know what to place!
			EnumFacing posNext = getPathPoint(world, pos, posWater);
			if (posNext == null) { //Nowhere to go so just place one piece and stop
				int p = world.rand.nextInt(4);
				switch (p) {
					case 0:
					default:
						world.setBlockState(pos, BlockTrackwayArthropodStraight.block.getDefaultState().withProperty(BlockTrackwayArthropodBent.FACING, posWater.getOpposite()));
						break;
					case 1:
						world.setBlockState(pos, BlockTrackwayArthropodStraight.block.getDefaultState().withProperty(BlockTrackwayArthropodBent.FACING, posWater.getOpposite().rotateY()));
						break;
					case 2:
					case 3:
						world.setBlockState(pos, BlockTrackwayArthropodStraight.block.getDefaultState().withProperty(BlockTrackwayArthropodStraight.FACING, posWater.getOpposite()));
						break;
				}
			}
			else {
				int pathLength = world.rand.nextInt(15) + 4;
				this.posCurrent = pos.add(0, downer, 0);
				for (int ii = 1; ii <= pathLength; ++ii) {
					this.downer = 0;
					posWater = pathFindAndPlace(world, this.posCurrent, posWater);
					if (posWater == null) {
						break; //End of path
					}
				}
			}

		}
	}

	@Nullable
	public EnumFacing pathFindAndPlace(World world, BlockPos pos, EnumFacing comingFrom) {
		EnumFacing posNext = getPathPoint(world, pos, comingFrom);
		if (posNext == null) {
			//Just place the block and stop:
			world.setBlockState(pos, BlockTrackwayArthropodStraight.block.getDefaultState().withProperty(BlockTrackwayArthropodStraight.FACING, comingFrom.getOpposite()));
			return null;
		}

		if (posNext.getOpposite() == comingFrom) {
			world.setBlockState(pos, BlockTrackwayArthropodStraight.block.getDefaultState().withProperty(BlockTrackwayArthropodStraight.FACING, comingFrom.getOpposite()));
		}
		if (posNext == comingFrom.rotateY()) {
			world.setBlockState(pos, BlockTrackwayArthropodBent.block.getDefaultState().withProperty(BlockTrackwayArthropodStraight.FACING, comingFrom.getOpposite().rotateY().rotateY().rotateY()));
		}
		if (posNext == comingFrom.rotateY().rotateY().rotateY()) {
			world.setBlockState(pos, BlockTrackwayArthropodBent.block.getDefaultState().withProperty(BlockTrackwayArthropodStraight.FACING, comingFrom.getOpposite().rotateY().rotateY()));
		}

		this.posCurrent = pos.offset(posNext).add(0, downer, 0);
		this.downer = 0;
		return posNext.getOpposite();
	}

	@Nullable
	public EnumFacing getWaterPos(World world, BlockPos pos) {
		int d = world.rand.nextInt(4);
		EnumFacing returnPos = null;
		boolean surrounded = true;
		for (int i = 0; i <= 3; ++i) {
			if (d > 3) {
				d = d - 4;
			}
			if (world.getBlockState(pos.down().offset(EnumFacing.byHorizontalIndex(d))).getMaterial() == Material.WATER) {
				returnPos = EnumFacing.byHorizontalIndex(d);
			}
			if (BlockTrackwayArthropodStraight.block.canPlaceBlockAt(world, pos.offset(EnumFacing.byHorizontalIndex(d)))
					&& world.getBlockState(pos.offset(EnumFacing.byHorizontalIndex(d))).getBlock() != BlockTrackwayArthropodStraight.block
					&& world.getBlockState(pos.offset(EnumFacing.byHorizontalIndex(d))).getBlock() != BlockTrackwayArthropodBent.block
					&& (world.getBlockState(pos.offset(EnumFacing.byHorizontalIndex(d))).getMaterial() == Material.PLANTS || world.isAirBlock(pos.offset(EnumFacing.byHorizontalIndex(d))))) {
				surrounded = false;
			}
			d++;
		}
		if (!surrounded) {
			return returnPos;
		}
		return null;
	}

	@Nullable
	public EnumFacing getPathPoint(World world, BlockPos pos, EnumFacing comingFrom) {
		int d = world.rand.nextInt(4);
		EnumFacing returnPos = null;
		if (world.rand.nextBoolean()) { //Try clockwise
			for (int i = 0; i <= 3; ++i) {
				if (d > 3) {
					d = d - 4;
				}
				if (BlockTrackwayArthropodStraight.block.canPlaceBlockAt(world, pos.offset(EnumFacing.byHorizontalIndex(d)))
						&& world.getBlockState(pos.offset(EnumFacing.byHorizontalIndex(d))).getBlock() != BlockTrackwayArthropodStraight.block
						&& world.getBlockState(pos.offset(EnumFacing.byHorizontalIndex(d))).getBlock() != BlockTrackwayArthropodBent.block
						&& (world.getBlockState(pos.offset(EnumFacing.byHorizontalIndex(d))).getMaterial() == Material.PLANTS || world.isAirBlock(pos.offset(EnumFacing.byHorizontalIndex(d))))) {
					if (comingFrom != EnumFacing.byHorizontalIndex(d)) {
						returnPos = EnumFacing.byHorizontalIndex(d);
						this.downer = 0;
						if (world.rand.nextInt(10) != 0 && comingFrom.getOpposite() == returnPos) {
							return returnPos;
						}
					}
				}
				else if (BlockTrackwayArthropodStraight.block.canPlaceBlockAt(world, pos.down().offset(EnumFacing.byHorizontalIndex(d)))
						&& world.getBlockState(pos.down().offset(EnumFacing.byHorizontalIndex(d))).getBlock() != BlockTrackwayArthropodStraight.block
						&& world.getBlockState(pos.down().offset(EnumFacing.byHorizontalIndex(d))).getBlock() != BlockTrackwayArthropodBent.block
						&& (world.getBlockState(pos.down().offset(EnumFacing.byHorizontalIndex(d))).getMaterial() == Material.PLANTS || world.isAirBlock(pos.down().offset(EnumFacing.byHorizontalIndex(d))))) {
					if (comingFrom != EnumFacing.byHorizontalIndex(d)) {
						returnPos = EnumFacing.byHorizontalIndex(d);
						this.downer = -1;
						if (world.rand.nextInt(10) != 0 && comingFrom.getOpposite() == returnPos) {
							return returnPos;
						}
					}
				}
				else if (BlockTrackwayArthropodStraight.block.canPlaceBlockAt(world, pos.up().offset(EnumFacing.byHorizontalIndex(d)))
						&& world.getBlockState(pos.up().offset(EnumFacing.byHorizontalIndex(d))).getBlock() != BlockTrackwayArthropodStraight.block
						&& world.getBlockState(pos.up().offset(EnumFacing.byHorizontalIndex(d))).getBlock() != BlockTrackwayArthropodBent.block
						&& (world.getBlockState(pos.up().offset(EnumFacing.byHorizontalIndex(d))).getMaterial() == Material.PLANTS || world.isAirBlock(pos.up().offset(EnumFacing.byHorizontalIndex(d))))) {
					if (comingFrom != EnumFacing.byHorizontalIndex(d)) {
						returnPos = EnumFacing.byHorizontalIndex(d);
						this.downer = 1;
						if (world.rand.nextInt(10) != 0 && comingFrom.getOpposite() == returnPos) {
							return returnPos;
						}
					}
				}
				d++;
			}
		}
		else { //Try anticlockwise
			d = world.rand.nextInt(4);
			for (int i = 3; i >= 0; --i) {
				if (d < 0) {
					d = d + 4;
				}
				if (BlockTrackwayArthropodStraight.block.canPlaceBlockAt(world, pos.offset(EnumFacing.byHorizontalIndex(d)))
						&& world.getBlockState(pos.offset(EnumFacing.byHorizontalIndex(d))).getBlock() != BlockTrackwayArthropodStraight.block
						&& world.getBlockState(pos.offset(EnumFacing.byHorizontalIndex(d))).getBlock() != BlockTrackwayArthropodBent.block
						&& (world.getBlockState(pos.offset(EnumFacing.byHorizontalIndex(d))).getMaterial() == Material.PLANTS || world.isAirBlock(pos.offset(EnumFacing.byHorizontalIndex(d))))) {
					if (comingFrom != EnumFacing.byHorizontalIndex(d)) {
						returnPos = EnumFacing.byHorizontalIndex(d);
						this.downer = 0;
						if (world.rand.nextInt(10) != 0 && comingFrom.getOpposite() == returnPos) {
							return returnPos;
						}
					}
				}
				else if (BlockTrackwayArthropodStraight.block.canPlaceBlockAt(world, pos.down().offset(EnumFacing.byHorizontalIndex(d)))
						&& world.getBlockState(pos.down().offset(EnumFacing.byHorizontalIndex(d))).getBlock() != BlockTrackwayArthropodStraight.block
						&& world.getBlockState(pos.down().offset(EnumFacing.byHorizontalIndex(d))).getBlock() != BlockTrackwayArthropodBent.block
						&& (world.getBlockState(pos.down().offset(EnumFacing.byHorizontalIndex(d))).getMaterial() == Material.PLANTS || world.isAirBlock(pos.down().offset(EnumFacing.byHorizontalIndex(d))))) {
					if (comingFrom != EnumFacing.byHorizontalIndex(d)) {
						returnPos = EnumFacing.byHorizontalIndex(d);
						this.downer = -1;
						if (world.rand.nextInt(10) != 0 && comingFrom.getOpposite() == returnPos) {
							return returnPos;
						}
					}
				}
				else if (BlockTrackwayArthropodStraight.block.canPlaceBlockAt(world, pos.up().offset(EnumFacing.byHorizontalIndex(d)))
						&& world.getBlockState(pos.up().offset(EnumFacing.byHorizontalIndex(d))).getBlock() != BlockTrackwayArthropodStraight.block
						&& world.getBlockState(pos.up().offset(EnumFacing.byHorizontalIndex(d))).getBlock() != BlockTrackwayArthropodBent.block
						&& (world.getBlockState(pos.up().offset(EnumFacing.byHorizontalIndex(d))).getMaterial() == Material.PLANTS || world.isAirBlock(pos.up().offset(EnumFacing.byHorizontalIndex(d))))) {
					if (comingFrom != EnumFacing.byHorizontalIndex(d)) {
						returnPos = EnumFacing.byHorizontalIndex(d);
						this.downer = 1;
						if (world.rand.nextInt(10) != 0 && comingFrom.getOpposite() == returnPos) {
							return returnPos;
						}
					}
				}
				d--;
			}
		}
		return returnPos;
	}
}
