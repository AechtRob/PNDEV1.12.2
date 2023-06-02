
package net.lepidodendron.block;

import net.lepidodendron.*;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.item.ItemDicranophyllumFruit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockReed;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
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

import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockDicranophyllum extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:dicranophyllum")
	public static final Block block = null;
	public BlockDicranophyllum(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.dicranophyllum);
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
				new ModelResourceLocation("lepidodendron:dicranophyllum", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:dicranophyllum", BlockDicranophyllum.block);
		OreDictionary.registerOre("plantPrehistoric", BlockDicranophyllum.block);
		OreDictionary.registerOre("plant", BlockDicranophyllum.block);
		OreDictionary.registerOre("treeLeaves", BlockDicranophyllum.block);
	}


	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		boolean dimensionCriteria = false;
		boolean isNetherType = false;
		if (shouldGenerateInDimension(dimID, LepidodendronConfigPlants.dimDicranophyllum))
			dimensionCriteria = true;
		if (!LepidodendronConfigPlants.genDicranophyllum && !LepidodendronConfig.genAllPlants)
			dimensionCriteria = false;
		if ((LepidodendronConfig.dimCarboniferous == dimID)
				|| (LepidodendronConfig.dimPermian == dimID)
		)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return;

		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(chunkX + 16, 128, chunkZ + 16));
		if ((!matchBiome(biome, LepidodendronConfig.genGlobalBlacklist)) && (!matchBiome(biome, LepidodendronConfigPlants.genDicranophyllumBlacklistBiomes))) {
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.PLAINS))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.FOREST))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.JUNGLE))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SANDY))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SAVANNA))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.COLD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MUSHROOM))
				biomeCriteria = false;
		}
		if (matchBiome(biome, LepidodendronConfigPlants.genDicranophyllumOverrideBiomes))
			biomeCriteria = true;
		if ((LepidodendronConfig.dimCarboniferous == dimID)
		)
			biomeCriteria = true;
		if ((biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_wetlands_unwooded"))
			|| (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_lowlands"))
			|| (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_stony_plains"))
		)
			biomeCriteria = true;
		if (!biomeCriteria)
			return;
			
		int GenChance = 3;
		double GenMultiplier = LepidodendronConfigPlants.multiplierDicranophyllum;
		if (GenMultiplier < 0) {GenMultiplier = 0;}
		GenChance = Math.min(15, (int) Math.round((double) GenChance * GenMultiplier));
		//Is this a transformed biome?
		if (LepidodendronDecorationHandler.matchBiome(biome, LepidodendronConfigPlants.genTransformBiomes)) {
			//if (biome.getRegistryName().toString().substring(0, biome.getRegistryName().toString().indexOf(":")).equalsIgnoreCase("minecraft"))
				GenChance = 15;
		}

		int maxheight = LepidodendronConfigPlants.maxheightDicranophyllum;
		int minheight = LepidodendronConfigPlants.minheightDicranophyllum;
		if (maxheight < 0) {maxheight = 0;}
		if (maxheight > 250) {maxheight = 250;}
		if (minheight < 1) {minheight = 1;}
		if (minheight > 250) {minheight = 250;}
		final int maxH;
		final int minH;

		if (LepidodendronConfig.dimCarboniferous == dimID) {
			maxH = 255;
			minH = 75;
			GenChance = 30;
		}
		else {
			maxH = maxheight;
			minH = minheight;
		}
			
		for (int i = 0; i < GenChance; i++) {
			int l6 = chunkX + random.nextInt(16) + 8;
			int i11 = random.nextInt(128);
			int l14 = chunkZ + random.nextInt(16) + 8;
			(new WorldGenReed() {
				@Override
				public boolean generate(World world, Random random, BlockPos pos) {
					for (int i = 0; i < 10; ++i) {
						BlockPos blockpos1 = pos.add(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
						if (world.isAirBlock(blockpos1) && world.isAirBlock(blockpos1.up()) && blockpos1.getY() >= minH && (blockpos1.getY() <= maxH || maxH == 0) ) {
							int j = random.nextInt(3) + 1;
							if (j == 3 && !world.isAirBlock(blockpos1.up(2))) {
								j = 2;
							}
							for (int k = 0; k <= j; ++k) {
								if (((BlockCustomFlower) block).canBlockStay(world, blockpos1)) {
									if (k <= (j - 1)) {
										world.setBlockState(blockpos1.up(k), block.getDefaultState(), 2); 
									}
									if (k == j) {
										world.setBlockState(blockpos1.up(k), BlockDicranophyllumShoot.block.getDefaultState(), 2);
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
	public static class BlockCustomFlower extends BlockReed {
		public BlockCustomFlower() {
			setSoundType(SoundType.PLANT);
			setCreativeTab(TabLepidodendronPlants.tab);
			setHardness(0.2F);
			setResistance(0.2F);
			setLightLevel(0F);
			setTranslationKey("pf_dicranophyllum");
			setRegistryName("dicranophyllum");
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
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			if (!LepidodendronConfig.doPropagation) {
				drops.add(new ItemStack(this));
			}
			else {
				drops.add(new ItemStack(ItemDicranophyllumFruit.block, (int) (1)));
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

		@Override
		public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
			return EnumPlantType.Plains;
		}

		@Override
		public boolean canPlaceBlockAt(World world, BlockPos pos) {
			Block block2 = world.getBlockState(pos.down()).getBlock();
			return (block2.canSustainPlant(world.getBlockState(pos.down()), world, pos.down(), EnumFacing.UP, this) || block2 == block);
		}

		@SideOnly(Side.CLIENT)
		public int colorMultiplier(IBlockAccess p_149720_1_, BlockPos pos, int pass) {
			return 16777215;
		}

		@Override
		public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
			if (world.getBlockState(pos.down()).getBlock() == block || this.checkForDrop(world, pos, state)) {
				if (world.isAirBlock(pos.up())) {
					world.setBlockState(pos.up(), BlockDicranophyllumShoot.block.getDefaultState(), 2);
				}
				else {
					if ((world.isAirBlock(pos.up(2))) && ((world.getBlockState(pos.up())).getBlock() == BlockDicranophyllumShoot.block)
						) {
						int l;
						for (l = 1; world.getBlockState(pos.down(l)).getBlock() == this; ++l);
						if (l < 2) {
							int i1 = (Integer) state.getValue(AGE);
							if (i1 == 15) {
								//world.setBlockToAir(pos.up(2));
								world.setBlockState(pos.up(), this.getDefaultState());
								world.setBlockState(pos, state.withProperty(AGE, 0), 4);
								//if (world.isAirBlock(pos.up(2))) {
									world.setBlockState(pos.up(2), BlockDicranophyllumShoot.block.getDefaultState(), 2);

							} else {
								world.setBlockState(pos, state.withProperty(AGE, i1 + 1), 4);
							}
						}
					}
				}
			}
		}

		@Override
	    public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
	    	if (world.isAirBlock(pos.up())) {
				world.setBlockState(pos.up(), BlockDicranophyllumShoot.block.getDefaultState(), 3);
	    	}
			super.onBlockAdded(world, pos, state);
	    }

	    @SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Coniferous shrub");
				tooltip.add("Periods: Carboniferous - Permian");
				tooltip.add("Propagation: fruit/cone");
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

