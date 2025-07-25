
package net.lepidodendron.block;

import net.lepidodendron.*;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.block.base.SeedSporeFacingBlockBase;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.util.*;
import net.lepidodendron.world.biome.carboniferous.BiomeCarboniferous;
import net.lepidodendron.world.biome.cretaceous.BiomeCretaceousEarly;
import net.lepidodendron.world.biome.jurassic.BiomeJurassic;
import net.lepidodendron.world.biome.permian.BiomePermian;
import net.lepidodendron.world.biome.triassic.BiomeTriassic;
import net.lepidodendron.world.gen.TmesipterisGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
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
public class BlockTmesipteris extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:tmesipteris")
	public static final Block block = null;
	public BlockTmesipteris(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.tmesipteris);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("tmesipteris"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:tmesipteris", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:tmesipteris", BlockTmesipteris.block);
		OreDictionary.registerOre("plantPrehistoric", BlockTmesipteris.block);
		OreDictionary.registerOre("plant", BlockTmesipteris.block);
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {		
			
		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(chunkX + 15, 0, chunkZ + 15));
		if (!matchBiome(biome, LepidodendronConfigPlants.genTmesipterisBlacklistBiomes)) {
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.JUNGLE))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MUSHROOM))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.VOID))
				biomeCriteria = false;
		}
		if (matchBiome(biome, LepidodendronConfigPlants.genTmesipterisOverrideBiomes))
			biomeCriteria = true;
		if (!LepidodendronConfigPlants.genTmesipteris && (!LepidodendronConfig.genAllPlants) && (!LepidodendronConfig.genAllPlantsModern))
			biomeCriteria = false;

		if (biome instanceof BiomeCarboniferous)
		{
			BiomeCarboniferous biomeCarboniferous = (BiomeCarboniferous) biome;
			if (biomeCarboniferous.getBiomeType() == EnumBiomeTypeCarboniferous.Swamp
					|| biomeCarboniferous.getBiomeType() == EnumBiomeTypeCarboniferous.Estuary
					|| biomeCarboniferous.getBiomeType() == EnumBiomeTypeCarboniferous.Marsh
					|| biomeCarboniferous.getBiomeType() == EnumBiomeTypeCarboniferous.Hills) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}
		
		if (biome instanceof BiomePermian)
		{
			BiomePermian biomePermian = (BiomePermian) biome;
			if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Ocean
				|| biomePermian.getBiomeType() == EnumBiomeTypePermian.Wetlands
				|| biomePermian.getBiomeType() == EnumBiomeTypePermian.Lowlands
				|| biomePermian.getBiomeType() == EnumBiomeTypePermian.Forest) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}
		if (biome instanceof BiomeTriassic)
		{
			BiomeTriassic biomeTriassic = (BiomeTriassic) biome;
			if (biomeTriassic.getBiomeType() == EnumBiomeTypeTriassic.CentralAfricaIndia
				|| biomeTriassic.getBiomeType() == EnumBiomeTypeTriassic.Europe
				|| biomeTriassic.getBiomeType() == EnumBiomeTypeTriassic.USAGreenland
				|| biomeTriassic.getBiomeType() == EnumBiomeTypeTriassic.China
				|| biomeTriassic.getBiomeType() == EnumBiomeTypeTriassic.River) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}
		if (biome instanceof BiomeJurassic)
		{
			BiomeJurassic biomeJurassic = (BiomeJurassic) biome;
			if (biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.Floodplain
				|| biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.Forest
				|| biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.IslandRock) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}

		if (biome instanceof BiomeCretaceousEarly)
		{
			BiomeCretaceousEarly biomeCretaceousEarly = (BiomeCretaceousEarly) biome;
			if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_africa_swamp")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_africa_swamp_open")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_africa_swamp")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_south_america_creek_wide")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_south_america_creek_wide_centre")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_south_america_patagonia")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_south_america_patagonia")) {
				biomeCriteria = true;
			}
			else if (biomeCretaceousEarly.getBiomeType() == EnumBiomeTypeCretaceousEarly.Early_Cretaceous_Austro_Antarctica) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}

		if (!biomeCriteria)
			return;

		int GenChance = 30;
		double GenMultiplier = LepidodendronConfigPlants.multiplierTmesipteris;
		if (GenMultiplier < 0) {GenMultiplier = 0;}
		GenChance = Math.min(256, (int) Math.round((double) GenChance * GenMultiplier));
		//Is this a transformed biome?
		if (LepidodendronDecorationHandler.matchBiome(biome, LepidodendronConfigPlants.genTransformBiomes)) {
			//if (biome.getRegistryName().toString().substring(0, biome.getRegistryName().toString().indexOf(":")).equalsIgnoreCase("minecraft"))
				GenChance = Math.min(GenChance * 10, 100);
		}
		
		for (int i = 0; i < (int) GenChance; i++) {
			int l6 = chunkX + random.nextInt(16) + 8;
			int i11 = random.nextInt(128);
			int l14 = chunkZ + random.nextInt(16) + 8;
			(new TmesipterisGenerator((Block) block)).generate(world, random, new BlockPos(l6, i11, l14));
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

	public static class BlockCustom extends SeedSporeFacingBlockBase implements IAdvancementGranter {

		public BlockCustom() {
			super(Material.PLANTS);
			setTranslationKey("pf_tmesipteris");
			setSoundType(SoundType.PLANT);
			setHardness(0F);
			setResistance(0F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronPlants.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.DOWN));
			setTickRandomly(true);
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_TMESIPTERIS;
		}

		@Override
		public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack) {
			if (stack.getItem() == Items.SHEARS && LepidodendronConfig.doPropagation
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
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 100;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 60;
		}

		@Override
		public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
	    {
	        for (EnumFacing enumfacing : FACING.getAllowedValues())
	        {
	            if (canPlaceAt(worldIn, pos, enumfacing))
	            {
	                return true;
	            }
	        }
	        return false;
	    }

    	public static boolean canPlaceAt(World worldIn, BlockPos pos, EnumFacing facing)
	    {
	    	BlockPos blockpos = pos.offset(facing.getOpposite());
	        IBlockState iblockstate = worldIn.getBlockState(blockpos);
	        Block block = iblockstate.getBlock();
	        BlockFaceShape blockfaceshape = iblockstate.getBlockFaceShape(worldIn, blockpos, facing);
	
	        if (facing.equals(EnumFacing.UP) || facing.equals(EnumFacing.DOWN))
	        {
	            return false;
	        }
	        else if (facing != EnumFacing.UP && facing != EnumFacing.DOWN)
	        {
	            return !isExceptBlockForAttachWithPiston(block) && blockfaceshape == BlockFaceShape.SOLID;
	        }
	        else
	        {
	            return false;
	        }
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

		public boolean isFullCube(IBlockState state)
	    {
	        return false;
	    }

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			switch ((EnumFacing) state.getValue(BlockDirectional.FACING)) {
				case SOUTH :
				default :
					return new AxisAlignedBB(0.4D, 0D, 0D, 0.6D, 1D, 0.75D);
				case NORTH :
					return new AxisAlignedBB(0.4D, 0D, 1D, 0.6D, 1D, 0.25D);
				case WEST :
					return new AxisAlignedBB(1D, 0D, 0.4D, 0.25D, 1D, 0.6D);
				case EAST :
					return new AxisAlignedBB(0D, 0D, 0.4D, 0.75D, 1D, 0.6D);
				case UP :
					return new AxisAlignedBB(0.4D, 0D, 0D, 0.6D, 0.75D, 1D);
				case DOWN :
					return new AxisAlignedBB(0.4D, 0.25D, 1D, 0.6D, 1D, 0D);
			}
		}

		@Nullable
		public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
		{
			return NULL_AABB;
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING});
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
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
	    {
	        if (canPlaceAt(worldIn, pos, facing))
	        {
	            return this.getDefaultState().withProperty(FACING, facing);
	        }
	        else
	        {
	            for (EnumFacing enumfacing : EnumFacing.Plane.HORIZONTAL)
	            {
	                if (canPlaceAt(worldIn, pos, enumfacing))
	                {
	                    return this.getDefaultState().withProperty(FACING, enumfacing);
	                }
	            }
	
	            return this.getDefaultState();
	        }
	    }

		@Override
		public boolean isReplaceable(IBlockAccess blockAccess, BlockPos pos) {
			return true;
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			if (!LepidodendronConfig.doPropagation) {
				drops.add(new ItemStack(this));
				if (Math.random()>0.66) {
					drops.add(new ItemStack(this));
				}
			}
		}

		@Override
		protected boolean canSilkHarvest()
	    {
	        return false;
	    }

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			if (!canPlaceBlockAt(world, pos)) {
				world.destroyBlock(pos, true);
			}
			else {
				EnumFacing enumfacing = (EnumFacing)state.getValue(FACING);
	            EnumFacing.Axis enumfacing$axis = enumfacing.getAxis();
	            EnumFacing enumfacing1 = enumfacing.getOpposite();
	            BlockPos blockpos = pos.offset(enumfacing1);
	
	            if (enumfacing$axis.isHorizontal() && world.getBlockState(blockpos).getBlockFaceShape(world, blockpos, enumfacing) != BlockFaceShape.SOLID)
				{
					world.destroyBlock(pos, true);
				}
				else {
					super.neighborChanged(state, world, pos, neighborBlock, fromPos);
				}
			}
			
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			return BlockFaceShape.UNDEFINED;
		}

		@SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Fern epiphytic plant");
	        tooltip.add("Periods: Carboniferous - Permian - Triassic - Jurassic - Early Cretaceous - Late Cretaceous - Paleogene - Neogene - Pleistocene [ - present]");
	        tooltip.add("Propagation: Spores");}
	        super.addInformation(stack, player, tooltip, advanced);
	    }

		@Override
		public Block planted() {
			return BlockTmesipteris.block;
		}

		@Override
		public int offsetY() {
			return 1;
		}

		@Override
		public Vec3d getOffset(IBlockState state, IBlockAccess worldIn, BlockPos pos) {

			long i = MathHelper.getCoordinateRandom(pos.getX(), pos.getY(), pos.getZ());
			switch (state.getValue(FACING)) {
				case UP: case DOWN: default:
					return new Vec3d(((double) ((float) (i >> 16 & 15L) / 15.0F) - 0.5D) * 0.5D, 0.0D, ((double) ((float) (i >> 24 & 15L) / 15.0F) - 0.5D) * 0.5D);

				case NORTH: case SOUTH:
					return new Vec3d(((double) ((float) (i >> 16 & 15L) / 15.0F) - 0.5D) * 0.5D, ((double)((float)(i >> 20 & 15L) / 15.0F) - 1.0D) * 0.2D, 0.0D);

				case EAST: case WEST:
					return new Vec3d(0.0D, ((double)((float)(i >> 20 & 15L) / 15.0F) - 1.0D) * 0.2D, ((double) ((float) (i >> 24 & 15L) / 15.0F) - 0.5D) * 0.5D);
			}
		}
	}
}
