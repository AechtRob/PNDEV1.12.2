
package net.lepidodendron.world.structure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockLavaCobble;
import net.lepidodendron.block.BlockLavaCobbleMolten;
import net.lepidodendron.block.BlockLavaRock;
import net.lepidodendron.block.BlockToxicMud;
import net.lepidodendron.world.biome.ChunkGenSpawner;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fluids.BlockFluidBase;

import java.util.ArrayList;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class StructureVolcanicVentUnderwater extends ElementsLepidodendronMod.ModElement {
	public StructureVolcanicVentUnderwater(ElementsLepidodendronMod instance) {
		super(instance, 44);
	}

	@Override
	public void generateWorld(Random random, int i2, int k2, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {

		Biome biome = world.getBiome(new BlockPos(i2, world.getSeaLevel(), k2));
		if (!(biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_ocean")))
			return;

		if (random.nextInt(6) <= 1) {
			int i = i2 + random.nextInt(16) + 8;
			int k = k2 + random.nextInt(16) + 8;
			BlockPos pos = new BlockPos(i, 0, k);
			pos = ChunkGenSpawner.getTopSolidBlock(pos, world);
			if (pos.getY() >= 45 + random.nextInt(6)) {
				return;
			}
			//Assemble our shape:
			//Either north-south or east-west:
			ArrayList<BlockPos> ventPos = new ArrayList<BlockPos>();
			int ventlength = random.nextInt(10) + 3;
			if (random.nextInt(2) == 0) {
				//N-S
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
					world.setBlockState(bp, Blocks.WATER.getDefaultState());
					IBlockState state = Blocks.MAGMA.getDefaultState();
					if (world.rand.nextInt(2) == 0) {
						state = BlockLavaCobbleMolten.block.getDefaultState();
					}
					world.setBlockState(bp.down(), state);
				}
				for (BlockPos bp : ventPos) {
					placeSulphur(world, bp);
				}
			}
		}
	}

	public static void placeSulphur(World world, BlockPos pos) {
		for (int x = -1; x <= 1; x++) {
			for (int z = -1; z <= 1; z++) {
				IBlockState state = null;
				int i = world.rand.nextInt(4);
				switch (i) {
					case 0: default:
						state = BlockLavaRock.block.getDefaultState();
						break;

					case 1:
						state = BlockLavaCobble.block.getDefaultState();
						break;

					case 2:
						state = BlockToxicMud.block.getDefaultState();
						break;

					case 3:
						state = Blocks.OBSIDIAN.getDefaultState();
						break;
				}
				if (!isWaterBlock(world, pos.add(x, 0, z))) {
					world.setBlockState(pos.add(x, 0, z), state);
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
	
}
