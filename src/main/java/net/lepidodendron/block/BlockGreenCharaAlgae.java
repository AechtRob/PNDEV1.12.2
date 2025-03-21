
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.util.*;
import net.lepidodendron.world.biome.carboniferous.BiomeCarboniferous;
import net.lepidodendron.world.biome.cretaceous.BiomeCretaceousEarly;
import net.lepidodendron.world.biome.devonian.BiomeDevonian;
import net.lepidodendron.world.biome.jurassic.BiomeJurassic;
import net.lepidodendron.world.biome.permian.BiomePermian;
import net.lepidodendron.world.biome.triassic.BiomeTriassic;
import net.lepidodendron.world.gen.AlgaeGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
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
public class BlockGreenCharaAlgae extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:green_chara_algae")
	public static final Block block = null;
	public BlockGreenCharaAlgae(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.green_chara_algae);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("itemAlgae", BlockGreenCharaAlgae.block);
		OreDictionary.registerOre("plantdnaPNlepidodendron:green_chara_algae", BlockGreenCharaAlgae.block);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("green_chara_algae"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:green_chara_algae", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockGreenCharaAlgae.LEVEL).build());
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {		
		
		int weight = LepidodendronConfigPlants.weightGreenCharaAlgae;
		if (weight > 100) {weight = 100;}
		if (weight < 0) {weight = 0;}
		if (Math.random() < ((double) (100 - (double) weight)/100)) {
			return;
		}
		
		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(chunkX + 16, 0, chunkZ + 16));
		if (!matchBiome(biome, LepidodendronConfigPlants.genGreenCharaAlgaeBlacklistBiomes)) {
			biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.OCEAN))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.BEACH))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.VOID))
				biomeCriteria = false;
		}
		if (matchBiome(biome, LepidodendronConfigPlants.genGreenCharaAlgaeOverrideBiomes))
			biomeCriteria = true;
		if ((dimID == LepidodendronConfig.dimCambrian)
			|| (dimID == LepidodendronConfig.dimPrecambrian)
				|| (dimID == LepidodendronConfig.dimOrdovician) ){
			biomeCriteria = false;
		}

		if (biome instanceof BiomeDevonian)
		{
			BiomeDevonian biomeDevonian = (BiomeDevonian) biome;
			if ( biomeDevonian.getBiomeType() == EnumBiomeTypeDevonian.Ocean
					|| biomeDevonian.getBiomeType() == EnumBiomeTypeDevonian.Hypersaline) {
				biomeCriteria = false;
			}
			else {
				biomeCriteria = true;
			}
		}
		if (biome instanceof BiomeCarboniferous)
		{
			BiomeCarboniferous biomeCarboniferous = (BiomeCarboniferous) biome;
			if (biomeCarboniferous.getBiomeType() == EnumBiomeTypeCarboniferous.Ocean
				|| biomeCarboniferous.getBiomeType() == EnumBiomeTypeCarboniferous.Bay) {
				biomeCriteria = false;
			}
			else {
				biomeCriteria = true;
			}
		}
		if (biome instanceof BiomePermian)
		{
			BiomePermian biomePermian = (BiomePermian) biome;
			if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Ocean) {
				biomeCriteria = false;
			}
			else {
				biomeCriteria = true;
			}
		}
		if (biome instanceof BiomeTriassic)
		{
			BiomeTriassic biomeTriassic = (BiomeTriassic) biome;
			if (biomeTriassic.getBiomeType() == EnumBiomeTypeTriassic.Ocean) {
				biomeCriteria = false;
			}
			else {
				biomeCriteria = true;
			}
		}
		if (biome instanceof BiomeJurassic)
		{
			BiomeJurassic biomeJurassic = (BiomeJurassic) biome;
			if (biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.Ocean
					|| biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.IslandWhite) {
				biomeCriteria = false;
			}
			else {
				biomeCriteria = true;
			}
		}

		if (biome instanceof BiomeCretaceousEarly)
		{
			BiomeCretaceousEarly biomeCretaceousEarly = (BiomeCretaceousEarly)biome;
			if (biomeCretaceousEarly.getBiomeType() == EnumBiomeTypeCretaceousEarly.Early_Cretaceous_Euro_America) {
				if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_beach_europe")) {
					biomeCriteria = false;
				}
				else {
					biomeCriteria = true;
				}
			}
			else if (biomeCretaceousEarly.getBiomeType() == EnumBiomeTypeCretaceousEarly.Early_Cretaceous_Austro_Antarctica) {
				if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_beach_australia_antarctica")
						|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_beach_australia_antarctica_inland_sea")
						|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_inland_sea_australia")) {
					biomeCriteria = false;
				}
				else {
					biomeCriteria = true;
				}
			}
			else if (biomeCretaceousEarly.getBiomeType() == EnumBiomeTypeCretaceousEarly.Early_Cretaceous_Afro_America) {
				if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_beach_africa")) {
					biomeCriteria = false;
				}
				else {
					biomeCriteria = true;
				}
			}
			else if (biomeCretaceousEarly.getBiomeType() == EnumBiomeTypeCretaceousEarly.Early_Cretaceous_Asia) {
				if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_beach_asia")) {
					biomeCriteria = false;
				}
				else {
					biomeCriteria = true;
				}
			}
			else {
				biomeCriteria = false;
			}
		}

		if (!biomeCriteria)
			return;

		int multiplier = 1;
		if ((dimID == LepidodendronConfig.dimDevonian)
				|| (dimID == LepidodendronConfig.dimSilurian)
				|| (dimID == LepidodendronConfig.dimPermian)
				|| (dimID == LepidodendronConfig.dimTriassic)
				|| (dimID == LepidodendronConfig.dimJurassic)
		) {
			multiplier = 2;
		}
		if (
				(dimID == LepidodendronConfig.dimCarboniferous)
		) {
			multiplier = 5;
		}

		if (biome instanceof BiomeDevonian)
		{
			multiplier = 12;
		}

		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_flooded_forest"))
		{
			multiplier = 5;
		}

		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_river")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_river")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_river")
		)
		{
			multiplier = 48;
		}

		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_lakes")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_lake_shore")

				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_samerica")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_samerica_desert_spikes")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_south_america_desert")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_samerica_desert_low")
		)
		{
			multiplier = 35;
		}

		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_brackish")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_asia_drooping_swamp")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_asia_drooping_swamp")
		)
			multiplier = 42;

		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_volcanic_tarns_crater_water")
		)
			multiplier = 64;

		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_coastal")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_estuary")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_hills")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_polar")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_marsh")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_swamp")
				
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_coastal")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_coastal_black")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_desert")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_flooded_forest")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_gondwanan_forest")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_gondwanan_plain")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_warm_lakeland")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_xeric")

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
		)
		{
			multiplier = 28;
		}

		for (int i = 0; i < (int) 10 * multiplier; i++) {
			int l6 = chunkX + random.nextInt(16) + 8;
			int i11 = random.nextInt(128);
			int l14 = chunkZ + random.nextInt(16) + 8;
			(new AlgaeGenerator((Block) block)).generate(world, random, new BlockPos(l6, i11, l14));
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
	
	public static class BlockCustom extends Block implements net.minecraftforge.common.IShearable, IAdvancementGranter {
		
		public static final PropertyDirection FACING = BlockDirectional.FACING;
    
		public BlockCustom() {
			super(Material.WATER);
			setTranslationKey("pf_green_chara_algae");
			setSoundType(SoundType.PLANT);
			setHardness(0.0F);
			setResistance(0.0F);
			setLightLevel(0F);
			setLightOpacity(3);
			//this.setTickRandomly(true);
			setCreativeTab(TabLepidodendronPlants.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(LEVEL, 0).withProperty(FACING, EnumFacing.UP));
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_ALGAE_GREEN;
		}
			
		@Override public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos){ return true; }
		
		@Override
		public NonNullList<ItemStack> onSheared(ItemStack item, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
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

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{LEVEL, FACING});
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
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 60;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 30;
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
			return MapColor.FOLIAGE;
		}

		@Override
		public Item getItemDropped(IBlockState state, java.util.Random rand, int fortune) {
			return new ItemStack(Blocks.AIR, (int) (1)).getItem();
		}
		
		@Override
		protected boolean canSilkHarvest()
	    {
	        return false;
	    }

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			world.scheduleUpdate(pos, this, 1);
		}

		@Override
		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) 
		{
			if (!canPlaceBlockAt(worldIn, pos)) {
				worldIn.setBlockToAir(pos);
			}
			else {
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
		}
	
		@Override
	    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
	    {
	        return BlockFaceShape.UNDEFINED;
	    }

		@Override
	    public boolean canBeReplacedByLeaves(IBlockState state, IBlockAccess world, BlockPos pos)
	    {
	        return true;
	    }

	    //@Override
		public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
		{

			//System.err.println("Can place");
			
			if ((isWaterBlock(worldIn, pos)) && (isWaterBlock(worldIn, pos.up()))) {
				return super.canPlaceBlockAt(worldIn, pos); 
			}
			//if (((world.getBlockState(pos.down()).getMaterial() != Material.SAND)
			//	&& (world.getBlockState(pos.down()).getMaterial() != Material.ROCK)
			//	&& (world.getBlockState(pos.down()).getMaterial() != Material.GROUND)
			//	&& (world.getBlockState(pos.down()).getMaterial() != Material.CLAY))) {
			//	return false;
			//}
			return false; 
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

			return (blockface && (side == EnumFacing.UP) && canPlaceBlockAt(worldIn, pos));
			
	    }
		
		@Override
	    public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos)
	    {
	        return true;
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
				tooltip.add("Type: Freshwater Algae");
	        	tooltip.add("Periods: [Silurian -] Devonian - Carboniferous - Permian - Triassic - Jurassic - Early Cretaceous - Late Cretaceous - Paleogene  - Neogene - Pleistocene - Present");
	        	tooltip.add("Propagation: water");}
	        super.addInformation(stack, player, tooltip, advanced);
	    }

	}
}
