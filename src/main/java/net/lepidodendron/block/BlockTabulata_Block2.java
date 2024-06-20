
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.lepidodendron.util.*;
import net.lepidodendron.world.biome.carboniferous.BiomeCarboniferous;
import net.lepidodendron.world.biome.devonian.BiomeDevonian;
import net.lepidodendron.world.biome.permian.BiomePermian;
import net.lepidodendron.world.biome.silurian.BiomeSilurian;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
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
public class BlockTabulata_Block2 extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:tabulata_block_2")
	public static final Block block = null;
	public BlockTabulata_Block2(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.tabulata_block_2);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("tabulata_block_2"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:tabulata_block_2", "inventory"));
		//ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockTabulata_Block1.LEVEL).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("staticdnaPNlepidodendron:tabulata_block_2", BlockTabulata_Block2.block);
		OreDictionary.registerOre("pndietCoral", BlockTabulata_Block2.block);
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {

		boolean dimensionCriteria = false;
		if (shouldGenerateInDimension(dimID, LepidodendronConfigPlants.dimTabulata))
			dimensionCriteria = true;
		if ((dimID == LepidodendronConfig.dimDevonian)
				|| (dimID == LepidodendronConfig.dimSilurian)
				|| (dimID == LepidodendronConfig.dimCarboniferous)
				|| (dimID == LepidodendronConfig.dimPermian)
		) {
			dimensionCriteria = true;
		}
		if (!dimensionCriteria)
			return;

		int weight = LepidodendronConfigPlants.weightTabulata;
		if (weight > 100) {weight = 100;}
		if (weight < 0) {weight = 0;}
		if (dimID == LepidodendronConfig.dimDevonian
				|| dimID == LepidodendronConfig.dimSilurian
				|| dimID == LepidodendronConfig.dimCarboniferous

		)
			weight = 100; //Full scale populations in these dims

		if (Math.random() < ((double) (100 - (double) weight)/100)) {
			return;
		}

		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(chunkX + 16, 0, chunkZ + 16));
		if (!matchBiome(biome, LepidodendronConfigPlants.genTabulataBlacklistBiomes)) {
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.OCEAN))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.BEACH))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.VOID))
				biomeCriteria = false;
		}
		if (matchBiome(biome, LepidodendronConfigPlants.genTabulataOverrideBiomes))
			biomeCriteria = true;

		if (biome instanceof BiomeSilurian)
		{
			BiomeSilurian biomeSilurian = (BiomeSilurian) biome;
			if (biomeSilurian.getBiomeType() == EnumBiomeTypeSilurian.Ocean
					|| biomeSilurian.getBiomeType() == EnumBiomeTypeSilurian.Coral
					|| biomeSilurian.getBiomeType() == EnumBiomeTypeSilurian.Crinoid
					|| biomeSilurian.getBiomeType() == EnumBiomeTypeSilurian.Lagoon
					|| biomeSilurian.getBiomeType() == EnumBiomeTypeSilurian.Reef) {
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
		if (biome instanceof BiomeCarboniferous)
		{
			BiomeCarboniferous biomeCarb = (BiomeCarboniferous) biome;
			if (biomeCarb.getBiomeType() == EnumBiomeTypeCarboniferous.Ocean) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}
		if (biome instanceof BiomeDevonian)
		{
			BiomeDevonian biomeDev = (BiomeDevonian) biome;
			if (biomeDev.getBiomeType() == EnumBiomeTypeDevonian.Ocean) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
			if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean_dead_reef")) {
				biomeCriteria = false;
			}
		}
		if (!biomeCriteria)
			return;

		double multiplier = 1;
		if ((dimID == LepidodendronConfig.dimSilurian)
		) {
			multiplier = 3;
		}
		if ((dimID == LepidodendronConfig.dimDevonian)
				|| (dimID == LepidodendronConfig.dimCarboniferous)
		) {
			multiplier = 2;
		}
		int dimWeight = 1;
		if ((dimID == LepidodendronConfig.dimCarboniferous)
		) {
			dimWeight = 2;
		}
		int minWaterDepth = 2 * dimWeight;
		int maxWaterDepth = 15;
		int startHeight = Functions.getAdjustedSeaLevel(world, new BlockPos(chunkX, 0, chunkZ)) - maxWaterDepth;

		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea_garden")) {
			multiplier = 0.5;
		}

		for (int i = 0; i < (12 * multiplier); i++) {
			int l6 = chunkX + random.nextInt(16) + 8;
			int i11 = random.nextInt(Functions.getAdjustedSeaLevel(world, new BlockPos(chunkX, 0, chunkZ)) - startHeight) + startHeight;
			int l14 = chunkZ + random.nextInt(16) + 8;
			(new WorldGenReed() {
				@Override
				public boolean generate(World world, Random random, BlockPos pos) {
					for (int i = 0; i < 40; ++i) {
						BlockPos blockpos1 = pos.add(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
						if (blockpos1.getY() < Functions.getAdjustedSeaLevel(world, new BlockPos(chunkX, 0, chunkZ))
								&& (Functions.isWater(world, blockpos1))
								&& !world.isAirBlock(blockpos1.north())
								&& !world.isAirBlock(blockpos1.south())
								&& !world.isAirBlock(blockpos1.east())
								&& !world.isAirBlock(blockpos1.west())
						)
						{	boolean waterDepthCheckMax = false;
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

							//figure out a position and facing to place this at!
							//First try regular uprights and then the rotations:
							EnumFacing enumfacing = EnumFacing.UP;
							BlockPos pos1 = blockpos1.down();
							if (waterDepthCheckMin & waterDepthCheckMax) {
								if (((world.getBlockState(pos1).getMaterial() == Material.SAND)
										|| (world.getBlockState(pos1).getMaterial() == Material.ROCK)
										|| (world.getBlockState(pos1).getMaterial() == Material.GROUND)
										|| (world.getBlockState(pos1).getMaterial() == Material.CLAY))
										&& (world.getBlockState(pos1).getBlockFaceShape(world, pos1, EnumFacing.UP) == BlockFaceShape.SOLID)) {
									world.setBlockState(blockpos1, block.getDefaultState().withProperty(BlockTabulata_Block1.BlockCustom.FACING, enumfacing), 2);
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
	
	public static class BlockCustom extends Block implements IAdvancementGranter {
		
		public static final PropertyDirection FACING = BlockDirectional.FACING;
		public static final PropertyBool WATER = PropertyBool.create("water");
    
		public BlockCustom() {
			super(Material.CORAL);
			setTranslationKey("pf_tabulata_block_2");
			setSoundType(SoundType.STONE);
			setHardness(2.0F);
			setResistance(2.0F);
			//setLightLevel(0.5F);
			setLightOpacity(0);
			//this.setTickRandomly(true);
			setCreativeTab(TabLepidodendronMisc.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.UP).withProperty(WATER, false));
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_TABULATA;
		}

		@SideOnly(Side.CLIENT)
		public int getPackedLightmapCoords(IBlockState state, IBlockAccess source, BlockPos pos) {
			int i = source.getCombinedLight(pos, state.getLightValue(source, pos));

			if (i == 0)
			{
				BlockPos pos1 = pos.up();
				state = source.getBlockState(pos1);
				int ii = source.getCombinedLight(pos1, state.getLightValue(source, pos1));
				if (ii == 0) {
					pos1 = pos.down();
					state = source.getBlockState(pos1);
					ii = source.getCombinedLight(pos1, state.getLightValue(source, pos1));
					if (ii == 0) {
						pos1 = pos.north();
						state = source.getBlockState(pos1);
						ii = source.getCombinedLight(pos1, state.getLightValue(source, pos1));
						if (ii == 0) {
							pos1 = pos.east();
							state = source.getBlockState(pos1);
							ii = source.getCombinedLight(pos1, state.getLightValue(source, pos1));
							if (ii == 0) {
								pos1 = pos.south();
								state = source.getBlockState(pos1);
								ii = source.getCombinedLight(pos1, state.getLightValue(source, pos1));
								if (ii == 0) {
									pos1 = pos.west();
									state = source.getBlockState(pos1);
									ii = source.getCombinedLight(pos1, state.getLightValue(source, pos1));
									return ii;
								}
								return ii;
							}
							return ii;
						}
						return ii;
					}
					return ii;
				}
				else {
					return ii;
				}
			}
			else
			{
				return i;
			}
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			return state.withProperty(WATER, (worldIn.getBlockState(pos.offset(state.getValue(FACING))).getMaterial() == Material.WATER));
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
		public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
			return BlockFaceShape.SOLID;
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING, WATER});
		}

		@Override
		public IBlockState withRotation(IBlockState state, Rotation rot) {
			return state.withProperty(FACING, rot.rotate((EnumFacing) state.getValue(FACING)));
		}

		@Override
		public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
			return state.withRotation(mirrorIn.toRotation((EnumFacing) state.getValue(FACING)));
		}

		@Override
		public IBlockState getStateFromMeta(int meta) {
			return this.getDefaultState().withProperty(FACING, EnumFacing.byIndex(meta));
		}

		@Override
		public int getMetaFromState(IBlockState state) {
			return ((EnumFacing) state.getValue(FACING)).getIndex();
		}

		@Override
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta,
				EntityLivingBase placer) {
				return this.getDefaultState().withProperty(FACING, facing);
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return new ItemStack(Blocks.GRAVEL, (int) (1)).getItem();
		}

		@Override
		protected boolean canSilkHarvest() {
			return true;
		}

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			world.scheduleUpdate(pos, this, 1);
		}

		@Override
		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) 
		{
			if (!worldIn.isAreaLoaded(pos, 1)) return; // Forge: prevent loading unloaded chunks when checking neighbor's light

				//Test the orientation of this block and then check if it is still connected:
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.NORTH) {
				IBlockState iblockstate = worldIn.getBlockState(pos.south());
				if (worldIn.isAirBlock(pos.south()) ||
					(
						(iblockstate.getBlockFaceShape(worldIn, pos.south(), EnumFacing.NORTH) != BlockFaceShape.SOLID)
						&& (!iblockstate.getBlock().isLeaves(iblockstate, worldIn, pos.south()))
					)
				)
					{
						worldIn.setBlockToAir(pos);

					}
				}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.SOUTH) {
				IBlockState iblockstate = worldIn.getBlockState(pos.north());
				if (worldIn.isAirBlock(pos.north()) ||
					(
						(iblockstate.getBlockFaceShape(worldIn, pos.north(), EnumFacing.SOUTH) != BlockFaceShape.SOLID)
						&& (!iblockstate.getBlock().isLeaves(iblockstate, worldIn, pos.north()))
					)
				)
					{
						worldIn.setBlockToAir(pos);

					}
				}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.EAST) {
				IBlockState iblockstate = worldIn.getBlockState(pos.west());
				if (worldIn.isAirBlock(pos.west()) ||
					(
						(iblockstate.getBlockFaceShape(worldIn, pos.west(), EnumFacing.EAST) != BlockFaceShape.SOLID)
						&& (!iblockstate.getBlock().isLeaves(iblockstate, worldIn, pos.west()))
					)
				)
					{
						worldIn.setBlockToAir(pos);

					}
				}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.WEST) {
				IBlockState iblockstate = worldIn.getBlockState(pos.east());
				if (worldIn.isAirBlock(pos.east()) ||
					(
						(iblockstate.getBlockFaceShape(worldIn, pos.east(), EnumFacing.WEST) != BlockFaceShape.SOLID)
						&& (!iblockstate.getBlock().isLeaves(iblockstate, worldIn, pos.east()))
					)
				)
					{
						worldIn.setBlockToAir(pos);

					}
				}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.UP) {
				IBlockState iblockstate = worldIn.getBlockState(pos.down());
				if (worldIn.isAirBlock(pos.down()) ||
					(
						(iblockstate.getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) != BlockFaceShape.SOLID)
						&& (!iblockstate.getBlock().isLeaves(iblockstate, worldIn, pos.down()))
					)
				)
					{
						worldIn.setBlockToAir(pos);

					}
				}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.DOWN) {
				IBlockState iblockstate = worldIn.getBlockState(pos.up());
				if (worldIn.isAirBlock(pos.up()) ||
					(
						(iblockstate.getBlockFaceShape(worldIn, pos.up(), EnumFacing.DOWN) != BlockFaceShape.SOLID)
						&& (!iblockstate.getBlock().isLeaves(iblockstate, worldIn, pos.up()))
					)
				)
					{
						worldIn.setBlockToAir(pos);

					}
				}

		}

		@Override
		public boolean canPlaceBlockOnSide(World worldIn, BlockPos pos, EnumFacing side)
	    {
	    	boolean blockface  = true;
			if (side == EnumFacing.NORTH) {
	        	if (worldIn.getBlockState(pos.south()).getBlockFaceShape(worldIn, pos.south(), side) != BlockFaceShape.SOLID)
	        		blockface = false;
			}
			if (side == EnumFacing.SOUTH) {
	        	if (worldIn.getBlockState(pos.north()).getBlockFaceShape(worldIn, pos.north(), side) != BlockFaceShape.SOLID)
	        		blockface = false;
			}
			if (side == EnumFacing.EAST) {
	        	if (worldIn.getBlockState(pos.west()).getBlockFaceShape(worldIn, pos.west(), side) != BlockFaceShape.SOLID)
	        		blockface = false;
			}
			if (side == EnumFacing.WEST) {
	        	if (worldIn.getBlockState(pos.east()).getBlockFaceShape(worldIn, pos.east(), side) != BlockFaceShape.SOLID)
	        		blockface = false;
			}
			if (side == EnumFacing.UP) {
	        	if (worldIn.getBlockState(pos.down()).getBlockFaceShape(worldIn, pos.down(), side) != BlockFaceShape.SOLID)
	        		blockface = false;
			}
			if (side == EnumFacing.DOWN) {
	        	if (worldIn.getBlockState(pos.up()).getBlockFaceShape(worldIn, pos.up(), side) != BlockFaceShape.SOLID)
	        		blockface = false;
			}

			return (blockface && canPlaceBlockAt(worldIn, pos));
			
	    }
	    
	    @SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Tabulate Coral");
				tooltip.add("Periods: [Ordovician -] Silurian - Devonian - Carboniferous - Permian");
			}
	        super.addInformation(stack, player, tooltip, advanced);
	    }

	}
}
