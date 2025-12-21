
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.util.*;
import net.lepidodendron.world.biome.ChunkGenSpawner;
import net.lepidodendron.world.biome.carboniferous.BiomeCarboniferous;
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
public class BlockBivalveMegalodon extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:bivalve_megalodon")
	public static final Block block = null;
	public BlockBivalveMegalodon(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.bivalve_megalodon);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("bivalve_megalodon"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:bivalve_megalodon", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockBivalveMegalodon.LEVEL).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("staticdnaPNlepidodendron:bivalve_megalodon", BlockBivalveMegalodon.block);
		OreDictionary.registerOre("itemShellfish", BlockBivalveMegalodon.block);
		OreDictionary.registerOre("pnfurnaceSeafood", BlockBivalveMegalodon.block);
		OreDictionary.registerOre("pndietShellfish", BlockBivalveMegalodon.block);
	}


	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {

		boolean dimensionCriteria = false;
		if (shouldGenerateInDimension(dimID, LepidodendronConfigPlants.dimBivalvePrehistoric))
			dimensionCriteria = true;
		if (dimID == LepidodendronConfig.dimDevonian
			|| dimID == LepidodendronConfig.dimCarboniferous
			|| dimID == LepidodendronConfig.dimPermian
			|| dimID == LepidodendronConfig.dimTriassic
			|| dimID == LepidodendronConfig.dimJurassic
		) {
			dimensionCriteria = true;
		}
		if (dimID == LepidodendronConfig.dimPrecambrian){
			dimensionCriteria = false;
		}
		if (dimID == LepidodendronConfig.dimCambrian){
			dimensionCriteria = false;
		}
		if (dimID == LepidodendronConfig.dimOrdovician){
			dimensionCriteria = false;
		}
		if (dimID == LepidodendronConfig.dimSilurian) {
			dimensionCriteria = false;
		}
		if (dimID == LepidodendronConfig.dimDevonian){
			dimensionCriteria = false;
		}
		if (dimID == LepidodendronConfig.dimCarboniferous){
			dimensionCriteria = false;
		}
		if (dimID == LepidodendronConfig.dimPermian){
			dimensionCriteria = false;
		}
		if (dimID == LepidodendronConfig.dimTriassic){
			dimensionCriteria = false;
		}
		if (dimID == LepidodendronConfig.dimJurassic){
			dimensionCriteria = false;
		}
		if (!dimensionCriteria)
			return;

		int weight = LepidodendronConfigPlants.weightBivalvePrehistoric;
		if (weight > 100) {weight = 100;}
		if (weight < 0) {weight = 0;}
		if (dimID == LepidodendronConfig.dimCarboniferous
			|| dimID == LepidodendronConfig.dimPermian
			|| dimID == LepidodendronConfig.dimTriassic
			|| dimID == LepidodendronConfig.dimJurassic
		)
			weight = 100; //Full scale populations in these dims

		if (dimID == LepidodendronConfig.dimDevonian
			|| dimID == LepidodendronConfig.dimOrdovician || dimID == LepidodendronConfig.dimSilurian
		)
			weight = 50; //Half scale populations in these dims

		if (Math.random() < ((double) (100 - (double) weight)/100)) {
			return;
		}

		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(chunkX + 15, 0, chunkZ + 15));
		if (!matchBiome(biome, LepidodendronConfigPlants.genBivalvePrehistoricBlacklistBiomes)) {
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.OCEAN))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.BEACH))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.VOID))
				biomeCriteria = false;
		}
		if (matchBiome(biome, LepidodendronConfigPlants.genBivalvePrehistoricOverrideBiomes))
			biomeCriteria = true;

		if (dimID == LepidodendronConfig.dimOrdovician || dimID == LepidodendronConfig.dimSilurian
		)
			biomeCriteria = true;
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_lush_patch")
		)
			biomeCriteria = false;

		if (biome instanceof BiomeDevonian)
		{
			BiomeDevonian biomeDev = (BiomeDevonian) biome;
			if (biomeDev.getBiomeType() == EnumBiomeTypeDevonian.Ocean) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}
		if (biome instanceof BiomeCarboniferous)
		{
			BiomeCarboniferous biomeCarb = (BiomeCarboniferous) biome;
			if (biomeCarb.getBiomeType() == EnumBiomeTypeCarboniferous.Ocean
					|| biomeCarb.getBiomeType() == EnumBiomeTypeCarboniferous.Bay) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}
		if (biome instanceof BiomePermian)
		{
			BiomePermian biomePermian = (BiomePermian) biome;
			if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Ocean) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}
		if (biome instanceof BiomeTriassic)
		{
			BiomeTriassic biomeTriassic = (BiomeTriassic) biome;
			if (biomeTriassic.getBiomeType() == EnumBiomeTypeTriassic.Ocean) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}
		if (biome instanceof BiomeJurassic)
		{
			BiomeJurassic biomeJurassic = (BiomeJurassic) biome;
			if (biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.Ocean
					|| biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.IslandWhite) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}
		if (!biomeCriteria)
			return;

		int multiplier = 1;
		if ((dimID == LepidodendronConfig.dimOrdovician || dimID == LepidodendronConfig.dimSilurian)
			|| (dimID == LepidodendronConfig.dimDevonian)
			|| (dimID == LepidodendronConfig.dimCarboniferous)
		) {
			multiplier = 2;
		}
		if ((dimID == LepidodendronConfig.dimPermian
			|| dimID == LepidodendronConfig.dimJurassic)
		) {
			multiplier = 3;
		}

		if ((biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_ocean_clam_beds"))
		) {
			multiplier = 10;
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
					for (int i = 0; i < 1; ++i) {
						//BlockPos blockpos1 = pos.add(random.nextInt(6) - random.nextInt(6), 0, random.nextInt(6) - random.nextInt(6));
						if (random.nextInt(8) != 0) {
							continue;
						}
						BlockPos blockpos1 = ChunkGenSpawner.getTopSolidBlock(pos, world).up();
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
									world.setBlockState(blockpos1, block.getDefaultState().withProperty(BlockBivalveMegalodon.BlockCustom.FACING, enumfacing), 2);
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
			setTranslationKey("pf_bivalve_megalodon");
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_BIVALVE_MEGALODON;
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
				tooltip.add("Type: Marine bivalve");
				tooltip.add("Periods: Devonian - Carboniferous - Permian - Triassic - Jurassic");}
			super.addInformation(stack, player, tooltip, advanced);
		}

	}
}
