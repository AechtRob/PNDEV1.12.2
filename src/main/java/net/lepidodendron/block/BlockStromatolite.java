
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.lepidodendron.item.armor.ArmorInit;
import net.lepidodendron.util.*;
import net.lepidodendron.world.biome.cambrian.BiomeCambrian;
import net.lepidodendron.world.biome.cretaceous.BiomeCretaceousEarly;
import net.lepidodendron.world.biome.jurassic.BiomeJurassic;
import net.lepidodendron.world.biome.ordovician.BiomeOrdovician;
import net.lepidodendron.world.biome.precambrian.BiomePrecambrian;
import net.lepidodendron.world.biome.silurian.BiomeSilurian;
import net.lepidodendron.world.biome.triassic.BiomeTriassic;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
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
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;


@ElementsLepidodendronMod.ModElement.Tag
public class BlockStromatolite extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:stromatolite")
	public static final Block block = null;
	public BlockStromatolite(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.stromatolite);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("stromatolite"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
			new ModelResourceLocation("lepidodendron:stromatolite", "inventory"));
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		
		boolean dimensionCriteria = false;
		if (shouldGenerateInDimension(dimID, LepidodendronConfigPlants.dimStromatolite))
			dimensionCriteria = true;
		if (dimID == LepidodendronConfig.dimOrdovician || dimID == LepidodendronConfig.dimSilurian
				|| dimID == LepidodendronConfig.dimCambrian
				|| dimID == LepidodendronConfig.dimTriassic
				|| dimID == LepidodendronConfig.dimPrecambrian) {
			dimensionCriteria = true;
		}
		if (!dimensionCriteria)
			return;

		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(chunkX + 16, 0, chunkZ + 16));
		if (!matchBiome(biome, LepidodendronConfigPlants.genStromatoliteBlacklistBiomes)) {
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.OCEAN))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.BEACH))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.VOID))
				biomeCriteria = false;
		}
		if (matchBiome(biome, LepidodendronConfigPlants.genStromatoliteOverrideBiomes))
			biomeCriteria = true;

		if (biome instanceof BiomePrecambrian) {
			BiomePrecambrian biomePrecambrian = (BiomePrecambrian) biome;
			if (biomePrecambrian.getBiomeType() == EnumBiomeTypePrecambrian.Hadean
					|| biomePrecambrian.getBiomeType() == EnumBiomeTypePrecambrian.Proterozoic_Land
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:archean_shallow_sea")
			) {
				biomeCriteria = false;
			}
			else {
				if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.OCEAN))
					biomeCriteria = true;
			}
		}

		if (biome instanceof BiomeCambrian) {
			BiomeCambrian biomeCambrian = (BiomeCambrian) biome;
			if (biomeCambrian.getBiomeType() == EnumBiomeTypeCambrian.Ocean
					|| biomeCambrian.getBiomeType() == EnumBiomeTypeCambrian.Estuary
			) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}

		if (biome instanceof BiomeOrdovician) {
			BiomeOrdovician biomeOrdovician = (BiomeOrdovician) biome;
			if (biomeOrdovician.getBiomeType() == EnumBiomeTypeOrdovician.Ocean
					|| biomeOrdovician.getBiomeType() == EnumBiomeTypeOrdovician.Sponge
					|| biomeOrdovician.getBiomeType() == EnumBiomeTypeOrdovician.Algae
					|| biomeOrdovician.getBiomeType() == EnumBiomeTypeOrdovician.Bryozoan
					|| biomeOrdovician.getBiomeType() == EnumBiomeTypeOrdovician.FrozenOcean
					|| biomeOrdovician.getBiomeType() == EnumBiomeTypeOrdovician.Estuary) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}

		if (biome instanceof BiomeSilurian) {
			BiomeSilurian biomeSilurian = (BiomeSilurian) biome;
			if (biomeSilurian.getBiomeType() == EnumBiomeTypeSilurian.Ocean
					|| biomeSilurian.getBiomeType() == EnumBiomeTypeSilurian.Lagoon
					|| biomeSilurian.getBiomeType() == EnumBiomeTypeSilurian.Crinoid
					|| biomeSilurian.getBiomeType() == EnumBiomeTypeSilurian.Reef
					|| biomeSilurian.getBiomeType() == EnumBiomeTypeSilurian.Coral) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}

		if (biome instanceof BiomeTriassic) {
			BiomeTriassic biomeTriassic = (BiomeTriassic) biome;
			if (biomeTriassic.getBiomeType() == EnumBiomeTypeTriassic.Ocean) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}

		if (biome instanceof BiomeJurassic) {
			BiomeJurassic biomeJurassic = (BiomeJurassic) biome;
			if (biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.Ocean) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}

		if (biome instanceof BiomeCretaceousEarly) {
			BiomeCretaceousEarly biomeCretaceousEarly = (BiomeCretaceousEarly) biome;
			if (biomeCretaceousEarly.getBiomeType() == EnumBiomeTypeCretaceousEarly.Early_Cretaceous_Ocean
					|| biomeCretaceousEarly.getBiomeType() == EnumBiomeTypeCretaceousEarly.Early_Cretaceous_Ocean_Shore_Atlantic
					|| biomeCretaceousEarly.getBiomeType() == EnumBiomeTypeCretaceousEarly.Early_Cretaceous_Ocean_Shore_Pacific
					|| biomeCretaceousEarly.getBiomeType() == EnumBiomeTypeCretaceousEarly.Early_Cretaceous_Ocean_Shore_Southern
					|| biomeCretaceousEarly.getBiomeType() == EnumBiomeTypeCretaceousEarly.Early_Cretaceous_Ocean_Shore_Tethys
					|| biomeCretaceousEarly.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_inland_sea_australia")) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}

		if (!biomeCriteria)
			return;

		double chanceGirvanella = 1.0;
		double genChance = 0.99;
		if (biome instanceof BiomePrecambrian) {
			BiomePrecambrian biomePrecambrian = (BiomePrecambrian) biome;
			if (biomePrecambrian.getBiomeType() == EnumBiomeTypePrecambrian.Archean
					|| biomePrecambrian.getBiomeType() == EnumBiomeTypePrecambrian.Hadean
					|| biomePrecambrian.getBiomeType() == EnumBiomeTypePrecambrian.Proterozoic_Land
					|| biomePrecambrian.getBiomeType() == EnumBiomeTypePrecambrian.Paleoproterozoic
			) {
				chanceGirvanella = 0.2;
			}
		}
		if (dimID == LepidodendronConfig.dimOrdovician || dimID == LepidodendronConfig.dimSilurian
				|| dimID == LepidodendronConfig.dimDevonian || dimID == LepidodendronConfig.dimCarboniferous
				|| dimID == LepidodendronConfig.dimPermian) {
			genChance = 0.65;
			chanceGirvanella = 0.3;
		}
		if (dimID == LepidodendronConfig.dimCambrian) {
			genChance = 0.8;
			chanceGirvanella = 0.0;
		}
		if (dimID == LepidodendronConfig.dimTriassic) {
			genChance = 0.15;
			chanceGirvanella = 0.55;
		}
		if (dimID == LepidodendronConfig.dimJurassic
				|| dimID == LepidodendronConfig.dimCretaceousEarly
				|| dimID == LepidodendronConfig.dimCretaceousLate) {
			genChance = 0.95;
			chanceGirvanella = 0.75;
		}
		if (dimID == LepidodendronConfig.dimPaleogene) {
			genChance = 0.95;
			chanceGirvanella = 0.93;
		}
		if (dimID == LepidodendronConfig.dimNeogene
				|| dimID == LepidodendronConfig.dimPleistocene) {
			genChance = 0.95;
			chanceGirvanella = 1.0;
		}
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:archean_tide_pools")) {
			genChance = 0.00;
			chanceGirvanella = 1.0;
		}
		
		if (Math.random() > genChance) {
			double girvanella = chanceGirvanella;
			for (int i = 0; i < 10; i++) {
				int l6 = chunkX + random.nextInt(16) + 8;
				int i11 = random.nextInt(128);
				int l14 = chunkZ + random.nextInt(16) + 8;

				(new WorldGenReed() {
					@Override
					public boolean generate(World world, Random random, BlockPos pos) {
						int c = 14;
						for (int i = 0; i < c; ++i) {
							BlockPos blockpos1 = pos.add(random.nextInt(6) - random.nextInt(6), 0, random.nextInt(6) - random.nextInt(6));
							//BlockPos blockpos2 = blockpos1.down();
							int j = random.nextInt(3) + 1;
							j = Math.min(3, j);
							for (int k = 0; k < j; ++k) {
								//System.err.println("SeaLavel: " + (Functions.getAdjustedSeaLevel(world, new BlockPos(chunkX, 0, chunkZ))));
								//System.err.println("Try to spawn at: "  + blockpos1.up(k).getY());
								if (
									//((world.isAirBlock(blockpos1.down()) || ((BlockFalling) block).canFallThrough(world.getBlockState(blockpos1.down()))) && blockpos1.getY() >= 0)
									//&& ((world.isAirBlock(blockpos1.up(k).down()) || ((BlockFalling) block).canFallThrough(world.getBlockState(blockpos1.up(k).down()))) && blockpos1.up(k).getY() >= 0)
										((world.getBlockState(blockpos1.down()).getMaterial() == Material.SAND)
												|| (world.getBlockState(blockpos1.down()).getMaterial() == Material.ROCK)
												|| (world.getBlockState(blockpos1.down()).getBlock() == block))
												&& ((world.getBlockState(blockpos1.up(k).down()).getMaterial() == Material.SAND)
												|| (world.getBlockState(blockpos1.up(k).down()).getMaterial() == Material.ROCK)
												|| (world.getBlockState(blockpos1.up(k).down()).getBlock() == block))
												&& (blockpos1.up(k).getY() >= (Functions.getAdjustedSeaLevel(world, new BlockPos(chunkX, 0, chunkZ)) - 5))
												&& (blockpos1.up(k).getY() < (Functions.getAdjustedSeaLevel(world, new BlockPos(chunkX, 0, chunkZ)))
													|| (blockpos1.up(k).getY() <= Functions.getAdjustedSeaLevel(world, new BlockPos(chunkX, 0, chunkZ)) &&
														(BiomeDictionary.hasType(biome, BiomeDictionary.Type.OCEAN)
														|| BiomeDictionary.hasType(biome, BiomeDictionary.Type.BEACH))
													)
												)
												&& ((world.isAirBlock(blockpos1.up(k)))
												|| (world.getBlockState(blockpos1.up(k)).getMaterial() == Material.WATER))
												&&
												!((world.getBlockState(blockpos1.up(k).down()).getBlock() == block)
														&& blockpos1.up(k).getY() == (Functions.getAdjustedSeaLevel(world, new BlockPos(chunkX, 0, chunkZ))))
								) {
									world.setBlockState(blockpos1.up(k), block.getDefaultState(), 2);
									if (Math.random() > girvanella) {
										//Code to generate Girvanella here:
										PropertyDirection FACING = BlockDirectional.FACING;
										int yct = -1;
										while (yct <= 1) {
											int xct = -3;
											while (xct <= 3) {
												int zct = -3;
												while (zct <= 3) {
													BlockPos pos1 = blockpos1.up(k).add(xct, yct, zct);
													//System.err.println("Testing block: " + pos1.getX() + " " + pos1.getY() + " " + pos1.getZ());
													if ((world.getBlockState(pos1).getBlock() == Blocks.WATER || (world.getBlockState(pos1).getBlock() == Blocks.FLOWING_WATER))
															&& (world.getBlockState(pos1.up()).getBlock() == Blocks.WATER || (world.getBlockState(pos1.up()).getBlock() == Blocks.FLOWING_WATER))) {
														//System.err.println("Block is water: " + pos1.getX() + " " + pos1.getY() + " " + pos1.getZ());
														//figure out a position and facing to place this at!
														//First try regular uprights and then the rotations:
														if ((((Math.random() > 0.98) && world.getBlockState(pos1.down()).getBlockFaceShape(world, pos1.down(), EnumFacing.UP) == BlockFaceShape.SOLID)
																&& (world.getBlockState(pos1.down()).getBlock()) != BlockStromatolite.block)) {
															Functions.setBlockStateAndCheckForDoublePlant(world,pos1, BlockGirvanella.block.getDefaultState().withProperty(FACING, EnumFacing.UP));
														} else {
															for (EnumFacing enumfacing1 : FACING.getAllowedValues()) {
																BlockPos pos2 = pos1;
																if (enumfacing1 == EnumFacing.NORTH) {
																	pos2 = pos1.add(0, 0, 1);
																}
																if (enumfacing1 == EnumFacing.SOUTH) {
																	pos2 = pos1.add(0, 0, -1);
																}
																if (enumfacing1 == EnumFacing.EAST) {
																	pos2 = pos1.add(-1, 0, 0);
																}
																if (enumfacing1 == EnumFacing.WEST) {
																	pos2 = pos1.add(1, 0, 0);
																}

																//System.err.println("Block at " + pos2.getX() + " "  + pos2.getY() + " " + pos2.getZ() + " : " + worldIn.getBlockState(pos2).getBlock());

																if ((Math.random() > 0.98) && enumfacing1 != EnumFacing.UP && enumfacing1 != EnumFacing.DOWN &&
																		((world.getBlockState(pos2).getBlockFaceShape(world, pos2, enumfacing1) == BlockFaceShape.SOLID)
																				||
																				(world.getBlockState(pos2).getBlock()) == BlockStromatolite.block)) {
																	Functions.setBlockStateAndCheckForDoublePlant(world,pos1, BlockGirvanella.block.getDefaultState().withProperty(FACING, enumfacing1), 3);
																	//System.err.println("Block at " + pos1.getX() + " "  + pos1.getY() + " " + pos1.getZ());
																	break;
																}
															}
														}
													}
													zct += 1;
												}
												xct += 1;
											}
											yct += 1;
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
	}

	public static final PropertyBool TOPSHOOT = PropertyBool.create("topshoot");
	public static final PropertyBool NORTH = PropertyBool.create("north");
	public static final PropertyBool SOUTH = PropertyBool.create("south");
	public static final PropertyBool EAST = PropertyBool.create("east");
	public static final PropertyBool WEST = PropertyBool.create("west");
	
	public static class BlockCustom extends BlockFalling implements IAdvancementGranter {
		public BlockCustom() {
			super(Material.ROCK);
			setTranslationKey("pf_stromatolite");
			setSoundType(SoundType.STONE);
			setHarvestLevel("pickaxe", 1);
			setHardness(1.5F);
			setResistance(6F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabLepidodendronMisc.tab);
			setDefaultSlipperiness(0.7f);
			useNeighborBrightness = true;
			this.setDefaultState(this.blockState.getBaseState().withProperty(NORTH, false).withProperty(SOUTH, false).withProperty(EAST, false).withProperty(WEST, false).withProperty(TOPSHOOT, true));
		}

		@Override
		public float getSlipperiness(IBlockState state, IBlockAccess world, BlockPos pos, @Nullable Entity entity) {
			if (entity != null) {
				if (entity instanceof EntityPlayer) {
					EntityPlayer player = (EntityPlayer) entity;
					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET) != ItemStack.EMPTY) {
						if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ArmorInit.RUBBER_BOOTS) {
							return 0.6F;
						}
					}
				}
			}
			return super.getSlipperiness(state, world, pos, entity);
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_STROMATOLITE;
		}

		@Override
		public boolean isFullBlock(IBlockState state) {
			return true;
		}

		@Override
		@SideOnly(Side.CLIENT)
		public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
		{
		}
		
		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			drops.add(new ItemStack(Blocks.GRAVEL, (int) (1)));
		}

		@Override
		protected boolean canSilkHarvest()
	    {
	        return true;
	    }

		public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
	    {
	        return BlockFaceShape.SOLID;
	    }

		//@Override
		//public boolean isOpaqueCube(IBlockState state) {
		//	return false;
		//}

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

	    protected BlockStateContainer createBlockState()
	    {
	        return new BlockStateContainer(this, new IProperty[] {TOPSHOOT, NORTH, SOUTH, EAST, WEST});
	    }

	    @Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos){

			if (worldIn.getBlockState(pos).getBlock() != this) {
				return state;
			}
			boolean boolNorth = false;
			boolean boolSouth = false;
			boolean boolEast = false;
			boolean boolWest = false;

			if (((worldIn.getBlockState(pos.north()).getBlock() == this)
					|| (worldIn.getBlockState(pos.north()).getBlock() == BlockStromatoliteSticky.block)
					|| worldIn.getBlockState(pos.north()).isFullCube()
					|| worldIn.getBlockState(pos.north()).isOpaqueCube())
				&& ((!worldIn.getBlockState(pos.north()).getMaterial().isLiquid()))
				&& ((!worldIn.isAirBlock(pos.north())))) {
				boolNorth = true;
			}
			if (((worldIn.getBlockState(pos.south()).getBlock() == this)
					|| (worldIn.getBlockState(pos.south()).getBlock() == BlockStromatoliteSticky.block)
					|| worldIn.getBlockState(pos.south()).isFullCube()
					|| worldIn.getBlockState(pos.south()).isOpaqueCube())
					&& ((!worldIn.getBlockState(pos.south()).getMaterial().isLiquid()))
					&& ((!worldIn.isAirBlock(pos.south())))) {
				boolSouth = true;
			}
			if (((worldIn.getBlockState(pos.east()).getBlock() == this)
					|| (worldIn.getBlockState(pos.east()).getBlock() == BlockStromatoliteSticky.block)
					|| worldIn.getBlockState(pos.east()).isFullCube()
					|| worldIn.getBlockState(pos.east()).isOpaqueCube())
					&& ((!worldIn.getBlockState(pos.east()).getMaterial().isLiquid()))
					&& ((!worldIn.isAirBlock(pos.east())))) {
				boolEast = true;
			}
			if (((worldIn.getBlockState(pos.west()).getBlock() == this)
					|| (worldIn.getBlockState(pos.west()).getBlock() == BlockStromatoliteSticky.block)
					|| worldIn.getBlockState(pos.west()).isFullCube()
					|| worldIn.getBlockState(pos.west()).isOpaqueCube())
					&& ((!worldIn.getBlockState(pos.west()).getMaterial().isLiquid()))
					&& ((!worldIn.isAirBlock(pos.west())))) {
				boolWest = true;
			}

			return state.withProperty(NORTH, boolNorth).withProperty(SOUTH, boolSouth).withProperty(EAST, boolEast).withProperty(WEST, boolWest).withProperty(TOPSHOOT, (worldIn.getBlockState(pos.up()).getBlock() != this && worldIn.getBlockState(pos.up()).getBlock() != BlockStromatoliteSticky.block));
		}

		//Trigger state change block face geometry updates to attached blocks:
		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			world.setBlockState(pos, state.withProperty(TOPSHOOT,getActualState(state, world, pos).getValue(TOPSHOOT)), 3);
		}

		public IBlockState getStateFromMeta(int meta)
	    {
	        return this.getDefaultState();
	    }

	    public int getMetaFromState(IBlockState state)
	    {
	        return 0;
	    }

		@SideOnly(Side.CLIENT)
		@Override
		public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
			if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Microbial formation");
				tooltip.add("Periods: Archean - Paleoproterozoic - Mesoproterozoic (Calymmian - Ectasian - Stenian) - Neoproterozoic (Tonian - Cryogenian - Ediacaran) - Cambrian - Ordovician - Silurian - Devonian - Carboniferous - Permian - Triassic - Jurassic - Cretaceous - Paleogene - Neogene - Pleistocene - present");
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
