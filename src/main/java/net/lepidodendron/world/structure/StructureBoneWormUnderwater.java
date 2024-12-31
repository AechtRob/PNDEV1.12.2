
package net.lepidodendron.world.structure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockBoneWorm;
import net.lepidodendron.world.biome.ChunkGenSpawner;
import net.minecraft.block.BlockBone;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fluids.BlockFluidBase;

import java.util.ArrayList;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class StructureBoneWormUnderwater extends ElementsLepidodendronMod.ModElement {
	public StructureBoneWormUnderwater(ElementsLepidodendronMod instance) {
		super(instance, 44);
	}

	@Override
	public void generateWorld(Random random, int i2, int k2, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {

		Biome biome = world.getBiome(new BlockPos(i2, world.getSeaLevel(), k2));
		if (!(biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_ocean")))
			return;

		if (random.nextInt(10) <= 1) {
			int i = i2 + random.nextInt(16) + 8;
			int k = k2 + random.nextInt(16) + 8;
			BlockPos pos = new BlockPos(i, 0, k);
			pos = ChunkGenSpawner.getTopSolidBlock(pos, world);
			if (pos.getY() >= 40 + random.nextInt(6)) {
				return;
			}
			boolean northsouth = false;
			//Assemble our shape:
			//Either north-south or east-west:
			ArrayList<BlockPos> ventPos = new ArrayList<BlockPos>();
			int ventlength = random.nextInt(5) + 6;
			if (random.nextInt(2) == 0) {
				//N-S
				northsouth = true;
				BlockPos tempPos = pos;
				ventPos.add(pos);
				boolean diag = true;
				for (int n = 0; n <= ventlength; n ++) {
					tempPos = tempPos.north();
					if (!(testBlock(world, tempPos))) {
						continue;
					}
					ventPos.add(tempPos);
					int v = random.nextInt(6);
					if (v == 0 && !diag) {
						tempPos = tempPos.east();
						if (!(testBlock(world, tempPos))) {
							continue;
						}
						ventPos.add(tempPos);
						diag = true;
					}
					else if (v == 1 && !diag) {
						tempPos = tempPos.west();
						if (!(testBlock(world, tempPos))) {
							continue;
						}
						ventPos.add(tempPos);
						diag = true;
					}
					else {
						diag = false;
					}
				}
			}
			else {
				//E-W
				BlockPos tempPos = pos;
				ventPos.add(pos);
				boolean diag = true;
				for (int n = 0; n <= ventlength; n ++) {
					tempPos = tempPos.east();
					if (!(testBlock(world, tempPos))) {
						continue;
					}
					ventPos.add(tempPos);
					int v = random.nextInt(6);
					if (v == 0 && !diag) {
						tempPos = tempPos.north();
						if (!(testBlock(world, tempPos))) {
							continue;
						}
						ventPos.add(tempPos);
						diag = true;
					}
					else if (v == 1 && !diag) {
						tempPos = tempPos.south();
						if (!(testBlock(world, tempPos))) {
							continue;
						}
						ventPos.add(tempPos);
						diag = true;
					}
					else {
						diag = false;
					}
				}
			}
			if (!ventPos.isEmpty()) {
				for (BlockPos bp : ventPos) {
					if (world.rand.nextInt(2) == 0) {
						if (northsouth) {
							world.setBlockState(bp.up(), Blocks.BONE_BLOCK.getDefaultState().withProperty(BlockBone.AXIS, EnumFacing.Axis.Z));
						}
						else {
							world.setBlockState(bp.up(), Blocks.BONE_BLOCK.getDefaultState().withProperty(BlockBone.AXIS, EnumFacing.Axis.X));
						}
						setBoneWorms(world, bp.up());
					}
				}
				for (BlockPos bp : ventPos) {
					if (random.nextInt(8) == 0) {
						placeBoneUnder(world, bp, northsouth);
					}
				}
			}
		}
	}

	public static void placeBoneUnder(World world, BlockPos pos, boolean northsouth) {
		if (northsouth) {
			for (int i = -1; i <= 1; i++) {
				if (!isWaterBlock(world, pos.add(i, 0, 0))
					&& i != 0) {
					world.setBlockState(pos.add(i, 0, 0), Blocks.BONE_BLOCK.getDefaultState().withProperty(BlockBone.AXIS, EnumFacing.Axis.Z));
					setBoneWorms(world, pos.add(i, 0, 0));
				}
			}
		}
		else {
			for (int i = -1; i <= 1; i++) {
				if (!isWaterBlock(world, pos.add(0, 0, i))
						&& i != 0) {
					world.setBlockState(pos.add(0, 0, i), Blocks.BONE_BLOCK.getDefaultState().withProperty(BlockBone.AXIS, EnumFacing.Axis.X));
					setBoneWorms(world, pos.add(0, 0, i));
				}
			}
		}
	}

	public static boolean testBlock(World world, BlockPos pos) {

		if (!world.isBlockLoaded(pos)) {
			return false;
		}
		for (int x = -2; x <= 2; x++) {
			for (int z = -2; z <= 2; z++) {
				if (!world.isBlockLoaded(pos.add(x, 0, z))) {
					return false;
				}
			}
		}

		for (int x = -1; x <= 1; x++) {
			for (int z = -1; z <= 1; z++) {
				if (isWaterBlock(world, pos.add(x, 0, z))) {
					return false;
				}
			}
		}

		IBlockState block = world.getBlockState(pos);
		Material materialDown1 = world.getBlockState(pos.down()).getMaterial();
		Material materialDown2 = world.getBlockState(pos.down()).getMaterial();

		if (!isWaterBlock(world, pos.up())) {
			return false;
		}
		if (block.getMaterial() != Material.GROUND
				&& block.getMaterial() != Material.ROCK
				&& block.getMaterial() != Material.CLAY
				&& block.getMaterial() != Material.SAND) {
			return false;
		}
		if (materialDown1 != Material.GROUND
				&& materialDown1 != Material.ROCK
				&& materialDown1 != Material.CLAY
				&& materialDown1 != Material.SAND) {
			return false;
		}
		if (materialDown2 != Material.GROUND
				&& materialDown2 != Material.ROCK
				&& materialDown2 != Material.CLAY) {
			return false;
		}
		return true;
	}

	public static boolean isWaterBlock(World world, BlockPos pos) {
		IBlockState state = world.getBlockState(pos);
		return state.getMaterial() == Material.WATER
			|| state.getBlock() instanceof BlockLiquid
			|| state.getBlock() instanceof BlockFluidBase;
	}

	public static void setBoneWorms(World world, BlockPos pos) {
		if (world.rand.nextInt(6) != 0) {
			if (BlockBoneWorm.block.canPlaceBlockOnSide(world, pos.up(), EnumFacing.UP)) {
				world.setBlockState(pos.up(), BlockBoneWorm.block.getDefaultState().withProperty(BlockBoneWorm.BlockCustom.FACING, EnumFacing.UP));
			}
			if (world.rand.nextInt(3) == 0) {
				if (BlockBoneWorm.block.canPlaceBlockOnSide(world, pos.north(), EnumFacing.NORTH)) {
					world.setBlockState(pos.north(), BlockBoneWorm.block.getDefaultState().withProperty(BlockBoneWorm.BlockCustom.FACING, EnumFacing.NORTH));
				}
			}
			if (world.rand.nextInt(3) == 0) {
				if (BlockBoneWorm.block.canPlaceBlockOnSide(world, pos.south(), EnumFacing.SOUTH)) {
					world.setBlockState(pos.south(), BlockBoneWorm.block.getDefaultState().withProperty(BlockBoneWorm.BlockCustom.FACING, EnumFacing.SOUTH));
				}
			}
			if (world.rand.nextInt(3) == 0) {
				if (BlockBoneWorm.block.canPlaceBlockOnSide(world, pos.east(), EnumFacing.EAST)) {
					world.setBlockState(pos.east(), BlockBoneWorm.block.getDefaultState().withProperty(BlockBoneWorm.BlockCustom.FACING, EnumFacing.EAST));
				}
			}
			if (world.rand.nextInt(3) == 0) {
				if (BlockBoneWorm.block.canPlaceBlockOnSide(world, pos.west(), EnumFacing.WEST)) {
					world.setBlockState(pos.west(), BlockBoneWorm.block.getDefaultState().withProperty(BlockBoneWorm.BlockCustom.FACING, EnumFacing.WEST));
				}
			}
		}
	}
	
}
