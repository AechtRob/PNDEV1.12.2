
package net.lepidodendron.block;

import net.lepidodendron.*;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockReed;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyInteger;
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
public class BlockSublepidodendron extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:sublepidodendron")
	public static final Block block = null;
	public BlockSublepidodendron(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.sublepidodendron);
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
				new ModelResourceLocation("lepidodendron:sublepidodendron", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:sublepidodendron", BlockSublepidodendron.block);
		OreDictionary.registerOre("plantPrehistoric", BlockSublepidodendron.block);
		OreDictionary.registerOre("plant", BlockSublepidodendron.block);
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		boolean dimensionCriteria = false;
		boolean isNetherType = false;
		if (shouldGenerateInDimension(dimID, LepidodendronConfigPlants.dimSublepidodendron))
			dimensionCriteria = true;
		if (!LepidodendronConfigPlants.genSublepidodendron && !LepidodendronConfig.genAllPlants)
			dimensionCriteria = false;
		if (!dimensionCriteria)
			return;

		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(chunkX + 16, 128, chunkZ + 16));
		if ((!matchBiome(biome, LepidodendronConfig.genGlobalBlacklist)) && (!matchBiome(biome, LepidodendronConfigPlants.genSublepidodendronBlacklistBiomes))) {
			if ((BiomeDictionary.hasType(biome, BiomeDictionary.Type.FOREST))
				&& (!BiomeDictionary.hasType(biome, BiomeDictionary.Type.COLD)))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SWAMP))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SNOWY))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.VOID))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MUSHROOM))
				biomeCriteria = false;
		}
		if (matchBiome(biome, LepidodendronConfigPlants.genSublepidodendronOverrideBiomes))
			biomeCriteria = true;
			
		if (!biomeCriteria)
			return;
			
		int GenChance = 6;
		double GenMultiplier = LepidodendronConfigPlants.multiplierSublepidodendron;
		if (GenMultiplier < 0) {GenMultiplier = 0;}
		GenChance = Math.min(15, (int) Math.round((double) GenChance * GenMultiplier));
		//Is this a transformed biome?
		if (LepidodendronDecorationHandler.matchBiome(biome, LepidodendronConfigPlants.genTransformBiomes)) {
			//if (biome.getRegistryName().toString().substring(0, biome.getRegistryName().toString().indexOf(":")).equalsIgnoreCase("minecraft"))
			GenChance = 15;
		}

		int maxheight = LepidodendronConfigPlants.maxheightSublepidodendron;
		int minheight = LepidodendronConfigPlants.minheightSublepidodendron;
		if (maxheight < 0) {maxheight = 0;}
		if (maxheight > 250) {maxheight = 250;}
		if (minheight < 1) {minheight = 1;}
		if (minheight > 250) {minheight = 250;}
		final int maxH = maxheight;
		final int minH = minheight;
	
		for (int i = 0; i < GenChance; i++) {
			int l6 = chunkX + random.nextInt(16) + 8;
			int i11 = random.nextInt(128);
			int l14 = chunkZ + random.nextInt(16) + 8;
			(new WorldGenReed() {
				
				@Override
				public boolean generate(World world, Random random, BlockPos pos) {
					for (int i = 0; i < 20; ++i) {
						BlockPos blockpos1 = pos.add(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
						if (world.isAirBlock(blockpos1) && world.isAirBlock(blockpos1.up()) && blockpos1.getY() >= minH && (blockpos1.getY() <= maxH || maxH == 0) ) {
							int j = 1 + random.nextInt(random.nextInt((height + 1)) + 1);
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
							for (int k = 0; k <= j; ++k) {
								if (((BlockCustomFlower) block).canBlockStay(world, blockpos1)) {
									if (k <= (j - 1)) {world.setBlockState(blockpos1.up(k), block.getDefaultState(), 2);}
									if (k == j) {
										if (k >= height + random.nextInt(2) - random.nextInt(2)) {
											world.setBlockState(blockpos1.up(k), BlockSublepidodendronShoot.block.getDefaultState(), 2);
										}
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

	public static final int height = 5;

	public static class BlockCustomFlower extends BlockReed implements IAdvancementGranter {

		
		public static final PropertyBool BOTTOM = PropertyBool.create("bottom");
		public static final PropertyInteger STAGE = PropertyInteger.create("stage", 0, 3);
		public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 15);

		public BlockCustomFlower() {
			setSoundType(SoundType.PLANT);
			setCreativeTab(TabLepidodendronPlants.tab);
			setHardness(0.2F);
			setResistance(0.2F);
			setLightLevel(0F);
			setTranslationKey("pf_sublepidodendron");
			setRegistryName("sublepidodendron");
			this.setDefaultState(this.blockState.getBaseState().withProperty(BOTTOM, false).withProperty(STAGE, 0).withProperty(AGE, Integer.valueOf(0)));
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_SUBLEPIDODENDRON;
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
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{AGE, BOTTOM, STAGE});
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos){

			if (worldIn.getBlockState(pos).getBlock() != this) {
				return state;
			}

			boolean	isBottom = (worldIn.getBlockState(pos.down()).getBlock() != this);

			int l = 0;
			int stage = 0; //Defaults to a bare stem
			if (worldIn.getBlockState(pos.up()).getBlock() != this && worldIn.getBlockState(pos.up()).getBlock() != BlockSublepidodendronShoot.block) {
				if (isBottom) {
					stage = 1; //is a bottom shoot single block
				}
				else {
					for (l = 1; worldIn.getBlockState(pos.down(l)).getBlock() == this; ++l) ;
					stage = 2; //is a medium shoot
					if (l >= height - 1) {
						stage = 3; //is a full shoot pre-top
					}
				}
			}

			return state.withProperty(BOTTOM, isBottom).withProperty(STAGE, stage);
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

		@Override
		public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
			return EnumPlantType.Plains;
		}

		@Override
		public boolean canPlaceBlockAt(World world, BlockPos pos) {
			IBlockState state = world.getBlockState(pos.down());
	        Block block = state.getBlock();

			if (block.canSustainPlant(state, world, pos.down(), EnumFacing.UP, this)) return true;
	        
			if (block == this)
	        {
	            return true;
	        }

           	if (block == Blocks.GRASS || block == Blocks.DIRT || block == Blocks.SAND)
	        {
	           return true;
	        }

	        //if (block.canSustainPlant(state, world, pos.down(), EnumFacing.UP, this)) return true;

            return false;

	    }

		@Override
		public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
			if (world.getBlockState(pos.down()).getBlock() == block || this.checkForDrop(world, pos, state)) {
				if (world.isAirBlock(pos.up())) {
					int l;
					for (l = 1; world.getBlockState(pos.down(l)).getBlock() == this; ++l);
					if (l < (height + 1)) {
						int i1 = (Integer) state.getValue(AGE);
						if (i1 == 15) {
							world.setBlockState(pos.up(), this.getDefaultState());
							world.setBlockState(pos, state.withProperty(AGE, 0), 4);
						} else {
							world.setBlockState(pos, state.withProperty(AGE, i1 + 1), 4);
						}
					}
					if (l >= height + random.nextInt(2) - random.nextInt(2) - 1) {
						world.setBlockState(pos.up(), BlockSublepidodendronShoot.block.getDefaultState(), 2);
					}
				}
			}
		}

	    @SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Lycophyte shrub");
	        	tooltip.add("Periods: Devonian - Carboniferous");
	        	tooltip.add("Propagation: Spores");}
	        super.addInformation(stack, player, tooltip, advanced);
	    }

		@Override
		@Nullable
		public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
			return NULL_AABB;
		}

		@Override
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
		}


		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			return new AxisAlignedBB(0.4D, 0D, 0.4D, 0.6D, 1D, 0.6D);
		}

		@Override
		public boolean isReplaceable(IBlockAccess blockAccess, BlockPos pos) {
			return false;
		}

		@Override
		public boolean canBlockStay(World worldIn, BlockPos pos)
	    {
	        return canPlaceBlockAt(worldIn, pos);
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

