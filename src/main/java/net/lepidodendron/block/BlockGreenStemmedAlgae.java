
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.Functions;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
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
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;


@ElementsLepidodendronMod.ModElement.Tag
public class BlockGreenStemmedAlgae extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:green_stemmed_algae")
	public static final Block block = null;
	public BlockGreenStemmedAlgae(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.green_stemmed_algae);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("itemAlgae", BlockGreenStemmedAlgae.block);
		OreDictionary.registerOre("plantdnaPNlepidodendron:green_stemmed_algae", BlockGreenStemmedAlgae.block);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom());
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:green_stemmed_algae", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockGreenStemmedAlgae.LEVEL).build());
	}

	public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {

		int weight = LepidodendronConfigPlants.weightGreenStemmedAlgae;
		if (weight > 100) {weight = 100;}
		if (weight < 0) {weight = 0;}
		if (Math.random() < ((double) (100 - (double) weight)/100)) {
			return;
		}
		
		boolean dimensionCriteria = false;
		if (shouldGenerateInDimension(dimID, LepidodendronConfigPlants.dimAlgae))
			dimensionCriteria = true;
		if (
			(dimID == LepidodendronConfig.dimCarboniferous)
			|| (dimID == LepidodendronConfig.dimPermian)
			|| (dimID == LepidodendronConfig.dimTriassic)
			|| (dimID == LepidodendronConfig.dimJurassic)
			|| (dimID == LepidodendronConfig.dimCretaceousEarly)
		) {
			dimensionCriteria = true;
		}
		if (!dimensionCriteria)
			return;

		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(chunkX + 15, 0, chunkZ + 15));
		if (!matchBiome(biome, LepidodendronConfigPlants.genGreenStemmedAlgaeBlacklistBiomes)) {
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.OCEAN))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.BEACH))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.VOID))
				biomeCriteria = false;
		}
		if (matchBiome(biome, LepidodendronConfigPlants.genGreenStemmedAlgaeOverrideBiomes))
			biomeCriteria = true;
		if (
			(dimID == LepidodendronConfig.dimCarboniferous)
			|| (dimID == LepidodendronConfig.dimPermian)
			|| (dimID == LepidodendronConfig.dimTriassic)
			|| (dimID == LepidodendronConfig.dimJurassic)
			|| (dimID == LepidodendronConfig.dimCretaceousEarly)
			) {
			biomeCriteria = true;
		}
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_china_lakes")) {
			biomeCriteria = false;
		}
		if (!biomeCriteria)
			return;

		int multiplier = 1;

		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_river")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_river")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_river")


				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_coastal")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_estuary")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_hills")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_polar")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_marsh")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_swamp")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_bay")

				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_coastal")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_coastal_black")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_desert")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_flooded_forest")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_gondwanan_forest")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_gondwanan_plain")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_warm_lakeland")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_xeric")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_ocean_reef")

				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_coastal")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_arid")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_cold_glossopteris")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_desert")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_highlands")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_lowlands")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_wetlands")


				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_coastal")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_fern_pasture")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_floodplain")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_garrigue")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_ginkgo_woodland")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_redwood_forest")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_southern_taiga")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mire")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mire_helper")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mire_lakes")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_lakes")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_lake_shore")

				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_asia_drooping_swamp")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_asia_drooping_swamp")
		)
		{
			multiplier = 8;
		}

		for (int i = 0; i < 12 * multiplier; i++) {
			int l6 = chunkX + random.nextInt(16) + 8;
			int i11 = random.nextInt(128);
			int l14 = chunkZ + random.nextInt(16) + 8;
			(new WorldGenReed() {
				@Override
				public boolean generate(World world, Random random, BlockPos pos) {
					for (int i = 0; i < 40; ++i) {
						BlockPos blockpos1 = pos.add(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
						if (blockpos1.getY() >= Functions.getAdjustedSeaLevel(world, new BlockPos(chunkX, 0, chunkZ))-15) {
							if (((BlockCustom) block).isWaterBlock(world, blockpos1) && ((BlockCustom) block).isWaterBlock(world, blockpos1.up())) {
								BlockPos blockpos2 = blockpos1.down();
								int j = 1 + random.nextInt(random.nextInt(random.nextInt(5) + 1) + 1);
								j = Math.min(5, j);
								for (int k = 0; k < j; ++k)
									if (((BlockCustom) block).canBlockStay(world, blockpos1)
											&& ((BlockCustom) block).canBlockStay(world, blockpos1.up(k)))
										world.setBlockState(blockpos1.up(k), block.getDefaultState(), 2);
							}
						}
					}
					return true;
				}
			}).generate(world, random, new BlockPos(l6, i11, l14));
		}
	}
	
	public static class BlockCustom extends Block implements net.minecraftforge.common.IShearable, IAdvancementGranter {

		public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 15);
	
		public BlockCustom() {
			super(Material.WATER);
			setSoundType(SoundType.PLANT);
			setCreativeTab(TabLepidodendronPlants.tab);
			setHardness(0F);
			setResistance(0F);
			setLightLevel(0F);
			setLightOpacity(3);
			this.setDefaultState(this.blockState.getBaseState().withProperty(AGE, Integer.valueOf(0)));
        	this.setTickRandomly(true);
			setTranslationKey("pf_green_stemmed_algae");
			setRegistryName("green_stemmed_algae");
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_ALGAE_GREEN;
		}
		
		@Override public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos){ return true; }
		
		@Override
		public NonNullList<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
			return NonNullList.withSize(1, new ItemStack(this, (int) (1)));
		}
	
	    @Nullable
	    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
	    {
	        return NULL_AABB;
	    }

		@SideOnly(Side.CLIENT)
		@Override
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }
		
		@Override
		public boolean canRenderInLayer(IBlockState state, BlockRenderLayer layer) {
			return layer == BlockRenderLayer.CUTOUT_MIPPED;
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}
		
		@Override
		public boolean isFullCube(IBlockState state)
	    {
	        return false;
	    }

	    public IBlockState getStateFromMeta(int meta)
	    {
	        return this.getDefaultState().withProperty(AGE, Integer.valueOf(meta));
	    }

	    public int getMetaFromState(IBlockState state)
	    {
	        return ((Integer)state.getValue(AGE)).intValue();
	    }

	    protected BlockStateContainer createBlockState()
	    {
	        return new BlockStateContainer(this, new IProperty[] {LEVEL,AGE});
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
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return new ItemStack(Blocks.AIR, (int) (1)).getItem();
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

		public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
	    {
	        return BlockFaceShape.UNDEFINED;
	    }

		@Override
		public boolean canPlaceBlockAt(World world, BlockPos pos) {
			//Block block2 = world.getBlockState(pos.down()).getBlock();
			//return (block2.canSustainPlant(world.getBlockState(pos.down()), world, pos.down(), EnumFacing.UP, this) || block2 == block);
			
			boolean water = false;
			boolean blockface = true;
			if (world.getBlockState(pos.down()).getBlockFaceShape(world, pos.down(), EnumFacing.UP) != BlockFaceShape.SOLID) {
	        	blockface = false;
			}

			if ((world.getBlockState(pos.down()).getMaterial() != Material.SAND)
				&& (world.getBlockState(pos.down()).getMaterial() != Material.ROCK)
				&& (world.getBlockState(pos.down()).getMaterial() != Material.GROUND)
				&& (world.getBlockState(pos.down()).getMaterial() != Material.WOOD)
				&& (world.getBlockState(pos.down()).getMaterial() != Material.CLAY)
				&& (world.getBlockState(pos.down()).getMaterial() != Material.IRON)
				&& (world.getBlockState(pos.down()).getMaterial() != Material.GLASS)) {
				blockface =  false;
			}
			
			if (world.getBlockState(pos.down()).getBlock() == this) {
				blockface = true;
			}
	        if ((isWaterBlock(world, pos)) && (isWaterBlock(world, pos.up()))) {
				water = true;
			}
	        return (blockface && water);
	        		
		}

		public boolean canBlockStay(World worldIn, BlockPos pos)
	    {
	        return this.canPlaceBlockAt(worldIn, pos);
	    }

		@SideOnly(Side.CLIENT)
		public int colorMultiplier(IBlockAccess p_149720_1_, BlockPos pos, int pass) {
			return 16777215;
		}

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			if (!canPlaceBlockAt(world, pos)) {
				world.destroyBlock(pos, false);
			}
		}

		@Override
		public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
			if (!canPlaceBlockAt(world, pos)) {
				world.destroyBlock(pos, false);
			}
			else {
				if (isWaterBlock(world, pos.up()) && isWaterBlock(world, pos.up(2))) {
					int l;
					for (l = 1; world.getBlockState(pos.down(l)).getBlock() == this; ++l);
					if (l < 5) {
						int i1 = (Integer) state.getValue(AGE);
						if (i1 == 15) {
							world.setBlockState(pos.up(), this.getDefaultState());
							world.setBlockState(pos, state.withProperty(AGE, 0), 4);
						} else {
							world.setBlockState(pos, state.withProperty(AGE, i1 + 1), 4);
						}
					}
				}
			}
		}

		public boolean isWaterBlock(World world, BlockPos pos) {
			if (world.getBlockState(pos).getMaterial() == Material.WATER) {
				//IBlockState iblockstate = world.getBlockState(pos);
				//if (((Integer)iblockstate.getValue(BlockLiquid.LEVEL)).intValue() == 0) {
					return true;
				//}
			}
	    	return false;
	    }

	    
	    @SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Marine and Freshwater Algae");
				tooltip.add("Periods: Carboniferous - Permian - Triassic - Jurassic - Early Cretaceous - Late Cretaceous - Paleogene - Neogene - Pleistocene - present");
				tooltip.add("Propagation: Water");}
	        super.addInformation(stack, player, tooltip, advanced);
	    }


	    //@Nullable
	    //protected RayTraceResult rayTrace(BlockPos pos, Vec3d start, Vec3d end, AxisAlignedBB boundingBox)
	    //{
	    //    return RayTraceResult.Type.BLOCK;
	    //}
	    
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
