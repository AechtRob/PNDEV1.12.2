
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronDecorationHandler;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.item.ItemNeocalamitesItem;
import net.lepidodendron.util.EnumBiomeTypePermian;
import net.lepidodendron.util.EnumBiomeTypeTriassic;
import net.lepidodendron.world.biome.permian.BiomePermian;
import net.lepidodendron.world.biome.permian.BiomePermianLowlandFloodplain;
import net.lepidodendron.world.biome.permian.BiomePermianLowlands;
import net.lepidodendron.world.biome.permian.BiomePermianRiver;
import net.lepidodendron.world.biome.triassic.BiomeTriassic;
import net.lepidodendron.world.biome.triassic.BiomeTriassicRiver;
import net.minecraft.block.Block;
import net.minecraft.block.BlockReed;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
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
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockNeocalamites extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:neocalamites")
	public static final Block block = null;
	public BlockNeocalamites(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.neocalamites);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustomFlower());
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	//@SideOnly(Side.CLIENT)
	//@Override
	//public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
		//		new ModelResourceLocation("lepidodendron:neocalamites", "inventory"));
	//}

	public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 15);
	public static final PropertyBool WATER = PropertyBool.create("water");

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		boolean dimensionCriteria = false;
		boolean isNetherType = false;
		if (shouldGenerateInDimension(dimID, LepidodendronConfig.dimNeocalamites))
			dimensionCriteria = true;
		if (!LepidodendronConfig.genNeocalamites && !LepidodendronConfig.genAllPlants)
			dimensionCriteria = false;
		if (dimID == LepidodendronConfig.dimPermian || dimID == LepidodendronConfig.dimTriassic)
			dimensionCriteria = true;

		if (!dimensionCriteria)
			return;

		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(chunkX, 128, chunkZ));
		if ((!matchBiome(biome, LepidodendronConfig.genGlobalBlacklist)) && (!matchBiome(biome, LepidodendronConfig.genNeocalamitesBlacklistBiomes))) {
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SWAMP))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SNOWY))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MUSHROOM))
				biomeCriteria = false;
		}
		if (matchBiome(biome, LepidodendronConfig.genNeocalamitesOverrideBiomes))
			biomeCriteria = true;

		if (biome instanceof BiomePermian) {
			BiomePermian biomePermian = (BiomePermian) biome;
			if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Wetlands
				|| biome == BiomePermianLowlands.biome
				|| biome == BiomePermianLowlandFloodplain.biome
				|| biome == BiomePermianRiver.biome) {
				biomeCriteria = true;
			}
		}

		if (biome instanceof BiomeTriassic) {
			BiomeTriassic biomeTriassic = (BiomeTriassic) biome;
			if (biomeTriassic.getBiomeType() == EnumBiomeTypeTriassic.Cool
				|| biomeTriassic.getBiomeType() == EnumBiomeTypeTriassic.River
				|| biomeTriassic.getBiomeType() == EnumBiomeTypeTriassic.Warm) {
				biomeCriteria = true;
			}
		}
			
		if (!biomeCriteria)
			return;
			
		int GenChance = 3;
		double GenMultiplier = LepidodendronConfig.multiplierNeocalamites;
		if (GenMultiplier < 0) {GenMultiplier = 0;}
		GenChance = Math.min(15, (int) Math.round((double) GenChance * GenMultiplier));
		//Is this a transformed biome?
		if (LepidodendronDecorationHandler.matchBiome(biome, LepidodendronConfig.genTransformBiomes)) {
			//if (biome.getRegistryName().toString().substring(0, biome.getRegistryName().toString().indexOf(":")).equalsIgnoreCase("minecraft"))
				GenChance = 15;
		}
		if (dimID == LepidodendronConfig.dimPermian || dimID == LepidodendronConfig.dimTriassic
		){
			GenChance = 28;
		}
		if (biome == BiomePermianLowlands.biome) {
			GenChance = 42;
		}
		if (biome == BiomePermianLowlandFloodplain.biome) {
			GenChance = 64;
		}

		if (biome == BiomeTriassicRiver.biome
			|| biome == BiomePermianRiver.biome)
		{
			GenChance = 48;
		}

		int maxheight = LepidodendronConfig.maxheightNeocalamites;
		int minheight = LepidodendronConfig.minheightNeocalamites;
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
					for (int i = 0; i < 10; ++i) {
						BlockPos blockpos1 = pos.add(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
						if (world.isAirBlock(blockpos1) && world.isAirBlock(blockpos1.up()) && world.isAirBlock(blockpos1.up(2)) && blockpos1.getY() >= minH && (blockpos1.getY() <= maxH || maxH == 0) ) {
							
							//Prepare a stem if this is in suitable water:
							int colWater = 1;
							while (colWater <= 6 && isWaterBlock(world, blockpos1.down(colWater))) {
					    		colWater = colWater + 1;
					    	}
					    	if ((colWater < 6) && (colWater > 1)) {
					    		//Build the stem:
					    		int counter = 2;
					    		while (counter <= colWater) {
									if (world.getBlockState(blockpos1.down(counter)).getMaterial() == Material.WATER) {
										world.setBlockState(blockpos1.down(counter), BlockNeocalamitesStem.block.getDefaultState(), 2);
									}
					    			counter = counter + 1;
					    		}
					    	}
							int j = 1 + random.nextInt(random.nextInt(9) + 2);
							j = Math.max(3, j);
							int heightCheck = 3;
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
									if (k <= (j - 2)) {
										world.setBlockState(blockpos1.up(k), block.getDefaultState(), 2); 
									}									
									if (k == (j - 1)) {
										world.setBlockState(blockpos1.up(k), BlockNeocalamites2.block.getDefaultState(), 2);
									}
									if (k == j) {
										world.setBlockState(blockpos1.up(k), BlockNeocalamites3.block.getDefaultState(), 2);
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
			setTranslationKey("pf_neocalamites");
			setRegistryName("neocalamites");
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
							|| (worldIn.getBlockState(pos.down()).getMaterial() == Material.WATER
							&& worldIn.getBlockState(pos.down()).getBlock() != this
							&& worldIn.getBlockState(pos.down()).getBlock() != BlockNeocalamitesStem.block
							&& (
							worldIn.getBlockState(pos.down(2)).getMaterial() == Material.GROUND
									|| worldIn.getBlockState(pos.down(2)).getMaterial() == Material.SAND
									|| worldIn.getBlockState(pos.down(2)).getMaterial() == Material.ROCK
									|| worldIn.getBlockState(pos.down(2)).getMaterial() == Material.CLAY
									|| worldIn.getBlockState(pos.down(2)).getMaterial() == Material.GRASS)
					)
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
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	    {
	    	if (worldIn instanceof World ) {
	        	return state.withProperty(WATER, isWaterBlock((World) worldIn, pos.down()));
	    	}
	        else {
	        	return state;
	        }
	    }

	    @Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			if (getActualState(state, source, pos).getValue(WATER)) {
				return new AxisAlignedBB(0D, -1D, 0D, 1D, 1D, 1D);
			}
			return new AxisAlignedBB(0D, 0D, 0D, 1D, 1D, 1D);
		}

	    @Override
	    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
			//Check for a stem underneath:
			if (worldIn.getBlockState(pos.down(2)).getBlock() == BlockNeocalamitesStem.block) {
				worldIn.destroyBlock(pos.down(2), true);
			}
			if ((worldIn.getBlockState(pos.up()).getBlock() == this)
				|| (worldIn.getBlockState(pos.up()).getBlock() == BlockNeocalamites2.block)
				|| (worldIn.getBlockState(pos.up()).getBlock() == BlockNeocalamites3.block))
			{
				worldIn.destroyBlock(pos.up(), true);
			}
	    	super.breakBlock(worldIn, pos, state);
	    }

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(ItemNeocalamitesItem.block, (int) (1));
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			if (LepidodendronConfig.doPropagation) {
				drops.add(new ItemStack(Blocks.AIR, (int) (1)));
			}
			else {
				drops.add(new ItemStack(ItemNeocalamitesItem.block, (int) (1)));
			}
		}

		@Override
		protected boolean canSilkHarvest()
	    {
	        return false;
	    }

		@Override
		public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
			return EnumPlantType.Beach;
		}

		public boolean canSustainPlantRevised(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, net.minecraftforge.common.IPlantable plantable)
		{
			boolean waterCheck = false;
			if (world instanceof World) {
				if (isWaterBlock((World) world, pos.north())) {waterCheck = true;}
				if (isWaterBlock((World) world, pos.south())) {waterCheck = true;}
				if (isWaterBlock((World) world, pos.east())) {waterCheck = true;}
				if (isWaterBlock((World) world, pos.west())) {waterCheck = true;}
				if (isWaterBlock((World) world, pos.north().east())) {waterCheck = true;}
				if (isWaterBlock((World) world, pos.north().west())) {waterCheck = true;}
				if (isWaterBlock((World) world, pos.south().east())) {waterCheck = true;}
				if (isWaterBlock((World) world, pos.south().west())) {waterCheck = true;}
				if (isWaterBlock((World) world, pos.north(2))) {waterCheck = true;}
				if (isWaterBlock((World) world, pos.south(2))) {waterCheck = true;}
				if (isWaterBlock((World) world, pos.east(2))) {waterCheck = true;}
				if (isWaterBlock((World) world, pos.west(2))) {waterCheck = true;}
			}
			
			if ((direction == EnumFacing.UP) && (waterCheck)
			&& (((world.getBlockState(pos).getMaterial() == Material.SAND)
			|| (world.getBlockState(pos).getMaterial() == Material.GRASS)
			|| (world.getBlockState(pos).getMaterial() == Material.GROUND)
			|| (world.getBlockState(pos).getMaterial() == Material.CLAY)))
			&& (world.getBlockState(pos).getBlockFaceShape(world, pos, EnumFacing.UP) == BlockFaceShape.SOLID))
				return true;
			else {
				return false;
			}
		}
		
		@Override
		public boolean canPlaceBlockAt(World world, BlockPos pos) {
			Block block2 = world.getBlockState(pos.down()).getBlock();
			boolean canPlace = canSustainPlantRevised(world.getBlockState(pos.down()), world, pos.down(), EnumFacing.UP, this);
			boolean canPlace2 = false;
			Block block3 = world.getBlockState(pos.down(2)).getBlock();
			if ((canSustainPlantRevised(world.getBlockState(pos.down(2)), world, pos.down(2), EnumFacing.UP, this)
				&& (isWaterBlock(world, pos.down()))) || block3 == BlockNeocalamitesStem.block) {
					canPlace2 = true;
				}
			return (canPlace || canPlace2 || block2 == block);
		}

		@SideOnly(Side.CLIENT)
		public int colorMultiplier(IBlockAccess p_149720_1_, BlockPos pos, int pass) {
			return 16777215;
		}

		public boolean checkForDropRevised(World worldIn, BlockPos pos, IBlockState state)
	    {
	        if (canPlaceBlockAt(worldIn, pos))
	        {
	            return true;
	        }
	        else
	        {
	            this.dropBlockAsItem(worldIn, pos, state, 0);
	            worldIn.setBlockToAir(pos);
	            return false;
	        }
	    }

	    public IBlockState getStateFromMeta(int meta) {
			return this.getDefaultState();
		}
		
	    public int getMetaFromState(IBlockState state) {
			return 0;
		}

		protected BlockStateContainer createBlockState()
	    {
	        return new BlockStateContainer(this, new IProperty[] {AGE, WATER});
	    }

		@Override
		public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
			if (world.getBlockState(pos.down()).getBlock() == block || checkForDropRevised(world, pos, state)) {
				if (world.isAirBlock(pos.up())) {
					world.setBlockState(pos.up(), BlockNeocalamites2.block.getDefaultState(), 2);
				}
				if ((world.isAirBlock(pos.up(2))) && (world.getBlockState(pos.up()).getBlock() == BlockNeocalamites2.block)) {
					world.setBlockState(pos.up(2), BlockNeocalamites3.block.getDefaultState(), 2);
				}
				else {
					if ((world.isAirBlock(pos.up(3))) && ((world.getBlockState(pos.up())).getBlock() == BlockNeocalamites2.block)
						&& ((world.getBlockState(pos.up(2))).getBlock() == BlockNeocalamites3.block)) {
						int l;
						for (l = 1; world.getBlockState(pos.down(l)).getBlock() == this; ++l);
						if (l < 9) {
							int i1 = (Integer) state.getValue(AGE);
							if (i1 == 15) {
								//world.setBlockToAir(pos.up(2));
								world.setBlockState(pos.up(), this.getDefaultState());
								world.setBlockState(pos, state.withProperty(AGE, 0), 4);
								//if (world.isAirBlock(pos.up(2))) {
									world.setBlockState(pos.up(2), BlockNeocalamites2.block.getDefaultState(), 2);
								//}
								//if (world.isAirBlock(pos.up(3))) {
									world.setBlockState(pos.up(3), BlockNeocalamites3.block.getDefaultState(), 2);
								//}
							} else {
								world.setBlockState(pos, state.withProperty(AGE, i1 + 1), 4);
							}
						}
					}
				}
			}
		}

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			if (fromPos.getY() == pos.getY()-1) {
				world.scheduleUpdate(pos, this, 1);
			}
		}

	    @SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Horsetail shrub");
	        tooltip.add("Periods: late Carboniferous - Permian - early Triassic");
	        tooltip.add("Note: Can be planted in water or on land");
	        tooltip.add("Propagation: spores");}
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
        String[] var2 = biomesList;
        int var3 = biomesList.length;
        for(int var4 = 0; var4 < var3; ++var4) {
            String checkBiome = var2[var4];
            if (!checkBiome.contains(":")) {
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

    public static boolean isWaterBlock(World world, BlockPos pos) {
		if (world.getBlockState(pos).getMaterial() == Material.WATER) {
			//IBlockState iblockstate = world.getBlockState(pos);
			//if (((Integer)iblockstate.getValue(BlockLiquid.LEVEL)).intValue() == 0) {
				return true;
			//}
		}
    	return false;
    }
	
}

