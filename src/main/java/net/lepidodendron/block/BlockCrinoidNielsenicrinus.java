
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.creativetab.TabLepidodendronStatic;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.lepidodendron.world.biome.ChunkGenSpawner;
import net.lepidodendron.world.biome.cretaceous.BiomeCretaceousEarly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
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
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockCrinoidNielsenicrinus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:crinoid_nielsenicrinus")
	public static final Block block = null;
	public BlockCrinoidNielsenicrinus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.crinoid_nielsenicrinus);
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
				new ModelResourceLocation("lepidodendron:crinoid_nielsenicrinus", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockMacrocystisKelp.LEVEL).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("staticdnaPNlepidodendron:crinoid_nielsenicrinus", BlockCrinoidNielsenicrinus.block);
		OreDictionary.registerOre("pndietCrinoid", BlockCrinoidNielsenicrinus.block);
		OreDictionary.registerOre("holdfastDrops", BlockCrinoidNielsenicrinus.block);
	}


	public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);
	public static final PropertyBool TOPSHOOT = PropertyBool.create("topshoot");

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {

		int weight = LepidodendronConfigPlants.weightCrinoid;
		if (weight > 100) {weight = 100;}
		if (weight < 0) {weight = 0;}
		if (Math.random() < ((double) (100 - (double) weight)/100)) {
			return;
		}

		boolean dimensionCriteria = false;
		if (shouldGenerateInDimension(dimID, LepidodendronConfigPlants.dimCrinoid)) {
			dimensionCriteria = true;
		}
		if (dimID == LepidodendronConfig.dimCretaceousEarly
		) {
			dimensionCriteria = true;
		}

		if (!dimensionCriteria)
			return;

		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(chunkX + 15, 0, chunkZ + 15));
		if (!matchBiome(biome, LepidodendronConfigPlants.genCrinoidBlacklistBiomes)) {
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.OCEAN))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.BEACH))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.VOID))
				biomeCriteria = false;
		}
		if (matchBiome(biome, LepidodendronConfigPlants.genCrinoidOverrideBiomes))
			biomeCriteria = true;

		if (biome instanceof BiomeCretaceousEarly)
		{
			BiomeCretaceousEarly biomeCretEarly = (BiomeCretaceousEarly) biome;
			if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_ocean")) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}
		if (!biomeCriteria)
			return;

		int multiplier = 1;
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_ocean")) {
			multiplier = 2;
		}

		for (int i = 0; i < (12 * multiplier); i++) {
			int l6 = chunkX + random.nextInt(16) + 8;
			int i11 = random.nextInt(128);
			int l14 = chunkZ + random.nextInt(16) + 8;
			(new WorldGenReed() {
				@Override
				public boolean generate(World world, Random random, BlockPos pos) {
					for (int i = 0; i < 1; ++i) {
						//BlockPos blockpos1 = pos.add(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
						if (random.nextInt(8) != 0) {
							continue;
						}
						BlockPos blockpos1 = ChunkGenSpawner.getTopSolidBlock(pos, world).up();
						if (((BlockCustom) block).isWaterBlock(world, blockpos1) && ((BlockCustom) block).isWaterBlock(world, blockpos1.up()) && ((BlockCustom) block).isWaterBlock(world, blockpos1.up(2))) {
							BlockPos blockpos2 = blockpos1.down();
							int j = crinoidHeight(world, blockpos1, random);
							j = Math.min(BlockCustom.crinoidheight, j);
							for (int k = 0; k < j; ++k)
								if (((BlockCustom) block).canBlockStay(world, blockpos1)
								&& ((BlockCustom) block).canBlockStay(world, blockpos1.up(k)))
									world.setBlockState(blockpos1.up(k), block.getDefaultState(), 2);
						}
					}
					return true;
				}
			}).generate(world, random, new BlockPos(l6, i11, l14));
		}
	}

	private static int crinoidHeight(World worldIn, BlockPos pos, Random random) {
		if (worldIn.getBiome(pos).getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea_garden")) {
			if (random.nextInt(8) != 0) {
				return BlockCrinoidNielsenicrinus.BlockCustom.crinoidheight;
			}
		}
		return 1 + random.nextInt(random.nextInt(random.nextInt(BlockCrinoidNielsenicrinus.BlockCustom.crinoidheight) + 1) + 1);
	}

	public static class BlockCustom extends Block implements net.minecraftforge.common.IShearable, IAdvancementGranter {

		public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 15);
		private static int crinoidheight;

		public BlockCustom() {
			super(Material.WATER);
			setSoundType(SoundType.PLANT);
			setCreativeTab(TabLepidodendronStatic.tab);
			setHardness(0F);
			setResistance(0F);
			setLightLevel(0F);
			setLightOpacity(3);
			crinoidheight = 4;
			this.setDefaultState(this.blockState.getBaseState().withProperty(TOPSHOOT, false).withProperty(AGE, Integer.valueOf(0)));
        	this.setTickRandomly(true);
			setTranslationKey("pf_crinoid_nielsenicrinus");
			setRegistryName("crinoid_nielsenicrinus");
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_CRINOID_NIELSENICRINUS;
		}



		@Override
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos){

			if (worldIn.getBlockState(pos).getBlock() != this) {
				return state;
			}
			return state.withProperty(TOPSHOOT, (worldIn.getBlockState(pos.up()).getBlock() != this));
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
	        return new BlockStateContainer(this, new IProperty[] {LEVEL,AGE,TOPSHOOT});
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
				&& (world.getBlockState(pos.down()).getMaterial() != Material.CORAL)
				&& (world.getBlockState(pos.down()).getMaterial() != Material.SPONGE)
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
					if (l < this.crinoidheight) {
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
			IBlockState state  = world.getBlockState(pos);
			if (state.getMaterial() == Material.WATER
					&& (state.getBlock() instanceof BlockLiquid || state.getBlock() instanceof BlockFluidBase
					|| state.getBlock() == this)) {
				return true;
			}
			return false;
		}


	    @SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Crinoid");
				tooltip.add("Periods: Early Cretaceous - Late Cretaceous - Paleogene");
			}
	        super.addInformation(stack, player, tooltip, advanced);
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
