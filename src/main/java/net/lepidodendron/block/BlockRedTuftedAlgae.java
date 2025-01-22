
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
import net.lepidodendron.world.biome.ordovician.BiomeOrdovician;
import net.lepidodendron.world.biome.permian.BiomePermian;
import net.lepidodendron.world.biome.silurian.BiomeSilurian;
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
public class BlockRedTuftedAlgae extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:red_tufted_algae")
	public static final Block block = null;
	public BlockRedTuftedAlgae(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.red_tufted_algae);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("itemAlgae", BlockRedTuftedAlgae.block);
		OreDictionary.registerOre("plantdnaPNlepidodendron:red_tufted_algae", BlockRedTuftedAlgae.block);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("red_tufted_algae"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:red_tufted_algae", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockRedTuftedAlgae.LEVEL).build());
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {		
			
		int weight = LepidodendronConfigPlants.weightRedTuftedAlgae;
		if (weight > 100) {weight = 100;}
		if (weight < 0) {weight = 0;}
		if (Math.random() < ((double) (100 - (double) weight)/100)) {
			return;
		}
		
		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(chunkX + 16, 0, chunkZ + 16));
		if (!matchBiome(biome, LepidodendronConfigPlants.genRedTuftedAlgaeBlacklistBiomes)) {
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.OCEAN))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.BEACH))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.VOID))
				biomeCriteria = false;
		}
		if (matchBiome(biome, LepidodendronConfigPlants.genRedTuftedAlgaeOverrideBiomes))
			biomeCriteria = true;

		if ((dimID == LepidodendronConfig.dimCambrian)
				|| (dimID == LepidodendronConfig.dimPrecambrian)) {
			biomeCriteria = false;
		}


		if ((dimID == LepidodendronConfig.dimDevonian)
				 ) {
			biomeCriteria = true;
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
			if (biomeCarb.getBiomeType() == EnumBiomeTypeCarboniferous.Ocean
					|| biomeCarb.getBiomeType() == EnumBiomeTypeCarboniferous.Bay) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}
		if (biome instanceof BiomeTriassic)
		{
			BiomeTriassic biomeTri = (BiomeTriassic) biome;
			if (biomeTri.getBiomeType() == EnumBiomeTypeTriassic.Ocean) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}
		if (biome instanceof BiomeJurassic)
		{
			BiomeJurassic biomeJurassic = (BiomeJurassic) biome;
			if (biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.Ocean) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}



		if (biome instanceof BiomeCretaceousEarly)
		{
			BiomeCretaceousEarly biomeCretaceousEarly = (BiomeCretaceousEarly)biome;
			if (biomeCretaceousEarly.getBiomeType() == EnumBiomeTypeCretaceousEarly.Early_Cretaceous_Ocean
					|| biomeCretaceousEarly.getBiomeType() == EnumBiomeTypeCretaceousEarly.Early_Cretaceous_Ocean_Shore_Atlantic
					|| biomeCretaceousEarly.getBiomeType() == EnumBiomeTypeCretaceousEarly.Early_Cretaceous_Ocean_Shore_Pacific
					|| biomeCretaceousEarly.getBiomeType() == EnumBiomeTypeCretaceousEarly.Early_Cretaceous_Ocean_Shore_Southern
					|| biomeCretaceousEarly.getBiomeType() == EnumBiomeTypeCretaceousEarly.Early_Cretaceous_Ocean_Shore_Tethys
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_beach_europe")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_beach_australia_antarctica")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_inland_sea_australia")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_beach_australia_antarctica_inland_sea")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_beach_africa")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_beach_asia")) {
				biomeCriteria = true;
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
		) {
			multiplier = 2;
		}
		if (dimID == LepidodendronConfig.dimOrdovician)
		{
			multiplier = 4;
		}
		if ((dimID == LepidodendronConfig.dimCambrian))
		{
			multiplier = 1;
		}
		if ((dimID == LepidodendronConfig.dimCarboniferous))
		{
			multiplier = 5;
		}

		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_ice")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_icebergs")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_shore_frozen")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_beach_frozen")
		)
			multiplier = 24;

		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_algal_reef")
		)
			multiplier = 48;

		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_ocean_reef")
		)
			multiplier = 12;

		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_ocean_clam_beds")
		)
			multiplier = 24;

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
			setTranslationKey("pf_red_tufted_algae");
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
			return ModTriggers.CLICK_ALGAE_RED;
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
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			switch ((EnumFacing) state.getValue(BlockDirectional.FACING)) {
				case SOUTH :
				default :
					return new AxisAlignedBB(0.3D, 0D, 0D, 0.7D, 1.0D, 1.0D);
				case NORTH :
					return new AxisAlignedBB(0.3D, 0D, 0D, 0.7D, 1D, 01.0D);
				case WEST :
					return new AxisAlignedBB(0D, 0D, 0.3D, 1D, 1D, 0.7D);
				case EAST :
					return new AxisAlignedBB(0D, 0D, 0.3D, 1D, 1D, 0.7D);
				case UP :
					return new AxisAlignedBB(0.0D, 0D, 0D, 1.0D, 1.0D, 1.0D);
				case DOWN :
					return new AxisAlignedBB(0.0D, 0D, 0D, 1.0D, 1.0D, 1.0D);
			}
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
				worldIn.destroyBlock(pos, false);
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
							worldIn.destroyBlock(pos, false);
							
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
							worldIn.destroyBlock(pos, false);
							
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
							worldIn.destroyBlock(pos, false);
							
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
							worldIn.destroyBlock(pos, false);
							
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
							worldIn.destroyBlock(pos, false);
							
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
							worldIn.destroyBlock(pos, false);
							
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

			
			return (blockface && canPlaceBlockAt(worldIn, pos));
			
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
				tooltip.add("Type: Marine Algae");
	        	tooltip.add("Periods: [Cambrian -] Ordovician - Silurian - Devonian - Carboniferous - Permian - Triassic - Jurassic - Cretaceous - Paleogene - Neogene - Pleistocene - present");
	        	tooltip.add("Propagation: water");}
	        super.addInformation(stack, player, tooltip, advanced);
	    }

	}
}
