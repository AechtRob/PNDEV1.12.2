
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.util.*;
import net.lepidodendron.world.biome.carboniferous.BiomeCarboniferous;
import net.lepidodendron.world.biome.cretaceous.BiomeCretaceousEarly;
import net.lepidodendron.world.biome.devonian.BiomeDevonian;
import net.lepidodendron.world.biome.jurassic.BiomeJurassic;
import net.lepidodendron.world.biome.permian.BiomePermian;
import net.lepidodendron.world.biome.triassic.BiomeTriassic;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenReed;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockBivalveGreen extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:bivalve_green")
	public static final Block block = null;
	public BlockBivalveGreen(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.bivalve_green);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("bivalve_green"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:bivalve_green", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockBivalveGreen.LEVEL).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("staticdnaPNlepidodendron:bivalve_green", BlockBivalveGreen.block);
		OreDictionary.registerOre("itemShellfish", BlockBivalveGreen.block);
		OreDictionary.registerOre("pnfurnaceSeafood", BlockBivalveGreen.block);
		OreDictionary.registerOre("pndietShellfish", BlockBivalveGreen.block);
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {

		boolean dimensionCriteria = false;
		if (shouldGenerateInDimension(dimID, LepidodendronConfigPlants.dimBivalve))
			dimensionCriteria = true;
		if (dimID == LepidodendronConfig.dimCarboniferous
			|| dimID == LepidodendronConfig.dimPermian
			|| dimID == LepidodendronConfig.dimTriassic
			|| dimID == LepidodendronConfig.dimJurassic
			|| dimID == LepidodendronConfig.dimCretaceousEarly
		) {
			dimensionCriteria = true;
		}
		if (!dimensionCriteria)
			return;

		int weight = LepidodendronConfigPlants.weightBivalve;
		if (weight > 100) {weight = 100;}
		if (weight < 0) {weight = 0;}
		if (dimID == LepidodendronConfig.dimCarboniferous
			|| dimID == LepidodendronConfig.dimPermian
			|| dimID == LepidodendronConfig.dimTriassic
			|| dimID == LepidodendronConfig.dimJurassic
			|| dimID == LepidodendronConfig.dimCretaceousEarly
		)
			weight = 100; //Full scale populations in these dims

		if (dimID == LepidodendronConfig.dimDevonian
			|| dimID == LepidodendronConfig.dimOrdovician || dimID == LepidodendronConfig.dimSilurian
		)
			weight = 50; //Half scale populations in these dims

		if (Math.random() < ((double) (100 - (double) weight)/100)) {
			return;
		}

		boolean biomeCriteria = true;
		Biome biome = world.getBiome(new BlockPos(chunkX + 16, 0, chunkZ + 16));
		if (!matchBiome(biome, LepidodendronConfigPlants.genBivalveBlacklistBiomes)) {
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.OCEAN))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.BEACH))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.VOID))
				biomeCriteria = false;
		}
		if (matchBiome(biome, LepidodendronConfigPlants.genBivalveOverrideBiomes))
			biomeCriteria = true;

		if (dimID == LepidodendronConfig.dimOrdovician || dimID == LepidodendronConfig.dimSilurian
		)
			biomeCriteria = false;
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_lush_patch")
		)
			biomeCriteria = true;

		if (biome instanceof BiomeDevonian)
		{
			BiomeDevonian biomeDev = (BiomeDevonian) biome;
			if (biomeDev.getBiomeType() != EnumBiomeTypeDevonian.Ocean && biomeDev.getBiomeType() != EnumBiomeTypeDevonian.Hypersaline) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}
		if (biome instanceof BiomeCarboniferous)
		{
			BiomeCarboniferous biomeCarb = (BiomeCarboniferous) biome;
			if (biomeCarb.getBiomeType() != EnumBiomeTypeCarboniferous.Ocean
				&& biomeCarb.getBiomeType() != EnumBiomeTypeCarboniferous.Volcanic
					&& biomeCarb.getBiomeType() != EnumBiomeTypeCarboniferous.Bay) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}
		if (biome instanceof BiomePermian)
		{
			BiomePermian biomePermian = (BiomePermian) biome;
			if (biomePermian.getBiomeType() != EnumBiomeTypePermian.Ocean) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}
		if (biome instanceof BiomeTriassic)
		{
			BiomeTriassic biomeTriassic = (BiomeTriassic) biome;
			if (biomeTriassic.getBiomeType() != EnumBiomeTypeTriassic.Ocean
				&& biomeTriassic.getBiomeType() != EnumBiomeTypeTriassic.Island) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}
		if (biome instanceof BiomeJurassic)
		{
			BiomeJurassic biomeJurassic = (BiomeJurassic) biome;
			if (biomeJurassic.getBiomeType() != EnumBiomeTypeJurassic.Ocean
				&& biomeJurassic.getBiomeType() != EnumBiomeTypeJurassic.IslandSand
				&& biomeJurassic.getBiomeType() != EnumBiomeTypeJurassic.IslandWhite) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}


		if (biome instanceof BiomeCretaceousEarly)
		{
			BiomeCretaceousEarly biomeCretaceousEarly = (BiomeCretaceousEarly) biome;
			if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_asia")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_boggy_glades")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_banded_desert")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_banded_desert")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_asia_drooping_swamp")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_asia_drooping_swamp")) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}

		if (!biomeCriteria)
			return;

		int multiplier = 1;
		if (dimID == LepidodendronConfig.dimOrdovician
				|| dimID == LepidodendronConfig.dimSilurian
				|| dimID == LepidodendronConfig.dimDevonian
				|| dimID == LepidodendronConfig.dimJurassic
				|| dimID == LepidodendronConfig.dimCretaceousEarly
		) {
			multiplier = 2;
		}
		if (dimID == LepidodendronConfig.dimPermian
			|| dimID == LepidodendronConfig.dimCarboniferous
		) {
			multiplier = 10;
		}

		if ((dimID == LepidodendronConfig.dimTriassic )
		) {
			multiplier = 5;
		}

		int minWaterDepth = 1;
		int maxWaterDepth = 20;
		int startHeight = Functions.getAdjustedSeaLevel(world, new BlockPos(chunkX, 0, chunkZ)) - maxWaterDepth;

		for (int i = 0; i < (12 * multiplier); i++) {
			int l6 = chunkX + random.nextInt(16) + 8;
			int i11 = random.nextInt(Functions.getAdjustedSeaLevel(world, new BlockPos(chunkX, 0, chunkZ)) - startHeight) + startHeight;
			int l14 = chunkZ + random.nextInt(16) + 8;
			(new WorldGenReed() {
				@Override
				public boolean generate(World world, Random random, BlockPos pos) {
					for (int i = 0; i < 40; ++i) {
						BlockPos blockpos1 = pos.add(random.nextInt(6) - random.nextInt(6), 0, random.nextInt(6) - random.nextInt(6));
						if (Functions.isWater(world, blockpos1)) {
							boolean waterDepthCheckMax = false;
							boolean waterDepthCheckMin = true;
							//find air within the right depth
							int yy = 1;
							while (yy <= maxWaterDepth + 1 && !waterDepthCheckMax) {
								if ((world.getBlockState(blockpos1.add(0, yy, 0)).getMaterial() != Material.AIR)
										&& ((world.getBlockState(blockpos1.add(0, yy, 0)).getMaterial() != Material.WATER))) {
									yy = maxWaterDepth + 1;
								} else if ((world.getBlockState(blockpos1.add(0, yy, 0)).getMaterial() == Material.AIR)
										&& (i11 + yy >= Functions.getAdjustedSeaLevel(world, new BlockPos(chunkX, 0, chunkZ)))) {
									waterDepthCheckMax = true;
								}
								yy += 1;
							}
							//Check that at least enough water is over the position:
							yy = 1;
							while (yy <= minWaterDepth && waterDepthCheckMin) {
								if (world.getBlockState(blockpos1.add(0, yy, 0)).getMaterial() != Material.WATER) {
									waterDepthCheckMin = false;
								}
								yy += 1;
							}
							//Only place these on teh floor:
							EnumFacing enumfacing = EnumFacing.UP;
							BlockPos pos1 = blockpos1.down();
							if (waterDepthCheckMin & waterDepthCheckMax) {
								if (((world.getBlockState(pos1).getMaterial() == Material.SAND)
									|| (world.getBlockState(pos1).getMaterial() == Material.ROCK && world.getBlockState(pos1).getBlock() != Blocks.MAGMA)
									|| (world.getBlockState(pos1).getMaterial() == Material.GROUND)
									|| (world.getBlockState(pos1).getMaterial() == Material.CORAL)
									|| (world.getBlockState(pos1).getMaterial() == Material.CLAY))
									&& (world.getBlockState(pos1).getBlockFaceShape(world, pos1, EnumFacing.UP) == BlockFaceShape.SOLID)) {
									world.setBlockState(blockpos1, block.getDefaultState().withProperty(BlockBivalveGreen.BlockCustom.FACING, enumfacing), 2);
									return true;
								}
							}
						}
					}
					return true;
				}
			}).generate(world, random, new BlockPos(l6, i11, l14));
		}
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

	public static class BlockCustom extends BlockBivalve  {

		public BlockCustom() {
			super();
			setTranslationKey("pf_bivalve_green");
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_BIVALVE_GREEN;
		}

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			switch ((EnumFacing) state.getValue(BlockDirectional.FACING)) {
				case SOUTH :
				default :
					return new AxisAlignedBB(0.0D, 0D, 0D, 1.0D, 1.0D, 1.0D);
				case NORTH :
					return new AxisAlignedBB(0.0D, 0D, 0D, 1.0D, 1.0D, 1.0D);
				case WEST :
					return new AxisAlignedBB(0.0D, 0D, 0D, 1.0D, 1.0D, 1.0D);
				case EAST :
					return new AxisAlignedBB(0.0D, 0D, 0D, 1.0D, 1.0D, 1.0D);
				case UP :
					return new AxisAlignedBB(0.0D, 0D, 0D, 1.0D, 1.0D, 1.0D);
				case DOWN :
					return new AxisAlignedBB(0.0D, 0D, 0D, 1.0D, 1.0D, 1.0D);
			}
		}

		@SideOnly(Side.CLIENT)
		@Override
		public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
			if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Freshwater bivalve");
				tooltip.add("Periods: Carboniferous - Permian - Triassic - Jurassic - Early Cretaceous - Late Cretaceous - Paleogene - Neogene - Pleistocene");}
			super.addInformation(stack, player, tooltip, advanced);
		}

	}
}
