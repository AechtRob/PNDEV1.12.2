
package net.lepidodendron.world.structure;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.*;
import net.lepidodendron.pfvillagers.entity.VillagerPalaeobotanist;
import net.lepidodendron.pfvillagers.entity.VillagerPalaeontologist;
import net.lepidodendron.util.Functions;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockLadder;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fluids.BlockFluidBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class StructureDigSite extends ElementsLepidodendronMod.ModElement {
	public StructureDigSite(ElementsLepidodendronMod instance) {
		super(instance, 44);
	}

	private boolean palaeontolgists;
	private boolean palaeobotanists;

	@Override
	public void generateWorld(Random random, int i2, int k2, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {

		if (world.isRemote) {
			return;
		}

		if (!LepidodendronConfig.genFossil) {
			return;
		}

		List<BlockPos> FenceArray = new ArrayList<>();
		List<BlockPos> DigArray = new ArrayList<>();
		List<BlockPos> EdgeArray = new ArrayList<>();
		this.palaeobotanists = false;
		this.palaeontolgists = false;

		//Check dimID and check Config for spawning of these structures:
		if (!shouldGenerateInDimension(dimID, LepidodendronConfig.digsiteDimensionWhiteList)) {
			return;
		}
		if (matchBiome(world.getBiome(new BlockPos(i2 + 16, 0, k2 + 16)), LepidodendronConfig.digsiteBiomeBlacklist)) {
			return;
		}

		int GenChance = LepidodendronConfig.digsiteRarity;
		if (GenChance <= 0) {
			return;
		}
		
		if (random.nextInt(GenChance) == 0) {

			int fossilType = random.nextInt(13);
			IBlockState fossilOre = null;
			switch (fossilType) {
				case 0: default:
					fossilOre = BlockFossilPrecambrian.block.getDefaultState();
					break;

				case 1:
					fossilOre = BlockFossilCambrian.block.getDefaultState();
					break;

				case 2:
					fossilOre = BlockFossilOrdovician.block.getDefaultState();
					break;

				case 3:
					fossilOre = BlockFossilSilurian.block.getDefaultState();
					break;

				case 4:
					fossilOre = BlockFossilDevonian.block.getDefaultState();
					break;

				case 5:
					fossilOre = BlockFossilCarboniferous.block.getDefaultState();
					break;

				case 6:
					fossilOre = BlockFossilPermian.block.getDefaultState();
					break;

				case 7:
					fossilOre = BlockFossilTriassic.block.getDefaultState();
					break;

				case 8:
					fossilOre = BlockFossilJurassic.block.getDefaultState();
					break;

				case 9:
					fossilOre = BlockFossilCretaceous.block.getDefaultState();
					break;

				case 10:
					fossilOre = BlockFossilPaleogene.block.getDefaultState();
					break;

				case 11:
					fossilOre = BlockFossilNeogene.block.getDefaultState();
					break;

				case 12:
					fossilOre = BlockFossilPleistocene.block.getDefaultState();
					break;

			}

			boolean examinationBench = false;
			boolean pit = false;
			boolean generated = false;

			//Divide into chunks:
			//1, 2 and/or 3 can be holes, 4 is always tents

			int xx = 0;
			int zz = 0;
			double digDepth = 1000;
			double digHeight = 0;
			int x1 = i2 + 9; //Centre of the chunks
			int z1 = k2 + 9; //Centre of the chunks
			int x2 = i2 + 22; //Centre of the chunks
			int z2 = k2 + 9; //Centre of the chunks
			int x3 = i2 + 9; //Centre of the chunks
			int z3 = k2 + 22; //Centre of the chunks
			int x4 = i2 + 22; //Centre of the chunks
			int z4 = k2 + 22; //Centre of the chunks
			boolean tent1 = false;
			boolean tent2 = false;
			boolean tent3 = false;
			boolean tent4 = false;

			int i = random.nextInt(4);
			switch (i) {
				case 0:
				default:
					tent1 = true;
					break;

				case 1:
					tent2 = true;
					break;

				case 2:
					tent3 = true;
					break;

				case 3:
					tent4 = true;
					break;
			}

			boolean digChunk1 = false;
			boolean digChunk2 = false;
			boolean digChunk3 = false;
			boolean digChunk4 = false;
			while ((!digChunk1) && (!digChunk2) && (!digChunk3) && (!digChunk4)) {
				digChunk1 = random.nextInt(3) == 0 && !tent1;
				digChunk2 = random.nextInt(3) == 0 && !tent2;
				digChunk3 = random.nextInt(3) == 0 && !tent3;
				digChunk4 = random.nextInt(3) == 0 && !tent4;
			}

			//Chunk 1:
			if (digChunk1) {
				int radius = 5;
				//Create the main site template
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				Map<String, Object> circle = digCirle($_dependencies, radius, x1, z1);
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				//Pick a few random positions to break up the circle:
				BlockPos randPos1 = EdgeArray.get(random.nextInt(EdgeArray.size()));
				BlockPos randPos2 = EdgeArray.get(random.nextInt(EdgeArray.size()));
				BlockPos randPos3 = EdgeArray.get(random.nextInt(EdgeArray.size()));
				BlockPos randPos4 = EdgeArray.get(random.nextInt(EdgeArray.size()));
				BlockPos randPos5 = EdgeArray.get(random.nextInt(EdgeArray.size()));
				BlockPos randPos6 = EdgeArray.get(random.nextInt(EdgeArray.size()));
				BlockPos randPos7 = EdgeArray.get(random.nextInt(EdgeArray.size()));
				BlockPos randPos8 = EdgeArray.get(random.nextInt(EdgeArray.size()));

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(2) + 3, randPos1.getX(), randPos1.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(2) + 3, randPos2.getX(), randPos2.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(2) + 3, randPos3.getX(), randPos3.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(2) + 3, randPos4.getX(), randPos4.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(3) + 3, randPos5.getX(), randPos5.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(3) + 3, randPos6.getX(), randPos6.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(3) + 3, randPos7.getX(), randPos7.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(3) + 3, randPos8.getX(), randPos8.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				//Tidy the Lists up to remove dug blocks fully
				FenceArray.removeIf(DigArray::contains);
				FenceArray.removeIf(EdgeArray::contains);

				EdgeArray.removeIf(DigArray::contains);

			}

			//Chunk 2:
			if (digChunk2) {
				int radius = 5;
				//Create the main site template
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				Map<String, Object> circle = digCirle($_dependencies, radius, x2, z2);
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				//Pick a few random positions to break up the circle:
				BlockPos randPos1 = EdgeArray.get(random.nextInt(EdgeArray.size()));
				BlockPos randPos2 = EdgeArray.get(random.nextInt(EdgeArray.size()));
				BlockPos randPos3 = EdgeArray.get(random.nextInt(EdgeArray.size()));
				BlockPos randPos4 = EdgeArray.get(random.nextInt(EdgeArray.size()));
				BlockPos randPos5 = EdgeArray.get(random.nextInt(EdgeArray.size()));
				BlockPos randPos6 = EdgeArray.get(random.nextInt(EdgeArray.size()));
				BlockPos randPos7 = EdgeArray.get(random.nextInt(EdgeArray.size()));
				BlockPos randPos8 = EdgeArray.get(random.nextInt(EdgeArray.size()));

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(2) + 3, randPos1.getX(), randPos1.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(2) + 3, randPos2.getX(), randPos2.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(2) + 3, randPos3.getX(), randPos3.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(2) + 3, randPos4.getX(), randPos4.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(3) + 3, randPos5.getX(), randPos5.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(3) + 3, randPos6.getX(), randPos6.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(3) + 3, randPos7.getX(), randPos7.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(3) + 3, randPos8.getX(), randPos8.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				//Tidy the Lists up to remove dug blocks fully
				FenceArray.removeIf(DigArray::contains);
				FenceArray.removeIf(EdgeArray::contains);

				EdgeArray.removeIf(DigArray::contains);

			}

			//Chunk 3:
			if (digChunk3) {
				int radius = 5;
				//Create the main site template
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				Map<String, Object> circle = digCirle($_dependencies, radius, x3, z3);
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				//Pick a few random positions to break up the circle:
				BlockPos randPos1 = EdgeArray.get(random.nextInt(EdgeArray.size()));
				BlockPos randPos2 = EdgeArray.get(random.nextInt(EdgeArray.size()));
				BlockPos randPos3 = EdgeArray.get(random.nextInt(EdgeArray.size()));
				BlockPos randPos4 = EdgeArray.get(random.nextInt(EdgeArray.size()));
				BlockPos randPos5 = EdgeArray.get(random.nextInt(EdgeArray.size()));
				BlockPos randPos6 = EdgeArray.get(random.nextInt(EdgeArray.size()));
				BlockPos randPos7 = EdgeArray.get(random.nextInt(EdgeArray.size()));
				BlockPos randPos8 = EdgeArray.get(random.nextInt(EdgeArray.size()));

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(2) + 3, randPos1.getX(), randPos1.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(2) + 3, randPos2.getX(), randPos2.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(2) + 3, randPos3.getX(), randPos3.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(2) + 3, randPos4.getX(), randPos4.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(3) + 3, randPos5.getX(), randPos5.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(3) + 3, randPos6.getX(), randPos6.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(3) + 3, randPos7.getX(), randPos7.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(3) + 3, randPos8.getX(), randPos8.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				//Tidy the Lists up to remove dug blocks fully
				FenceArray.removeIf(DigArray::contains);
				FenceArray.removeIf(EdgeArray::contains);

				EdgeArray.removeIf(DigArray::contains);

			}

			//Chunk 4:
			if (digChunk4) {
				int radius = 5;
				//Create the main site template
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				Map<String, Object> circle = digCirle($_dependencies, radius, x4, z4);
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				//Pick a few random positions to break up the circle:
				BlockPos randPos1 = EdgeArray.get(random.nextInt(EdgeArray.size()));
				BlockPos randPos2 = EdgeArray.get(random.nextInt(EdgeArray.size()));
				BlockPos randPos3 = EdgeArray.get(random.nextInt(EdgeArray.size()));
				BlockPos randPos4 = EdgeArray.get(random.nextInt(EdgeArray.size()));
				BlockPos randPos5 = EdgeArray.get(random.nextInt(EdgeArray.size()));
				BlockPos randPos6 = EdgeArray.get(random.nextInt(EdgeArray.size()));
				BlockPos randPos7 = EdgeArray.get(random.nextInt(EdgeArray.size()));
				BlockPos randPos8 = EdgeArray.get(random.nextInt(EdgeArray.size()));

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(2) + 3, randPos1.getX(), randPos1.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(2) + 3, randPos2.getX(), randPos2.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(2) + 3, randPos3.getX(), randPos3.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(2) + 3, randPos4.getX(), randPos4.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(3) + 3, randPos5.getX(), randPos5.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(3) + 3, randPos6.getX(), randPos6.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(3) + 3, randPos7.getX(), randPos7.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				$_dependencies.put("FenceArray", FenceArray);
				$_dependencies.put("DigArray", DigArray);
				$_dependencies.put("EdgeArray", EdgeArray);
				circle = digCirle($_dependencies, random.nextInt(3) + 3, randPos8.getX(), randPos8.getZ());
				FenceArray = (List<BlockPos>) circle.get("FenceArray");
				DigArray = (List<BlockPos>) circle.get("DigArray");
				EdgeArray = (List<BlockPos>) circle.get("EdgeArray");

				//Tidy the Lists up to remove dug blocks fully
				FenceArray.removeIf(DigArray::contains);
				FenceArray.removeIf(EdgeArray::contains);

				EdgeArray.removeIf(DigArray::contains);

				//Process the lists:
				if (FenceArray.isEmpty() || EdgeArray.isEmpty() || DigArray.isEmpty()) {
					return;
				}

				for (BlockPos fencePos : FenceArray) {
					if (getTopBlockForDig(fencePos, world).up().getY() < world.getSeaLevel() ) {
						return;
					}
					IBlockState state = world.getBlockState(getTopBlockForDig(fencePos, world).up());
					if (state.getMaterial() == Material.WATER
							|| state.getBlock() instanceof BlockLiquid
							|| state.getBlock() instanceof BlockFluidBase) {
						return;
					}
					IBlockState stateD = world.getBlockState(getTopBlockForDig(fencePos, world));
					if (stateD.getMaterial() == Material.ICE
							|| stateD.getMaterial() == Material.PACKED_ICE) {
						return;
					}
				}

				for (BlockPos digPos : DigArray) {
					BlockPos addPos = getTopBlockForDig(digPos, world);
					if (addPos.getY() - 1 < digDepth) {
						digDepth = addPos.getY() - 1;
					}
				}

				for (BlockPos digPos : EdgeArray) {
					BlockPos addPos = getTopBlockForDig(digPos, world);
					if (addPos.getY() > digHeight) {
						digHeight = addPos.getY();
					}
				}

				if (digHeight - digDepth > 2) {
					return;
				}

				for (BlockPos fencePos : FenceArray) {
					int lights = 0;
					BlockPos addPos = getTopBlockForDig(fencePos, world).up();
					if (!(world.getBlockState(addPos).getMaterial() == Material.WOOD && world.getBlockState(addPos).getBlock().isFullBlock(world.getBlockState(addPos)))) {
						world.setBlockState(addPos, BlockPandanFence.block.getDefaultState());
						generated = true;
					}
				}
				boolean ladder1 = false;
				boolean ladder2 = false;
				boolean ladder3 = false;
				boolean ladder4 = false;
				for (BlockPos edgePos : EdgeArray) {
					BlockPos addPos = getTopBlockForDig(edgePos, world);
					treeFixer(world, addPos);
					int yDig = 0;
					while (addPos.down(yDig).getY() >= (digHeight - ((digHeight - digDepth) / 2D)) && addPos.down(yDig).getY() > 1) {
						world.setBlockToAir(addPos.down(yDig));
						generated = true;
						if (random.nextInt(4) == 0 && addPos.down(yDig + 1).getY() > 1) {
							world.setBlockToAir(addPos.down(yDig + 1));
							if (addPos.down(yDig + 1).getY() == digDepth) {
								world.setBlockState(addPos.down(yDig + 2), getStoneState(world, addPos));
								//Add a ladder because we are at the rock level now:
								//which chunk are we in?
								boolean ladderChunk1 = world.getChunk(addPos) == world.getChunk(new BlockPos(x1, 0, z1));
								boolean ladderChunk2 = world.getChunk(addPos) == world.getChunk(new BlockPos(x2, 0, z2));
								boolean ladderChunk3 = world.getChunk(addPos) == world.getChunk(new BlockPos(x3, 0, z3));
								boolean ladderChunk4 = world.getChunk(addPos) == world.getChunk(new BlockPos(x4, 0, z4));
								//Which side?
								if ((!(ladder1 && ladderChunk1))
										&& (!(ladder2 && ladderChunk2))
										&& (!(ladder3 && ladderChunk3))
										&& (!(ladder4 && ladderChunk4))
								) {
									if (FenceArray.contains(edgePos.north())) {
										BlockPos ladderPos = addPos.down(yDig + 1);
										BlockPos fencePos = getTopBlockForDig(edgePos.north(), world).up();
										if (world.getBlockState(fencePos).getBlock() == BlockPandanFence.block
												&& world.getBlockState(fencePos.south().down().north()).getBlock() != Blocks.LADDER
												&& world.getBlockState(fencePos.south().down().south()).getBlock() != Blocks.LADDER
												&& world.getBlockState(fencePos.south().down().east()).getBlock() != Blocks.LADDER
												&& world.getBlockState(fencePos.south().down().west()).getBlock() != Blocks.LADDER) {
											if (fenceCheck(world, fencePos)) {
												int yLadder = 0;
												while (ladderPos.up(yLadder).getY() <= fencePos.getY() - 1) {
													world.setBlockState(ladderPos.up(yLadder), Blocks.LADDER.getDefaultState().withProperty(BlockLadder.FACING, EnumFacing.SOUTH));
													yLadder++;
												}
												world.setBlockToAir(fencePos);
												if (ladderChunk1) {
													ladder1 = true;
												}
												if (ladderChunk2) {
													ladder2 = true;
												}
												if (ladderChunk3) {
													ladder3 = true;
												}
												if (ladderChunk4) {
													ladder4 = true;
												}
											}
										}
									} else if (FenceArray.contains(edgePos.south())) {
										BlockPos ladderPos = addPos.down(yDig + 1);
										BlockPos fencePos = getTopBlockForDig(edgePos.south(), world).up();
										if (world.getBlockState(fencePos).getBlock() == BlockPandanFence.block
												&& world.getBlockState(fencePos.north().down().north()).getBlock() != Blocks.LADDER
												&& world.getBlockState(fencePos.north().down().south()).getBlock() != Blocks.LADDER
												&& world.getBlockState(fencePos.north().down().east()).getBlock() != Blocks.LADDER
												&& world.getBlockState(fencePos.north().down().west()).getBlock() != Blocks.LADDER) {
											if (fenceCheck(world, fencePos)) {
												int yLadder = 0;
												while (ladderPos.up(yLadder).getY() <= fencePos.getY() - 1) {
													world.setBlockState(ladderPos.up(yLadder), Blocks.LADDER.getDefaultState().withProperty(BlockLadder.FACING, EnumFacing.NORTH));
													yLadder++;
												}
												world.setBlockToAir(fencePos);
												if (ladderChunk1) {
													ladder1 = true;
												}
												if (ladderChunk2) {
													ladder2 = true;
												}
												if (ladderChunk3) {
													ladder3 = true;
												}
												if (ladderChunk4) {
													ladder4 = true;
												}
											}
										}
									} else if (FenceArray.contains(edgePos.east())) {
										BlockPos ladderPos = addPos.down(yDig + 1);
										BlockPos fencePos = getTopBlockForDig(edgePos.east(), world).up();
										if (world.getBlockState(fencePos).getBlock() == BlockPandanFence.block
												&& world.getBlockState(fencePos.west().down().north()).getBlock() != Blocks.LADDER
												&& world.getBlockState(fencePos.west().down().south()).getBlock() != Blocks.LADDER
												&& world.getBlockState(fencePos.west().down().east()).getBlock() != Blocks.LADDER
												&& world.getBlockState(fencePos.west().down().west()).getBlock() != Blocks.LADDER) {
											if (fenceCheck(world, fencePos)) {
												int yLadder = 0;
												while (ladderPos.up(yLadder).getY() <= fencePos.getY() - 1) {
													world.setBlockState(ladderPos.up(yLadder), Blocks.LADDER.getDefaultState().withProperty(BlockLadder.FACING, EnumFacing.WEST));
													yLadder++;
												}
												world.setBlockToAir(fencePos);
												if (ladderChunk1) {
													ladder1 = true;
												}
												if (ladderChunk2) {
													ladder2 = true;
												}
												if (ladderChunk3) {
													ladder3 = true;
												}
												if (ladderChunk4) {
													ladder4 = true;
												}
											}
										}
									} else if (FenceArray.contains(edgePos.west())) {
										BlockPos ladderPos = addPos.down(yDig + 1);
										BlockPos fencePos = getTopBlockForDig(edgePos.west(), world).up();
										if (world.getBlockState(fencePos).getBlock() == BlockPandanFence.block
												&& world.getBlockState(fencePos.east().down().north()).getBlock() != Blocks.LADDER
												&& world.getBlockState(fencePos.east().down().south()).getBlock() != Blocks.LADDER
												&& world.getBlockState(fencePos.east().down().east()).getBlock() != Blocks.LADDER
												&& world.getBlockState(fencePos.east().down().west()).getBlock() != Blocks.LADDER) {
											if (fenceCheck(world, fencePos)) {
												int yLadder = 0;
												while (ladderPos.up(yLadder).getY() <= fencePos.getY() - 1) {
													world.setBlockState(ladderPos.up(yLadder), Blocks.LADDER.getDefaultState().withProperty(BlockLadder.FACING, EnumFacing.EAST));
													yLadder++;
												}
												world.setBlockToAir(fencePos);
												if (ladderChunk1) {
													ladder1 = true;
												}
												if (ladderChunk2) {
													ladder2 = true;
												}
												if (ladderChunk3) {
													ladder3 = true;
												}
												if (ladderChunk4) {
													ladder4 = true;
												}
											}
										}
									}
								}
							}
						}
						yDig++;
					}
				}
				for (BlockPos digPos : DigArray) {
					BlockPos addPos = getTopBlockForDig(digPos, world);
					treeFixer(world, addPos);
					int yDig = 0;
					while (addPos.down(yDig).getY() >= digDepth && addPos.down(yDig).getY() > 1) {
						generated = true;
						world.setBlockToAir(addPos.down(yDig));
						if (addPos.down(yDig).getY() == digDepth) {
							world.setBlockState(addPos.down(yDig + 1), getStoneState(world, addPos));
						}
						yDig++;
					}
				}

				//Re-parse for lighting:
				int lights = 0;
				for (BlockPos fencePos : FenceArray) {
					if (world.getBlockState(getTopBlockForDig(fencePos, world).up()).getBlock() == BlockPandanFence.block) {
						BlockPos addPos = getTopBlockForDig(fencePos, world).up();
						if (lights == 0) {
							if (Functions.decoLoaded()) {
								world.setBlockState(addPos.up(), BlockPandanFence.block.getDefaultState());
								world.setBlockState(addPos.up(2), BlockPandanFence.block.getDefaultState());
								if (world.getBlockState(addPos.up(3).north()).getBlock().isReplaceable(world, addPos.up(3).north())) {
									world.setBlockState(addPos.up(3).north(), BlockWireGridTile.block.getDefaultState().withProperty(BlockWireGridTile.BlockCustom.FACING, EnumFacing.UP));
								}
								if (world.getBlockState(addPos.up(3).east()).getBlock().isReplaceable(world, addPos.up(3).east())) {
									world.setBlockState(addPos.up(3).east(), BlockWireGridTile.block.getDefaultState().withProperty(BlockWireGridTile.BlockCustom.FACING, EnumFacing.UP));
								}
								if (world.getBlockState(addPos.up(3).south()).getBlock().isReplaceable(world, addPos.up(3).south())) {
									world.setBlockState(addPos.up(3).south(), BlockWireGridTile.block.getDefaultState().withProperty(BlockWireGridTile.BlockCustom.FACING, EnumFacing.UP));
								}
								if (world.getBlockState(addPos.up(3).west()).getBlock().isReplaceable(world, addPos.up(3).west())) {
									world.setBlockState(addPos.up(3).west(), BlockWireGridTile.block.getDefaultState().withProperty(BlockWireGridTile.BlockCustom.FACING, EnumFacing.UP));
								}
								if (world.getBlockState(addPos.up(2).north()).getBlock().isReplaceable(world, addPos.up(2).north())) {
									world.setBlockState(addPos.up(2).north(), BlockLamp.block.getDefaultState().withProperty(BlockLamp.BlockCustom.FACING, EnumFacing.DOWN));
								}
								if (world.getBlockState(addPos.up(2).east()).getBlock().isReplaceable(world, addPos.up(2).east())) {
									world.setBlockState(addPos.up(2).east(), BlockLamp.block.getDefaultState().withProperty(BlockLamp.BlockCustom.FACING, EnumFacing.DOWN));
								}
								if (world.getBlockState(addPos.up(2).south()).getBlock().isReplaceable(world, addPos.up(2).south())) {
									world.setBlockState(addPos.up(2).south(), BlockLamp.block.getDefaultState().withProperty(BlockLamp.BlockCustom.FACING, EnumFacing.DOWN));
								}
								if (world.getBlockState(addPos.up(2).west()).getBlock().isReplaceable(world, addPos.up(2).west())) {
									world.setBlockState(addPos.up(2).west(), BlockLamp.block.getDefaultState().withProperty(BlockLamp.BlockCustom.FACING, EnumFacing.DOWN));
								}
							}
							else {
								world.setBlockState(addPos.up(), Blocks.TORCH.getDefaultState());
							}
						}
					}
					lights++;
					if (lights == 50) {
						lights = 0;
					}
				}

				//Re-parse for structure-gen:
				for (BlockPos digPos : DigArray) {
					BlockPos addPos = getTopBlockForDig(digPos, world);
					IBlockState digFossil = fossilOre;
					if ((BiomeDictionary.hasType(world.getBiome(addPos), BiomeDictionary.Type.MESA)) && random.nextInt(3) == 0) {
						int facing = world.rand.nextInt(3);
						switch (facing) {
							case 0: default:
								digFossil = BlockAraucarioxylonLogPetrified.block.getDefaultState().withProperty(BlockAraucarioxylonLogPetrified.BlockCustom.FACING, EnumFacing.NORTH);
								break;

							case 1:
								digFossil = BlockAraucarioxylonLogPetrified.block.getDefaultState().withProperty(BlockAraucarioxylonLogPetrified.BlockCustom.FACING, EnumFacing.EAST);
								break;

							case 2:
								digFossil = BlockAraucarioxylonLogPetrified.block.getDefaultState().withProperty(BlockAraucarioxylonLogPetrified.BlockCustom.FACING, EnumFacing.UP);
								break;
						}
					}
					//Fossils and structures:
					for (int yy = 0; yy <= 5; yy++) {
						if (random.nextInt(8) == 0 && world.getBlockState(addPos.down(yy)).getBlock() == Blocks.STONE) {
							world.setBlockState(addPos.down(yy), digFossil);
							if (random.nextInt(8) == 0 && yy == 0) {
								examinationBench = genExaminationBench(world, addPos.up(), examinationBench);
							}
							else if (random.nextInt(8) == 0 && yy == 0) {
								pit = genPit(world, addPos.up(), pit, digFossil);

							}
						}
					}
				}

			}

			//Tents:

			//Chunk 1:
			if (tent1 && generated) {
				setTents(world, new BlockPos(x1, 0, z1), FenceArray, DigArray, EdgeArray, fossilOre);
			}
			if (tent2 && generated) {
				setTents(world, new BlockPos(x2, 0, z2), FenceArray, DigArray, EdgeArray, fossilOre);
			}
			if (tent3 && generated) {
				setTents(world, new BlockPos(x3, 0, z3), FenceArray, DigArray, EdgeArray, fossilOre);
			}
			if (tent4 && generated) {
				setTents(world, new BlockPos(x4, 0, z4), FenceArray, DigArray, EdgeArray, fossilOre);
			}
		}
	}

	public void setTents (World world, BlockPos pos, List<BlockPos> FenceArray, List<BlockPos> DigArray, List<BlockPos> EdgeArray, IBlockState fossilOre) {
		List<BlockPos> TentArray = new ArrayList<>();
		int tentMax = 0;
		int tryMax = 0;
		int tentIndex = 0;
		boolean largeTent = false;
		while (tentMax < 6 && tryMax < 50) {
			BlockPos spawnPos = pos.add(world.rand.nextInt(15) - 7, 0, world.rand.nextInt(15) - 7).add(-2,0,-3); //further offset to acounnt for tent approx size
			spawnPos = getTopBlockForDig(spawnPos, world);
			if (largeTent) {
				tentIndex = world.rand.nextInt(5);
			}
			else {
				tentIndex = world.rand.nextInt(6);
			}
			Map<String, Object> tentTry = setTent(world, spawnPos, tentIndex, FenceArray, DigArray, EdgeArray, TentArray, fossilOre);
			TentArray = (List<BlockPos>)tentTry.get("TentArray");
			if ((boolean)tentTry.get("Tent")) {
				tentMax++;
				if (tentIndex == 5) {
					largeTent = true;
				}
			}
			tryMax ++;
		}
//		for (BlockPos tentPos : TentArray) {
//			treeFixer(world, tentPos);
//		}
	}

	public Map<String, Object> setTent(World world, BlockPos pos, int indTent, List<BlockPos> FenceArray, List<BlockPos> DigArray, List<BlockPos> EdgeArray, List<BlockPos> TentArray, IBlockState fossilOre) {
		java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
		List<BlockPos> TentArrayNew = new ArrayList<>();

		Template template;
		switch (indTent) {
			case 0: case 1: case 2: default:
				indTent = 1;
				template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
						new ResourceLocation("lepidodendron", "tent_digsite_small"));
				break;

			case 3: case 4:
				indTent = 2;
				template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
						new ResourceLocation("lepidodendron", "tent_digsite_medium"));
				break;

			case 5:
				indTent = 3;
				template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
						new ResourceLocation("lepidodendron", "tent_digsite_large"));
				break;

		}

		Rotation rotation = Rotation.values()[world.rand.nextInt(3)];
		//rotation = Rotation.NONE;
		int xx = 0;
		int zz = 0;
		int xpos = 0;
		int zpos = 0;
		BlockPos tentPos;
		int doorY;
		BlockPos villagerPos = pos;

		switch (indTent) {

			case 1: default: //small tent:
			switch (rotation.ordinal()) {
				case 0: default:

					doorY = getTopBlockForDig(pos.add(1,0,-1), world).getY();
					villagerPos = new BlockPos(pos.getX() + 1, doorY + 1, pos.getZ() + 2);
					pos = new BlockPos(pos.getX(), doorY, pos.getZ());
					xx = 2; //east
					zz = 4; //south

					//This next things provides an outline around the tents:
					tentPos = new BlockPos(pos.add(-1,0,-1));
					xx = xx + 2;
					zz = zz + 2;

					xpos = 0;
					while (xpos <= xx) {
						zpos = 0;
						while (zpos <= zz) {
							BlockPos checkPos = new BlockPos(tentPos.getX() + xpos, 0, tentPos.getZ() + zpos);
							TentArrayNew.add(checkPos);
							if (getTopBlockForDig(checkPos, world).getY() < doorY - 1 || !isTentable(new BlockPos(checkPos.getX(), doorY, checkPos.getZ()), world)) {
								$_dependencies.put("Tent", Boolean.valueOf(false));
								$_dependencies.put("TentArray", TentArray);
								return $_dependencies;
							}
							if (DigArray.contains(checkPos) || EdgeArray.contains(checkPos) || FenceArray.contains(checkPos) || TentArray.contains(checkPos)) {
								$_dependencies.put("Tent", Boolean.valueOf(false));
								$_dependencies.put("TentArray", TentArray);
								return $_dependencies;
							}
							zpos++;
						}
						xpos++;
					}
					break;

				case 1: //90 degrees

					doorY = getTopBlockForDig(pos.add(1,0,1), world).getY();
					villagerPos = new BlockPos(pos.getX() - 2, doorY + 1, pos.getZ() + 1);
					pos = new BlockPos(pos.getX(), doorY, pos.getZ());
					xx = 4; //east
					zz = 2; //south

					//This next things provides an outline around the tents:
					tentPos = new BlockPos(pos.add(1,0,-1));
					xx = xx + 2;
					zz = zz + 2;

					xpos = xx;
					while (xpos >= 0) {
						zpos = 0;
						while (zpos <= zz) {
							BlockPos checkPos = new BlockPos(tentPos.getX() - xpos, 0, tentPos.getZ() + zpos);
							TentArrayNew.add(checkPos);
							if (getTopBlockForDig(checkPos, world).getY() < doorY - 1 || !isTentable(new BlockPos(checkPos.getX(), doorY, checkPos.getZ()), world)) {
								$_dependencies.put("Tent", Boolean.valueOf(false));
								$_dependencies.put("TentArray", TentArray);
								return $_dependencies;
							}
							if (DigArray.contains(checkPos) || EdgeArray.contains(checkPos) || FenceArray.contains(checkPos) || TentArray.contains(checkPos)) {
								$_dependencies.put("Tent", Boolean.valueOf(false));
								$_dependencies.put("TentArray", TentArray);
								return $_dependencies;
							}
							zpos++;
						}
						xpos--;
					}
					break;

				case 2:
					doorY = getTopBlockForDig(pos.add(-1,0,1), world).getY();
					villagerPos = new BlockPos(pos.getX() - 1, doorY + 1, pos.getZ() - 2);
					pos = new BlockPos(pos.getX(), doorY, pos.getZ());
					xx = 2; //east
					zz = 4; //south

					//This next things provides an outline around the tents:
					tentPos = new BlockPos(pos.add(1,0,1));
					xx = xx + 2;
					zz = zz + 2;

					xpos = xx;
					while (xpos >= 0) {
						zpos = zz;
						while (zpos >= 0) {
							BlockPos checkPos = new BlockPos(tentPos.getX() - xpos, 0, tentPos.getZ() - zpos);
							TentArrayNew.add(checkPos);
							if (getTopBlockForDig(checkPos, world).getY() < doorY - 1 || !isTentable(new BlockPos(checkPos.getX(), doorY, checkPos.getZ()), world)) {
								$_dependencies.put("Tent", Boolean.valueOf(false));
								$_dependencies.put("TentArray", TentArray);
								return $_dependencies;
							}
							if (DigArray.contains(checkPos) || EdgeArray.contains(checkPos) || FenceArray.contains(checkPos) || TentArray.contains(checkPos)) {
								$_dependencies.put("Tent", Boolean.valueOf(false));
								$_dependencies.put("TentArray", TentArray);
								return $_dependencies;
							}
							zpos--;
						}
						xpos--;
					}
					break;

				case 3:
					doorY = getTopBlockForDig(pos.add(-1,0,-1), world).getY();
					villagerPos = new BlockPos(pos.getX() + 2, doorY + 1, pos.getZ() - 1);
					pos = new BlockPos(pos.getX(), doorY, pos.getZ());
					xx = 4; //east
					zz = 2; //south

					//This next things provides an outline around the tents:
					tentPos = new BlockPos(pos.add(-1,0,1));
					xx = xx + 2;
					zz = zz + 2;

					xpos = 0;
					while (xpos <= xx) {
						zpos = zz;
						while (zpos >= 0) {
							BlockPos checkPos = new BlockPos(tentPos.getX() + xpos, 0, tentPos.getZ() - zpos);
							TentArrayNew.add(checkPos);
							if (getTopBlockForDig(checkPos, world).getY() < doorY - 1 || !isTentable(new BlockPos(checkPos.getX(), doorY, checkPos.getZ()), world)) {
								$_dependencies.put("Tent", Boolean.valueOf(false));
								$_dependencies.put("TentArray", TentArray);
								return $_dependencies;
							}
							if (DigArray.contains(checkPos) || EdgeArray.contains(checkPos) || FenceArray.contains(checkPos) || TentArray.contains(checkPos)) {
								$_dependencies.put("Tent", Boolean.valueOf(false));
								$_dependencies.put("TentArray", TentArray);
								return $_dependencies;
							}
							zpos--;
						}
						xpos++;
					}
					break;

				}
				break;

			case 2: //medium tent:
				switch (rotation.ordinal()) {
					case 0: default:
						doorY = getTopBlockForDig(pos.add(2,0,-1), world).getY();
						villagerPos = new BlockPos(pos.getX() + 2, doorY + 1, pos.getZ() + 2);
						pos = new BlockPos(pos.getX(), doorY, pos.getZ());
						xx = 4; //east
						zz = 6; //south

						//This next things provides an outline around the tents:
						tentPos = new BlockPos(pos.add(-1,0,-1));
						xx = xx + 2;
						zz = zz + 2;

						xpos = 0;
						while (xpos <= xx) {
							zpos = 0;
							while (zpos <= zz) {
								BlockPos checkPos = new BlockPos(tentPos.getX() + xpos, 0, tentPos.getZ() + zpos);
								TentArrayNew.add(checkPos);
								if (getTopBlockForDig(checkPos, world).getY() < doorY - 1 || !isTentable(new BlockPos(checkPos.getX(), doorY, checkPos.getZ()), world)) {
									$_dependencies.put("Tent", Boolean.valueOf(false));
									$_dependencies.put("TentArray", TentArray);
									return $_dependencies;
								}
								if (DigArray.contains(checkPos) || EdgeArray.contains(checkPos) || FenceArray.contains(checkPos) || TentArray.contains(checkPos)) {
									$_dependencies.put("Tent", Boolean.valueOf(false));
									$_dependencies.put("TentArray", TentArray);
									return $_dependencies;
								}
								zpos++;
							}
							xpos++;
						}
						break;

					case 1: //90 degrees
						doorY = getTopBlockForDig(pos.add(1,0,2), world).getY();
						villagerPos = new BlockPos(pos.getX() - 2, doorY + 1, pos.getZ() + 2);
						pos = new BlockPos(pos.getX(), doorY, pos.getZ());
						xx = 6; //east
						zz = 4; //south

						//This next things provides an outline around the tents:
						tentPos = new BlockPos(pos.add(1,0,-1));
						xx = xx + 2;
						zz = zz + 2;

						xpos = xx;
						while (xpos >= 0) {
							zpos = 0;
							while (zpos <= zz) {
								BlockPos checkPos = new BlockPos(tentPos.getX() - xpos, 0, tentPos.getZ() + zpos);
								TentArrayNew.add(checkPos);
								if (getTopBlockForDig(checkPos, world).getY() < doorY - 1 || !isTentable(new BlockPos(checkPos.getX(), doorY, checkPos.getZ()), world)) {
									$_dependencies.put("Tent", Boolean.valueOf(false));
									$_dependencies.put("TentArray", TentArray);
									return $_dependencies;
								}
								if (DigArray.contains(checkPos) || EdgeArray.contains(checkPos) || FenceArray.contains(checkPos) || TentArray.contains(checkPos)) {
									$_dependencies.put("Tent", Boolean.valueOf(false));
									$_dependencies.put("TentArray", TentArray);
									return $_dependencies;
								}
								zpos++;
							}
							xpos--;
						}
						break;

					case 2:
						doorY = getTopBlockForDig(pos.add(-2,0,1), world).getY();
						villagerPos = new BlockPos(pos.getX() - 2, doorY + 1, pos.getZ() - 2);
						pos = new BlockPos(pos.getX(), doorY, pos.getZ());
						xx = 4; //east
						zz = 6; //south

						//This next things provides an outline around the tents:
						tentPos = new BlockPos(pos.add(1,0,1));
						xx = xx + 2;
						zz = zz + 2;

						xpos = xx;
						while (xpos >= 0) {
							zpos = zz;
							while (zpos >= 0) {
								BlockPos checkPos = new BlockPos(tentPos.getX() - xpos, 0, tentPos.getZ() - zpos);
								TentArrayNew.add(checkPos);
								if (getTopBlockForDig(checkPos, world).getY() < doorY - 1 || !isTentable(new BlockPos(checkPos.getX(), doorY, checkPos.getZ()), world)) {
									$_dependencies.put("Tent", Boolean.valueOf(false));
									$_dependencies.put("TentArray", TentArray);
									return $_dependencies;
								}
								if (DigArray.contains(checkPos) || EdgeArray.contains(checkPos) || FenceArray.contains(checkPos) || TentArray.contains(checkPos)) {
									$_dependencies.put("Tent", Boolean.valueOf(false));
									$_dependencies.put("TentArray", TentArray);
									return $_dependencies;
								}
								zpos--;
							}
							xpos--;
						}
						break;

					case 3:
						doorY = getTopBlockForDig(pos.add(-1,0,-2), world).getY();
						villagerPos = new BlockPos(pos.getX() + 2, doorY + 1, pos.getZ() - 2);
						pos = new BlockPos(pos.getX(), doorY, pos.getZ());
						xx = 6; //east
						zz = 4; //south

						//This next things provides an outline around the tents:
						tentPos = new BlockPos(pos.add(-1,0,1));
						xx = xx + 2;
						zz = zz + 2;

						xpos = 0;
						while (xpos <= xx) {
							zpos = zz;
							while (zpos >= 0) {
								BlockPos checkPos = new BlockPos(tentPos.getX() + xpos, 0, tentPos.getZ() - zpos);
								TentArrayNew.add(checkPos);
								if (getTopBlockForDig(checkPos, world).getY() < doorY - 1 || !isTentable(new BlockPos(checkPos.getX(), doorY, checkPos.getZ()), world)) {
									$_dependencies.put("Tent", Boolean.valueOf(false));
									$_dependencies.put("TentArray", TentArray);
									return $_dependencies;
								}
								if (DigArray.contains(checkPos) || EdgeArray.contains(checkPos) || FenceArray.contains(checkPos) || TentArray.contains(checkPos)) {
									$_dependencies.put("Tent", Boolean.valueOf(false));
									$_dependencies.put("TentArray", TentArray);
									return $_dependencies;
								}
								zpos--;
							}
							xpos++;
						}
						break;

				}
				break;


			case 3: //large tent:
				switch (rotation.ordinal()) {
					case 0: default:
						doorY = getTopBlockForDig(pos.add(3,0,-1), world).getY();
						villagerPos = new BlockPos(pos.getX() + 3, doorY + 1, pos.getZ() + 2);
						pos = new BlockPos(pos.getX(), doorY, pos.getZ());
						xx = 6; //east
						zz = 8; //south

						//This next things provides an outline around the tents:
						tentPos = new BlockPos(pos.add(-1,0,-1));
						xx = xx + 2;
						zz = zz + 2;

						xpos = 0;
						while (xpos <= xx) {
							zpos = 0;
							while (zpos <= zz) {
								BlockPos checkPos = new BlockPos(tentPos.getX() + xpos, 0, tentPos.getZ() + zpos);
								TentArrayNew.add(checkPos);
								if (getTopBlockForDig(checkPos, world).getY() < doorY - 1 || !isTentable(new BlockPos(checkPos.getX(), doorY, checkPos.getZ()), world)) {
									$_dependencies.put("Tent", Boolean.valueOf(false));
									$_dependencies.put("TentArray", TentArray);
									return $_dependencies;
								}
								if (DigArray.contains(checkPos) || EdgeArray.contains(checkPos) || FenceArray.contains(checkPos) || TentArray.contains(checkPos)) {
									$_dependencies.put("Tent", Boolean.valueOf(false));
									$_dependencies.put("TentArray", TentArray);
									return $_dependencies;
								}
								zpos++;
							}
							xpos++;
						}
						break;

					case 1: //90 degrees
						doorY = getTopBlockForDig(pos.add(1,0,3), world).getY();
						villagerPos = new BlockPos(pos.getX() - 2, doorY + 1, pos.getZ() + 3);
						pos = new BlockPos(pos.getX(), doorY, pos.getZ());
						xx = 8; //east
						zz = 6; //south

						//This next things provides an outline around the tents:
						tentPos = new BlockPos(pos.add(1,0,-1));
						xx = xx + 2;
						zz = zz + 2;

						xpos = xx;
						while (xpos >= 0) {
							zpos = 0;
							while (zpos <= zz) {
								BlockPos checkPos = new BlockPos(tentPos.getX() - xpos, 0, tentPos.getZ() + zpos);
								TentArrayNew.add(checkPos);
								if (getTopBlockForDig(checkPos, world).getY() < doorY - 1 || !isTentable(new BlockPos(checkPos.getX(), doorY, checkPos.getZ()), world)) {
									$_dependencies.put("Tent", Boolean.valueOf(false));
									$_dependencies.put("TentArray", TentArray);
									return $_dependencies;
								}
								if (DigArray.contains(checkPos) || EdgeArray.contains(checkPos) || FenceArray.contains(checkPos) || TentArray.contains(checkPos)) {
									$_dependencies.put("Tent", Boolean.valueOf(false));
									$_dependencies.put("TentArray", TentArray);
									return $_dependencies;
								}
								zpos++;
							}
							xpos--;
						}
						break;

					case 2:
						doorY = getTopBlockForDig(pos.add(-3,0,1), world).getY();
						villagerPos = new BlockPos(pos.getX() - 3, doorY + 1, pos.getZ() - 2);
						pos = new BlockPos(pos.getX(), doorY, pos.getZ());
						xx = 6; //east
						zz = 8; //south

						//This next things provides an outline around the tents:
						tentPos = new BlockPos(pos.add(1,0,1));
						xx = xx + 2;
						zz = zz + 2;

						xpos = xx;
						while (xpos >= 0) {
							zpos = zz;
							while (zpos >= 0) {
								BlockPos checkPos = new BlockPos(tentPos.getX() - xpos, 0, tentPos.getZ() - zpos);
								TentArrayNew.add(checkPos);
								if (getTopBlockForDig(checkPos, world).getY() < doorY - 1 || !isTentable(new BlockPos(checkPos.getX(), doorY, checkPos.getZ()), world)) {
									$_dependencies.put("Tent", Boolean.valueOf(false));
									$_dependencies.put("TentArray", TentArray);
									return $_dependencies;
								}
								if (DigArray.contains(checkPos) || EdgeArray.contains(checkPos) || FenceArray.contains(checkPos) || TentArray.contains(checkPos)) {
									$_dependencies.put("Tent", Boolean.valueOf(false));
									$_dependencies.put("TentArray", TentArray);
									return $_dependencies;
								}
								zpos--;
							}
							xpos--;
						}
						break;

					case 3:
						doorY = getTopBlockForDig(pos.add(-1,0,-3), world).getY();
						villagerPos = new BlockPos(pos.getX() + 2, doorY + 1, pos.getZ() - 3);
						pos = new BlockPos(pos.getX(), doorY, pos.getZ());
						xx = 8; //east
						zz = 6; //south

						//This next things provides an outline around the tents:
						tentPos = new BlockPos(pos.add(-1,0,1));
						xx = xx + 2;
						zz = zz + 2;

						xpos = 0;
						while (xpos <= xx) {
							zpos = zz;
							while (zpos >= 0) {
								BlockPos checkPos = new BlockPos(tentPos.getX() + xpos, 0, tentPos.getZ() - zpos);
								TentArrayNew.add(checkPos);
								if (getTopBlockForDig(checkPos, world).getY() < doorY - 1 || !isTentable(new BlockPos(checkPos.getX(), doorY, checkPos.getZ()), world)) {
									$_dependencies.put("Tent", Boolean.valueOf(false));
									$_dependencies.put("TentArray", TentArray);
									return $_dependencies;
								}
								if (DigArray.contains(checkPos) || EdgeArray.contains(checkPos) || FenceArray.contains(checkPos) || TentArray.contains(checkPos)) {
									$_dependencies.put("Tent", Boolean.valueOf(false));
									$_dependencies.put("TentArray", TentArray);
									return $_dependencies;
								}
								zpos--;
							}
							xpos++;
						}
						break;
				}
				break;

		}


		if (template == null) {
			$_dependencies.put("Tent", Boolean.valueOf(false));
			$_dependencies.put("TentArray", TentArray);
			return $_dependencies;
		}

		BlockPos spawnTo = pos;
		IBlockState iblockstate = world.getBlockState(spawnTo);
		world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
		PlacementSettings settings = new PlacementSettings().setChunk(null).setIgnoreStructureBlock(false).setIgnoreEntities(false).setRotation(rotation).setMirror(Mirror.NONE);

		template.addBlocksToWorld(world, spawnTo, new StructureDigSiteProcessTents(spawnTo, settings, fossilOre, world.rand.nextInt(15), world.rand.nextInt(15), world.rand.nextInt(15)), settings, 2);

		EntityVillager villager = new EntityVillager(world);
		if (!this.palaeontolgists) {
			villager.setProfession(VillagerPalaeontologist.PALAEONTOLOGIST_PROFESSION);
			this.palaeontolgists = true;
		}
		else if (!this.palaeobotanists) {
			villager.setProfession(VillagerPalaeobotanist.PALAEOBOTANIST_PROFESSION);
			this.palaeobotanists = true;
		}
		else {
			if (world.rand.nextInt(14) == 0) {
				villager.setProfession(VillagerPalaeontologist.PALAEONTOLOGIST_PROFESSION);
			}
			else if (world.rand.nextInt(14) == 0) {
				villager.setProfession(VillagerPalaeobotanist.PALAEOBOTANIST_PROFESSION);
			}
			else {
				villager.setProfession(5);
			}
		}
		villager.setLocationAndAngles(villagerPos.getX() + 0.5D, villagerPos.getY() + 0.5D, villagerPos.getZ() + 0.5D, 0, 0);
		world.spawnEntity(villager);

		$_dependencies.put("Tent", Boolean.valueOf(true));
		boolean result = TentArray.addAll(TentArrayNew);
		$_dependencies.put("TentArray",  TentArray);
		return $_dependencies;
	}

	public static Map<String, Object> digCirle(Map<String, Object> dependencies, int radius, int x, int z) {
		List<BlockPos> FenceArray = (List<BlockPos>) dependencies.get("FenceArray");
		List<BlockPos> DigArray = (List<BlockPos>) dependencies.get("DigArray");
		List<BlockPos> EdgeArray = (List<BlockPos>) dependencies.get("EdgeArray");

		//Draw a circle and save the various blocks:
		int xx;
		int zz;
		xx = -radius;
		while (xx <= radius) {
			zz = -radius;
			while (zz <= radius) {
				//Circle:
				if (Math.floor(Math.sqrt(Math.pow(xx,2) + Math.pow(zz,2))) == radius) {
					FenceArray.add(new BlockPos(xx + x, 0, zz + z));
				}
				if (Math.round(Math.sqrt(Math.pow(xx,2) + Math.pow(zz,2))) == radius) {
					FenceArray.add(new BlockPos(xx + x, 0, zz + z));
				}
				else if (Math.floor(Math.sqrt(Math.pow(xx,2) + Math.pow(zz,2))) == radius - 1) {
					EdgeArray.add(new BlockPos(xx + x, 0, zz + z));
				}
				else if (Math.floor(Math.sqrt(Math.pow(xx,2) + Math.pow(zz,2))) < radius) {
					DigArray.add(new BlockPos(xx + x, 0, zz + z));
				}
				zz ++;
			}
			xx ++;
		}

		java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
		$_dependencies.put("FenceArray", FenceArray);
		$_dependencies.put("DigArray", DigArray);
		$_dependencies.put("EdgeArray", EdgeArray);
		return $_dependencies;
	}

	public static boolean fenceCheck(World world, BlockPos pos) {
		IBlockState state = world.getBlockState(pos);
		if (state.getBlock() != BlockPandanFence.block) {
			return false;
		}
		state = BlockPandanFence.block.getActualState(state, world, pos);
		if (state.getValue(BlockFence.EAST)) {
			return (state.getValue(BlockFence.WEST) && (!state.getValue(BlockFence.NORTH)) && (!state.getValue(BlockFence.SOUTH)));
		}
		if (state.getValue(BlockFence.WEST)) {
			return (state.getValue(BlockFence.EAST) && (!state.getValue(BlockFence.NORTH)) && (!state.getValue(BlockFence.SOUTH)));
		}
		if (state.getValue(BlockFence.NORTH)) {
			return (state.getValue(BlockFence.SOUTH) && (!state.getValue(BlockFence.EAST)) && (!state.getValue(BlockFence.WEST)));
		}
		if (state.getValue(BlockFence.SOUTH)) {
			return (state.getValue(BlockFence.NORTH) && (!state.getValue(BlockFence.EAST)) && (!state.getValue(BlockFence.WEST)));
		}
		return false;
	}

	public static boolean isTentable(BlockPos pos, World world) {
		if (world.getBlockState(pos).getMaterial() == Material.ICE || world.getBlockState(pos).getMaterial() == Material.PACKED_ICE) {
			return false;
		}
		if (world.getBlockState(pos).isSideSolid(world, pos, EnumFacing.UP)) {
			return true;
		}
		return false;
	}

	public static IBlockState getStoneState(World world, BlockPos pos) {
		if (world.rand.nextInt(10) == 0) {
			return Blocks.GRAVEL.getDefaultState();
		}
		if (world.rand.nextInt(10) != 0) {
			return Blocks.STONE.getDefaultState();
		}
		if (world.getBiome(pos).fillerBlock.getMaterial() == Material.GRASS
			|| world.getBiome(pos).fillerBlock.getBlock() == Blocks.DIRT) {
			return Blocks.DIRT.getStateFromMeta(1);
		}
		return world.getBiome(pos).fillerBlock;
	}

	public static void treeFixer(World world, BlockPos pos) {
		for (int i = 0; i < 100 ; i++) {
			if (world.getBlockState(pos.up(i)).getMaterial() == Material.WOOD) {
				world.setBlockToAir(pos.up(i));
			}
			else {
				BlockPos tickPos = pos.up(i);
				for (int xx = -4; xx <= 4; xx++) {
					for (int yy = -4; yy <= 4; yy++) {
						for (int zz = -4; zz <= 4; zz++) {
							if (world.isBlockLoaded(tickPos.add(xx, yy, zz))) {
								world.getBlockState(tickPos.add(xx, yy, zz)).getBlock().updateTick(world, tickPos.add(xx, yy, zz), world.getBlockState(tickPos.add(xx, yy, zz)), world.rand);
							}
						}
					}
				}
			}
		}
	}

	public static BlockPos getTopBlockForDig(BlockPos pos, World world)
	{
		Chunk chunk = world.getChunk(pos);
		BlockPos blockpos = new BlockPos(pos.getX(), chunk.getTopFilledSegment() + 16, pos.getZ());
		BlockPos blockpos1 = blockpos;
		int yy = blockpos.getY();
		while (yy > 0)
		{
			blockpos1 = new BlockPos(pos.getX(), yy, pos.getZ());
			IBlockState state = world.getBlockState(blockpos1);

			if (state.getMaterial().blocksMovement()
					&& state.getMaterial() != Material.WATER
					&& state.getMaterial() != Material.LEAVES
					&& state.getMaterial() != Material.VINE
					&& state.getMaterial() != Material.WOOD
					&& state.getMaterial() != Material.PLANTS)
			{
				break;
			}
			yy --;
		}

		return blockpos1;
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

 	public static boolean matchBiome(Biome biome, String[] biomesList) {
    	
    	//String regName = biome.getRegistryName().toString();
    	
        String[] var2 = biomesList;
        int var3 = biomesList.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String checkBiome = var2[var4];
            if (!checkBiome.contains(":")) {
            	//System.err.println("modid test: " + biome.getRegistryName().toString().substring(0, biome.getRegistryName().toString().indexOf(":") - 1));
	            if (checkBiome.equalsIgnoreCase(
	            	biome.getRegistryName().toString().substring(0, biome.getRegistryName().toString().indexOf(":"))
	            	)) {
	                return true;
	            }
        	}
        	if (checkBiome.equalsIgnoreCase(biome.getRegistryName().toString())) {
                return true;
            }
        }

        return false;
    }

	public static boolean genExaminationBench(World world, BlockPos pos, boolean quit) {
		if (quit) {
			return true;
		}
		//Check space:
		if (!world.isAirBlock(pos)) {
			return false;
		}

		if (!world.isAirBlock(pos.north().east())) {
			return false;
		}
		if (!world.isAirBlock(pos.north().west())) {
			return false;
		}
		if (!world.isAirBlock(pos.south().east())) {
			return false;
		}
		if (!world.isAirBlock(pos.south().west())) {
			return false;
		}

		if (!world.isAirBlock(pos.up().south().east())) {
			return false;
		}
		if (!world.isAirBlock(pos.up().south())) {
			return false;
		}
		if (!world.isAirBlock(pos.up().south().west())) {
			return false;
		}
		if (!world.isAirBlock(pos.up().east())) {
			return false;
		}
		if (!world.isAirBlock(pos.up())) {
			return false;
		}
		if (!world.isAirBlock(pos.up().west())) {
			return false;
		}
		if (!world.isAirBlock(pos.up().north().east())) {
			return false;
		}
		if (!world.isAirBlock(pos.up().north())) {
			return false;
		}
		if (!world.isAirBlock(pos.up().north().west())) {
			return false;
		}

		//We have space:
		world.setBlockState(pos.north().east(), BlockPandanFence.block.getDefaultState());
		world.setBlockState(pos.north().west(), BlockPandanFence.block.getDefaultState());
		world.setBlockState(pos.south().east(), BlockPandanFence.block.getDefaultState());
		world.setBlockState(pos.south().west(), BlockPandanFence.block.getDefaultState());

		world.setBlockState(pos.up().south().east(), BlockZirconGlassTile.block.getDefaultState().withProperty(BlockZirconGlassTile.BlockCustom.FACING, EnumFacing.UP));
		world.setBlockState(pos.up().south(), BlockZirconGlassTile.block.getDefaultState().withProperty(BlockZirconGlassTile.BlockCustom.FACING, EnumFacing.UP));
		world.setBlockState(pos.up().south().west(), BlockZirconGlassTile.block.getDefaultState().withProperty(BlockZirconGlassTile.BlockCustom.FACING, EnumFacing.UP));
		world.setBlockState(pos.up().east(), BlockZirconGlassTile.block.getDefaultState().withProperty(BlockZirconGlassTile.BlockCustom.FACING, EnumFacing.UP));
		world.setBlockState(pos.up(), BlockZirconGlassTile.block.getDefaultState().withProperty(BlockZirconGlassTile.BlockCustom.FACING, EnumFacing.UP));
		world.setBlockState(pos.up().west(), BlockZirconGlassTile.block.getDefaultState().withProperty(BlockZirconGlassTile.BlockCustom.FACING, EnumFacing.UP));
		world.setBlockState(pos.up().north().east(), BlockZirconGlassTile.block.getDefaultState().withProperty(BlockZirconGlassTile.BlockCustom.FACING, EnumFacing.UP));
		world.setBlockState(pos.up().north(), BlockZirconGlassTile.block.getDefaultState().withProperty(BlockZirconGlassTile.BlockCustom.FACING, EnumFacing.UP));
		world.setBlockState(pos.up().north().west(), BlockZirconGlassTile.block.getDefaultState().withProperty(BlockZirconGlassTile.BlockCustom.FACING, EnumFacing.UP));

		return true;
	}

	public static boolean genPit(World world, BlockPos pos, boolean quit, IBlockState fossil) {
		if (quit) {
			return true;
		}
		//Check space:
		if (!world.isAirBlock(pos)) {
			return false;
		}
		if (!world.isAirBlock(pos.east())) {
			return false;
		}
		if (!world.isAirBlock(pos.east(2))) {
			return false;
		}
		if (!world.isAirBlock(pos.east(3))) {
			return false;
		}

		if (!world.isAirBlock(pos.south())) {
			return false;
		}
		if (!world.isAirBlock(pos.south().east())) {
			return false;
		}
		if (!world.isAirBlock(pos.south().east(2))) {
			return false;
		}
		if (!world.isAirBlock(pos.south().east(3))) {
			return false;
		}

		if (!world.isAirBlock(pos.south(2))) {
			return false;
		}
		if (!world.isAirBlock(pos.south(2).east())) {
			return false;
		}
		if (!world.isAirBlock(pos.south(2).east(2))) {
			return false;
		}
		if (!world.isAirBlock(pos.south(2).east(3))) {
			return false;
		}


		Template template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
				new ResourceLocation("lepidodendron", "fossilpit"));
		if (template == null)
			return false;
//		Rotation rotation = Rotation.values()[world.rand.nextInt(3)];
//		Mirror mirror = Mirror.values()[world.rand.nextInt(2)];

		BlockPos spawnTo = pos.down(4);
		IBlockState iblockstate = world.getBlockState(spawnTo);
		world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
		PlacementSettings settings = new PlacementSettings().setChunk(null).setIgnoreStructureBlock(false).setRotation(Rotation.NONE).setMirror(Mirror.NONE);

		template.addBlocksToWorld(world, spawnTo, new StructureDigSiteProcess(spawnTo, settings, fossil), settings, 2);

		//world.setBlockState(spawnTo.up(7), Blocks.COAL_BLOCK.getDefaultState());

		return true;
	}
	
}
