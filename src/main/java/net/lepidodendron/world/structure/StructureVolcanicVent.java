
package net.lepidodendron.world.structure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockToxicMud;
import net.lepidodendron.world.biome.ChunkGenSpawner;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;

import java.util.ArrayList;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class StructureVolcanicVent extends ElementsLepidodendronMod.ModElement {
	public StructureVolcanicVent(ElementsLepidodendronMod instance) {
		super(instance, 44);
	}

	@Override
	public void generateWorld(Random random, int i2, int k2, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {

		Biome biome = world.getBiome(new BlockPos(i2, world.getSeaLevel(), k2));
		if (!(biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_yixian_highland")))
			return;

		if (random.nextInt(5) <= 1) {
			int i = i2 + random.nextInt(16) + 8;
			int k = k2 + random.nextInt(16) + 8;
			BlockPos pos = new BlockPos(i, 0, k);
			pos = ChunkGenSpawner.getTopSolidBlock(pos, world);
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
					world.setBlockToAir(bp);
					world.setBlockState(bp.down(), BlockToxicMud.block.getDefaultState());
				}
			}
		}
	}

	public static boolean testBlock(World world, BlockPos pos) {

		if (!world.isBlockLoaded(pos)) {
			return false;
		}
		if (!world.isBlockLoaded(pos.north())) {
			return false;
		}
		if (!world.isBlockLoaded(pos.south())) {
			return false;
		}
		if (!world.isBlockLoaded(pos.east())) {
			return false;
		}
		if (!world.isBlockLoaded(pos.west())) {
			return false;
		}

		IBlockState block = world.getBlockState(pos);
		Material materialDown1 = world.getBlockState(pos.down()).getMaterial();
		Material materialDown2 = world.getBlockState(pos.down()).getMaterial();

		if (!world.isAirBlock(pos.up())) {
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
	
}
