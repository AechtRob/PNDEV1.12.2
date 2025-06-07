
package net.lepidodendron.block;

import net.lepidodendron.*;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.util.*;
import net.lepidodendron.world.biome.carboniferous.BiomeCarboniferous;
import net.lepidodendron.world.biome.cretaceous.BiomeCretaceousEarly;
import net.lepidodendron.world.biome.jurassic.BiomeJurassic;
import net.lepidodendron.world.biome.permian.BiomePermian;
import net.lepidodendron.world.biome.triassic.BiomeTriassic;
import net.minecraft.block.Block;
import net.minecraft.block.BlockReed;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenReed;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockGiantHorsetail extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:giant_horsetail")
	public static final Block block = null;
	public BlockGiantHorsetail(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.giant_horsetail);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustomFlower());
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:giant_horsetail", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:giant_horsetail", BlockGiantHorsetail.block);
		OreDictionary.registerOre("plantPrehistoric", BlockGiantHorsetail.block);
		OreDictionary.registerOre("plant", BlockGiantHorsetail.block);
		OreDictionary.registerOre("stemHorsetail", BlockGiantHorsetail.block);
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		boolean dimensionCriteria = false;
		boolean isNetherType = false;
		if (shouldGenerateInDimension(dimID, LepidodendronConfigPlants.dimHorsetail))
			dimensionCriteria = true;
		if (!LepidodendronConfigPlants.genHorsetail && (!LepidodendronConfig.genAllPlants) && (!LepidodendronConfig.genAllPlantsModern))
			dimensionCriteria = false;
		if ((LepidodendronConfig.dimCarboniferous == dimID
			|| dimID == LepidodendronConfig.dimPermian
			|| dimID == LepidodendronConfig.dimTriassic
			|| dimID == LepidodendronConfig.dimJurassic
			|| dimID == LepidodendronConfig.dimCretaceousEarly)
			)
			dimensionCriteria = true;

		if (!dimensionCriteria)
			return;

		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(chunkX + 16, 128, chunkZ + 16));
		if ((!matchBiome(biome, LepidodendronConfig.genGlobalBlacklist)) && (!matchBiome(biome, LepidodendronConfigPlants.genHorsetailBlacklistBiomes))) {
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SWAMP))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.RIVER))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.LUSH))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.JUNGLE))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.VOID))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MUSHROOM))
				biomeCriteria = false;
		}
		if (matchBiome(biome, LepidodendronConfigPlants.genHorsetailOverrideBiomes))
			biomeCriteria = true;
		if (LepidodendronConfig.dimCarboniferous == dimID)
			biomeCriteria = true;

		if (biome instanceof BiomePermian) {
			BiomePermian biomePermian = (BiomePermian) biome;
			if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Wetlands
				|| biomePermian.getBiomeType() == EnumBiomeTypePermian.Ocean) {
				biomeCriteria = true;
			}
			else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_lowlands_forest")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_lowlands")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_desert_edge")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_temperate_glossopteris")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_temperate_glossopteris_copse")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_forest")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_swamp")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_lowlands_floodplain")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_highlands")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_stony")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_wetlands_fern_copse")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_wetlands_fern_copse")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_wetlands_fern_copse_lakes")) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}

		if (biome instanceof BiomeCarboniferous)
		{
			BiomeCarboniferous biomeCarboniferous = (BiomeCarboniferous) biome;
			if (biomeCarboniferous.getBiomeType() == EnumBiomeTypeCarboniferous.Swamp
					|| biomeCarboniferous.getBiomeType() == EnumBiomeTypeCarboniferous.Estuary
					|| biomeCarboniferous.getBiomeType() == EnumBiomeTypeCarboniferous.Marsh
					|| biomeCarboniferous.getBiomeType() == EnumBiomeTypeCarboniferous.Hills
					|| biomeCarboniferous.getBiomeType() == EnumBiomeTypeCarboniferous.Fen) {
				biomeCriteria = true;
			}
			else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_cold_savanna")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_cold_woodland")) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}

		if (biome instanceof BiomeTriassic) {
			BiomeTriassic biomeTriassic = (BiomeTriassic) biome;
			if (biomeTriassic.getBiomeType() == EnumBiomeTypeTriassic.SouthAmericaAusAnt
				|| biomeTriassic.getBiomeType() == EnumBiomeTypeTriassic.CentralAfricaIndia
				|| biomeTriassic.getBiomeType() == EnumBiomeTypeTriassic.SouthAfricaMadagascar
				|| biomeTriassic.getBiomeType() == EnumBiomeTypeTriassic.Chinle
				|| biomeTriassic.getBiomeType() == EnumBiomeTypeTriassic.Ocean
				|| biomeTriassic.getBiomeType() == EnumBiomeTypeTriassic.River
				|| biomeTriassic.getBiomeType() == EnumBiomeTypeTriassic.Europe) {
				biomeCriteria = true;
			}
			else if (
				biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_woodland")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_woodland_polje")
			) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}

		if (biome instanceof BiomeJurassic) {
			BiomeJurassic biomeJurassic = (BiomeJurassic) biome;
			if (biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.Floodplain
				|| biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.Forest
				|| biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.River
                || biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.IslandSand
				|| biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.Mire
				|| biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.Highlands
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_scrub")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_wet")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_field")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mudflats_estuary_copse")) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}


		if (biome instanceof BiomeCretaceousEarly)
		{
			if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_europe")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_ocean_shore_tethys_europe")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_europe_field")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_north_america_braided")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_namerica")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_namerica_transition")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_austro_antarctic_subalpine_lakes")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_austro_antarctic_rainforest")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_austro_antarctic_rainforest")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_south_america_desert")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_namerica_shrubland_copse")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_south_america_creek_wide")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_south_america_creek_wide_centre")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_africa_savanna_hole")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_africa_savanna_hole_centre")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_africa_swamp")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_africa_swamp_open")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_africa_swamp")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_banded_desert")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_banded_desert")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_yixian_lakes_dead")) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}

		if (!biomeCriteria)
			return;
			
		int GenChance = 5;
		double GenMultiplier = LepidodendronConfigPlants.multiplierHorsetail;
		if (GenMultiplier < 0) {GenMultiplier = 0;}
		GenChance = Math.min(15, (int) Math.round((double) GenChance * GenMultiplier));
		//Is this a transformed biome?
		if (LepidodendronDecorationHandler.matchBiome(biome, LepidodendronConfigPlants.genTransformBiomes)) {
			//if (biome.getRegistryName().toString().substring(0, biome.getRegistryName().toString().indexOf(":")).equalsIgnoreCase("minecraft"))
				GenChance = 15;
		}
		
		if (LepidodendronConfig.dimCarboniferous == dimID
				|| dimID == LepidodendronConfig.dimPermian
				|| dimID == LepidodendronConfig.dimTriassic
				|| dimID == LepidodendronConfig.dimJurassic
				|| dimID == LepidodendronConfig.dimCretaceousEarly) {
			GenChance = 25;
		}
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_lowlands")) {
			GenChance = 92;
		}
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_lowlands_floodplain")) {
			GenChance = 156;
		}
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_highlands")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_wetlands_fern_copse")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_wetlands_fern_copse")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_wetlands_fern_copse_lakes")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_floodplain_forested")) {
			GenChance = 64;
		}
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_riverbank") || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_river")) {
			GenChance = 156;
		}
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_stony")) {
			GenChance = 192;
		}
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_marsh")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_desert_edge")) {
			GenChance = 256;
		}
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mudflats")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mudflats_helper")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_austro_antarctic_rainforest")) {
			GenChance = 5;
		}
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mire")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mire_helper")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mire_lakes")) {
			GenChance = 256;
		}
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_scrub")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_namerica_shrubland_copse")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_africa_swamp")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_africa_swamp_open")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_africa_swamp")) {
			GenChance = 64;
		}
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_wet")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_field")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_namerica_transition")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_africa_savanna_hole")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_africa_savanna_hole_centre")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_south_america_creek_wide")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_yixian_lakes_dead")) {
			GenChance = 30;
		}
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_europe")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_north_america_braided")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_namerica")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_south_america_desert")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_south_america_creek_wide_centre")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_banded_desert")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_banded_desert")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_gondwanan_forest_dry_bayou")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_xeric")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_xeric_scrubland")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_lossiemouth")) {
			GenChance = 192;
		}
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_woodland")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_woodland_polje")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_austro_antarctic_subalpine_lakes")) {
			GenChance = 256;
		}

		int maxheight = LepidodendronConfigPlants.maxheightHorsetail;
		int minheight = LepidodendronConfigPlants.minheightHorsetail;
		if (maxheight < 0) {maxheight = 0;}
		if (maxheight > 250) {maxheight = 250;}
		if (minheight < 1) {minheight = 1;}
		if (minheight > 250) {minheight = 250;}
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_yixian_lakes_dead")) {
			maxheight = 160;
		}
		final int maxH = maxheight;
		final int minH = minheight;
	
		for (int i = 0; i < GenChance; i++) {
			int l6 = chunkX + random.nextInt(16) + 8;
			int i11 = random.nextInt(128);
			if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_yixian_lakes_dead")) {
				i11 = 140 + random.nextInt(40);
			}
			int l14 = chunkZ + random.nextInt(16) + 8;
			(new WorldGenReed() {
				@Override
				public boolean generate(World world, Random random, BlockPos pos) {
					for (int i = 0; i < 20; ++i) {
						BlockPos blockpos1 = pos.add(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
						if (world.getBiome(blockpos1).getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_austro_antarctic_subalpine_lakes")
							|| world.getBiome(blockpos1).getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_austro_antarctic_subalpine_lakes")
							|| world.getBiome(blockpos1).getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_banded_desert")
							|| world.getBiome(blockpos1).getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_desert_edge")
							|| world.getBiome(blockpos1).getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_desert")
							|| world.getBiome(blockpos1).getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_xeric_scrubland")
							|| world.getBiome(blockpos1).getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_lossiemouth")) {
							if (world.getBlockState(blockpos1.down().north()).getMaterial() != Material.WATER
									&& world.getBlockState(blockpos1.down().east()).getMaterial() != Material.WATER
									&& world.getBlockState(blockpos1.down().south()).getMaterial() != Material.WATER
									&& world.getBlockState(blockpos1.down().west()).getMaterial() != Material.WATER
									&& world.getBlockState(blockpos1.down().north().east()).getMaterial() != Material.WATER
									&& world.getBlockState(blockpos1.down().north().west()).getMaterial() != Material.WATER
									&& world.getBlockState(blockpos1.down().south().east()).getMaterial() != Material.WATER
									&& world.getBlockState(blockpos1.down().south().west()).getMaterial() != Material.WATER
									&& world.getBlockState(blockpos1.down().north(2)).getMaterial() != Material.WATER
									&& world.getBlockState(blockpos1.down().east(2)).getMaterial() != Material.WATER
									&& world.getBlockState(blockpos1.down().south(2)).getMaterial() != Material.WATER
									&& world.getBlockState(blockpos1.down().west(2)).getMaterial() != Material.WATER) {
								continue;
							}
						}
						if (world.getBiome(blockpos1).getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_austro_antarctic_subalpine_lakes_rim_inner")
							|| world.getBiome(blockpos1).getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_austro_antarctic_subalpine_lakes_rim_outer")) {
							continue;
						}
						if (world.isAirBlock(blockpos1) && world.isAirBlock(blockpos1.up()) && blockpos1.getY() >= minH && (blockpos1.getY() <= maxH || maxH == 0) ) {
							int j = 1 + random.nextInt(random.nextInt(10) + 1);
							j = Math.max(2, j);
							int heightCheck = 2;
							boolean spaceCheck = true;
							for (int k = 1; k <= j; ++k) {
								if (((BlockCustomFlower) block).canBlockStay(world, blockpos1)
									&& (world.isAirBlock(blockpos1.up(k))) && spaceCheck) {
									heightCheck = k;
								}
								else {
									spaceCheck = false;
								}
							}
							j = heightCheck;
							for (int k = 0; k <= j; ++k)
 {
								if (((BlockCustomFlower) block).canBlockStay(world, blockpos1) && ((BlockCustomFlower) block).hasWater(world, blockpos1))
 {
									if (k <= (j - 1)) {world.setBlockState(blockpos1.up(k), block.getDefaultState(), 2);
}
									if (k == j) {
										world.setBlockState(blockpos1.up(k), BlockGiantHorsetailShoot.block.getDefaultState(), 2);
									}
								}
							}
						}
					}
					return true;
				}
			}).generate(world, random, new BlockPos(l6, i11, l14));
		}
	}
	public static class BlockCustomFlower extends BlockReed implements IAdvancementGranter {
		public BlockCustomFlower() {
			setSoundType(SoundType.PLANT);
			setCreativeTab(TabLepidodendronPlants.tab);
			setHardness(0F);
			setResistance(0F);
			setLightLevel(0F);
			setTranslationKey("pf_giant_horsetail");
			setRegistryName("giant_horsetail");
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_GIANT_HORSETAIL;
		}

		@Override
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
		}

		@Override
		public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack) {
			if (stack.getItem() == Items.SHEARS && LepidodendronConfig.doPropagation
					&&
					(worldIn.getBlockState(pos.down()).getMaterial() == Material.GROUND
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.SAND
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.ROCK
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.CLAY
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.GRASS
					)
			) {
				EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				worldIn.spawnEntity(entityToSpawn);
			}
			else {
				super.harvestBlock(worldIn, player, pos, state, te, stack);
			}
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			if (!LepidodendronConfig.doPropagation) {
				drops.add(new ItemStack(this));
			}
			else {
				drops.add(new ItemStack(Blocks.AIR));
			}
		}

		@Override
		protected boolean canSilkHarvest()
	    {
	        return false;
	    }

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(Item.getItemFromBlock(this), 1, this.damageDropped(state));
		}

		public boolean hasWater(World world, BlockPos pos) {
			Biome biome = world.getBiome(pos);
			if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_lowlands") || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_highlands")) {
				boolean waterCriteria = false;
				//Is there water nearby?
				int xct = -3;
				int yct;
				int zct;
				while ((xct < 4) && (!waterCriteria)) {
					yct = -6;
					while ((yct <= 1) && (!waterCriteria)) {
						zct = -3;
						while ((zct < 4) && (!waterCriteria)) {
							if ((world.getBlockState(pos.add(xct, yct, zct))).getMaterial() == Material.WATER) {
								waterCriteria = true;
							}
							zct = zct + 1;
						}
						yct = yct + 1;
					}
					xct = xct + 1;
				}
				return waterCriteria;
			}
			return true;
		}

		@Override
		public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
			return EnumPlantType.Plains;
		}

		@Override
		public boolean canPlaceBlockAt(World world, BlockPos pos) {
			Block block2 = world.getBlockState(pos.down()).getBlock();
			return (block2.canSustainPlant(world.getBlockState(pos.down()), world, pos.down(), EnumFacing.UP, this)
					|| (world.getBlockState(pos.down()).getMaterial() == Material.SAND && world.getBlockState(pos.down()).getBlockFaceShape(world, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID)
					|| block2 == block);
		}

		@SideOnly(Side.CLIENT)
		public int colorMultiplier(IBlockAccess p_149720_1_, BlockPos pos, int pass) {
			return 16777215;
		}

		@Override
		public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
			if (world.getBlockState(pos.down()).getBlock() == block || this.checkForDrop(world, pos, state)) {
				if (world.isAirBlock(pos.up())) {
					world.setBlockState(pos.up(), BlockGiantHorsetailShoot.block.getDefaultState(), 2);
				}
				else {
					if ((world.isAirBlock(pos.up(2))) && ((world.getBlockState(pos.up())).getBlock() == BlockGiantHorsetailShoot.block)) {
						int l;
						for (l = 1; world.getBlockState(pos.down(l)).getBlock() == this; ++l);
						if (l < 10) {
							int i1 = (Integer) state.getValue(AGE);
							if (i1 == 15) {
								//world.setBlockToAir(pos.up());
								world.setBlockState(pos.up(), this.getDefaultState());
								world.setBlockState(pos, state.withProperty(AGE, 0), 4);
								if (world.isAirBlock(pos.up(2))) {
									world.setBlockState(pos.up(2), BlockGiantHorsetailShoot.block.getDefaultState(), 2);
								}
							} else {
								world.setBlockState(pos, state.withProperty(AGE, i1 + 1), 4);
							}
						}
					}
				}
			}
			if ((world.getBlockState(pos.down()).getBlock() != block) && (Math.random() > 0.75)){
				//Sometimes it's a new plants, but mostly it's flowers
				//Send up flower stems sometimes:
				boolean flowered = false;
				BlockPos block1 = pos.east();
				if (!flowered && (world.isAirBlock(block1)) && (world.isAirBlock(block1.up()))) {
					Block block2 = world.getBlockState(block1.down()).getBlock();
					if (block2.canSustainPlant(world.getBlockState(block1.down()), world, block1.down(), EnumFacing.UP, this)) {
						world.setBlockState(block1, BlockGiantHorsetailFlower.block.getDefaultState(), 2);
						world.setBlockState(block1.up(), BlockGiantHorsetailFlower.block.getDefaultState(), 2);
						flowered = true;
					}
				}
				block1 = pos.west();
				if (!flowered && (world.isAirBlock(block1)) && (world.isAirBlock(block1.up()))) {
					Block block2 = world.getBlockState(block1.down()).getBlock();
					if (block2.canSustainPlant(world.getBlockState(block1.down()), world, block1.down(), EnumFacing.UP, this)) {
						world.setBlockState(block1, BlockGiantHorsetailFlower.block.getDefaultState(), 2);
						world.setBlockState(block1.up(), BlockGiantHorsetailFlower.block.getDefaultState(), 2);
						flowered = true;
					}
				}
				block1 = pos.north();
				if (!flowered && (world.isAirBlock(block1)) && (world.isAirBlock(block1.up()))) {
					Block block2 = world.getBlockState(block1.down()).getBlock();
					if (block2.canSustainPlant(world.getBlockState(block1.down()), world, block1.down(), EnumFacing.UP, this)) {
						world.setBlockState(block1, BlockGiantHorsetailFlower.block.getDefaultState(), 2);
						world.setBlockState(block1.up(), BlockGiantHorsetailFlower.block.getDefaultState(), 2);
						flowered = true;
					}
				}
				block1 = pos.south();
				if (!flowered && (world.isAirBlock(block1)) && (world.isAirBlock(block1.up()))) {
					Block block2 = world.getBlockState(block1.down()).getBlock();
					if (block2.canSustainPlant(world.getBlockState(block1.down()), world, block1.down(), EnumFacing.UP, this)) {
						world.setBlockState(block1, BlockGiantHorsetailFlower.block.getDefaultState(), 2);
						world.setBlockState(block1.up(), BlockGiantHorsetailFlower.block.getDefaultState(), 2);
						flowered = true;
					}
				}
			}
		}

	    @SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Horsetail shrub");
	        tooltip.add("Periods: Carboniferous - Permian - Triassic - Jurassic - Early Cretaceous - Late Cretaceous - Paleogene - Neogene - Pleistocene [ - present]");
	        tooltip.add("Propagation: Spores");}
	        super.addInformation(stack, player, tooltip, advanced);
	    }

		@Override
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 100;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 60;
		}

		@Override
	    public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
	    	if (world.isAirBlock(pos.up())) {
				world.setBlockState(pos.up(), BlockGiantHorsetailShoot.block.getDefaultState(), 3);
	    	}
			super.onBlockAdded(world, pos, state);
	    }

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
	
}

